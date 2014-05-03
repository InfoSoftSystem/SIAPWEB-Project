/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;

import java.util.List;

/**
 *
 * @author Infosoft
 */

public class PlantillasDeSeguridad {
    private Long idPlantillaSeguridad;
    private List<SecurityInfo> securityInfoList;

    public PlantillasDeSeguridad() {
    }

    public PlantillasDeSeguridad(Long idPlantillaSeguridad) {
        this.idPlantillaSeguridad = idPlantillaSeguridad;
    }

    public Long getIdPlantillaSeguridad() {
        return idPlantillaSeguridad;
    }

    public void setIdPlantillaSeguridad(Long idPlantillaSeguridad) {
        this.idPlantillaSeguridad = idPlantillaSeguridad;
    }

    public List<SecurityInfo> getSecurityInfoList() {
        return securityInfoList;
    }

    public void setSecurityInfoList(List<SecurityInfo> securityInfoList) {
        this.securityInfoList = securityInfoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPlantillaSeguridad != null ? idPlantillaSeguridad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlantillasDeSeguridad)) {
            return false;
        }
        PlantillasDeSeguridad other = (PlantillasDeSeguridad) object;
        if ((this.idPlantillaSeguridad == null && other.idPlantillaSeguridad != null) || (this.idPlantillaSeguridad != null && !this.idPlantillaSeguridad.equals(other.idPlantillaSeguridad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.PlantillasDeSeguridad[ idPlantillaSeguridad=" + idPlantillaSeguridad + " ]";
    }
    
}
