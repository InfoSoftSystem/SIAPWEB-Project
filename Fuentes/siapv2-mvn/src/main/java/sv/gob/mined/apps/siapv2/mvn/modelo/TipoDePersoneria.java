/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;

/**
 *
 * @author Infosoft
 */
public class TipoDePersoneria {
    private Integer identificadorDePersoneria;
    private String descripcionDePersoneria;

    public TipoDePersoneria() {
    }

    public String getDescripcionDePersoneria() {
        return descripcionDePersoneria;
    }

    public void setDescripcionDePersoneria(String descripcionDePersoneria) {
        this.descripcionDePersoneria = descripcionDePersoneria;
    }

    public Integer getIdentificadorDePersoneria() {
        return identificadorDePersoneria;
    }

    public void setIdentificadorDePersoneria(Integer identificadorDePersoneria) {
        this.identificadorDePersoneria = identificadorDePersoneria;
    }

    @Override
    public String toString() {
        return descripcionDePersoneria;
    }
    
    
    
}
