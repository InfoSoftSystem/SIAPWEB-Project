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

public class FuentesFinanciamientos  {
    private Integer convenio;
    private Integer organismo;
    private Integer contrapartida;
    private Integer idOrigenRecursos;
    private Integer proyInvePub;
    private Integer fuenteFinancSafi;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;

    public FuentesFinanciamientos() {
    }

    public Integer getConvenio() {
        return convenio;
    }

    public void setConvenio(Integer convenio) {
        this.convenio = convenio;
    }

    public Integer getOrganismo() {
        return organismo;
    }

    public void setOrganismo(Integer organismo) {
        this.organismo = organismo;
    }

    public Integer getContrapartida() {
        return contrapartida;
    }

    public void setContrapartida(Integer contrapartida) {
        this.contrapartida = contrapartida;
    }

    public Integer getIdOrigenRecursos() {
        return idOrigenRecursos;
    }

    public void setIdOrigenRecursos(Integer idOrigenRecursos) {
        this.idOrigenRecursos = idOrigenRecursos;
    }

    public Integer getProyInvePub() {
        return proyInvePub;
    }

    public void setProyInvePub(Integer proyInvePub) {
        this.proyInvePub = proyInvePub;
    }

    public Integer getFuenteFinancSafi() {
        return fuenteFinancSafi;
    }

    public void setFuenteFinancSafi(Integer fuenteFinancSafi) {
        this.fuenteFinancSafi = fuenteFinancSafi;
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

    public Date getFechaDeEliminacion() {
        return fechaDeEliminacion;
    }

    public void setFechaDeEliminacion(Date fechaDeEliminacion) {
        this.fechaDeEliminacion = fechaDeEliminacion;
    }

    public Integer getEstadoDeEliminacion() {
        return estadoDeEliminacion;
    }

    public void setEstadoDeEliminacion(Integer estadoDeEliminacion) {
        this.estadoDeEliminacion = estadoDeEliminacion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}