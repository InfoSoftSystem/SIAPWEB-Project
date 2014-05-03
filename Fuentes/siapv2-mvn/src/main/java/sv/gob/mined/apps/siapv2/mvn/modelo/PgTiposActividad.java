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

public class PgTiposActividad {
    
    private Integer tipoActividad;
    private String tipoActividadDescripcion;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private List<PgActividades> pgActividadesList;

    public PgTiposActividad() {
    }

    public PgTiposActividad(Integer tipoActividad) {
        this.tipoActividad = tipoActividad;
    }

    public Integer getTipoActividad() {
        return tipoActividad;
    }

    public void setTipoActividad(Integer tipoActividad) {
        this.tipoActividad = tipoActividad;
    }

    public String getTipoActividadDescripcion() {
        return tipoActividadDescripcion;
    }

    public void setTipoActividadDescripcion(String tipoActividadDescripcion) {
        this.tipoActividadDescripcion = tipoActividadDescripcion;
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

    public List<PgActividades> getPgActividadesList() {
        return pgActividadesList;
    }

    public void setPgActividadesList(List<PgActividades> pgActividadesList) {
        this.pgActividadesList = pgActividadesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipoActividad != null ? tipoActividad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PgTiposActividad)) {
            return false;
        }
        PgTiposActividad other = (PgTiposActividad) object;
        if ((this.tipoActividad == null && other.tipoActividad != null) || (this.tipoActividad != null && !this.tipoActividad.equals(other.tipoActividad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.PgTiposActividad[ tipoActividad=" + tipoActividad + " ]";
    }
    
}
