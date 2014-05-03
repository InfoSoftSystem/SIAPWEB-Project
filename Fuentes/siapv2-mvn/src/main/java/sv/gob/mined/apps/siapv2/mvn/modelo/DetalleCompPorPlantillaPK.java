/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;


/**
 *
 * @author Infosoft
 */

public class DetalleCompPorPlantillaPK {
    private int idPlantillaComportamiento;
    private int identificadorDetalleComportamiento;

    public DetalleCompPorPlantillaPK() {
    }

    public DetalleCompPorPlantillaPK(int idPlantillaComportamiento, int identificadorDetalleComportamiento) {
        this.idPlantillaComportamiento = idPlantillaComportamiento;
        this.identificadorDetalleComportamiento = identificadorDetalleComportamiento;
    }

    public int getIdPlantillaComportamiento() {
        return idPlantillaComportamiento;
    }

    public void setIdPlantillaComportamiento(int idPlantillaComportamiento) {
        this.idPlantillaComportamiento = idPlantillaComportamiento;
    }

    public int getIdentificadorDetalleComportamiento() {
        return identificadorDetalleComportamiento;
    }

    public void setIdentificadorDetalleComportamiento(int identificadorDetalleComportamiento) {
        this.identificadorDetalleComportamiento = identificadorDetalleComportamiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idPlantillaComportamiento;
        hash += (int) identificadorDetalleComportamiento;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleCompPorPlantillaPK)) {
            return false;
        }
        DetalleCompPorPlantillaPK other = (DetalleCompPorPlantillaPK) object;
        if (this.idPlantillaComportamiento != other.idPlantillaComportamiento) {
            return false;
        }
        if (this.identificadorDetalleComportamiento != other.identificadorDetalleComportamiento) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.DetalleCompPorPlantillaPK[ idPlantillaComportamiento=" + idPlantillaComportamiento + ", identificadorDetalleComportamiento=" + identificadorDetalleComportamiento + " ]";
    }
    
}
