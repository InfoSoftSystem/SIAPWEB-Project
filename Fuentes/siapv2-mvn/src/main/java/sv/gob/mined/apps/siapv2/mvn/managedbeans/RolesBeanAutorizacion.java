/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.managedbeans;

import java.math.BigDecimal;
import org.primefaces.context.RequestContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgActividades;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgMetas;
import sv.gob.mined.apps.siapv2.mvn.modelo.PoaRecursos;

/**
 *
 * @author infosoft
 */
@Component(value = "rolesBeanAutorizacion")
@Scope(value = "view")
public class RolesBeanAutorizacion {
    

    private Boolean showEstructuraOp = false;
    private Boolean showProcesosInst = false;
    private Boolean showPlantillaSel = false;
    private Boolean showPlantillayRolSel = false;
    private Boolean showProcedimiento = false;
    private Boolean showPlantillaRoles = false;
    private Boolean showAsigRolesUsuarios = false;
    private Boolean showAsigRolesPorPlantilla = false;
    private Integer nivelEdicion = 1;
    
    

    /**
     * Creates a new instance of RolesBean
     */
    public RolesBeanAutorizacion() {
    }

  

    public void cerrarPopupProcesosInst() {
        nivelEdicion -= 1;
        showProcesosInst = false;
        RequestContext.getCurrentInstance().update("frmPrincipal:dlgProcesosInst");
        RequestContext.getCurrentInstance().execute("dlgPlantillaSel.show();");
    }
    
    public void agregarProceso(){
        this.cerrarPopupProcesosInst();
    }
    public void cerrarPopupPlantillaSel(){
        showProcesosInst=false;
        RequestContext.getCurrentInstance().update("frmPrincipal:dlgPlantillaSel");
        RequestContext.getCurrentInstance().execute("dlgProcesosInst.show();");
        
    }
    
    public void agregarRol(){
        
        cerrarPopupPlantillayRolSel();
    }
    
    public void cerrarPopupPlantillayRolSel(){
        showProcesosInst=false;
        RequestContext.getCurrentInstance().update("frmPrincipal:dlgProcesosInst");
        RequestContext.getCurrentInstance().execute("dlgPlantillayRolSel.show();");
    }
    
      public void cerrarPopupRolSel(){
          
        showProcesosInst=true;
        RequestContext.getCurrentInstance().update("frmPrincipal:dlgPlantillayRolSel");
        RequestContext.getCurrentInstance().execute("dlgProcesosInst.show();");
        
    }
      public void cerrarPopupProcedimiento(){
          showProcesosInst=true;
          showProcedimiento=false;
          RequestContext.getCurrentInstance().update("frmPrincipal:dlgProcedimiento");
          RequestContext.getCurrentInstance().execute("dlgProcesosInst.show();");
      }

    

    public void nuevo() {
        switch (nivelEdicion) {
            case 1:
                showEstructuraOp = true;
                PgMetas meta = new PgMetas(0);
                meta.setDescripcion(" ");
                meta.setActivo(1);
                meta.setMontoBanco(BigDecimal.ZERO);
                meta.setMontoGoes(BigDecimal.ZERO);
                //meta.setComponente(idComponente);
                //lstMetas.add(meta);
                break;
            case 2:
                PgActividades actividad = new PgActividades(0);
                actividad.setFinanciamientoBanco(BigDecimal.ZERO);
                actividad.setFinanciamientoGoes(BigDecimal.ZERO);
                // actividad.setPgMeta(pgMeta);
                //lstActividades.add(actividad);
                break;
            case 3:
                PoaRecursos recurso = new PoaRecursos(0);
                // recurso.setActividad(currentActividad.getActividad());
                recurso.setPrecioUnitario(BigDecimal.ZERO);
                recurso.setCantidad(0);
                // lstRecuros.add(recurso);
                break;
        }
    }

    public Boolean getShowEstructuraOp() {
        return showEstructuraOp;
    }

    public void setShowEstructuraOp(Boolean showEstructuraOp) {
        this.showEstructuraOp = showEstructuraOp;
    }

    public Boolean getShowProcesosInst() {
        return showProcesosInst;
    }

    public void setShowProcesosInst(Boolean showProcesosInst) {
        this.showProcesosInst = showProcesosInst;
    }

    public Boolean getShowPlantillaRoles() {
        return showPlantillaRoles;
    }

    public void setShowPlantillaRoles(Boolean showPlantillaRoles) {
        this.showPlantillaRoles = showPlantillaRoles;
    }

    public Boolean getShowAsigRolesUsuarios() {
        return showAsigRolesUsuarios;
    }

    public void setShowAsigRolesUsuarios(Boolean showAsigRolesUsuarios) {
        this.showAsigRolesUsuarios = showAsigRolesUsuarios;
    }

    public Boolean getShowAsigRolesPorPlantilla() {
        return showAsigRolesPorPlantilla;
    }

    public void setShowAsigRolesPorPlantilla(Boolean showAsigRolesPorPlantilla) {
        this.showAsigRolesPorPlantilla = showAsigRolesPorPlantilla;
    }

    public Boolean getShowPlantillaSel() {
        return showPlantillaSel;
    }

    public void setShowPlantillaSel(Boolean showPlantillaSel) {
        this.showPlantillaSel = showPlantillaSel;
    }

    public Boolean getShowPlantillayRolSel() {
        return showPlantillayRolSel;
    }

    public void setShowPlantillayRolSel(Boolean showPlantillayRolSel) {
        this.showPlantillayRolSel = showPlantillayRolSel;
    }

    public Boolean getShowProcedimiento() {
        return showProcedimiento;
    }

    public void setShowProcedimiento(Boolean showProcedimiento) {
        this.showProcedimiento = showProcedimiento;
    }
    
    

    
}
