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

public class TipoMultas {
    private Integer idTipoDeMulta;
    private String codigoTipoMulta;
    private String descripcionTipoMulta;
    private Integer estado;
    private Date fechaInsercion;
    private Date fechaModificacion;
    private Date fechaEliminacion;
    private Integer estadoDeEliminacion;
    private String name;

    public TipoMultas() {
    }

    public TipoMultas(Integer idTipoDeMulta) {
        this.idTipoDeMulta = idTipoDeMulta;
    }

    public Integer getIdTipoDeMulta() {
        return idTipoDeMulta;
    }

    public void setIdTipoDeMulta(Integer idTipoDeMulta) {
        this.idTipoDeMulta = idTipoDeMulta;
    }

    public String getCodigoTipoMulta() {
        return codigoTipoMulta;
    }

    public void setCodigoTipoMulta(String codigoTipoMulta) {
        this.codigoTipoMulta = codigoTipoMulta;
    }

    public String getDescripcionTipoMulta() {
        return descripcionTipoMulta;
    }

    public void setDescripcionTipoMulta(String descripcionTipoMulta) {
        this.descripcionTipoMulta = descripcionTipoMulta;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Date getFechaInsercion() {
        return fechaInsercion;
    }

    public void setFechaInsercion(Date fechaInsercion) {
        this.fechaInsercion = fechaInsercion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public Date getFechaEliminacion() {
        return fechaEliminacion;
    }

    public void setFechaEliminacion(Date fechaEliminacion) {
        this.fechaEliminacion = fechaEliminacion;
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
        return descripcionTipoMulta;
    }
}