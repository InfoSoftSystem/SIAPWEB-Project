/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.managedbeans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.primefaces.component.calendar.Calendar;
import org.primefaces.component.inputtext.InputText;
import org.primefaces.component.inputtextarea.InputTextarea;
import org.primefaces.component.selectonemenu.SelectOneMenu;
import org.primefaces.event.SelectEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import sv.gob.mined.apps.siapv2.mvn.bo.BancoProveedoresBo;
import sv.gob.mined.apps.siapv2.mvn.modelo.Empresa;
import sv.gob.mined.apps.siapv2.mvn.modelo.FaltasOferente;
import sv.gob.mined.apps.siapv2.mvn.modelo.GarantiasOferente;
import sv.gob.mined.apps.siapv2.mvn.modelo.MultasOferente;
import sv.gob.mined.apps.siapv2.mvn.modelo.RescisionesOferente;
import sv.gob.mined.apps.siapv2.mvn.modelo.TipoFaltas;
import sv.gob.mined.apps.siapv2.mvn.modelo.TipoGarantias;
import sv.gob.mined.apps.siapv2.mvn.modelo.TipoMultas;
import sv.gob.mined.apps.siapv2.mvn.modelo.TipoRescision;
import sv.gob.mined.apps.siapv2.mvn.modelo.view.VwFaltasEmpresa;
import sv.gob.mined.apps.siapv2.mvn.modelo.view.VwGarantiasEmpresa;
import sv.gob.mined.apps.siapv2.mvn.modelo.view.VwMultasEmpresa;
import sv.gob.mined.apps.siapv2.mvn.modelo.view.VwRescisionesEmpresa;
import sv.gob.mined.apps.siapv2.mvn.modelo.view.VwTrasladoEmpresa;
import sv.gob.mined.apps.siapv2.mvn.util.JsfUtil;

/**
 *
 * @author Infosoft
 */
@Component(value = "bancoProveedoresBean")
@Scope(value = "view")
public class BancoProveedoresBean {

    private String razonSocial;
    private String numeroDeNit;
    private String descripcion;
    private Empresa currentEmpresa;
    private FaltasOferente currentFaltasOferente;
    private MultasOferente currentMultaOferente;
    private GarantiasOferente currentGarantiaOferente;
    private RescisionesOferente currentRescisionesOferente;
    private TipoFaltas currentFaltas;
    private List<Empresa> lstEmpresa;
    private List<VwFaltasEmpresa> lstFaltas;
    private List<VwMultasEmpresa> lstMultas;
    private List<VwGarantiasEmpresa> lstGarantias;
    private List<VwRescisionesEmpresa> lstRescision;
    private List<VwTrasladoEmpresa> lstTrasladoEmpresa;
    private Boolean deshabilitado = true;
    private Boolean deshabilitadoEliminar = true;
    private Boolean deshabilitadoEfectiva = true;
    
    public BancoProveedoresBean() {
    }
    @Autowired
    private BancoProveedoresBo bancoProv;

    public List<TipoFaltas> getLstTipoFaltas() {
        return bancoProv.getLstTipoFaltas();
    }

    public List<TipoMultas> getLstTipoMultas() {
        return bancoProv.getLstTipoMultas();
    }

    public List<TipoGarantias> getLstTipoGarantias() {
        return bancoProv.getLstTipoGarantias();
    }

