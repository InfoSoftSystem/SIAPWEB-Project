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
public class VwRescisionesEmpresa {

    private Integer identificadorRecesion;
    private String razonSocial;
    private String numeroContrato;
    private Date fechaRecesion;
    private BigDecimal montoPagado;
    private BigDecimal montoRemanente;
    private String descripcionTipoRecesion;
    private String descripcionRecesion;
    private Integer estadoDeEliminacion;

    public VwRescisionesEmpresa() {
    }

    public Integer getIdentificadorRecesion() {
        return identificadorRecesion;
    }

    public void setIdentificadorRecesion(Integer identificadorRecesion) {
        this.identificadorRecesion = identificadorRecesion;
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

    public Date getFechaRecesion() {
        return fechaRecesion;
    }

    public void setFechaRecesion(Date fechaRecesion) {
        this.fechaRecesion = fechaRecesion;
    }

    public BigDecimal getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(BigDecimal montoPagado) {
        this.montoPagado = montoPagado;
    }

    public BigDecimal getMontoRemanente() {
        return montoRemanente;
    }

    public void setMontoRemanente(BigDecimal montoRemanente) {
        this.montoRemanente = montoRemanente;
    }

    public String getDescripcionTipoRecesion() {
        return descripcionTipoRecesion;
    }

    public void setDescripcionTipoRecesion(String descripcionTipoRecesion) {
        this.descripcionTipoRecesion = descripcionTipoRecesion;
    }

    public String getDescripcionRecesion() {
        return descripcionRecesion;
    }

    public void setDescripcionRecesion(String descripcionRecesion) {
        this.descripcionRecesion = descripcionRecesion;
    }

    public Integer getEstadoDeEliminacion() {
        return estadoDeEliminacion;
    }

    public void setEstadoDeEliminacion(Integer estadoDeEliminacion) {
        this.estadoDeEliminacion = estadoDeEliminacion;
    }
}