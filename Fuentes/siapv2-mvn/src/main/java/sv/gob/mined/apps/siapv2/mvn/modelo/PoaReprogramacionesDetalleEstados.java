/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;

import java.util.Date;

/**
 *
 * @author Infosoft
 */

public class PoaReprogramacionesDetalleEstados {
    private Integer reprogramacionEstado;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private PoaReprogramaciones reprogramacion;
    private EstadoPoaReprogramaciones estadoPoaReprogramaciones;

    public PoaReprogramacionesDetalleEstados() {
    }

    public PoaReprogramacionesDetalleEstados(Integer reprogramacionEstado) {
        this.reprogramacionEstado = reprogramacionEstado;
    }

    public Integer getReprogramacionEstado() {
        return reprogramacionEstado;
    }

    public void setReprogramacionEstado(Integer reprogramacionEstado) {
        this.reprogramacionEstado = reprogramacionEstado;
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

    public PoaReprogramaciones getReprogramacion() {
        return reprogramacion;
    }

    public void setReprogramacion(PoaReprogramaciones reprogramacion) {
        this.reprogramacion = reprogramacion;
    }

    public EstadoPoaReprogramaciones getEstadoPoaReprogramaciones() {
        return estadoPoaReprogramaciones;
    }

    public void setEstadoPoaReprogramaciones(EstadoPoaReprogramaciones estadoPoaReprogramaciones) {
        this.estadoPoaReprogramaciones = estadoPoaReprogramaciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reprogramacionEstado != null ? reprogramacionEstado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PoaReprogramacionesDetalleEstados)) {
            return false;
        }
        PoaReprogramacionesDetalleEstados other = (PoaReprogramacionesDetalleEstados) object;
        if ((this.reprogramacionEstado == null && other.reprogramacionEstado != null) || (this.reprogramacionEstado != null && !this.reprogramacionEstado.equals(other.reprogramacionEstado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.PoaReprogramacionesDetalleEstados[ reprogramacionEstado=" + reprogramacionEstado + " ]";
    }
    
}
