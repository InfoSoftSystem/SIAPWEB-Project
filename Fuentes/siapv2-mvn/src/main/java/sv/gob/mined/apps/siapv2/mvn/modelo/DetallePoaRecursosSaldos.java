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
public class DetallePoaRecursosSaldos {
    private Integer detallePoaSaldo;
    private BigDecimal montoPreliminar;
    private BigDecimal montoSolicitado;
    private BigDecimal montoAprobado;
    private BigDecimal montoTramite;
    private BigDecimal montoReprogramado;
    private BigDecimal montoComprometido;
    private BigDecimal montoDevengado;
    private BigDecimal montoPagado;
    private BigDecimal montoReservado;
    private BigDecimal montoCongelado;
    private BigDecimal montoDisponible;
    private Integer activo;
    private BigDecimal montoDevengadoProvision;
    private BigDecimal montoPagadoProvision;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private PoaRecursosSaldos saldoRecurso;

    public DetallePoaRecursosSaldos() {
    }

    public DetallePoaRecursosSaldos(Integer detallePoaSaldo) {
        this.detallePoaSaldo = detallePoaSaldo;
    }

    public Integer getDetallePoaSaldo() {
        return detallePoaSaldo;
    }

    public void setDetallePoaSaldo(Integer detallePoaSaldo) {
        this.detallePoaSaldo = detallePoaSaldo;
    }

    public BigDecimal getMontoPreliminar() {
        return montoPreliminar;
    }

    public void setMontoPreliminar(BigDecimal montoPreliminar) {
        this.montoPreliminar = montoPreliminar;
    }

    public BigDecimal getMontoSolicitado() {
        return montoSolicitado;
    }

    public void setMontoSolicitado(BigDecimal montoSolicitado) {
        this.montoSolicitado = montoSolicitado;
    }

    public BigDecimal getMontoAprobado() {
        return montoAprobado;
    }

    public void setMontoAprobado(BigDecimal montoAprobado) {
        this.montoAprobado = montoAprobado;
    }

    public BigDecimal getMontoTramite() {
        return montoTramite;
    }

    public void setMontoTramite(BigDecimal montoTramite) {
        this.montoTramite = montoTramite;
    }

    public BigDecimal getMontoReprogramado() {
        return montoReprogramado;
    }

    public void setMontoReprogramado(BigDecimal montoReprogramado) {
        this.montoReprogramado = montoReprogramado;
    }

    public BigDecimal getMontoComprometido() {
        return montoComprometido;
    }

    public void setMontoComprometido(BigDecimal montoComprometido) {
        this.montoComprometido = montoComprometido;
    }

    public BigDecimal getMontoDevengado() {
        return montoDevengado;
    }

    public void setMontoDevengado(BigDecimal montoDevengado) {
        this.montoDevengado = montoDevengado;
    }

    public BigDecimal getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(BigDecimal montoPagado) {
        this.montoPagado = montoPagado;
    }

    public BigDecimal getMontoReservado() {
        return montoReservado;
    }

    public void setMontoReservado(BigDecimal montoReservado) {
        this.montoReservado = montoReservado;
    }

    public BigDecimal getMontoCongelado() {
        return montoCongelado;
    }

    public void setMontoCongelado(BigDecimal montoCongelado) {
        this.montoCongelado = montoCongelado;
    }

    public BigDecimal getMontoDisponible() {
        return montoDisponible;
    }

    public void setMontoDisponible(BigDecimal montoDisponible) {
        this.montoDisponible = montoDisponible;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }

    public BigDecimal getMontoDevengadoProvision() {
        return montoDevengadoProvision;
    }

    public void setMontoDevengadoProvision(BigDecimal montoDevengadoProvision) {
        this.montoDevengadoProvision = montoDevengadoProvision;
    }

    public BigDecimal getMontoPagadoProvision() {
        return montoPagadoProvision;
    }

    public void setMontoPagadoProvision(BigDecimal montoPagadoProvision) {
        this.montoPagadoProvision = montoPagadoProvision;
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

    public PoaRecursosSaldos getSaldoRecurso() {
        return saldoRecurso;
    }

    public void setSaldoRecurso(PoaRecursosSaldos saldoRecurso) {
        this.saldoRecurso = saldoRecurso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallePoaSaldo != null ? detallePoaSaldo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallePoaRecursosSaldos)) {
            return false;
        }
        DetallePoaRecursosSaldos other = (DetallePoaRecursosSaldos) object;
        if ((this.detallePoaSaldo == null && other.detallePoaSaldo != null) || (this.detallePoaSaldo != null && !this.detallePoaSaldo.equals(other.detallePoaSaldo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.DetallePoaRecursosSaldos[ detallePoaSaldo=" + detallePoaSaldo + " ]";
    }
    
}
