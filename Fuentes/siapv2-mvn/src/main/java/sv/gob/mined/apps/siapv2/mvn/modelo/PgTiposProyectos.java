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

public class PgTiposProyectos  {
    private Integer tipoProyecto;
    private String tipoProyectoNombre;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private List<PgProyectos> pgProyectosList;

    public PgTiposProyectos() {
    }

    public PgTiposProyectos(Integer tipoProyecto) {
        this.tipoProyecto = tipoProyecto;
    }

    public Integer getTipoProyecto() {
        return tipoProyecto;
    }

    public void setTipoProyecto(Integer tipoProyecto) {
        this.tipoProyecto = tipoProyecto;
    }

    public String getTipoProyectoNombre() {
        return tipoProyectoNombre;
    }

    public void setTipoProyectoNombre(String tipoProyectoNombre) {
        this.tipoProyectoNombre = tipoProyectoNombre;
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

    public List<PgProyectos> getPgProyectosList() {
        return pgProyectosList;
    }

    public void setPgProyectosList(List<PgProyectos> pgProyectosList) {
        this.pgProyectosList = pgProyectosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipoProyecto != null ? tipoProyecto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PgTiposProyectos)) {
            return false;
        }
        PgTiposProyectos other = (PgTiposProyectos) object;
        if ((this.tipoProyecto == null && other.tipoProyecto != null) || (this.tipoProyecto != null && !this.tipoProyecto.equals(other.tipoProyecto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.PgTiposProyectos[ tipoProyecto=" + tipoProyecto + " ]";
    }
    
}
