/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;

/**
 *
 * @author Infosoft
 */
public class OrigenDelCiudadano {
    private Integer identificadorOrigenlCiudadano;
    private String descripcionDeCiudadania;

    public OrigenDelCiudadano() {
    }

    public String getDescripcionDeCiudadania() {
        return descripcionDeCiudadania;
    }

    public void setDescripcionDeCiudadania(String descripcionDeCiudadania) {
        this.descripcionDeCiudadania = descripcionDeCiudadania;
    }

    public Integer getIdentificadorOrigenlCiudadano() {
        return identificadorOrigenlCiudadano;
    }

    public void setIdentificadorOrigenlCiudadano(Integer identificadorOrigenlCiudadano) {
        this.identificadorOrigenlCiudadano = identificadorOrigenlCiudadano;
    }

    @Override
    public String toString() {
        return descripcionDeCiudadania;
    }    
        
}
