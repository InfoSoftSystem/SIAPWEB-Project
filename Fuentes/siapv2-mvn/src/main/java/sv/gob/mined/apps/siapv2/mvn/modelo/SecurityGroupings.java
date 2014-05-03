/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;

/**
 *
 * @author Infosoft
 */

public class SecurityGroupings {
    private String name;
    private SecurityUsers securityUsers;

    public SecurityGroupings() {
    }

    public SecurityGroupings(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SecurityUsers getSecurityUsers() {
        return securityUsers;
    }

    public void setSecurityUsers(SecurityUsers securityUsers) {
        this.securityUsers = securityUsers;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (name != null ? name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SecurityGroupings)) {
            return false;
        }
        SecurityGroupings other = (SecurityGroupings) object;
        if ((this.name == null && other.name != null) || (this.name != null && !this.name.equals(other.name))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.SecurityGroupings[ name=" + name + " ]";
    }
    
}
