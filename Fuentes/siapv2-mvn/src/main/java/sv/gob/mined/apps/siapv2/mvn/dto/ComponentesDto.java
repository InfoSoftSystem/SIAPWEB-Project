/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dto;

import java.math.BigDecimal;

/**
 *
 * @author Infosoft
 */
public class ComponentesDto {
    
    
    private Integer componente;
    private String componente_nombre;
    private BigDecimal monto_apr_fte_ppal;
    private BigDecimal monto_pre_fte_ppal;
    private BigDecimal monto_apr_fte_cont;
    private BigDecimal monto_pre_fte_cont;
    private BigDecimal monto_saldo_ppal;
    private BigDecimal monto_saldo_cont;

    public ComponentesDto() {
    }

    public Integer getComponente() {
        return componente;
    }

    public void setComponente(Integer componente) {
        this.componente = componente;
    }

    public String getComponente_nombre() {
        return componente_nombre;
    }

    public void setComponente_nombre(String componente_nombre) {
        this.componente_nombre = componente_nombre;
    }

    public BigDecimal getMonto_apr_fte_ppal() {
        return monto_apr_fte_ppal;
    }

    public void setMonto_apr_fte_ppal(BigDecimal monto_apr_fte_ppal) {
        this.monto_apr_fte_ppal = monto_apr_fte_ppal;
    }

    public BigDecimal getMonto_pre_fte_ppal() {
        return monto_pre_fte_ppal;
    }

    public void setMonto_pre_fte_ppal(BigDecimal monto_pre_fte_ppal) {
        this.monto_pre_fte_ppal = monto_pre_fte_ppal;
    }

    public BigDecimal getMonto_apr_fte_cont() {
        return monto_apr_fte_cont;
    }

    public void setMonto_apr_fte_cont(BigDecimal monto_apr_fte_cont) {
        this.monto_apr_fte_cont = monto_apr_fte_cont;
    }

    public BigDecimal getMonto_pre_fte_cont() {
        return monto_pre_fte_cont;
    }

    public void setMonto_pre_fte_cont(BigDecimal monto_pre_fte_cont) {
        this.monto_pre_fte_cont = monto_pre_fte_cont;
    }

    public BigDecimal getMonto_saldo_ppal() {
        return monto_saldo_ppal;
    }

    public void setMonto_saldo_ppal(BigDecimal monto_saldo_ppal) {
        this.monto_saldo_ppal = monto_saldo_ppal;
    }

    public BigDecimal getMonto_saldo_cont() {
        return monto_saldo_cont;
    }

    public void setMonto_saldo_cont(BigDecimal monto_saldo_cont) {
        this.monto_saldo_cont = monto_saldo_cont;
    }

   

   
    
}
