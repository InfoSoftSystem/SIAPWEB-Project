/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo.view;

import java.util.Date;

/**
 *
 * @author Infosoft
 */
public class VwTrasladoEmpresa {
    private Integer identificadorPrimarioDeLaEmpresa;
    private String numeroDeNit;
    private String razonSocial;
    private String nombreRepresentante;
    private String descripcionDeEstado;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Boolean seleccionado;

    public VwTrasladoEmpresa() {
    }

    public Integer getIdentificadorPrimarioDeLaEmpresa() {
        return identificadorPrimarioDeLaEmpresa;
    }

    public void setIdentificadorPrimarioDeLaEmpresa(Integer identificadorPrimarioDeLaEmpresa) {
        this.identificadorPrimarioDeLaEmpresa = identificadorPrimarioDeLaEmpresa;
    }

    public String getNumeroDeNit() {
        return numeroDeNit;
    }

    public void setNumeroDeNit(String numeroDeNit) {
        this.numeroDeNit = numeroDeNit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombreRepresentante() {
        return nombreRepresentante;
    }

    public void setNombreRepresentante(String nombreRepresentante) {
        this.nombreRepresentante = nombreRepresentante;
    }

    public String getDescripcionDeEstado() {
        return descripcionDeEstado;
    }

    public void setDescripcionDeEstado(String descripcionDeEstado) {
        this.descripcionDeEstado = descripcionDeEstado;
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

    public Boolean getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Boolean seleccionado) {
        this.seleccionado = seleccionado;
    }
}