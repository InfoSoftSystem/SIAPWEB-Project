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

public class PlantillaDeComportamientos {
    private Integer idPlantillaComportamiento;
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
    private Integer idNivelDesagregacion;
    private Integer organismo;
    private Integer idEstructuraEstrategia;
    private Integer idTipoNormativa;
    private Integer idTipoDeBien;
    private Integer tipoDeAdministracion;
    private Integer idOrigenRecursos;
    private Integer idNivel;

    public PlantillaDeComportamientos() {
    }

    public PlantillaDeComportamientos(Integer idPlantillaComportamiento) {
        this.idPlantillaComportamiento = idPlantillaComportamiento;
    }

    public Integer getIdPlantillaComportamiento() {
        return idPlantillaComportamiento;
    }

    public void setIdPlantillaComportamiento(Integer idPlantillaComportamiento) {
        this.idPlantillaComportamiento = idPlantillaComportamiento;
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

    @Override
    public String toString() {
        return descripcionDeLaPlantilla;
    }

    public Integer getIdNivelDesagregacion() {
        return idNivelDesagregacion;
    }

    public void setIdNivelDesagregacion(Integer idNivelDesagregacion) {
        this.idNivelDesagregacion = idNivelDesagregacion;
    }

    public Integer getOrganismo() {
        return organismo;
    }

    public void setOrganismo(Integer organismo) {
        this.organismo = organismo;
    }

    public Integer getIdEstructuraEstrategia() {
        return idEstructuraEstrategia;
    }

    public void setIdEstructuraEstrategia(Integer idEstructuraEstrategia) {
        this.idEstructuraEstrategia = idEstructuraEstrategia;
    }

    public Integer getIdTipoNormativa() {
        return idTipoNormativa;
    }

    public void setIdTipoNormativa(Integer idTipoNormativa) {
        this.idTipoNormativa = idTipoNormativa;
    }

    public Integer getTipoDeAdministracion() {
        return tipoDeAdministracion;
    }

    public void setTipoDeAdministracion(Integer tipoDeAdministracion) {
        this.tipoDeAdministracion = tipoDeAdministracion;
    }

    public Integer getIdOrigenRecursos() {
        return idOrigenRecursos;
    }

    public void setIdOrigenRecursos(Integer idOrigenRecursos) {
        this.idOrigenRecursos = idOrigenRecursos;
    }

    public Integer getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(Integer idNivel) {
        this.idNivel = idNivel;
    }

    public Integer getIdTipoDeBien() {
        return idTipoDeBien;
    }

    public void setIdTipoDeBien(Integer idTipoDeBien) {
        this.idTipoDeBien = idTipoDeBien;
    }
}