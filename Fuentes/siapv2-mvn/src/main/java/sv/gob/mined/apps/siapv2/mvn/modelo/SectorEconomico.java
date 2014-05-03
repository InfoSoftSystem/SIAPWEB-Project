/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;

import java.util.Date;

/**
 *
 * @author Infosoft
 */
public class SectorEconomico {
    private Integer identificadorDelSectorEconomico;
    private Integer Sec_identificadorDelSectorEconomico;
    private String descripcionDelSectorEconomico; 
    private String identificadorDeLaSesion; 
    private Date fechaDeInsercion; 
    private Date fechaDeModificacion; 
    private Date fechaDeEliminacion;

    public SectorEconomico() {
    }

    public Integer getSec_identificadorDelSectorEconomico() {
        return Sec_identificadorDelSectorEconomico;
    }

    public void setSec_identificadorDelSectorEconomico(Integer Sec_identificadorDelSectorEconomico) {
        this.Sec_identificadorDelSectorEconomico = Sec_identificadorDelSectorEconomico;
    }

    public String getDescripcionDelSectorEconomico() {
        return descripcionDelSectorEconomico;
    }

    public void setDescripcionDelSectorEconomico(String descripcionDelSectorEconomico) {
        this.descripcionDelSectorEconomico = descripcionDelSectorEconomico;
    }

    public Date getFechaDeEliminacion() {
        return fechaDeEliminacion;
    }

    public void setFechaDeEliminacion(Date fechaDeEliminacion) {
        this.fechaDeEliminacion = fechaDeEliminacion;
    }

    public Date getFechaDeInsercion() {
        return fechaDeInsercion;
    }

    public void setFechaDeInsercion(Date fechaDeInsercion) {
        this.fechaDeInsercion = fechaDeInsercion;
    }

    public Date getFechaDeModificacion() {
        return fechaDeModificacion;
    }

    public void setFechaDeModificacion(Date fechaDeModificacion) {
        this.fechaDeModificacion = fechaDeModificacion;
    }

    public String getIdentificadorDeLaSesion() {
        return identificadorDeLaSesion;
    }

    public void setIdentificadorDeLaSesion(String identificadorDeLaSesion) {
        this.identificadorDeLaSesion = identificadorDeLaSesion;
    }

    public Integer getIdentificadorDelSectorEconomico() {
        return identificadorDelSectorEconomico;
    }

    public void setIdentificadorDelSectorEconomico(Integer identificadorDelSectorEconomico) {
        this.identificadorDelSectorEconomico = identificadorDelSectorEconomico;
    }

    @Override
    public String toString() {
        return descripcionDelSectorEconomico;
    }
}