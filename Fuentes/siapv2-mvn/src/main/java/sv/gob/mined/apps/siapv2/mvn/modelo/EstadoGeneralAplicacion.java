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

public class EstadoGeneralAplicacion {
    private Integer idGeneralEstado;
    private String descripcionDelEstado;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private List<BitacoraRegistroProce> bitacoraRegistroProceList;
    private SecurityUsers name;

    public EstadoGeneralAplicacion() {
    }

    public EstadoGeneralAplicacion(Integer idGeneralEstado) {
        this.idGeneralEstado = idGeneralEstado;
    }

    public Integer getIdGeneralEstado() {
        return idGeneralEstado;
    }

    public void setIdGeneralEstado(Integer idGeneralEstado) {
        this.idGeneralEstado = idGeneralEstado;
    }

    public String getDescripcionDelEstado() {
        return descripcionDelEstado;
    }

    public void setDescripcionDelEstado(String descripcionDelEstado) {
        this.descripcionDelEstado = descripcionDelEstado;
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

    public List<BitacoraRegistroProce> getBitacoraRegistroProceList() {
        return bitacoraRegistroProceList;
    }

    public void setBitacoraRegistroProceList(List<BitacoraRegistroProce> bitacoraRegistroProceList) {
        this.bitacoraRegistroProceList = bitacoraRegistroProceList;
    }

    public SecurityUsers getName() {
        return name;
    }

    public void setName(SecurityUsers name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGeneralEstado != null ? idGeneralEstado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoGeneralAplicacion)) {
            return false;
        }
        EstadoGeneralAplicacion other = (EstadoGeneralAplicacion) object;
        if ((this.idGeneralEstado == null && other.idGeneralEstado != null) || (this.idGeneralEstado != null && !this.idGeneralEstado.equals(other.idGeneralEstado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.EstadoGeneralAplicacion[ idGeneralEstado=" + idGeneralEstado + " ]";
    }
    
}
