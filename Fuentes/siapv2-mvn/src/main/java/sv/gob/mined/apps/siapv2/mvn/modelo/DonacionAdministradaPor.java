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

public class DonacionAdministradaPor  {
    private Integer tipodeadministracion;
    private String descripcionTipoDeAdmon;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private List<PlantillaDeComportamientos> plantillaDeComportamientosList;

    public DonacionAdministradaPor() {
    }

    public DonacionAdministradaPor(Integer tipodeadministracion) {
        this.tipodeadministracion = tipodeadministracion;
    }

    public Integer getTipodeadministracion() {
        return tipodeadministracion;
    }

    public void setTipodeadministracion(Integer tipodeadministracion) {
        this.tipodeadministracion = tipodeadministracion;
    }

    public String getDescripcionTipoDeAdmon() {
        return descripcionTipoDeAdmon;
    }

    public void setDescripcionTipoDeAdmon(String descripcionTipoDeAdmon) {
        this.descripcionTipoDeAdmon = descripcionTipoDeAdmon;
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

    public List<PlantillaDeComportamientos> getPlantillaDeComportamientosList() {
        return plantillaDeComportamientosList;
    }

    public void setPlantillaDeComportamientosList(List<PlantillaDeComportamientos> plantillaDeComportamientosList) {
        this.plantillaDeComportamientosList = plantillaDeComportamientosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipodeadministracion != null ? tipodeadministracion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DonacionAdministradaPor)) {
            return false;
        }
        DonacionAdministradaPor other = (DonacionAdministradaPor) object;
        if ((this.tipodeadministracion == null && other.tipodeadministracion != null) || (this.tipodeadministracion != null && !this.tipodeadministracion.equals(other.tipodeadministracion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.DonacionAdministradaPor[ tipodeadministracion=" + tipodeadministracion + " ]";
    }
    
}
