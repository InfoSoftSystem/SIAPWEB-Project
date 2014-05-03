/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;


/**
 *
 * @author Infosoft
 */

public class GPersonal  {
    
    private Integer personalId;

    public GPersonal() {
    }

    public GPersonal(Integer personalId) {
        this.personalId = personalId;
    }

    public Integer getPersonalId() {
        return personalId;
    }

    public void setPersonalId(Integer personalId) {
        this.personalId = personalId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (personalId != null ? personalId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GPersonal)) {
            return false;
        }
        GPersonal other = (GPersonal) object;
        if ((this.personalId == null && other.personalId != null) || (this.personalId != null && !this.personalId.equals(other.personalId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.GPersonal[ personalId=" + personalId + " ]";
    }
    
}
