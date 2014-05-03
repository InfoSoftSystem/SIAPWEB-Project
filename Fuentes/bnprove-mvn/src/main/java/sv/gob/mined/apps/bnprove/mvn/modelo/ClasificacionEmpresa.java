/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.bnprove.mvn.modelo;

import java.util.Date;

/**
 *
 * @author Infosoft
 */
public class ClasificacionEmpresa {

    private Integer identificadorPrimarioDeLaEmpresa;
    private Integer identificadorDelSectorEconomico;
    private String especializacionPorSubsector;
    private String identificadorDeLaSesion;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private ClasificacionEmpresa ctEmp;

    public ClasificacionEmpresa() {
    }

    public ClasificacionEmpresa(ClasificacionEmpresa ctEmp) {
        this.ctEmp = ctEmp;
    }

    public ClasificacionEmpresa getCtEmp() {
        return ctEmp;
    }

    public void setCtEmp(ClasificacionEmpresa ctEmp) {
        this.ctEmp = ctEmp;
    }

    public String getEspecializacionPorSubsector() {
        return especializacionPorSubsector;
    }

    public void setEspecializacionPorSubsector(String especializacionPorSubsector) {
        this.especializacionPorSubsector = especializacionPorSubsector;
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

    public Integer getIdentificadorPrimarioDeLaEmpresa() {
        return identificadorPrimarioDeLaEmpresa;
    }

    public void setIdentificadorPrimarioDeLaEmpresa(Integer identificadorPrimarioDeLaEmpresa) {
        this.identificadorPrimarioDeLaEmpresa = identificadorPrimarioDeLaEmpresa;
    }

    public String generarInsertSQL() {
        String query = "INSERT INTO dbo.ClasificacionEmpresaEconomico (identificadorPrimarioDeLaEmpresa, identificadorDelSectorEconomico, especializacionPorSubsector, identificadorDeLaSesion, fechaDeInsercion, fechaDeModificacion, fechaDeEliminacion) VALUES (" + ctEmp.getIdentificadorPrimarioDeLaEmpresa() + "," + ctEmp.getIdentificadorDelSectorEconomico() + "," + ctEmp.getEspecializacionPorSubsector() + "," + ctEmp.getIdentificadorDeLaSesion() + "," + ctEmp.getFechaDeInsercion() + "," + ctEmp.getFechaDeModificacion() + "," + ctEmp.getFechaDeEliminacion() + ");";
        return query;
    }

    public String generarUpdateSQL() {
        String query = "update dbo.CoberturaTerritorio SET identificadorPrimarioDeLaEmpresa=" + ctEmp.getIdentificadorPrimarioDeLaEmpresa() + ", identificadorDelSectorEconomico=" + ctEmp.getIdentificadorDelSectorEconomico() + ", especializacionPorSubsector=" + ctEmp.getEspecializacionPorSubsector() + ", identificadorDeLaSesion=" + ctEmp.getIdentificadorDeLaSesion() + ", fechaDeInsercion=" + ctEmp.getFechaDeInsercion() + ", fechaDeModificacion=" + ctEmp.getFechaDeModificacion() + ", fechaDeEliminacion=" + ctEmp.getFechaDeEliminacion() + "";
        return query;
    }
}