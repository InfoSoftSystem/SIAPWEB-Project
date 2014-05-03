/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;


/**
 *
 * @author Infosoft
 */

public class DetalleMacroConvenioPK {
    private int idDetalleMacroAplicable;
    private int idDetalleMacroProceso;

    public DetalleMacroConvenioPK() {
    }

    public DetalleMacroConvenioPK(int idDetalleMacroAplicable, int idDetalleMacroProceso) {
        this.idDetalleMacroAplicable = idDetalleMacroAplicable;
        this.idDetalleMacroProceso = idDetalleMacroProceso;
    }

    public int getIdDetalleMacroAplicable() {
        return idDetalleMacroAplicable;
    }

    public void setIdDetalleMacroAplicable(int idDetalleMacroAplicable) {
        this.idDetalleMacroAplicable = idDetalleMacroAplicable;
    }

    public int getIdDetalleMacroProceso() {
        return idDetalleMacroProceso;
    }

    public void setIdDetalleMacroProceso(int idDetalleMacroProceso) {
        this.idDetalleMacroProceso = idDetalleMacroProceso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idDetalleMacroAplicable;
        hash += (int) idDetalleMacroProceso;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleMacroConvenioPK)) {
            return false;
        }
        DetalleMacroConvenioPK other = (DetalleMacroConvenioPK) object;
        if (this.idDetalleMacroAplicable != other.idDetalleMacroAplicable) {
            return false;
        }
        if (this.idDetalleMacroProceso != other.idDetalleMacroProceso) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.DetalleMacroConvenioPK[ idDetalleMacroAplicable=" + idDetalleMacroAplicable + ", idDetalleMacroProceso=" + idDetalleMacroProceso + " ]";
    }
    
}
