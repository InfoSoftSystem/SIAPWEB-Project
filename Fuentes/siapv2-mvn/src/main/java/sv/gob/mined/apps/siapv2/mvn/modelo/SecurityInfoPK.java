/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;


/**
 *
 * @author Infosoft
 */

public class SecurityInfoPK {
    private int application;
    private String name;

    public SecurityInfoPK() {
    }

    public SecurityInfoPK(int application, String name) {
        this.application = application;
        this.name = name;
    }

    public int getApplication() {
        return application;
    }

    public void setApplication(int application) {
        this.application = application;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) application;
        hash += (name != null ? name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SecurityInfoPK)) {
            return false;
        }
        SecurityInfoPK other = (SecurityInfoPK) object;
        if (this.application != other.application) {
            return false;
        }
        if ((this.name == null && other.name != null) || (this.name != null && !this.name.equals(other.name))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.SecurityInfoPK[ application=" + application + ", name=" + name + " ]";
    }
    
}
