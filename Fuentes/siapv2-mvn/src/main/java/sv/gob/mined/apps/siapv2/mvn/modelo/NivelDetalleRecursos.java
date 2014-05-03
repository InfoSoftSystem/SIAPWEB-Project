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

public class NivelDetalleRecursos {
    private Integer identificadorNivelDetalle;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private PlantillaDeComportamientos idPlantillaComportamiento;
    private NivelDetalleEspRecursos idNivelDetalle;

    public NivelDetalleRecursos() {
    }

    public NivelDetalleRecursos(Integer identificadorNivelDetalle) {
        this.identificadorNivelDetalle = identificadorNivelDetalle;
    }

    public Integer getIdentificadorNivelDetalle() {
        return identificadorNivelDetalle;
    }

    public void setIdentificadorNivelDetalle(Integer identificadorNivelDetalle) {
        this.identificadorNivelDetalle = identificadorNivelDetalle;
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

    public PlantillaDeComportamientos getIdPlantillaComportamiento() {
        return idPlantillaComportamiento;
    }

    public void setIdPlantillaComportamiento(PlantillaDeComportamientos idPlantillaComportamiento) {
        this.idPlantillaComportamiento = idPlantillaComportamiento;
    }

    public NivelDetalleEspRecursos getIdNivelDetalle() {
        return idNivelDetalle;
    }

    public void setIdNivelDetalle(NivelDetalleEspRecursos idNivelDetalle) {
        this.idNivelDetalle = idNivelDetalle;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (identificadorNivelDetalle != null ? identificadorNivelDetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NivelDetalleRecursos)) {
            return false;
        }
        NivelDetalleRecursos other = (NivelDetalleRecursos) object;
        if ((this.identificadorNivelDetalle == null && other.identificadorNivelDetalle != null) || (this.identificadorNivelDetalle != null && !this.identificadorNivelDetalle.equals(other.identificadorNivelDetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.NivelDetalleRecursos[ identificadorNivelDetalle=" + identificadorNivelDetalle + " ]";
    }
    
}