    public List<TipoRescision> getLstTipoRescisiones() {
        return bancoProv.getLstTipoRescisiones();
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNumeroDeNit() {
        return numeroDeNit;
    }

    public void setNumeroDeNit(String numeroDeNit) {
        this.numeroDeNit = numeroDeNit;
    }

    public Empresa getCurrentEmpresa() {
        return currentEmpresa;
    }

    public void setCurrentEmpresa(Empresa currentEmpresa) {
        this.currentEmpresa = currentEmpresa;
        
        if (currentEmpresa != null) {
            if (currentFaltasOferente != null) {
                lstFaltas = bancoProv.getLstFaltasOferente(currentEmpresa.getIdentificadorPrimarioOferente());
            } else if (currentMultaOferente != null) {
                lstMultas = bancoProv.getLstMultasOferente(currentEmpresa.getIdentificadorPrimarioOferente());
            } else if (currentGarantiaOferente != null) {
                lstGarantias = bancoProv.getLstGarantiasOferente(currentEmpresa.getIdentificadorPrimarioOferente());
            } else if (currentRescisionesOferente != null) {
                lstRescision = bancoProv.getLstRescisionesOferente(currentEmpresa.getIdentificadorPrimarioOferente());
            }
        }
    }

    public MultasOferente getCurrentMultaOferente() {
        if (currentMultaOferente == null) {
            currentMultaOferente = new MultasOferente();
        }
        return currentMultaOferente;
    }

    public void setCurrentMultaOferente(MultasOferente currentMultaOferente) {
        this.currentMultaOferente = currentMultaOferente;
    }

    public RescisionesOferente getCurrentRescisionesOferente() {
        if (currentRescisionesOferente == null) {
            currentRescisionesOferente = new RescisionesOferente();
        }
        return currentRescisionesOferente;
    }

    public void setCurrentRescisionesOferente(RescisionesOferente currentRescisionesOferente) {
        this.currentRescisionesOferente = currentRescisionesOferente;
    }

    public void buscarEmpresas() {
        if (razonSocial != null && !razonSocial.isEmpty()) {
            lstEmpresa = bancoProv.getLstEmpresaByRazonSocial(razonSocial);
        } else if (numeroDeNit != null && !numeroDeNit.isEmpty()) {
            lstEmpresa = bancoProv.getLstEmpresaByNit(numeroDeNit);
        }
    }

    public List<Empresa> getLstEmpresa() {
        if (lstEmpresa == null) {
            lstEmpresa = new ArrayList<Empresa>();
        }
        return lstEmpresa;
    }

    public void setLstEmpresa(List<Empresa> lstEmpresa) {
        this.lstEmpresa = lstEmpresa;
    }

    public Boolean getDeshabilitado() {
        return deshabilitado;
    }

    public void setDeshabilitado(Boolean deshabilitado) {
        this.deshabilitado = deshabilitado;
    }

    public Boolean getDeshabilitadoEliminar() {
        return deshabilitadoEliminar;
    }

    public void setDeshabilitadoEliminar(Boolean deshabilitadoEliminar) {
        this.deshabilitadoEliminar = deshabilitadoEliminar;
    }
    
    public Boolean getDeshabilitadoEfectiva() {
        return deshabilitadoEfectiva;
    }

    public void setDeshabilitadoEfectiva(Boolean deshabilitadoEfectiva) {
        this.deshabilitadoEfectiva = deshabilitadoEfectiva;
    }

    public TipoFaltas getCurrentFaltas() {
        return currentFaltas;
    }

    public void setCurrentFaltas(TipoFaltas currentFaltas) {
        this.currentFaltas = currentFaltas;
    }

    public void nuevaFalta() {
        nuevo();
        currentFaltasOferente = new FaltasOferente();
    }

    public void nuevaGarantia() {
        nuevo();
        currentGarantiaOferente = new GarantiasOferente();
    }

    public void nuevaRescision() {
        nuevo();
        currentRescisionesOferente = new RescisionesOferente();
    }

    private void nuevo() {
        deshabilitado = false;
        deshabilitadoEliminar = true;
        currentEmpresa = null;
        numeroDeNit = null;
        razonSocial = null;
        descripcion = null;
        lstMultas = null;
        lstFaltas = null;
        lstGarantias = null;
        lstRescision = null;
    }

    public void nuevaMulta() {
        nuevo();
        currentMultaOferente = new MultasOferente();
    }

    public void guardarFalta() {
        Boolean valido;
        
        if (currentEmpresa != null) {
            valido = JsfUtil.addErrorStyle("frmPrincipal", "txtContratista", InputText.class, currentEmpresa.getRazonSocial());
            valido = JsfUtil.addErrorStyle("frmPrincipal", "txtNumContrato", InputText.class, currentFaltasOferente.getNumeroContrato()) && valido;

            valido = JsfUtil.addErrorStyle("frmPrincipal", "cbTipoFalta", SelectOneMenu.class, currentFaltasOferente.getIdTipoDeFalta()) && valido;
            valido = JsfUtil.addErrorStyle("frmPrincipal", "txaDescripcion", InputTextarea.class, currentFaltasOferente.getDescripcionFalta()) && valido;
        }else{
            valido = JsfUtil.addErrorStyle("frmPrincipal", "txtContratista", InputText.class, null);
        }
        
        if(currentEmpresa != null && valido == true){
            currentFaltasOferente.setIdentificadorPrimarioOferente(currentEmpresa.getIdentificadorPrimarioOferente());
            currentFaltasOferente.setFechaDeInsercion(new Date());
            currentFaltasOferente.setEstadoDeEliminacion(0);
            bancoProv.saveFaltaOferente(currentFaltasOferente);
            lstFaltas = bancoProv.getLstFaltasOferente(currentEmpresa.getIdentificadorPrimarioOferente());

            if(currentFaltasOferente.getIdentificadorFalta() == null){
                currentFaltasOferente = new FaltasOferente();
                deshabilitadoEliminar = true;
            }else{
                deshabilitadoEliminar = false;
            }
            
            JsfUtil.addSuccessMessage("El registro ha sido guardado");
        }else{
            JsfUtil.addErrorMessage("Los campos marcados con rojo son REQUERIDOS");
        }
    }

    public void guardarMulta() {
        Boolean valido;
        
        if (currentEmpresa != null) {
            valido = JsfUtil.addErrorStyle("frmPrincipal", "txtContratista", InputText.class, currentEmpresa.getRazonSocial());
            valido = JsfUtil.addErrorStyle("frmPrincipal", "txtNumContrato", InputText.class, currentMultaOferente.getNumeroContrato()) && valido;

            valido = JsfUtil.addErrorStyle("frmPrincipal", "cbTipoMulta", SelectOneMenu.class, currentMultaOferente.getIdTipoDeMulta()) && valido;
            valido = JsfUtil.addErrorStyle("frmPrincipal", "txtMonto", InputText.class, currentMultaOferente.getMontoMulta()) && valido;
            valido = JsfUtil.addErrorStyle("frmPrincipal", "txaDescripcion", InputTextarea.class, currentMultaOferente.getDescripcionDeMulta()) && valido;
        }else{
            valido = JsfUtil.addErrorStyle("frmPrincipal", "txtContratista", InputText.class, null);
        }
        
        if(currentEmpresa != null && valido == true){
            currentMultaOferente.setIdentificadorPrimarioOferente(currentEmpresa.getIdentificadorPrimarioOferente());
            currentMultaOferente.setFechaDeInsercion(new Date());
            currentMultaOferente.setEstadoDeEliminacion(0);
            bancoProv.saveMultaOferente(currentMultaOferente);
            lstMultas = bancoProv.getLstMultasOferente(currentEmpresa.getIdentificadorPrimarioOferente());
            
            if(currentMultaOferente.getIdentificadorMulta()== null){
                currentMultaOferente = new MultasOferente();
                deshabilitadoEliminar = true;
            }else{
                deshabilitadoEliminar = false;
            }
            
            JsfUtil.addSuccessMessage("El registro ha sido guardado");
        }else{
            JsfUtil.addErrorMessage("Los campos marcados con rojo son REQUERIDOS");
        }
    }

    public void guardarGarantia() {
        Boolean valido;
        
        if (currentEmpresa != null) {
            valido = JsfUtil.addErrorStyle("frmPrincipal", "txtContratista", InputText.class, currentEmpresa.getRazonSocial());
            valido = JsfUtil.addErrorStyle("frmPrincipal", "txtNumContrato", InputText.class, currentGarantiaOferente.getNumeroContrato()) && valido;

            valido = JsfUtil.addErrorStyle("frmPrincipal", "cbTipoGarantia", SelectOneMenu.class, currentGarantiaOferente.getIdTipoGarantia()) && valido;
            valido = JsfUtil.addErrorStyle("frmPrincipal", "txtMonto", InputText.class, currentGarantiaOferente.getMontoGarantia()) && valido;
            valido = JsfUtil.addErrorStyle("frmPrincipal", "cdlVencimiento", Calendar.class, currentGarantiaOferente.getFechaVencimiento()) && valido;
            
            if(currentGarantiaOferente.getEfectiva() == Boolean.TRUE ){
                valido = JsfUtil.addErrorStyle("frmPrincipal", "cdlEfectiva", Calendar.class, currentGarantiaOferente.getFechaEmision()) && valido;
            }
            valido = JsfUtil.addErrorStyle("frmPrincipal", "txaDescripcion", InputTextarea.class, currentGarantiaOferente.getDescripcionGarantia()) && valido;
        }else{
            valido = JsfUtil.addErrorStyle("frmPrincipal", "txtContratista", InputText.class, null);
        }
        
        if(currentEmpresa != null && valido == true){
            currentGarantiaOferente.setIdentificadorPrimarioOferente(currentEmpresa.getIdentificadorPrimarioOferente());
            currentGarantiaOferente.setFechaDeInsercion(new Date());
            currentGarantiaOferente.setEstadoDeEliminacion(0);
            bancoProv.saveGarantiaOferente(currentGarantiaOferente);
            lstGarantias = bancoProv.getLstGarantiasOferente(currentEmpresa.getIdentificadorPrimarioOferente());
            
            if(currentGarantiaOferente.getIdentificadorGarantia()== null){
                currentGarantiaOferente = new GarantiasOferente();
                deshabilitadoEliminar = true;
            }else{
                deshabilitadoEliminar = false;
            }
            
            JsfUtil.addSuccessMessage("El registro ha sido guardado");
        }else{
            JsfUtil.addErrorMessage("Los campos marcados con rojo son REQUERIDOS");
        }
    }
    
    public void efectivaChange() {
        if( this.currentGarantiaOferente.getEfectiva() == Boolean.TRUE){
            this.deshabilitadoEfectiva = false;
        }else{
            this.deshabilitadoEfectiva = true;
            this.currentGarantiaOferente.setFechaEmision(null);
        }
    }

    public void guardarRescision() {
        Boolean valido;
        
        if (currentEmpresa != null) {
            valido = JsfUtil.addErrorStyle("frmPrincipal", "txtContratista", InputText.class, currentEmpresa.getRazonSocial());
            valido = JsfUtil.addErrorStyle("frmPrincipal", "txtNumContrato", InputText.class, currentRescisionesOferente.getNumeroContrato()) && valido;

            valido = JsfUtil.addErrorStyle("frmPrincipal", "cdlVencimiento", Calendar.class, currentRescisionesOferente.getFechaRecesion()) && valido;
            valido = JsfUtil.addErrorStyle("frmPrincipal", "txtMontoPagado", InputText.class, currentRescisionesOferente.getMontoPagado()) && valido;
            valido = JsfUtil.addErrorStyle("frmPrincipal", "txtMontoRemanente", InputText.class, currentRescisionesOferente.getMontoRemanente()) && valido;
            valido = JsfUtil.addErrorStyle("frmPrincipal", "cbTipoRescision", SelectOneMenu.class, currentRescisionesOferente.getTipoRecesion()) && valido;
            
            valido = JsfUtil.addErrorStyle("frmPrincipal", "txaObservaciones", InputTextarea.class, currentRescisionesOferente.getDescripcionRecesion()) && valido;
        }else{
            valido = JsfUtil.addErrorStyle("frmPrincipal", "txtContratista", InputText.class, null);
        }
        
        if(currentEmpresa != null && valido == true){
            currentRescisionesOferente.setIdentificadorPrimarioOferente(currentEmpresa.getIdentificadorPrimarioOferente());
            currentRescisionesOferente.setFechaDeInsercion(new Date());
            currentRescisionesOferente.setEstadoDeEliminacion(0);
            bancoProv.saveRescisionOferente(currentRescisionesOferente);
            lstRescision = bancoProv.getLstRescisionesOferente(currentEmpresa.getIdentificadorPrimarioOferente());
            
            if(currentRescisionesOferente.getIdentificadorRecesion() == null){
                currentRescisionesOferente = new RescisionesOferente();
                deshabilitadoEliminar = true;
            }else{
                deshabilitadoEliminar = false;
            }
            
            JsfUtil.addSuccessMessage("El registro ha sido guardado");
        }else{
            JsfUtil.addErrorMessage("Los campos marcados con rojo son REQUERIDOS");
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public FaltasOferente getCurrentFaltasOferente() {
        if (currentFaltasOferente == null) {
            currentFaltasOferente = new FaltasOferente();
        }
        return currentFaltasOferente;
    }

    public GarantiasOferente getCurrentGarantiaOferente() {
        if (currentGarantiaOferente == null) {
            currentGarantiaOferente = new GarantiasOferente();
        }
        return currentGarantiaOferente;
    }

    public void setCurrentGarantiaOferente(GarantiasOferente currentGarantiaOferente) {
        this.currentGarantiaOferente = currentGarantiaOferente;
    }

    public void setCurrentFaltasOferente(FaltasOferente curretFaltasOferente) {
        this.currentFaltasOferente = curretFaltasOferente;
    }

    public List<VwFaltasEmpresa> getLstFaltas() {
        if (lstFaltas == null) {
            lstFaltas = new ArrayList<VwFaltasEmpresa>();
        }
        return lstFaltas;
    }

    public void setLstFaltas(List<VwFaltasEmpresa> lstFaltas) {
        this.lstFaltas = lstFaltas;
    }

    public List<VwRescisionesEmpresa> getLstRescision() {
        if (lstRescision == null) {
            lstRescision = new ArrayList<VwRescisionesEmpresa>();
        }
        return lstRescision;
    }

    public void setLstRescision(List<VwRescisionesEmpresa> lstRescision) {
        this.lstRescision = lstRescision;
    }

    public List<VwMultasEmpresa> getLstMultas() {
        if (lstMultas == null) {
            lstMultas = new ArrayList<VwMultasEmpresa>();
        }
        return lstMultas;
    }

    public void setLstMultas(List<VwMultasEmpresa> lstMultas) {
        this.lstMultas = lstMultas;
    }

    public List<VwGarantiasEmpresa> getLstGarantias() {
        if (lstGarantias == null) {
            lstGarantias = new ArrayList<VwGarantiasEmpresa>();
        }
        return lstGarantias;
    }

    public void setLstGarantias(List<VwGarantiasEmpresa> lstGarantias) {
        this.lstGarantias = lstGarantias;
    }

    public List<VwTrasladoEmpresa> getLstTrasladoEmpresa() {
        if (lstTrasladoEmpresa == null) {
            lstTrasladoEmpresa = bancoProv.getLstTrasladoEmpresa();
        }
        lstTrasladoEmpresa.get(1).setSeleccionado(true);
        return lstTrasladoEmpresa;
    }

    public void onRowSelectEmpresa(SelectEvent event) {
        deshabilitadoEliminar = true;
        if (currentEmpresa != null) {
            if (currentFaltasOferente != null) {
                currentFaltasOferente = new FaltasOferente();
            } else if (currentMultaOferente != null) {
                currentMultaOferente = new MultasOferente();
            } else if (currentGarantiaOferente != null) {
                currentGarantiaOferente = new GarantiasOferente();
            } else if (currentRescisionesOferente != null) {
                currentRescisionesOferente = new RescisionesOferente();
            }
        }
    }
    
    public void onRowSelectFalta(SelectEvent event) {
        FaltasOferente falta = bancoProv.getFaltaById(((VwFaltasEmpresa) event.getObject()).getIdentificadorFalta());
        if (falta != null) {
            currentFaltasOferente = falta;
            deshabilitadoEliminar = false;
        }
    }

    public void onRowSelectGarantias(SelectEvent event) {
        GarantiasOferente garantia = bancoProv.getGarantiaById(((VwGarantiasEmpresa) event.getObject()).getIdentificadorGarantia());
        if (garantia != null) {
            currentGarantiaOferente = garantia;
            deshabilitadoEliminar = false;
            this.efectivaChange();
        }
    }

    public void onRowSelectMultas(SelectEvent event) {
        MultasOferente multa = bancoProv.getMultaById(((VwMultasEmpresa) event.getObject()).getIdentificadorMulta());
        if (multa != null) {
            deshabilitadoEliminar = false;
            currentMultaOferente = multa;
        }
    }

    public void onRowSelectRescisiones(SelectEvent event) {
        RescisionesOferente rescision = bancoProv.getRescisionById(((VwRescisionesEmpresa) event.getObject()).getIdentificadorRecesion());
        if (rescision != null) {
            deshabilitadoEliminar = false;
            currentRescisionesOferente = rescision;
        }
    }

    public void eliminarFalta() {
        if (currentFaltasOferente != null && currentFaltasOferente.getIdentificadorFalta() != null) {
            currentFaltasOferente.setEstadoDeEliminacion(1);
            currentFaltasOferente.setFechaDeEliminacion(new Date());
            bancoProv.saveFaltaOferente(currentFaltasOferente);
            lstFaltas = bancoProv.getLstFaltasOferente(currentEmpresa.getIdentificadorPrimarioOferente());
            currentFaltasOferente = new FaltasOferente();
            deshabilitadoEliminar = true;
            
            JsfUtil.addSuccessMessage("El registro ha sido eliminado");
        }
    }

    public void eliminarGarantia() {
        if (currentGarantiaOferente != null && currentGarantiaOferente.getIdentificadorGarantia() != null) {
            currentGarantiaOferente.setEstadoDeEliminacion(1);
            currentGarantiaOferente.setFechaDeEliminacion(new Date());
            bancoProv.saveGarantiaOferente(currentGarantiaOferente);
            lstGarantias = bancoProv.getLstGarantiasOferente(currentEmpresa.getIdentificadorPrimarioOferente());
            
            currentGarantiaOferente = new GarantiasOferente();
            deshabilitadoEliminar = true;
            JsfUtil.addSuccessMessage("El registro ha sido eliminado");
        }
    }

    public void eliminarMulta() {
        if (currentMultaOferente != null && currentMultaOferente.getIdentificadorMulta() != null) {
            currentMultaOferente.setEstadoDeEliminacion(1);
            currentMultaOferente.setFechaDeEliminacion(new Date());
            bancoProv.saveMultaOferente(currentMultaOferente);
            lstMultas = bancoProv.getLstMultasOferente(currentEmpresa.getIdentificadorPrimarioOferente());
            
            currentMultaOferente = new MultasOferente();
            deshabilitadoEliminar = true;
            JsfUtil.addSuccessMessage("El registro ha sido eliminado");
        }
    }

    public void eliminarRescision() {
        if (currentRescisionesOferente != null && currentRescisionesOferente.getIdentificadorRecesion() != null) {
            currentRescisionesOferente.setEstadoDeEliminacion(1);
            currentRescisionesOferente.setFechaDeEliminacion(new Date());
            bancoProv.saveRescisionOferente(currentRescisionesOferente);
            lstRescision = bancoProv.getLstRescisionesOferente(currentEmpresa.getIdentificadorPrimarioOferente());
            
            currentRescisionesOferente = new RescisionesOferente();
            deshabilitadoEliminar = true;
            
            JsfUtil.addSuccessMessage("El registro ha sido eliminado");
        }
    }

    public void trasladoOferente() {
        for (VwTrasladoEmpresa empresa : getLstTrasladoEmpresa()) {
            if (empresa.getSeleccionado()) {
                bancoProv.trasladoOferente(empresa.getIdentificadorPrimarioDeLaEmpresa());
                JsfUtil.addSuccessMessage("Proceso completado con éxito!");
            }
        }

    }
    
}