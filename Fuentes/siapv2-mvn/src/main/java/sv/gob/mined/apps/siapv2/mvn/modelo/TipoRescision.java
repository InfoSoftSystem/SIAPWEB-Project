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

public class TipoRescision {
    private Integer idTipoRecesion;
    private String codigoTipoRecesion;
    private String descripcionTipoRecesion;
    private Integer estado;
    private Date fechaInsercion;
    private Date fechaModificacion;
    private Date fechaEliminacion;
    private Integer estadoDeEliminacion;
    private String name;

    public TipoRescision() {
    }

    public TipoRescision(Integer idTipoRecesion) {
        this.idTipoRecesion = idTipoRecesion;
    }

    public Integer getIdTipoRecesion() {
        return idTipoRecesion;
    }

    public void setIdTipoRecesion(Integer idTipoRecesion) {
        this.idTipoRecesion = idTipoRecesion;
    }

    public String getCodigoTipoRecesion() {
        return codigoTipoRecesion;
    }

    public void setCodigoTipoRecesion(String codigoTipoRecesion) {
        this.codigoTipoRecesion = codigoTipoRecesion;
    }

    public String getDescripcionTipoRecesion() {
        return descripcionTipoRecesion;
    }

    public void setDescripcionTipoRecesion(String descripcionTipoRecesion) {
        this.descripcionTipoRecesion = descripcionTipoRecesion;
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
        return descripcionTipoRecesion;
    }
}