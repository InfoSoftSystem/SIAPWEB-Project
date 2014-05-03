/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo.view;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Infosoft
 */
public class VwGarantiasEmpresa  {
    private Integer identificadorGarantia;
    private String razonSocial;
    private String numeroContrato;
    private String descripcionTipoGarantia;
    private BigDecimal montoGarantia;
    private Date fechaVencimiento;
    private Integer estadoGarantia;
    private String descripcionGarantia;
    private Integer estadoDeEliminacion;
    private Integer identificadorPrimarioOferente;

    public VwGarantiasEmpresa() {
    }

    public Integer getIdentificadorGarantia() {
        return identificadorGarantia;
    }

    public void setIdentificadorGarantia(Integer identificadorGarantia) {
        this.identificadorGarantia = identificadorGarantia;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(String numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public String getDescripcionTipoGarantia() {
        return descripcionTipoGarantia;
    }

    public void setDescripcionTipoGarantia(String descripcionTipoGarantia) {
        this.descripcionTipoGarantia = descripcionTipoGarantia;
    }

    public BigDecimal getMontoGarantia() {
        return montoGarantia;
    }

    public void setMontoGarantia(BigDecimal montoGarantia) {
        this.montoGarantia = montoGarantia;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Integer getEstadoGarantia() {
        return estadoGarantia;
    }

    public void setEstadoGarantia(Integer estadoGarantia) {
        this.estadoGarantia = estadoGarantia;
    }

    public String getDescripcionGarantia() {
        return descripcionGarantia;
    }

    public void setDescripcionGarantia(String descripcionGarantia) {
        this.descripcionGarantia = descripcionGarantia;
    }

    public Integer getEstadoDeEliminacion() {
        return estadoDeEliminacion;
    }

    public void setEstadoDeEliminacion(Integer estadoDeEliminacion) {
        this.estadoDeEliminacion = estadoDeEliminacion;
    }

    public Integer getIdentificadorPrimarioOferente() {
        return identificadorPrimarioOferente;
    }

    public void setIdentificadorPrimarioOferente(Integer identificadorPrimarioOferente) {
        this.identificadorPrimarioOferente = identificadorPrimarioOferente;
    }
}