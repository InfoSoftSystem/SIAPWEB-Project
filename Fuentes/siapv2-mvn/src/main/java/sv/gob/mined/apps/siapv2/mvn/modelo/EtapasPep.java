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

public class EtapasPep  {
    
    private Integer etapaPep;
    private String descEtapaPep;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private List<Pep> pepList;

    public EtapasPep() {
    }

    public EtapasPep(Integer etapaPep) {
        this.etapaPep = etapaPep;
    }

    public Integer getEtapaPep() {
        return etapaPep;
    }

    public void setEtapaPep(Integer etapaPep) {
        this.etapaPep = etapaPep;
    }

    public String getDescEtapaPep() {
        return descEtapaPep;
    }

    public void setDescEtapaPep(String descEtapaPep) {
        this.descEtapaPep = descEtapaPep;
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

    public List<Pep> getPepList() {
        return pepList;
    }

    public void setPepList(List<Pep> pepList) {
        this.pepList = pepList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (etapaPep != null ? etapaPep.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EtapasPep)) {
            return false;
        }
        EtapasPep other = (EtapasPep) object;
        if ((this.etapaPep == null && other.etapaPep != null) || (this.etapaPep != null && !this.etapaPep.equals(other.etapaPep))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.EtapasPep[ etapaPep=" + etapaPep + " ]";
    }
    
}
