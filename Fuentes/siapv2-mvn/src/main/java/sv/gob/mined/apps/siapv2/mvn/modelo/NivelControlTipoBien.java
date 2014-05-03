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

public class NivelControlTipoBien  {
    private Integer idTipoDeBien;
    private String descripcionDelNivel;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private List<PlantillaDeComportamientos> plantillaDeComportamientosList;
    private List<PlantillaDeComportamientos> plantillaDeComportamientosList1;

    public NivelControlTipoBien() {
    }

    public NivelControlTipoBien(Integer idTipoDeBien) {
        this.idTipoDeBien = idTipoDeBien;
    }

    public Integer getIdTipoDeBien() {
        return idTipoDeBien;
    }

    public void setIdTipoDeBien(Integer idTipoDeBien) {
        this.idTipoDeBien = idTipoDeBien;
    }

    public String getDescripcionDelNivel() {
        return descripcionDelNivel;
    }

    public void setDescripcionDelNivel(String descripcionDelNivel) {
        this.descripcionDelNivel = descripcionDelNivel;
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

    public List<PlantillaDeComportamientos> getPlantillaDeComportamientosList1() {
        return plantillaDeComportamientosList1;
    }

    public void setPlantillaDeComportamientosList1(List<PlantillaDeComportamientos> plantillaDeComportamientosList1) {
        this.plantillaDeComportamientosList1 = plantillaDeComportamientosList1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoDeBien != null ? idTipoDeBien.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NivelControlTipoBien)) {
            return false;
        }
        NivelControlTipoBien other = (NivelControlTipoBien) object;
        if ((this.idTipoDeBien == null && other.idTipoDeBien != null) || (this.idTipoDeBien != null && !this.idTipoDeBien.equals(other.idTipoDeBien))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.NivelControlTipoBien[ idTipoDeBien=" + idTipoDeBien + " ]";
    }
    
}
