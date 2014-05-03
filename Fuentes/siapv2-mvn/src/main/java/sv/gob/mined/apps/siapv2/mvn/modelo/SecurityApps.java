/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;


/**
 *
 * @author Infosoft
 */

public class SecurityApps {
    private static final long serialVersionUID = 1L;
    private Integer application;

    public SecurityApps() {
    }

    public SecurityApps(Integer application) {
        this.application = application;
    }

    public Integer getApplication() {
        return application;
    }

    public void setApplication(Integer application) {
        this.application = application;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (application != null ? application.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SecurityApps)) {
            return false;
        }
        SecurityApps other = (SecurityApps) object;
        if ((this.application == null && other.application != null) || (this.application != null && !this.application.equals(other.application))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.SecurityApps[ application=" + application + " ]";
    }
    
}
