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

public class MovimientosPresupuestario  {
    private Integer correlativoMovimiento;
    private Date fechaSolicitudMovPres;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private PoaReprogramaciones reprogramacion;
    private EstadoMovimientosPresupuestarios estadoMovimientoPresupuestario;

    public MovimientosPresupuestario() {
    }

    public MovimientosPresupuestario(Integer correlativoMovimiento) {
        this.correlativoMovimiento = correlativoMovimiento;
    }

    public Integer getCorrelativoMovimiento() {
        return correlativoMovimiento;
    }

    public void setCorrelativoMovimiento(Integer correlativoMovimiento) {
        this.correlativoMovimiento = correlativoMovimiento;
    }

    public Date getFechaSolicitudMovPres() {
        return fechaSolicitudMovPres;
    }

    public void setFechaSolicitudMovPres(Date fechaSolicitudMovPres) {
        this.fechaSolicitudMovPres = fechaSolicitudMovPres;
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

    public EstadoMovimientosPresupuestarios getEstadoMovimientoPresupuestario() {
        return estadoMovimientoPresupuestario;
    }

    public void setEstadoMovimientoPresupuestario(EstadoMovimientosPresupuestarios estadoMovimientoPresupuestario) {
        this.estadoMovimientoPresupuestario = estadoMovimientoPresupuestario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (correlativoMovimiento != null ? correlativoMovimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovimientosPresupuestario)) {
            return false;
        }
        MovimientosPresupuestario other = (MovimientosPresupuestario) object;
        if ((this.correlativoMovimiento == null && other.correlativoMovimiento != null) || (this.correlativoMovimiento != null && !this.correlativoMovimiento.equals(other.correlativoMovimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.MovimientosPresupuestario[ correlativoMovimiento=" + correlativoMovimiento + " ]";
    }
    
}
