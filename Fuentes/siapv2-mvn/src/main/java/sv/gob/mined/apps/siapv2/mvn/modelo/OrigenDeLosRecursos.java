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

public class OrigenDeLosRecursos {
    
    private Integer idOrigenRecursos;
    private String descripcionDeLosRecursos;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;

    public OrigenDeLosRecursos() {
    }

    public OrigenDeLosRecursos(Integer idOrigenRecursos) {
        this.idOrigenRecursos = idOrigenRecursos;
    }

    public Integer getIdOrigenRecursos() {
        return idOrigenRecursos;
    }

    public void setIdOrigenRecursos(Integer idOrigenRecursos) {
        this.idOrigenRecursos = idOrigenRecursos;
    }

    public String getDescripcionDeLosRecursos() {
        return descripcionDeLosRecursos;
    }

    public void setDescripcionDeLosRecursos(String descripcionDeLosRecursos) {
        this.descripcionDeLosRecursos = descripcionDeLosRecursos;
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
        return descripcionDeLosRecursos;
    }
    
}
