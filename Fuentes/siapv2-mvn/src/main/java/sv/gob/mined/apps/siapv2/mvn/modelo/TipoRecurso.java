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

public class TipoRecurso {
    
    private Integer trasferencia;
    private String descripcionTipoRecurso;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private List<PoaRecursos> poaRecursosList;

    public TipoRecurso() {
    }

    public TipoRecurso(Integer trasferencia) {
        this.trasferencia = trasferencia;
    }

    public Integer getTrasferencia() {
        return trasferencia;
    }

    public void setTrasferencia(Integer trasferencia) {
        this.trasferencia = trasferencia;
    }

    public String getDescripcionTipoRecurso() {
        return descripcionTipoRecurso;
    }

    public void setDescripcionTipoRecurso(String descripcionTipoRecurso) {
        this.descripcionTipoRecurso = descripcionTipoRecurso;
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

    public List<PoaRecursos> getPoaRecursosList() {
        return poaRecursosList;
    }

    public void setPoaRecursosList(List<PoaRecursos> poaRecursosList) {
        this.poaRecursosList = poaRecursosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trasferencia != null ? trasferencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoRecurso)) {
            return false;
        }
        TipoRecurso other = (TipoRecurso) object;
        if ((this.trasferencia == null && other.trasferencia != null) || (this.trasferencia != null && !this.trasferencia.equals(other.trasferencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.TipoRecurso[ trasferencia=" + trasferencia + " ]";
    }
    
}
