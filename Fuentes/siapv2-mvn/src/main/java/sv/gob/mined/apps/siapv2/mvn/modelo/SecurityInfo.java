/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;


/**
 *
 * @author Infosoft
 */

public class SecurityInfo {
    private static final long serialVersionUID = 1L;
    protected SecurityInfoPK securityInfoPK;
    private PlantillasDeSeguridad idPlantillaSeguridad;

    public SecurityInfo() {
    }

    public SecurityInfo(SecurityInfoPK securityInfoPK) {
        this.securityInfoPK = securityInfoPK;
    }

    public SecurityInfo(int application, String name) {
        this.securityInfoPK = new SecurityInfoPK(application, name);
    }

    public SecurityInfoPK getSecurityInfoPK() {
        return securityInfoPK;
    }

    public void setSecurityInfoPK(SecurityInfoPK securityInfoPK) {
        this.securityInfoPK = securityInfoPK;
    }

    public PlantillasDeSeguridad getIdPlantillaSeguridad() {
        return idPlantillaSeguridad;
    }

    public void setIdPlantillaSeguridad(PlantillasDeSeguridad idPlantillaSeguridad) {
        this.idPlantillaSeguridad = idPlantillaSeguridad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (securityInfoPK != null ? securityInfoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SecurityInfo)) {
            return false;
        }
        SecurityInfo other = (SecurityInfo) object;
        if ((this.securityInfoPK == null && other.securityInfoPK != null) || (this.securityInfoPK != null && !this.securityInfoPK.equals(other.securityInfoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.SecurityInfo[ securityInfoPK=" + securityInfoPK + " ]";
    }
    
}
