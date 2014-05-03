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
public class MontosPapDto {

    private Integer poa;
    private String descripcionAnho;
    private BigDecimal montoFtePpal;
    private BigDecimal montoFteCont;
    private String estadoPap;

    public MontosPapDto() {
    }

    public Integer getPoa() {
        return poa;
    }

    public void setPoa(Integer poa) {
        this.poa = poa;
    }

    public String getDescripcionAnho() {
        return descripcionAnho;
    }

    public void setDescripcionAnho(String descripcionAnho) {
        this.descripcionAnho = descripcionAnho;
    }

    public BigDecimal getMontoFtePpal() {
        return montoFtePpal;
    }

    public void setMontoFtePpal(BigDecimal montoFtePpal) {
        this.montoFtePpal = montoFtePpal;
    }

    public BigDecimal getMontoFteCont() {
        return montoFteCont;
    }

    public void setMontoFteCont(BigDecimal montoFteCont) {
        this.montoFteCont = montoFteCont;
    }

    public String getEstadoPap() {
        return estadoPap;
    }

    public void setEstadoPap(String estadoPap) {
        this.estadoPap = estadoPap;
    }
}