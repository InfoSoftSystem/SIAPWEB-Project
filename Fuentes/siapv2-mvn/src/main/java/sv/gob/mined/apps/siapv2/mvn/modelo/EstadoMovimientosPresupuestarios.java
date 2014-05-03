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

public class EstadoMovimientosPresupuestarios {
    private Integer estadoMovimientoPresupuestario;
    private String descripcionEstadoMovPres;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private List<MovimientosPresupuestario> movimientosPresupuestarioList;

    public EstadoMovimientosPresupuestarios() {
    }

    public EstadoMovimientosPresupuestarios(Integer estadoMovimientoPresupuestario) {
        this.estadoMovimientoPresupuestario = estadoMovimientoPresupuestario;
    }

    public Integer getEstadoMovimientoPresupuestario() {
        return estadoMovimientoPresupuestario;
    }

    public void setEstadoMovimientoPresupuestario(Integer estadoMovimientoPresupuestario) {
        this.estadoMovimientoPresupuestario = estadoMovimientoPresupuestario;
    }

    public String getDescripcionEstadoMovPres() {
        return descripcionEstadoMovPres;
    }

    public void setDescripcionEstadoMovPres(String descripcionEstadoMovPres) {
        this.descripcionEstadoMovPres = descripcionEstadoMovPres;
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

    public List<MovimientosPresupuestario> getMovimientosPresupuestarioList() {
        return movimientosPresupuestarioList;
    }

    public void setMovimientosPresupuestarioList(List<MovimientosPresupuestario> movimientosPresupuestarioList) {
        this.movimientosPresupuestarioList = movimientosPresupuestarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (estadoMovimientoPresupuestario != null ? estadoMovimientoPresupuestario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoMovimientosPresupuestarios)) {
            return false;
        }
        EstadoMovimientosPresupuestarios other = (EstadoMovimientosPresupuestarios) object;
        if ((this.estadoMovimientoPresupuestario == null && other.estadoMovimientoPresupuestario != null) || (this.estadoMovimientoPresupuestario != null && !this.estadoMovimientoPresupuestario.equals(other.estadoMovimientoPresupuestario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.EstadoMovimientosPresupuestarios[ estadoMovimientoPresupuestario=" + estadoMovimientoPresupuestario + " ]";
    }
    
}
