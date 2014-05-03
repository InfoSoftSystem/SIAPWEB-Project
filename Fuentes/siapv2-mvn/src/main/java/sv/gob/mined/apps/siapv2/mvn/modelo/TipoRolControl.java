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
public class TipoRolControl {

    private Integer idTipoRolControl;
    private String descripcionRolControl;
    private Date fechaDeInsercion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;

    public TipoRolControl() {
    }

    public Integer getIdTipoRolControl() {
        return idTipoRolControl;
    }

    public void setIdTipoRolControl(Integer idTipoRolControl) {
        this.idTipoRolControl = idTipoRolControl;
    }

    public String getDescripcionRolControl() {
        return descripcionRolControl;
    }

    public void setDescripcionRolControl(String descripcionRolControl) {
        this.descripcionRolControl = descripcionRolControl;
    }

    public Date getFechaDeInsercion() {
        return fechaDeInsercion;
    }

    public void setFechaDeInsercion(Date fechaDeInsercion) {
        this.fechaDeInsercion = fechaDeInsercion;
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
        return "TipoRolControl{" + "idTipoRolControl=" + idTipoRolControl + ", descripcionRolControl=" + descripcionRolControl + ", fechaDeInsercion=" + fechaDeInsercion + ", fechaDeEliminacion=" + fechaDeEliminacion + ", estadoDeEliminacion=" + estadoDeEliminacion + ", name=" + name + '}';
    }
    
}
