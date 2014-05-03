/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;


import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Infosoft
 */

public class DetalleMovimientosPresupuestarios {
    
    private Integer numeroMovimiento;
    private Integer correlativoMovimiento;
    private Date fechaMovimiento;
    private BigDecimal monto;
    private String afectacion;
    private Integer signo;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private DetallePep corrDetallePep;

    public DetalleMovimientosPresupuestarios() {
    }

    public DetalleMovimientosPresupuestarios(Integer numeroMovimiento) {
        this.numeroMovimiento = numeroMovimiento;
    }

    public Integer getNumeroMovimiento() {
        return numeroMovimiento;
    }

    public void setNumeroMovimiento(Integer numeroMovimiento) {
        this.numeroMovimiento = numeroMovimiento;
    }

    public Integer getCorrelativoMovimiento() {
        return correlativoMovimiento;
    }

    public void setCorrelativoMovimiento(Integer correlativoMovimiento) {
        this.correlativoMovimiento = correlativoMovimiento;
    }

    public Date getFechaMovimiento() {
        return fechaMovimiento;
    }

    public void setFechaMovimiento(Date fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public String getAfectacion() {
        return afectacion;
    }

    public void setAfectacion(String afectacion) {
        this.afectacion = afectacion;
    }

    public Integer getSigno() {
        return signo;
    }

    public void setSigno(Integer signo) {
        this.signo = signo;
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

    public DetallePep getCorrDetallePep() {
        return corrDetallePep;
    }

    public void setCorrDetallePep(DetallePep corrDetallePep) {
        this.corrDetallePep = corrDetallePep;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroMovimiento != null ? numeroMovimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleMovimientosPresupuestarios)) {
            return false;
        }
        DetalleMovimientosPresupuestarios other = (DetalleMovimientosPresupuestarios) object;
        if ((this.numeroMovimiento == null && other.numeroMovimiento != null) || (this.numeroMovimiento != null && !this.numeroMovimiento.equals(other.numeroMovimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.DetalleMovimientosPresupuestarios[ numeroMovimiento=" + numeroMovimiento + " ]";
    }
    
}
