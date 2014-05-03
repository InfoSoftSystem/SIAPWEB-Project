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

public class NivelDetalleEspRecursos{
    
    private Integer idNivelDetalle;
    private String descripcionNivelDetalle;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private List<NivelDetalleRecursos> nivelDetalleRecursosList;

    public NivelDetalleEspRecursos() {
    }

    public NivelDetalleEspRecursos(Integer idNivelDetalle) {
        this.idNivelDetalle = idNivelDetalle;
    }

    public Integer getIdNivelDetalle() {
        return idNivelDetalle;
    }

    public void setIdNivelDetalle(Integer idNivelDetalle) {
        this.idNivelDetalle = idNivelDetalle;
    }

    public String getDescripcionNivelDetalle() {
        return descripcionNivelDetalle;
    }

    public void setDescripcionNivelDetalle(String descripcionNivelDetalle) {
        this.descripcionNivelDetalle = descripcionNivelDetalle;
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

    public List<NivelDetalleRecursos> getNivelDetalleRecursosList() {
        return nivelDetalleRecursosList;
    }

    public void setNivelDetalleRecursosList(List<NivelDetalleRecursos> nivelDetalleRecursosList) {
        this.nivelDetalleRecursosList = nivelDetalleRecursosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNivelDetalle != null ? idNivelDetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NivelDetalleEspRecursos)) {
            return false;
        }
        NivelDetalleEspRecursos other = (NivelDetalleEspRecursos) object;
        if ((this.idNivelDetalle == null && other.idNivelDetalle != null) || (this.idNivelDetalle != null && !this.idNivelDetalle.equals(other.idNivelDetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.NivelDetalleEspRecursos[ idNivelDetalle=" + idNivelDetalle + " ]";
    }
    
}
