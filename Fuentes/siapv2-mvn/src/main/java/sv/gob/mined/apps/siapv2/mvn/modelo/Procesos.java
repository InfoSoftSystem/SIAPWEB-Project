/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;

import java.util.Date;
import java.util.List;


/**
 *
 * @author Infosoft
 */

public class Procesos {
    
    private Integer identificacionDelProceso;
    private Integer descripcionDelProceso;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private MacroProcesos idMacroProceso;
    private List<CatalogoTareas> catalogoTareasList;
    private List<ProcedimientoTarea> procedimientoTareaList;

    public Procesos() {
    }

    public Procesos(Integer identificacionDelProceso) {
        this.identificacionDelProceso = identificacionDelProceso;
    }

    public Integer getIdentificacionDelProceso() {
        return identificacionDelProceso;
    }

    public void setIdentificacionDelProceso(Integer identificacionDelProceso) {
        this.identificacionDelProceso = identificacionDelProceso;
    }

    public Integer getDescripcionDelProceso() {
        return descripcionDelProceso;
    }

    public void setDescripcionDelProceso(Integer descripcionDelProceso) {
        this.descripcionDelProceso = descripcionDelProceso;
    }

    public Date getFechaDeInsercion() {
        return fechaDeInsercion;
    }

    public void setFechaDeInsercion(Date fechaDeInsercion) {
        this.fechaDeInsercion = fechaDeInsercion;
    }

    public Date getFechaDeModificacion() {
        return fechaDeModificacion;
    }

    public void setFechaDeModificacion(Date fechaDeModificacion) {
        this.fechaDeModificacion = fechaDeModificacion;
    }

    public Date getFechaDeEliminacion() {
        return fechaDeEliminacion;
    }

    public void setFechaDeEliminacion(Date fechaDeEliminacion) {
        this.fechaDeEliminacion = fechaDeEliminacion;
    }

    public Integer getEstadoDeEliminacion() {
        return estadoDeEliminacion;
    }

    public void setEstadoDeEliminacion(Integer estadoDeEliminacion) {
        this.estadoDeEliminacion = estadoDeEliminacion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MacroProcesos getIdMacroProceso() {
        return idMacroProceso;
    }

    public void setIdMacroProceso(MacroProcesos idMacroProceso) {
        this.idMacroProceso = idMacroProceso;
    }

    public List<CatalogoTareas> getCatalogoTareasList() {
        return catalogoTareasList;
    }

    public void setCatalogoTareasList(List<CatalogoTareas> catalogoTareasList) {
        this.catalogoTareasList = catalogoTareasList;
    }

    public List<ProcedimientoTarea> getProcedimientoTareaList() {
        return procedimientoTareaList;
    }

    public void setProcedimientoTareaList(List<ProcedimientoTarea> procedimientoTareaList) {
        this.procedimientoTareaList = procedimientoTareaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (identificacionDelProceso != null ? identificacionDelProceso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Procesos)) {
            return false;
        }
        Procesos other = (Procesos) object;
        if ((this.identificacionDelProceso == null && other.identificacionDelProceso != null) || (this.identificacionDelProceso != null && !this.identificacionDelProceso.equals(other.identificacionDelProceso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.Procesos[ identificacionDelProceso=" + identificacionDelProceso + " ]";
    }
    
}
