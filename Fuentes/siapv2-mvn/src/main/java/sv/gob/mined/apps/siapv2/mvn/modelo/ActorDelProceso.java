/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;

import java.util.Date;

/**
 *
 * @author
 */
public class ActorDelProceso {

    private Integer idActorProceso;
    private String descripcionActor;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;

    public ActorDelProceso() {
    }

    public Integer getIdActorProceso() {
        return idActorProceso;
    }

    public void setIdActorProceso(Integer idActorProceso) {
        this.idActorProceso = idActorProceso;
    }

    public String getDescripcionActor() {
        return descripcionActor;
    }

    public void setDescripcionActor(String descripcionActor) {
        this.descripcionActor = descripcionActor;
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
        return "ActorDelProceso{" + "idActorProceso=" + idActorProceso + ", descripcionActor=" + descripcionActor + ", fechaDeInsercion=" + fechaDeInsercion + ", fechaDeModificacion=" + fechaDeModificacion + ", fechaDeEliminacion=" + fechaDeEliminacion + ", estadoDeEliminacion=" + estadoDeEliminacion + ", name=" + name + '}';
    }
    
    
}
