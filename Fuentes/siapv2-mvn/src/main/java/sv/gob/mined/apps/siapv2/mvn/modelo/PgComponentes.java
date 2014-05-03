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

public class PgComponentes  {
    private Integer componente;
    private String codigoComponente;
    private String componenteNombre;
    private String estructuraOrganizativa;
    private Integer modificacion;
    private String componenteObjetivo;
    private BigDecimal financiamientoBanco;
    private BigDecimal financiamientoGoes;
    private BigDecimal montoModifFuentePpal;
    private BigDecimal montoModifFuenteSec;
    private BigDecimal montosProgrPAPFtePpal;
    private BigDecimal montoProgPAPFteSec;
    private BigDecimal dispEjecFtePpal;
    private BigDecimal dispEjecFteSec;
    private BigDecimal disponiblePrestamo;
    private BigDecimal disponibleGoes;
    private BigDecimal montoReservadoFuentePppal;
    private BigDecimal montoReservadoFuenteSec;
    private BigDecimal montoDispPAPFtePpal;
    private BigDecimal montoDispPAPFteSec;
    private Integer componenteNivel;
    private Integer activo;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private Integer convenio;
    private Integer pgComponente;

    public PgComponentes() {
    }

    public PgComponentes(Integer componente) {
        this.componente = componente;
    }

    public Integer getComponente() {
        return componente;
    }

    public void setComponente(Integer componente) {
        this.componente = componente;
    }

    public String getCodigoComponente() {
        return codigoComponente;
    }

    public void setCodigoComponente(String codigoComponente) {
        this.codigoComponente = codigoComponente;
    }

    public String getComponenteNombre() {
        return componenteNombre;
    }

    public void setComponenteNombre(String componenteNombre) {
        this.componenteNombre = componenteNombre;
    }

    public String getEstructuraOrganizativa() {
        return estructuraOrganizativa;
    }

    public void setEstructuraOrganizativa(String estructuraOrganizativa) {
        this.estructuraOrganizativa = estructuraOrganizativa;
    }

    public Integer getModificacion() {
        return modificacion;
    }

    public void setModificacion(Integer modificacion) {
        this.modificacion = modificacion;
    }

    public String getComponenteObjetivo() {
        return componenteObjetivo;
    }

    public void setComponenteObjetivo(String componenteObjetivo) {
        this.componenteObjetivo = componenteObjetivo;
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

    public BigDecimal getMontoModifFuentePpal() {
        return montoModifFuentePpal;
    }

    public void setMontoModifFuentePpal(BigDecimal montoModifFuentePpal) {
        this.montoModifFuentePpal = montoModifFuentePpal;
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

    public BigDecimal getMontoProgPAPFteSec() {
        return montoProgPAPFteSec;
    }

    public void setMontoProgPAPFteSec(BigDecimal montoProgPAPFteSec) {
        this.montoProgPAPFteSec = montoProgPAPFteSec;
    }

    public BigDecimal getDispEjecFtePpal() {
        return dispEjecFtePpal;
    }

    public void setDispEjecFtePpal(BigDecimal dispEjecFtePpal) {
        this.dispEjecFtePpal = dispEjecFtePpal;
    }

    public BigDecimal getDispEjecFteSec() {
        return dispEjecFteSec;
    }

    public void setDispEjecFteSec(BigDecimal dispEjecFteSec) {
        this.dispEjecFteSec = dispEjecFteSec;
    }

    public BigDecimal getDisponiblePrestamo() {
        return disponiblePrestamo;
    }

    public void setDisponiblePrestamo(BigDecimal disponiblePrestamo) {
        this.disponiblePrestamo = disponiblePrestamo;
    }

    public BigDecimal getDisponibleGoes() {
        return disponibleGoes;
    }

    public void setDisponibleGoes(BigDecimal disponibleGoes) {
        this.disponibleGoes = disponibleGoes;
    }

    public BigDecimal getMontoReservadoFuentePppal() {
        return montoReservadoFuentePppal;
    }

    public void setMontoReservadoFuentePppal(BigDecimal montoReservadoFuentePppal) {
        this.montoReservadoFuentePppal = montoReservadoFuentePppal;
    }

    public BigDecimal getMontoReservadoFuenteSec() {
        return montoReservadoFuenteSec;
    }

    public void setMontoReservadoFuenteSec(BigDecimal montoReservadoFuenteSec) {
        this.montoReservadoFuenteSec = montoReservadoFuenteSec;
    }

    public BigDecimal getMontoDispPAPFtePpal() {
        return montoDispPAPFtePpal;
    }

    public void setMontoDispPAPFtePpal(BigDecimal montoDispPAPFtePpal) {
        this.montoDispPAPFtePpal = montoDispPAPFtePpal;
    }

    public BigDecimal getMontoDispPAPFteSec() {
        return montoDispPAPFteSec;
    }

    public void setMontoDispPAPFteSec(BigDecimal montoDispPAPFteSec) {
        this.montoDispPAPFteSec = montoDispPAPFteSec;
    }

    public Integer getComponenteNivel() {
        return componenteNivel;
    }

    public void setComponenteNivel(Integer componenteNivel) {
        this.componenteNivel = componenteNivel;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
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

    @Override
    public String toString() {
        return componenteNombre;
    }

    public Integer getConvenio() {
        return convenio;
    }

    public void setConvenio(Integer convenio) {
        this.convenio = convenio;
    }

    public Integer getPgComponente() {
        return pgComponente;
    }

    public void setPgComponente(Integer pgComponente) {
        this.pgComponente = pgComponente;
    }
}