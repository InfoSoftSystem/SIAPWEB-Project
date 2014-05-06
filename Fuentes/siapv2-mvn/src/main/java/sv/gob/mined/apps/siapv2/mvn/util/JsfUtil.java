/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import org.primefaces.context.RequestContext;

/**
 *
 * @author Infosoft
 */
public class JsfUtil {

    public static final int COD_ERROR = -1;

    public static SelectItem[] getSelectItems(List<?> entities, boolean selectOne) {
        int size = selectOne ? entities.size() + 1 : entities.size();
        SelectItem[] items = new SelectItem[size];
        int i = 0;
        if (selectOne) {
            items[0] = new SelectItem("", "---");
            i++;
        }
        for (Object x : entities) {
            items[i++] = new SelectItem(x, x.toString());
        }
        return items;
    }

    public static PreparedStatement setValuesPreparedStatement(PreparedStatement ps, Object[] valores) throws SQLException {
        int col = 1;
        for (Object object : valores) {
            if (object instanceof Integer) {
                ps.setInt(col, (Integer) object);
            } else if (object instanceof String) {
                ps.setString(col, object.toString());
            } else if (object instanceof Date) {
                ps.setDate(col, new java.sql.Date(((Date) object).getTime()));
            } else if (object instanceof BigDecimal) {
                ps.setFloat(col, ((BigDecimal) object).floatValue());
            } else {
                ps.setObject(col, object);
            }
            col++;
        }
        return ps;
    }

    public static void addErrorMessage(String msg) {
        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", msg);
        FacesContext.getCurrentInstance().addMessage(null, facesMsg);
    }

    public static void addWarningMessage(String msg) {
        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Alerta", msg);
        FacesContext.getCurrentInstance().addMessage(null, facesMsg);
    }

    public static void addSuccessMessage(String msg) {
        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Información", msg);
        FacesContext.getCurrentInstance().addMessage("successInfo", facesMsg);
    }

    public static String getUsuarioSession() {
        /*FacesContext session = FacesContext.getCurrentInstance();
        return session.getExternalContext().getSessionMap().get("sUsuario").toString();*/
        return "ADMIN";
    }
    
    public static Boolean addErrorStyle(String frm, String idComponente, Class tipoComponente, Object valor) {
        Boolean valido = true;
        if (valor != null) {
            if (valor instanceof Integer) {
                if (valor == null || (Integer) valor == 0) {
                    valido = false;
                }
            } else if (valor instanceof String) {
                if (valor == null || valor.toString().isEmpty()) {
                    valido = false;
                }
            } else if (valor instanceof BigDecimal) {
                if (valor == null || ((BigDecimal) valor).compareTo(BigDecimal.ZERO) == 0) {
                    valido = false;
                }
            }
        } else {
            valido = false;
        }

        Class noParams[] = {};
        Class[] paramString = new Class[1];
        paramString[0] = String.class;

        Object componente = tipoComponente.cast(FacesContext.getCurrentInstance().getViewRoot().findComponent(frm).findComponent(idComponente));
        try {
            Method getStyleClass = tipoComponente.getMethod("getStyleClass", noParams);
            Method setStyleClass = tipoComponente.getMethod("setStyleClass", paramString);
            Object objEstilo = getStyleClass.invoke(componente, noParams);
            String estilos = ((objEstilo == null) ? "" : objEstilo.toString());

            if (valido) {
                setStyleClass.invoke(componente, new String(estilos.replace("ui-state-error", "")));
            } else {
                setStyleClass.invoke(componente, new String(estilos.concat(" ").concat("ui-state-error")));
            }

            RequestContext.getCurrentInstance().update(frm + ":" + idComponente);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(JsfUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(JsfUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(JsfUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(JsfUtil.class.getName()).log(Level.SEVERE, null, ex);
        }

        return valido;
    }
}