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

public class DetalleMacroProcAplicable {
    private Integer idDetalleMacroAplicable;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private PlantillaDeComportamientos idPlantillaComportamiento;
    private MacroProcesos idMacroProceso;
    private List<DetalleMacroConvenio> detalleMacroConvenioList;

    public DetalleMacroProcAplicable() {
    }

    public DetalleMacroProcAplicable(Integer idDetalleMacroAplicable) {
        this.idDetalleMacroAplicable = idDetalleMacroAplicable;
    }

    public Integer getIdDetalleMacroAplicable() {
        return idDetalleMacroAplicable;
    }

    public void setIdDetalleMacroAplicable(Integer idDetalleMacroAplicable) {
        this.idDetalleMacroAplicable = idDetalleMacroAplicable;
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

    public PlantillaDeComportamientos getIdPlantillaComportamiento() {
        return idPlantillaComportamiento;
    }

    public void setIdPlantillaComportamiento(PlantillaDeComportamientos idPlantillaComportamiento) {
        this.idPlantillaComportamiento = idPlantillaComportamiento;
    }

    public MacroProcesos getIdMacroProceso() {
        return idMacroProceso;
    }

    public void setIdMacroProceso(MacroProcesos idMacroProceso) {
        this.idMacroProceso = idMacroProceso;
    }

    public List<DetalleMacroConvenio> getDetalleMacroConvenioList() {
        return detalleMacroConvenioList;
    }

    public void setDetalleMacroConvenioList(List<DetalleMacroConvenio> detalleMacroConvenioList) {
        this.detalleMacroConvenioList = detalleMacroConvenioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalleMacroAplicable != null ? idDetalleMacroAplicable.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleMacroProcAplicable)) {
            return false;
        }
        DetalleMacroProcAplicable other = (DetalleMacroProcAplicable) object;
        if ((this.idDetalleMacroAplicable == null && other.idDetalleMacroAplicable != null) || (this.idDetalleMacroAplicable != null && !this.idDetalleMacroAplicable.equals(other.idDetalleMacroAplicable))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.DetalleMacroProcAplicable[ idDetalleMacroAplicable=" + idDetalleMacroAplicable + " ]";
    }
    
}
