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

public class PgResponsablesEntidadesFinanciadoras {
    protected PgResponsablesEntidadesFinanciadorasPK pgResponsablesEntidadesFinanciadorasPK;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private PgConvenio pgConvenio;
    private PgContactosEntidades pgContactosEntidades;

    public PgResponsablesEntidadesFinanciadoras() {
    }

    public PgResponsablesEntidadesFinanciadoras(PgResponsablesEntidadesFinanciadorasPK pgResponsablesEntidadesFinanciadorasPK) {
        this.pgResponsablesEntidadesFinanciadorasPK = pgResponsablesEntidadesFinanciadorasPK;
    }

    public PgResponsablesEntidadesFinanciadoras(int convenio, int contacto) {
        this.pgResponsablesEntidadesFinanciadorasPK = new PgResponsablesEntidadesFinanciadorasPK(convenio, contacto);
    }

    public PgResponsablesEntidadesFinanciadorasPK getPgResponsablesEntidadesFinanciadorasPK() {
        return pgResponsablesEntidadesFinanciadorasPK;
    }

    public void setPgResponsablesEntidadesFinanciadorasPK(PgResponsablesEntidadesFinanciadorasPK pgResponsablesEntidadesFinanciadorasPK) {
        this.pgResponsablesEntidadesFinanciadorasPK = pgResponsablesEntidadesFinanciadorasPK;
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

    public PgConvenio getPgConvenio() {
        return pgConvenio;
    }

    public void setPgConvenio(PgConvenio pgConvenio) {
        this.pgConvenio = pgConvenio;
    }

    public PgContactosEntidades getPgContactosEntidades() {
        return pgContactosEntidades;
    }

    public void setPgContactosEntidades(PgContactosEntidades pgContactosEntidades) {
        this.pgContactosEntidades = pgContactosEntidades;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pgResponsablesEntidadesFinanciadorasPK != null ? pgResponsablesEntidadesFinanciadorasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PgResponsablesEntidadesFinanciadoras)) {
            return false;
        }
        PgResponsablesEntidadesFinanciadoras other = (PgResponsablesEntidadesFinanciadoras) object;
        if ((this.pgResponsablesEntidadesFinanciadorasPK == null && other.pgResponsablesEntidadesFinanciadorasPK != null) || (this.pgResponsablesEntidadesFinanciadorasPK != null && !this.pgResponsablesEntidadesFinanciadorasPK.equals(other.pgResponsablesEntidadesFinanciadorasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.PgResponsablesEntidadesFinanciadoras[ pgResponsablesEntidadesFinanciadorasPK=" + pgResponsablesEntidadesFinanciadorasPK + " ]";
    }
    
}
