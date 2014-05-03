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

public class TipoNormativaApliAdq {
    
    private Integer idTipoNormativa;
    private String descripcionTipoNormativa;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private List<PlantillaDeComportamientos> plantillaDeComportamientosList;

    public TipoNormativaApliAdq() {
    }

    public TipoNormativaApliAdq(Integer idTipoNormativa) {
        this.idTipoNormativa = idTipoNormativa;
    }

    public Integer getIdTipoNormativa() {
        return idTipoNormativa;
    }

    public void setIdTipoNormativa(Integer idTipoNormativa) {
        this.idTipoNormativa = idTipoNormativa;
    }

    public String getDescripcionTipoNormativa() {
        return descripcionTipoNormativa;
    }

    public void setDescripcionTipoNormativa(String descripcionTipoNormativa) {
        this.descripcionTipoNormativa = descripcionTipoNormativa;
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

    public List<PlantillaDeComportamientos> getPlantillaDeComportamientosList() {
        return plantillaDeComportamientosList;
    }

    public void setPlantillaDeComportamientosList(List<PlantillaDeComportamientos> plantillaDeComportamientosList) {
        this.plantillaDeComportamientosList = plantillaDeComportamientosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoNormativa != null ? idTipoNormativa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoNormativaApliAdq)) {
            return false;
        }
        TipoNormativaApliAdq other = (TipoNormativaApliAdq) object;
        if ((this.idTipoNormativa == null && other.idTipoNormativa != null) || (this.idTipoNormativa != null && !this.idTipoNormativa.equals(other.idTipoNormativa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.TipoNormativaApliAdq[ idTipoNormativa=" + idTipoNormativa + " ]";
    }
    
}
