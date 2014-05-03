/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;

/**
 *
 * @author 
 */
public class EntidadTres {
    private Integer Id;
    private String NombreEntidad;
    private boolean asociadoHerramienta;

    public EntidadTres() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getNombreEntidad() {
        return NombreEntidad;
    }

    public void setNombreEntidad(String NombreEntidad) {
        this.NombreEntidad = NombreEntidad;
    }

    public boolean isAsociadoHerramienta() {
        return asociadoHerramienta;
    }

    public void setAsociadoHerramienta(boolean asociadoHerramienta) {
        this.asociadoHerramienta = asociadoHerramienta;
    }
    
}
