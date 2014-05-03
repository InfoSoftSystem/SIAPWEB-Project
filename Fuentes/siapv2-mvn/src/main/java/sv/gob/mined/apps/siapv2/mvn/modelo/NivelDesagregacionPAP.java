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
public class NivelDesagregacionPAP {
    private Integer idNivelDesagregacion;
    private String descripcionNivel;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private List<PlantillaDeComportamientos> plantillaDeComportamientosList;

    public NivelDesagregacionPAP() {
    }

    public NivelDesagregacionPAP(Integer idNivelDesagregacion) {
        this.idNivelDesagregacion = idNivelDesagregacion;
    }

    public Integer getIdNivelDesagregacion() {
        return idNivelDesagregacion;
    }

    public void setIdNivelDesagregacion(Integer idNivelDesagregacion) {
        this.idNivelDesagregacion = idNivelDesagregacion;
    }

    public String getDescripcionNivel() {
        return descripcionNivel;
    }

    public void setDescripcionNivel(String descripcionNivel) {
        this.descripcionNivel = descripcionNivel;
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
        hash += (idNivelDesagregacion != null ? idNivelDesagregacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NivelDesagregacionPAP)) {
            return false;
        }
        NivelDesagregacionPAP other = (NivelDesagregacionPAP) object;
        if ((this.idNivelDesagregacion == null && other.idNivelDesagregacion != null) || (this.idNivelDesagregacion != null && !this.idNivelDesagregacion.equals(other.idNivelDesagregacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.NivelDesagregacionPAP[ idNivelDesagregacion=" + idNivelDesagregacion + " ]";
    }
    
}
