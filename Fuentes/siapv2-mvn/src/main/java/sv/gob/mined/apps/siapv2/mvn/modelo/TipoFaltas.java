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

public class TipoFaltas {
    private Integer idTipoFalta;
    private String codigoTipoFalta;
    private String descripcionTipoFalta;
    private Integer estado;
    private Date fechaInsercion;
    private Date fechaModificacion;
    private Date fechaEliminacion;
    private Integer estadoDeEliminacion;
    private String name;

    public TipoFaltas() {
    }

    public TipoFaltas(Integer idTipoFalta) {
        this.idTipoFalta = idTipoFalta;
    }

    public Integer getIdTipoFalta() {
        return idTipoFalta;
    }

    public void setIdTipoFalta(Integer idTipoFalta) {
        this.idTipoFalta = idTipoFalta;
    }

    public String getCodigoTipoFalta() {
        return codigoTipoFalta;
    }

    public void setCodigoTipoFalta(String codigoTipoFalta) {
        this.codigoTipoFalta = codigoTipoFalta;
    }

    public String getDescripcionTipoFalta() {
        return descripcionTipoFalta;
    }

    public void setDescripcionTipoFalta(String descripcionTipoFalta) {
        this.descripcionTipoFalta = descripcionTipoFalta;
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
        return descripcionTipoFalta;
    }
}