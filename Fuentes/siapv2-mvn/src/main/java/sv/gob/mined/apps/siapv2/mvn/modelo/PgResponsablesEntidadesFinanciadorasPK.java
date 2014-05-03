/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;


/**
 *
 * @author Infosoft
 */

public class PgResponsablesEntidadesFinanciadorasPK {
    private int convenio;
    private int contacto;

    public PgResponsablesEntidadesFinanciadorasPK() {
    }

    public PgResponsablesEntidadesFinanciadorasPK(int convenio, int contacto) {
        this.convenio = convenio;
        this.contacto = contacto;
    }

    public int getConvenio() {
        return convenio;
    }

    public void setConvenio(int convenio) {
        this.convenio = convenio;
    }

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) convenio;
        hash += (int) contacto;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PgResponsablesEntidadesFinanciadorasPK)) {
            return false;
        }
        PgResponsablesEntidadesFinanciadorasPK other = (PgResponsablesEntidadesFinanciadorasPK) object;
        if (this.convenio != other.convenio) {
            return false;
        }
        if (this.contacto != other.contacto) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.PgResponsablesEntidadesFinanciadorasPK[ convenio=" + convenio + ", contacto=" + contacto + " ]";
    }
    
}
