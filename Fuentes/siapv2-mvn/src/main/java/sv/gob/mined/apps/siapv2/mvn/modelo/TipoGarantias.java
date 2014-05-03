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

public class TipoGarantias {
    private Integer idTipoGarantia;
    private String codigoTipoGarantia;
    private String descripcionTipoGarantia;
    private Integer estado;
    private Date fechaInsercion;
    private Date fechaModificacion;
    private Date fechaEliminacion;
    private Integer estadoDeEliminacion;
    private String name;

    public TipoGarantias() {
    }

    public TipoGarantias(Integer idTipoGarantia) {
        this.idTipoGarantia = idTipoGarantia;
    }

    public Integer getIdTipoGarantia() {
        return idTipoGarantia;
    }

    public void setIdTipoGarantia(Integer idTipoGarantia) {
        this.idTipoGarantia = idTipoGarantia;
    }

    public String getCodigoTipoGarantia() {
        return codigoTipoGarantia;
    }

    public void setCodigoTipoGarantia(String codigoTipoGarantia) {
        this.codigoTipoGarantia = codigoTipoGarantia;
    }

    public String getDescripcionTipoGarantia() {
        return descripcionTipoGarantia;
    }

    public void setDescripcionTipoGarantia(String descripcionTipoGarantia) {
        this.descripcionTipoGarantia = descripcionTipoGarantia;
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
        return descripcionTipoGarantia;
    }
}