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

public class EstadoEjecConvenio  {
    private Integer idEstadoEjecProyecto;
    private String descripciondeEstado;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;

    public EstadoEjecConvenio() {
    }

    public EstadoEjecConvenio(Integer idEstadoEjecProyecto) {
        this.idEstadoEjecProyecto = idEstadoEjecProyecto;
    }

    public Integer getIdEstadoEjecProyecto() {
        return idEstadoEjecProyecto;
    }

    public void setIdEstadoEjecProyecto(Integer idEstadoEjecProyecto) {
        this.idEstadoEjecProyecto = idEstadoEjecProyecto;
    }

    public String getDescripciondeEstado() {
        return descripciondeEstado;
    }

    public void setDescripciondeEstado(String descripciondeEstado) {
        this.descripciondeEstado = descripciondeEstado;
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
        return descripciondeEstado;
    }
}