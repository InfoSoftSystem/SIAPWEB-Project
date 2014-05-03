/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo.view;

/**
 *
 * @author Infosoft
 */
public class VwFaltasEmpresa {
    private Integer identificadorFalta;
    private String razonSocial;
    private String numeroContrato;
    private String descripcionTipoFalta;
    private String descripcionFalta;
    private Integer estadoEliminacion;
    private Integer identificadorPrimarioOferente;

    public VwFaltasEmpresa() {
    }

    public Integer getIdentificadorFalta() {
        return identificadorFalta;
    }

    public void setIdentificadorFalta(Integer identificadorFalta) {
        this.identificadorFalta = identificadorFalta;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDescripcionTipoFalta() {
        return descripcionTipoFalta;
    }

    public void setDescripcionTipoFalta(String descripcionTipoFalta) {
        this.descripcionTipoFalta = descripcionTipoFalta;
    }

    public String getDescripcionFalta() {
        return descripcionFalta;
    }

    public void setDescripcionFalta(String descripcionFalta) {
        this.descripcionFalta = descripcionFalta;
    }

    public String getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(String numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public Integer getEstadoEliminacion() {
        return estadoEliminacion;
    }

    public void setEstadoEliminacion(Integer estadoEliminacion) {
        this.estadoEliminacion = estadoEliminacion;
    }

    public Integer getIdentificadorPrimarioOferente() {
        return identificadorPrimarioOferente;
    }

    public void setIdentificadorPrimarioOferente(Integer identificadorPrimarioOferente) {
        this.identificadorPrimarioOferente = identificadorPrimarioOferente;
    }
}