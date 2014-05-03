/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;

/**
 *
 * @author Infosoft
 */
public class TiposDeDocumentoLegal {
    private Integer identificadorDeDocumentoLegal;
    private String descripcionDeDocumentoLegal;

    public TiposDeDocumentoLegal() {
    }

    public Integer getIdentificadorDeDocumentoLegal() {
        return identificadorDeDocumentoLegal;
    }

    public void setIdentificadorDeDocumentoLegal(Integer identificadorDeDocumentoLegal) {
        this.identificadorDeDocumentoLegal = identificadorDeDocumentoLegal;
    }

    public String getDescripcionDeDocumentoLegal() {
        return descripcionDeDocumentoLegal;
    }

    public void setDescripcionDeDocumentoLegal(String descripcionDeDocumentoLegal) {
        this.descripcionDeDocumentoLegal = descripcionDeDocumentoLegal;
    }

    @Override
    public String toString() {
        return descripcionDeDocumentoLegal;
    }
}
