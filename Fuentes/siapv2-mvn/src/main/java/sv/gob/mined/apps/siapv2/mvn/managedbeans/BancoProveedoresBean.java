/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.managedbeans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import org.primefaces.event.SelectEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import sv.gob.mined.apps.siapv2.mvn.bo.BancoProveedoresBo;
import sv.gob.mined.apps.siapv2.mvn.modelo.Empresa;
import sv.gob.mined.apps.siapv2.mvn.modelo.FaltasOferente;
import sv.gob.mined.apps.siapv2.mvn.modelo.GarantiasOferente;
import sv.gob.mined.apps.siapv2.mvn.modelo.MultasOferente;
import sv.gob.mined.apps.siapv2.mvn.modelo.RecesionesOferente;
import sv.gob.mined.apps.siapv2.mvn.modelo.TipoFaltas;
import sv.gob.mined.apps.siapv2.mvn.modelo.TipoGarantias;
import sv.gob.mined.apps.siapv2.mvn.modelo.TipoMultas;
import sv.gob.mined.apps.siapv2.mvn.modelo.TipoRecesion;
import sv.gob.mined.apps.siapv2.mvn.modelo.view.VwFaltasEmpresa;
import sv.gob.mined.apps.siapv2.mvn.modelo.view.VwGarantiasEmpresa;
import sv.gob.mined.apps.siapv2.mvn.modelo.view.VwMultasEmpresa;
import sv.gob.mined.apps.siapv2.mvn.modelo.view.VwRecesionesEmpresa;
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
    private RecesionesOferente currentRecesionesOferente;
    private TipoFaltas currentFaltas;
    private List<Empresa> lstEmpresa;
    private List<VwFaltasEmpresa> lstFaltas;
    private List<VwMultasEmpresa> lstMultas;
    private List<VwGarantiasEmpresa> lstGarantias;
    private List<VwRecesionesEmpresa> lstRecesion;
    private List<VwTrasladoEmpresa> lstTrasladoEmpresa;
    private Boolean deshabilitado = true;

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

    public List<TipoRecesion> getLstTipoRecesiones() {
        return bancoProv.getLstTipoRecesiones();
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
            } else if (currentRecesionesOferente != null) {
                lstRecesion = bancoProv.getLstRecesionesOferente(currentEmpresa.getIdentificadorPrimarioOferente());
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

    public RecesionesOferente getCurrentRecesionesOferente() {
        if (currentRecesionesOferente == null) {
            currentRecesionesOferente = new RecesionesOferente();
        }
        return currentRecesionesOferente;
    }

    public void setCurrentRecesionesOferente(RecesionesOferente currentRecesionesOferente) {
        this.currentRecesionesOferente = currentRecesionesOferente;
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

    public void nuevaRecesion() {
        nuevo();
        currentRecesionesOferente = new RecesionesOferente();
    }

    private void nuevo() {
        deshabilitado = false;
        currentEmpresa = null;
        numeroDeNit = null;
        razonSocial = null;
        descripcion = null;
        lstMultas = null;
        lstFaltas = null;
    }

    public void nuevaMulta() {
        nuevo();
        currentMultaOferente = new MultasOferente();
    }

    public void guardarFalta() {
        currentFaltasOferente.setIdentificadorPrimarioOferente(currentEmpresa.getIdentificadorPrimarioOferente());
        currentFaltasOferente.setFechaDeInsercion(new Date());
        currentFaltasOferente.setEstadoDeEliminacion(0);
        bancoProv.saveFaltaOferente(currentFaltasOferente);
        lstFaltas = bancoProv.getLstFaltasOferente(currentEmpresa.getIdentificadorPrimarioOferente());
    }

    public void guardarMulta() {
        currentMultaOferente.setIdentificadorPrimarioOferente(currentEmpresa.getIdentificadorPrimarioOferente());
        currentMultaOferente.setFechaDeInsercion(new Date());
        currentMultaOferente.setEstadoDeEliminacion(0);
        bancoProv.saveMultaOferente(currentMultaOferente);
        lstMultas = bancoProv.getLstMultasOferente(currentEmpresa.getIdentificadorPrimarioOferente());
    }

    public void guardarGarantia() {
        currentGarantiaOferente.setIdentificadorPrimarioOferente(currentEmpresa.getIdentificadorPrimarioOferente());
        currentGarantiaOferente.setFechaDeInsercion(new Date());
        currentGarantiaOferente.setEstadoDeEliminacion(0);
        bancoProv.saveGarantiaOferente(currentGarantiaOferente);
        lstGarantias = bancoProv.getLstGarantiasOferente(currentEmpresa.getIdentificadorPrimarioOferente());
    }

    public void guardarRecesion() {
        currentRecesionesOferente.setIdentificadorPrimarioOferente(currentEmpresa.getIdentificadorPrimarioOferente());
        currentRecesionesOferente.setFechaDeInsercion(new Date());
        currentRecesionesOferente.setEstadoDeEliminacion(0);
        bancoProv.saveRecesionOferente(currentRecesionesOferente);
        lstRecesion = bancoProv.getLstRecesionesOferente(currentEmpresa.getIdentificadorPrimarioOferente());
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

    public List<VwRecesionesEmpresa> getLstRecesion() {
        if (lstRecesion == null) {
            lstRecesion = new ArrayList<VwRecesionesEmpresa>();
        }
        return lstRecesion;
    }

    public void setLstRecesion(List<VwRecesionesEmpresa> lstRecesion) {
        this.lstRecesion = lstRecesion;
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

    public void onRowSelectFalta(SelectEvent event) {
        FaltasOferente falta = bancoProv.getFaltaById(((VwFaltasEmpresa) event.getObject()).getIdentificadorFalta());
        if (falta != null) {
            currentFaltasOferente = falta;
        }
    }

    public void onRowSelectGarantias(SelectEvent event) {
        GarantiasOferente garantia = bancoProv.getGarantiaById(((VwGarantiasEmpresa) event.getObject()).getIdentificadorGarantia());
        if (garantia != null) {
            currentGarantiaOferente = garantia;
        }
    }

    public void onRowSelectMultas(SelectEvent event) {
        MultasOferente multa = bancoProv.getMultaById(((VwMultasEmpresa) event.getObject()).getIdentificadorMulta());
        if (multa != null) {
            currentMultaOferente = multa;
        }
    }

    public void onRowSelectRecesiones(SelectEvent event) {
        RecesionesOferente recesion = bancoProv.getRecesionById(((VwRecesionesEmpresa) event.getObject()).getIdentificadorRecesion());
        if (recesion != null) {
            currentRecesionesOferente = recesion;
        }
    }

    public void eliminarFalta() {
        if (currentFaltasOferente != null && currentFaltasOferente.getIdentificadorFalta() != null) {
            currentFaltasOferente.setEstadoDeEliminacion(1);
            currentFaltasOferente.setFechaDeEliminacion(new Date());
            bancoProv.saveFaltaOferente(currentFaltasOferente);
            lstFaltas = bancoProv.getLstFaltasOferente(currentEmpresa.getIdentificadorPrimarioOferente());
        }
    }

    public void eliminarGarantia() {
        if (currentGarantiaOferente != null && currentGarantiaOferente.getIdentificadorGarantia() != null) {
            currentGarantiaOferente.setEstadoDeEliminacion(1);
            guardarGarantia();
        }
    }

    public void eliminarMulta() {
        if (currentMultaOferente != null && currentMultaOferente.getIdentificadorMulta() != null) {
            currentMultaOferente.setEstadoDeEliminacion(1);
            guardarMulta();
        }
    }

    public void eliminarRecesion() {
        if (currentRecesionesOferente != null && currentRecesionesOferente.getIdentificadorRecesion() != null) {
            currentRecesionesOferente.setEstadoDeEliminacion(1);
            guardarRecesion();
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