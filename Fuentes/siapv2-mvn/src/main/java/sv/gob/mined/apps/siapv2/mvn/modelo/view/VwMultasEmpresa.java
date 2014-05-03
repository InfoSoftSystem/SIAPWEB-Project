/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo.view;

import java.math.BigDecimal;

/**
 *
 * @author Infosoft
 */
public class VwMultasEmpresa {
    private Integer identificadorMulta;
    private Integer identificadorPrimarioOferente;
    private String razonSocial;
    private String numeroContrato;
    private BigDecimal montoMulta;
    private String descripcionTipoMulta;
    private String descripcionDeMulta;
    private Integer estadoDeEliminacion;
    
    public VwMultasEmpresa() {
    }

    public Integer getIdentificadorMulta() {
        return identificadorMulta;
    }

    public void setIdentificadorMulta(Integer identificadorMulta) {
        this.identificadorMulta = identificadorMulta;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public Integer getIdentificadorPrimarioOferente() {
        return identificadorPrimarioOferente;
    }

    public void setIdentificadorPrimarioOferente(Integer identificadorPrimarioOferente) {
        this.identificadorPrimarioOferente = identificadorPrimarioOferente;
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

    public BigDecimal getMontoMulta() {
        return montoMulta;
    }

    public void setMontoMulta(BigDecimal montoMulta) {
        this.montoMulta = montoMulta;
    }

    public String getDescripcionTipoMulta() {
        return descripcionTipoMulta;
    }

    public void setDescripcionTipoMulta(String descripcionTipoMulta) {
        this.descripcionTipoMulta = descripcionTipoMulta;
    }

    public String getDescripcionDeMulta() {
        return descripcionDeMulta;
    }

    public void setDescripcionDeMulta(String descripcionDeMulta) {
        this.descripcionDeMulta = descripcionDeMulta;
    }

    public Integer getEstadoDeEliminacion() {
        return estadoDeEliminacion;
    }

    public void setEstadoDeEliminacion(Integer estadoDeEliminacion) {
        this.estadoDeEliminacion = estadoDeEliminacion;
    }
}
