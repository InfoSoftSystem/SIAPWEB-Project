/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.bnprove.mvn.managedbeans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import sv.gob.mined.apps.bnprove.mvn.bo.ProveedoresBo;
import sv.gob.mined.apps.bnprove.mvn.modelo.Persona;
import sv.gob.mined.apps.bnprove.mvn.modelo.PreguntaValidaUsuario;
import sv.gob.mined.apps.bnprove.mvn.modelo.Usuario;
import sv.gob.mined.apps.bnprove.mvn.util.JsfUtil;

/**
 *
 * @author Infosoft
 */
@Component(value = "validacionUsuarioBean")
@Scope(value = "view")
public class ValidacionUsuarioBean {

    private String usuario;
    private String claveDeAcceso;
    private String dui;
    private String respuesta1;
    private String respuesta2;
    private Persona currentPersona;
    private Usuario currentUsuario;
    @Autowired
    private ProveedoresBo provBo;
    private List<PreguntaValidaUsuario> lstPreguntasUsuario = new ArrayList<PreguntaValidaUsuario>();

    public ValidacionUsuarioBean() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClaveDeAcceso() {
        return claveDeAcceso;
    }

    public void setClaveDeAcceso(String claveDeAcceso) {
        this.claveDeAcceso = claveDeAcceso;
    }

    public String validarCredencialesDeAcceso() {
        if (usuario != null && claveDeAcceso != null) {
            Persona per = provBo.findPersonaByUsuarioClave(usuario, claveDeAcceso);

            if (per != null) {
                FacesContext context = FacesContext.getCurrentInstance();
                context.getExternalContext().getSessionMap().put(JsfUtil.sUsuario, usuario);
                context.getExternalContext().getSessionMap().put(JsfUtil.sIdPersona, per.getIdentificadorDeLaPersona());

                return "/app/vistas/registro.jsf?faces-redirect=true";
            } else {
                JsfUtil.addErrorMessage("Usuario y/o Clave de acceso erroneas.");
                return null;
            }
        } else {
            JsfUtil.addErrorMessage("Usuario y/o Clave de acceso erroneas.");
            return "";
        }
    }

    public ProveedoresBo getProvBo() {
        return provBo;
    }

    public void setProvBo(ProveedoresBo provBo) {
        this.provBo = provBo;
    }

    public void nuevoUsuario() {
        if (provBo.isExistPersonaByUsuario(currentUsuario.getUserName())) {
            JsfUtil.addWarningMessage("Ya existe el nombre de usuario " + currentUsuario.getUserName() + ". Escriba otro nombre de usuario.");
        } else {
            currentUsuario.setFechaInsercion(new Date());
            currentUsuario.setEstadoDeEliminacion(0);
            int var = provBo.saveUsuario(currentUsuario);

            if (var != 0) {
                JsfUtil.addSuccessMessage("Registro completado.");
            } else {
                JsfUtil.addErrorMessage("Ocurrio un error al registrar el nuevo usuario.");
            }
        }
    }

    public Persona getCurrentPersona() {
        if (currentPersona == null) {
            currentPersona = new Persona();
        }

        return currentPersona;
    }

    public void setCurrentPersona(Persona currentPersona) {
        this.currentPersona = currentPersona;
    }

    public String logout() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.getExternalContext().getSessionMap().clear();
        ExternalContext externalContext = context.getExternalContext();
        Object session = externalContext.getSession(true);
        HttpSession httpSession = (HttpSession) session;
        httpSession.invalidate();
        return "/index?faces-redirect=true";
    }

    public Usuario getCurrentUsuario() {
        if (currentUsuario == null) {
            currentUsuario = new Usuario();
            currentUsuario.setIdPregunta1(getLstPreguntas().get(0).getIdPregunta());
        }
        return currentUsuario;
    }

    public void setCurrentUsuario(Usuario currentUsuario) {
        this.currentUsuario = currentUsuario;
    }

    public List<PreguntaValidaUsuario> getLstPreguntas() {
        return provBo.findAllPreguntas();
    }

    public List<PreguntaValidaUsuario> getLstPreguntas2() {
        return provBo.findAllPreguntasExcepto(currentUsuario.getIdPregunta1());
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public void buscarUsuarioPreguntas() {
        if (dui.replace("_", "").length() == 9) {
            lstPreguntasUsuario = provBo.findAllByDui(dui);
            if(lstPreguntasUsuario.isEmpty()){
                JsfUtil.addWarningMessage("El usuario con DUI " + dui + " no esta registrado");
            }
        }
    }

    public List<PreguntaValidaUsuario> getLstPreguntasUsuario() {
        return lstPreguntasUsuario;
    }

    public void setLstPreguntasUsuario(List<PreguntaValidaUsuario> lstPreguntasUsuario) {
        this.lstPreguntasUsuario = lstPreguntasUsuario;
    }

    public PreguntaValidaUsuario getPregunta1() {
        if (lstPreguntasUsuario != null && !lstPreguntasUsuario.isEmpty()) {
            return lstPreguntasUsuario.get(0);
        } else {
            return null;
        }
    }

    public PreguntaValidaUsuario getPregunta2() {
        if (lstPreguntasUsuario != null && !lstPreguntasUsuario.isEmpty()) {
            return lstPreguntasUsuario.get(1);
        } else {
            return null;
        }
    }

    public String getRespuesta1() {
        return respuesta1;
    }

    public void setRespuesta1(String respuesta1) {
        this.respuesta1 = respuesta1;
    }

    public String getRespuesta2() {
        return respuesta2;
    }

    public void setRespuesta2(String respuesta2) {
        this.respuesta2 = respuesta2;
    }
    
    public void comprobarRespuestas(){
        Usuario usuario = provBo.findUsuarioByDui(dui);
        if(provBo.comprobarRespuestas(usuario.getUserName(), respuesta1, respuesta2)){
            JsfUtil.addSuccessMessage("Respuestas correctas");
        }else{
            JsfUtil.addSuccessMessage("Respuestas incorrectas");
        }
    }
}