/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Infosoft
 */

public class DetallePep  {
    
    private Integer corrDetallePep;
    private Integer saldoRecurso;
    private Integer mes;
    private Integer origenDeLosRecursos;
    private Integer rubroClasificacionEconomica;
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
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private List<DetalleMovimientosPresupuestarios> detalleMovimientosPresupuestariosList;
    private PgEntidadesFinanciadoras organismo;
    private PgConvenio convenio;
    private Pep identificadorPepp;
    private EstructuraPresupuestaria idEstructuraPresupuestaria;
    private EjerciciosPresupuestarios ejercicioPresupuestario;
    private ClasificadoresPresupuestarios clasificadorPresupuestario;

    public DetallePep() {
    }

    public DetallePep(Integer corrDetallePep) {
        this.corrDetallePep = corrDetallePep;
    }

    public Integer getCorrDetallePep() {
        return corrDetallePep;
    }

    public void setCorrDetallePep(Integer corrDetallePep) {
        this.corrDetallePep = corrDetallePep;
    }

    public Integer getSaldoRecurso() {
        return saldoRecurso;
    }

    public void setSaldoRecurso(Integer saldoRecurso) {
        this.saldoRecurso = saldoRecurso;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getOrigenDeLosRecursos() {
        return origenDeLosRecursos;
    }

    public void setOrigenDeLosRecursos(Integer origenDeLosRecursos) {
        this.origenDeLosRecursos = origenDeLosRecursos;
    }

    public Integer getRubroClasificacionEconomica() {
        return rubroClasificacionEconomica;
    }

    public void setRubroClasificacionEconomica(Integer rubroClasificacionEconomica) {
        this.rubroClasificacionEconomica = rubroClasificacionEconomica;
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

    public List<DetalleMovimientosPresupuestarios> getDetalleMovimientosPresupuestariosList() {
        return detalleMovimientosPresupuestariosList;
    }

    public void setDetalleMovimientosPresupuestariosList(List<DetalleMovimientosPresupuestarios> detalleMovimientosPresupuestariosList) {
        this.detalleMovimientosPresupuestariosList = detalleMovimientosPresupuestariosList;
    }

    public PgEntidadesFinanciadoras getOrganismo() {
        return organismo;
    }

    public void setOrganismo(PgEntidadesFinanciadoras organismo) {
        this.organismo = organismo;
    }

    public PgConvenio getConvenio() {
        return convenio;
    }

    public void setConvenio(PgConvenio convenio) {
        this.convenio = convenio;
    }

    public Pep getIdentificadorPepp() {
        return identificadorPepp;
    }

    public void setIdentificadorPepp(Pep identificadorPepp) {
        this.identificadorPepp = identificadorPepp;
    }

    public EstructuraPresupuestaria getIdEstructuraPresupuestaria() {
        return idEstructuraPresupuestaria;
    }

    public void setIdEstructuraPresupuestaria(EstructuraPresupuestaria idEstructuraPresupuestaria) {
        this.idEstructuraPresupuestaria = idEstructuraPresupuestaria;
    }

    public EjerciciosPresupuestarios getEjercicioPresupuestario() {
        return ejercicioPresupuestario;
    }

    public void setEjercicioPresupuestario(EjerciciosPresupuestarios ejercicioPresupuestario) {
        this.ejercicioPresupuestario = ejercicioPresupuestario;
    }

    public ClasificadoresPresupuestarios getClasificadorPresupuestario() {
        return clasificadorPresupuestario;
    }

    public void setClasificadorPresupuestario(ClasificadoresPresupuestarios clasificadorPresupuestario) {
        this.clasificadorPresupuestario = clasificadorPresupuestario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (corrDetallePep != null ? corrDetallePep.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallePep)) {
            return false;
        }
        DetallePep other = (DetallePep) object;
        if ((this.corrDetallePep == null && other.corrDetallePep != null) || (this.corrDetallePep != null && !this.corrDetallePep.equals(other.corrDetallePep))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.DetallePep[ corrDetallePep=" + corrDetallePep + " ]";
    }
    
}
