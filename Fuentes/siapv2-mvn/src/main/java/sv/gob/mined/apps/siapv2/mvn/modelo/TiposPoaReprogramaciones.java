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

public class TiposPoaReprogramaciones {
    
    private Integer tipoPoaReprog;
    private String descripcionTipo;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;

    public TiposPoaReprogramaciones() {
    }

    public TiposPoaReprogramaciones(Integer tipoPoaReprog) {
        this.tipoPoaReprog = tipoPoaReprog;
    }

    public Integer getTipoPoaReprog() {
        return tipoPoaReprog;
    }

    public void setTipoPoaReprog(Integer tipoPoaReprog) {
        this.tipoPoaReprog = tipoPoaReprog;
    }

    public String getDescripcionTipo() {
        return descripcionTipo;
    }

    public void setDescripcionTipo(String descripcionTipo) {
        this.descripcionTipo = descripcionTipo;
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
        return descripcionTipo;
    }
    
    public void setEliminado(Boolean eliminado){
        if(eliminado){
            estadoDeEliminacion = 1;
        }else{
            estadoDeEliminacion = 0;
        }
    }
    
    public Boolean getEliminado(){
        return estadoDeEliminacion == 1;
    }
}