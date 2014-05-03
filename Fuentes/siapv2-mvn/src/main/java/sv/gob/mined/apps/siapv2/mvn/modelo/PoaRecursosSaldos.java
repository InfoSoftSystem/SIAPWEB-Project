/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;

import java.math.BigDecimal;
import java.util.Date;
import sv.gob.mined.apps.siapv2.mvn.dao.PersistenciaDao;

/**
 *
 * @author Infosoft
 */

public class PoaRecursosSaldos implements PersistenciaDao{
    
    private Integer saldoRecurso;
    private Integer poaSaldoRecurso;
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
    private Integer reprogramacion;
    private Integer recurso;
    private Integer organismo;
    private Integer convenio;

    public PoaRecursosSaldos() {
    }

    public PoaRecursosSaldos(Integer saldoRecurso) {
        this.saldoRecurso = saldoRecurso;
    }

    public Integer getSaldoRecurso() {
        return saldoRecurso;
    }

    public void setSaldoRecurso(Integer saldoRecurso) {
        this.saldoRecurso = saldoRecurso;
    }

    public Integer getPoaSaldoRecurso() {
        return poaSaldoRecurso;
    }

    public void setPoaSaldoRecurso(Integer poaSaldoRecurso) {
        this.poaSaldoRecurso = poaSaldoRecurso;
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

    @Override
    public void setFechaDeInsercion(Date fechaDeInsercion) {
        this.fechaDeInsercion = fechaDeInsercion;
    }

    public Date getFechaDeModificacion() {
        return fechaDeModificacion;
    }

    @Override
    public void setFechaDeModificacion(Date fechaDeModificacion) {
        this.fechaDeModificacion = fechaDeModificacion;
    }

    public Date getFechaDeEliminacion() {
        return fechaDeEliminacion;
    }

    @Override
    public void setFechaDeEliminacion(Date fechaDeEliminacion) {
        this.fechaDeEliminacion = fechaDeEliminacion;
    }

    @Override
    public Integer getEstadoDeEliminacion() {
        return estadoDeEliminacion;
    }

    public void setEstadoDeEliminacion(Integer estadoDeEliminacion) {
        this.estadoDeEliminacion = estadoDeEliminacion;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Integer getReprogramacion() {
        return reprogramacion;
    }

    public void setReprogramacion(Integer reprogramacion) {
        this.reprogramacion = reprogramacion;
    }

    public Integer getRecurso() {
        return recurso;
    }

    public void setRecurso(Integer recurso) {
        this.recurso = recurso;
    }

    public Integer getOrganismo() {
        return organismo;
    }

    public void setOrganismo(Integer organismo) {
        this.organismo = organismo;
    }

    public Integer getConvenio() {
        return convenio;
    }

    public void setConvenio(Integer convenio) {
        this.convenio = convenio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (saldoRecurso != null ? saldoRecurso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PoaRecursosSaldos)) {
            return false;
        }
        PoaRecursosSaldos other = (PoaRecursosSaldos) object;
        if ((this.saldoRecurso == null && other.saldoRecurso != null) || (this.saldoRecurso != null && !this.saldoRecurso.equals(other.saldoRecurso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.PoaRecursosSaldos[ saldoRecurso=" + saldoRecurso + " ]";
    }

    @Override
    public String generarInsertSQL() {
        return "INSERT INTO dbo.poa_recursos_saldos (organismo, convenio, reprogramacion, recurso, poaSaldoRecurso, monto_preliminar, monto_solicitado, monto_aprobado, monto_tramite, monto_reprogramado, monto_comprometido, monto_devengado, monto_pagado, monto_reservado, monto_congelado, monto_disponible, activo, monto_devengado_provision, monto_pagado_provision, fechaDeInsercion, fechaDeModificacion, fechaDeEliminacion, estadoDeEliminacion, name) " +
                    " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    }

    @Override
    public Object[] getDatosInsert() {
        return new Object[]{organismo, convenio, reprogramacion, recurso, poaSaldoRecurso, montoPreliminar, montoSolicitado, montoAprobado, montoTramite, montoReprogramado, montoComprometido, montoDevengado, montoPagado, montoReservado, montoCongelado, montoDisponible, activo, montoDevengadoProvision ,montoPagadoProvision, fechaDeInsercion, fechaDeModificacion, fechaDeEliminacion, estadoDeEliminacion, name};
    }

    @Override
    public String generarUpdateSQL() {
        return "UPDATE dbo.poa_recursos_saldos SET organismo=?, convenio=?, reprogramacion=?, recurso=?, poaSaldoRecurso=?, monto_preliminar=?, monto_solicitado=?, monto_aprobado=?, monto_tramite=?, monto_reprogramado=?, monto_comprometido=?, monto_devengado=?, monto_pagado=?, monto_reservado=?, monto_congelado=?, monto_disponible=?, activo=?, monto_devengado_provision=?, monto_pagado_provision=?, fechaDeInsercion=?, fechaDeModificacion=?, fechaDeEliminacion=?, estadoDeEliminacion=?, name=? " +
                "WHERE saldo_recurso = ?";
    }

    @Override
    public Object[] getDatosUpdate() {
        return new Object[]{organismo, convenio, reprogramacion, recurso, poaSaldoRecurso, montoPreliminar, montoSolicitado, montoAprobado, montoTramite, montoReprogramado, montoComprometido, montoDevengado, montoPagado, montoReservado, montoCongelado, montoDisponible, activo, montoDevengadoProvision ,montoPagadoProvision, fechaDeInsercion, fechaDeModificacion, fechaDeEliminacion, estadoDeEliminacion, name, saldoRecurso};
    }
}