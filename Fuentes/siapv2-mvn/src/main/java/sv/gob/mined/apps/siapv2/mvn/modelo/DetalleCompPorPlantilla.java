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

public class DetalleCompPorPlantilla{
    
    private Integer idPlantillaComportamiento;
    private Integer identificadorDetalleComportamiento;
    private String descripcionDeLaPlantilla;
    private Integer existeCodigoDelProyecto;
    private Integer aplicaCodigoSiip;
    private Integer duracionPrevistaMasDeUnAno;
    private Integer variablesDeControlPropias;
    private Integer tieneVariosConveniosDePrestamo;
    private Integer aplicaNivelDeComponentes;
    private Integer nivelDeComponentes;
    private Integer existeMasFuentesFinanc;
    private Integer tieneAfectacionPresupuestaria;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private PlantillaDeComportamientos plantillaDeComportamientos;

    public DetalleCompPorPlantilla() {
    }

    public Integer getIdPlantillaComportamiento() {
        return idPlantillaComportamiento;
    }

    public void setIdPlantillaComportamiento(Integer idPlantillaComportamiento) {
        this.idPlantillaComportamiento = idPlantillaComportamiento;
    }

    public Integer getIdentificadorDetalleComportamiento() {
        return identificadorDetalleComportamiento;
    }

    public void setIdentificadorDetalleComportamiento(Integer identificadorDetalleComportamiento) {
        this.identificadorDetalleComportamiento = identificadorDetalleComportamiento;
    }

    public String getDescripcionDeLaPlantilla() {
        return descripcionDeLaPlantilla;
    }

    public void setDescripcionDeLaPlantilla(String descripcionDeLaPlantilla) {
        this.descripcionDeLaPlantilla = descripcionDeLaPlantilla;
    }

    public Integer getExisteCodigoDelProyecto() {
        return existeCodigoDelProyecto;
    }

    public void setExisteCodigoDelProyecto(Integer existeCodigoDelProyecto) {
        this.existeCodigoDelProyecto = existeCodigoDelProyecto;
    }

    public Integer getAplicaCodigoSiip() {
        return aplicaCodigoSiip;
    }

    public void setAplicaCodigoSiip(Integer aplicaCodigoSiip) {
        this.aplicaCodigoSiip = aplicaCodigoSiip;
    }

    public Integer getDuracionPrevistaMasDeUnAno() {
        return duracionPrevistaMasDeUnAno;
    }

    public void setDuracionPrevistaMasDeUnAno(Integer duracionPrevistaMasDeUnAno) {
        this.duracionPrevistaMasDeUnAno = duracionPrevistaMasDeUnAno;
    }

    public Integer getVariablesDeControlPropias() {
        return variablesDeControlPropias;
    }

    public void setVariablesDeControlPropias(Integer variablesDeControlPropias) {
        this.variablesDeControlPropias = variablesDeControlPropias;
    }

    public Integer getTieneVariosConveniosDePrestamo() {
        return tieneVariosConveniosDePrestamo;
    }

    public void setTieneVariosConveniosDePrestamo(Integer tieneVariosConveniosDePrestamo) {
        this.tieneVariosConveniosDePrestamo = tieneVariosConveniosDePrestamo;
    }

    public Integer getAplicaNivelDeComponentes() {
        return aplicaNivelDeComponentes;
    }

    public void setAplicaNivelDeComponentes(Integer aplicaNivelDeComponentes) {
        this.aplicaNivelDeComponentes = aplicaNivelDeComponentes;
    }

    public Integer getNivelDeComponentes() {
        return nivelDeComponentes;
    }

    public void setNivelDeComponentes(Integer nivelDeComponentes) {
        this.nivelDeComponentes = nivelDeComponentes;
    }

    public Integer getExisteMasFuentesFinanc() {
        return existeMasFuentesFinanc;
    }

    public void setExisteMasFuentesFinanc(Integer existeMasFuentesFinanc) {
        this.existeMasFuentesFinanc = existeMasFuentesFinanc;
    }

    public Integer getTieneAfectacionPresupuestaria() {
        return tieneAfectacionPresupuestaria;
    }

    public void setTieneAfectacionPresupuestaria(Integer tieneAfectacionPresupuestaria) {
        this.tieneAfectacionPresupuestaria = tieneAfectacionPresupuestaria;
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

    public PlantillaDeComportamientos getPlantillaDeComportamientos() {
        return plantillaDeComportamientos;
    }

    public void setPlantillaDeComportamientos(PlantillaDeComportamientos plantillaDeComportamientos) {
        this.plantillaDeComportamientos = plantillaDeComportamientos;
    }

    @Override
    public String toString() {
        return descripcionDeLaPlantilla;
    }
}