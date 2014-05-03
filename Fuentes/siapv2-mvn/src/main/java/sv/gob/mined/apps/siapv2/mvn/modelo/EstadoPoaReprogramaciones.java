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

public class EstadoPoaReprogramaciones  {
    private Integer estadoPoaReprogramaciones;
    private String descripcionEstado;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private List<PoaReprogramacionesDetalleEstados> poaReprogramacionesDetalleEstadosList;
    private PoaReprogramaciones reprogramacion;
    private List<PoaReprogramaciones> poaReprogramacionesList;

    public EstadoPoaReprogramaciones() {
    }

    public EstadoPoaReprogramaciones(Integer estadoPoaReprogramaciones) {
        this.estadoPoaReprogramaciones = estadoPoaReprogramaciones;
    }

    public Integer getEstadoPoaReprogramaciones() {
        return estadoPoaReprogramaciones;
    }

    public void setEstadoPoaReprogramaciones(Integer estadoPoaReprogramaciones) {
        this.estadoPoaReprogramaciones = estadoPoaReprogramaciones;
    }

    public String getDescripcionEstado() {
        return descripcionEstado;
    }

    public void setDescripcionEstado(String descripcionEstado) {
        this.descripcionEstado = descripcionEstado;
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

    public List<PoaReprogramacionesDetalleEstados> getPoaReprogramacionesDetalleEstadosList() {
        return poaReprogramacionesDetalleEstadosList;
    }

    public void setPoaReprogramacionesDetalleEstadosList(List<PoaReprogramacionesDetalleEstados> poaReprogramacionesDetalleEstadosList) {
        this.poaReprogramacionesDetalleEstadosList = poaReprogramacionesDetalleEstadosList;
    }

    public PoaReprogramaciones getReprogramacion() {
        return reprogramacion;
    }

    public void setReprogramacion(PoaReprogramaciones reprogramacion) {
        this.reprogramacion = reprogramacion;
    }

    public List<PoaReprogramaciones> getPoaReprogramacionesList() {
        return poaReprogramacionesList;
    }

    public void setPoaReprogramacionesList(List<PoaReprogramaciones> poaReprogramacionesList) {
        this.poaReprogramacionesList = poaReprogramacionesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (estadoPoaReprogramaciones != null ? estadoPoaReprogramaciones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoPoaReprogramaciones)) {
            return false;
        }
        EstadoPoaReprogramaciones other = (EstadoPoaReprogramaciones) object;
        if ((this.estadoPoaReprogramaciones == null && other.estadoPoaReprogramaciones != null) || (this.estadoPoaReprogramaciones != null && !this.estadoPoaReprogramaciones.equals(other.estadoPoaReprogramaciones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return descripcionEstado;
    }
    
}
