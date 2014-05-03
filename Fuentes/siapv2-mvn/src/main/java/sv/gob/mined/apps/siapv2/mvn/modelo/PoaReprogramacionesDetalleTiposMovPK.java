/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;

/**
 *
 * @author Infosoft
 */

public class PoaReprogramacionesDetalleTiposMovPK {
    private int tipoMovimiento;
    private int reprogramacion;

    public PoaReprogramacionesDetalleTiposMovPK() {
    }

    public PoaReprogramacionesDetalleTiposMovPK(int tipoMovimiento, int reprogramacion) {
        this.tipoMovimiento = tipoMovimiento;
        this.reprogramacion = reprogramacion;
    }

    public int getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(int tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public int getReprogramacion() {
        return reprogramacion;
    }

    public void setReprogramacion(int reprogramacion) {
        this.reprogramacion = reprogramacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) tipoMovimiento;
        hash += (int) reprogramacion;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PoaReprogramacionesDetalleTiposMovPK)) {
            return false;
        }
        PoaReprogramacionesDetalleTiposMovPK other = (PoaReprogramacionesDetalleTiposMovPK) object;
        if (this.tipoMovimiento != other.tipoMovimiento) {
            return false;
        }
        if (this.reprogramacion != other.reprogramacion) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.PoaReprogramacionesDetalleTiposMovPK[ tipoMovimiento=" + tipoMovimiento + ", reprogramacion=" + reprogramacion + " ]";
    }
    
}
