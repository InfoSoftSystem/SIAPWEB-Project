/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.bnprove.mvn.managedbeans;

import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sv.gob.mined.apps.bnprove.mvn.bo.ProveedoresBo;
import sv.gob.mined.apps.bnprove.mvn.modelo.Departamento;

/**
 *
 * @author Infosoft
 */
@Component
@ManagedBean
@ViewScoped
public class UserBean implements Serializable {

    @Autowired
    private ProveedoresBo provBo;
    private String salida;
    private String names;
    private String lastNames;

   

   

    public String printMsgFromSpring() {
        System.out.println("Entro al metodo mensaje");
        List<Departamento> dep = provBo.findAllDepartamentos();
        System.out.println("dep: " + dep);
        return "Saludo";
    }

    public String getSalida() {
        System.out.println("Entro al metodo mensaje");
        List<Departamento> dep = provBo.findAllDepartamentos();
        System.out.println("dep: " + dep);
        return "Hola";
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

  

    private void agregarMensaje(String summary, String detail) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail));
    }
}
