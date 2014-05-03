/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;

import java.util.Date;

/**
 *
 * @author Infosoft
 */
public class CoberturaTerritorio {

    private Integer identificadorPrimarioDeLaEmpresa;
    private String codigo_departamento;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private String identificadorDeLaSesion;
    private Integer identificadorPrimarioOferente;
    private CoberturaTerritorio ct;

    public CoberturaTerritorio() {
    }

    public CoberturaTerritorio(CoberturaTerritorio ct) {
        this.ct = ct;
    }

    public String getCodigo_departamento() {
        return codigo_departamento;
    }

    public void setCodigo_departamento(String codigo_departamento) {
        this.codigo_departamento = codigo_departamento;
    }

    public CoberturaTerritorio getCt() {
        return ct;
    }

    public void setCt(CoberturaTerritorio ct) {
        this.ct = ct;
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

    public String getIdentificadorDeLaSesion() {
        return identificadorDeLaSesion;
    }

    public void setIdentificadorDeLaSesion(String identificadorDeLaSesion) {
        this.identificadorDeLaSesion = identificadorDeLaSesion;
    }

    public Integer getIdentificadorPrimarioDeLaEmpresa() {
        return identificadorPrimarioDeLaEmpresa;
    }

    public void setIdentificadorPrimarioDeLaEmpresa(Integer identificadorPrimarioDeLaEmpresa) {
        this.identificadorPrimarioDeLaEmpresa = identificadorPrimarioDeLaEmpresa;
    }

    public Integer getIdentificadorPrimarioOferente() {
        return identificadorPrimarioOferente;
    }

    public void setIdentificadorPrimarioOferente(Integer identificadorPrimarioOferente) {
        this.identificadorPrimarioOferente = identificadorPrimarioOferente;
    }

    public String generarInsertSQL() {
        String query = "INSERT INTO dbo.CoberturaTerritorio (identificadorPrimarioDeLaEmpresa, identificadorPrimarioOferente, codigo_departamento, fechaDeInsercion, fechaDeModificacion, identificadorDeLaSesion) VALUES (" + ct.getIdentificadorPrimarioDeLaEmpresa() + "," + ct.getIdentificadorPrimarioOferente() + "," + ct.getCodigo_departamento() + "," + ct.getFechaDeInsercion() + "," + ct.getFechaDeModificacion() + "," + ct.getIdentificadorDeLaSesion() + ")";
        return query;
    }

    public String generarUpdateSQL() {
        String query = "update dbo.CoberturaTerritorio SET identificadorPrimarioDeLaEmpresa=" + ct.getIdentificadorPrimarioDeLaEmpresa() + ",identificadorPrimarioOferente=" + ct.getIdentificadorPrimarioOferente() + ",codigo_departamento=" + ct.getCodigo_departamento() + ",fechaDeInsercion=" + ct.getFechaDeInsercion() + ",fechaDeModificacion=" + ct.getFechaDeModificacion() + ",identificadorDeLaSesion=" + ct.getIdentificadorDeLaSesion() + "";
        return query;
    }
}
