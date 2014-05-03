/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;

import java.io.Serializable;

/**
 *
 * @author Infosoft
 */
public class Calculo implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private Integer numero;
    private Integer multiplicador;

    public Calculo() {
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(Integer multiplicador) {
        this.multiplicador = multiplicador;
    }
}
