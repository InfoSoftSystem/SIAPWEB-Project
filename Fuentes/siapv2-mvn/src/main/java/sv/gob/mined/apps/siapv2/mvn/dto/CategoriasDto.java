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
public class CategoriasDto {

    private Integer id_categoria;
    private String descripcion;
    private BigDecimal monto_apr_fte_ppal;
    private BigDecimal monto_pre_fte_ppal;
    private BigDecimal monto_apr_fte_cont;
    private BigDecimal monto_pre_fte_cont;
    private BigDecimal monto_saldo_ppal;
    private BigDecimal monto_saldo_cont;

    public CategoriasDto() {
    }

    public Integer getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Integer id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public void setMonto_apr_fte_cont(BigDecimal monto_apro_fte_cont) {
        this.monto_apr_fte_cont = monto_apro_fte_cont;
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
