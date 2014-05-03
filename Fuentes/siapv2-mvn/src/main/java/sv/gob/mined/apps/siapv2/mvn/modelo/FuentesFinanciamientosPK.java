/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;


/**
 *
 * @author Infosoft
 */
public class FuentesFinanciamientosPK  {
    private int convenio;
    private int organismo;

    public FuentesFinanciamientosPK() {
    }

    public FuentesFinanciamientosPK(int convenio, int organismo) {
        this.convenio = convenio;
        this.organismo = organismo;
    }

    public int getConvenio() {
        return convenio;
    }

    public void setConvenio(int convenio) {
        this.convenio = convenio;
    }

    public int getOrganismo() {
        return organismo;
    }

    public void setOrganismo(int organismo) {
        this.organismo = organismo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) convenio;
        hash += (int) organismo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FuentesFinanciamientosPK)) {
            return false;
        }
        FuentesFinanciamientosPK other = (FuentesFinanciamientosPK) object;
        if (this.convenio != other.convenio) {
            return false;
        }
        if (this.organismo != other.organismo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.FuentesFinanciamientosPK[ convenio=" + convenio + ", organismo=" + organismo + " ]";
    }
    
}
