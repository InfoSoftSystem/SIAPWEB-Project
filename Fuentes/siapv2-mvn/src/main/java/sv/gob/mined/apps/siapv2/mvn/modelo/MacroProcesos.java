/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Infosoft
 */
public class MacroProcesos {

    private Integer idMacroProceso;
    private String descripcionDelMacroProceso;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;

    public MacroProcesos() {
    }

    public MacroProcesos(Integer idMacroProceso) {
        this.idMacroProceso = idMacroProceso;
    }

    public Integer getIdMacroProceso() {
        return idMacroProceso;
    }

    public void setIdMacroProceso(Integer idMacroProceso) {
        this.idMacroProceso = idMacroProceso;
    }

    public String getDescripcionDelMacroProceso() {
        return descripcionDelMacroProceso;
    }

    public void setDescripcionDelMacroProceso(String descripcionDelMacroProceso) {
        this.descripcionDelMacroProceso = descripcionDelMacroProceso;
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

   

    

   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMacroProceso != null ? idMacroProceso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MacroProcesos)) {
            return false;
        }
        MacroProcesos other = (MacroProcesos) object;
        if ((this.idMacroProceso == null && other.idMacroProceso != null) || (this.idMacroProceso != null && !this.idMacroProceso.equals(other.idMacroProceso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.MacroProcesos[ idMacroProceso=" + idMacroProceso + " ]";
    }
}
