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

public class PgConvenio {
    private Integer convenio;
    private Integer modificacion;
    private String numeroConvenio;
    private String codigoPnud;
    private String descripcion;
    private Date fechaCierre;
    private Date fechaFin;
    private Date fechaActualizacion;
    private Date fechaFirmaContrato;
    private Integer periodoEjecucion;
    private Date fechaEfectivaInicio;
    private Date fechaEfectivaCierre;
    private Date fechaInicio;
    private Integer activo;
    private Integer cerrado;
    private Integer moneda;
    private BigDecimal financiamientoBanco;
    private BigDecimal financiamientoGoes;
    private BigDecimal montoModifFuenteSec;
    private BigDecimal montosProgrPAPFtePpal;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private Integer tieneContraIVA;
    private String name;
    private Integer idEstadoEjecProyecto;
    private Integer identificadorDetalleComportamiento;    
    private Integer identificadorDelProyecto;    
    private Integer idOrigenRecursos;    

    public PgConvenio() {
    }

    public PgConvenio(Integer convenio) {
        this.convenio = convenio;
    }

    public Integer getConvenio() {
        return convenio;
    }

    public void setConvenio(Integer convenio) {
        this.convenio = convenio;
    }

    public Integer getModificacion() {
        return modificacion;
    }

    public void setModificacion(Integer modificacion) {
        this.modificacion = modificacion;
    }

    public String getNumeroConvenio() {
        return numeroConvenio;
    }

    public void setNumeroConvenio(String numeroConvenio) {
        this.numeroConvenio = numeroConvenio;
    }

    public String getCodigoPnud() {
        return codigoPnud;
    }

    public void setCodigoPnud(String codigoPnud) {
        this.codigoPnud = codigoPnud;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public Date getFechaFirmaContrato() {
        return fechaFirmaContrato;
    }

    public void setFechaFirmaContrato(Date fechaFirmaContrato) {
        this.fechaFirmaContrato = fechaFirmaContrato;
    }

    public Integer getPeriodoEjecucion() {
        return periodoEjecucion;
    }

    public void setPeriodoEjecucion(Integer periodoEjecucion) {
        this.periodoEjecucion = periodoEjecucion;
    }

    public Date getFechaEfectivaInicio() {
        return fechaEfectivaInicio;
    }

    public void setFechaEfectivaInicio(Date fechaEfectivaInicio) {
        this.fechaEfectivaInicio = fechaEfectivaInicio;
    }

    public Date getFechaEfectivaCierre() {
        return fechaEfectivaCierre;
    }

    public void setFechaEfectivaCierre(Date fechaEfectivaCierre) {
        this.fechaEfectivaCierre = fechaEfectivaCierre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }

    public Integer getCerrado() {
        return cerrado;
    }

    public void setCerrado(Integer cerrado) {
        this.cerrado = cerrado;
    }

    public BigDecimal getFinanciamientoBanco() {
        return financiamientoBanco;
    }

    public void setFinanciamientoBanco(BigDecimal financiamientoBanco) {
        this.financiamientoBanco = financiamientoBanco;
    }

    public BigDecimal getFinanciamientoGoes() {
        return financiamientoGoes;
    }

    public void setFinanciamientoGoes(BigDecimal financiamientoGoes) {
        this.financiamientoGoes = financiamientoGoes;
    }

    public BigDecimal getMontoModifFuenteSec() {
        return montoModifFuenteSec;
    }

    public void setMontoModifFuenteSec(BigDecimal montoModifFuenteSec) {
        this.montoModifFuenteSec = montoModifFuenteSec;
    }

    public BigDecimal getMontosProgrPAPFtePpal() {
        return montosProgrPAPFtePpal;
    }

    public void setMontosProgrPAPFtePpal(BigDecimal montosProgrPAPFtePpal) {
        this.montosProgrPAPFtePpal = montosProgrPAPFtePpal;
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

    public Integer getMoneda() {
        return moneda;
    }

    public void setMoneda(Integer moneda) {
        this.moneda = moneda;
    }

    public Integer getTieneContraIVA() {
        return tieneContraIVA;
    }

    public void setTieneContraIVA(Integer tieneContraIVA) {
        this.tieneContraIVA = tieneContraIVA;
    }

    @Override
    public String toString() {
        return numeroConvenio;
    }

    public Integer getIdEstadoEjecProyecto() {
        return idEstadoEjecProyecto;
    }

    public void setIdEstadoEjecProyecto(Integer idEstadoEjecProyecto) {
        this.idEstadoEjecProyecto = idEstadoEjecProyecto;
    }

    public Integer getIdentificadorDetalleComportamiento() {
        return identificadorDetalleComportamiento;
    }

    public void setIdentificadorDetalleComportamiento(Integer identificadorDetalleComportamiento) {
        this.identificadorDetalleComportamiento = identificadorDetalleComportamiento;
    }

    public Integer getIdentificadorDelProyecto() {
        return identificadorDelProyecto;
    }

    public void setIdentificadorDelProyecto(Integer identificadorDelProyecto) {
        this.identificadorDelProyecto = identificadorDelProyecto;
    }

    public Integer getIdOrigenRecursos() {
        return idOrigenRecursos;
    }

    public void setIdOrigenRecursos(Integer idOrigenRecursos) {
        this.idOrigenRecursos = idOrigenRecursos;
    }
}