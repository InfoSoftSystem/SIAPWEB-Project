/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Infosoft
 */

public class PoaRecursoTramo {
    
    protected PoaRecursoTramoPK poaRecursoTramoPK;
    private BigDecimal asignadoBanco;
    private BigDecimal asignadoGoes;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private PoaRecursos poaRecursos;
    private PgTramosCategorias pgTramosCategorias;

    public PoaRecursoTramo() {
    }

    public PoaRecursoTramo(PoaRecursoTramoPK poaRecursoTramoPK) {
        this.poaRecursoTramoPK = poaRecursoTramoPK;
    }

    public PoaRecursoTramo(int recurso, int tramo) {
        this.poaRecursoTramoPK = new PoaRecursoTramoPK(recurso, tramo);
    }

    public PoaRecursoTramoPK getPoaRecursoTramoPK() {
        return poaRecursoTramoPK;
    }

    public void setPoaRecursoTramoPK(PoaRecursoTramoPK poaRecursoTramoPK) {
        this.poaRecursoTramoPK = poaRecursoTramoPK;
    }

    public BigDecimal getAsignadoBanco() {
        return asignadoBanco;
    }

    public void setAsignadoBanco(BigDecimal asignadoBanco) {
        this.asignadoBanco = asignadoBanco;
    }

    public BigDecimal getAsignadoGoes() {
        return asignadoGoes;
    }

    public void setAsignadoGoes(BigDecimal asignadoGoes) {
        this.asignadoGoes = asignadoGoes;
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

    public PoaRecursos getPoaRecursos() {
        return poaRecursos;
    }

    public void setPoaRecursos(PoaRecursos poaRecursos) {
        this.poaRecursos = poaRecursos;
    }

    public PgTramosCategorias getPgTramosCategorias() {
        return pgTramosCategorias;
    }

    public void setPgTramosCategorias(PgTramosCategorias pgTramosCategorias) {
        this.pgTramosCategorias = pgTramosCategorias;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (poaRecursoTramoPK != null ? poaRecursoTramoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PoaRecursoTramo)) {
            return false;
        }
        PoaRecursoTramo other = (PoaRecursoTramo) object;
        if ((this.poaRecursoTramoPK == null && other.poaRecursoTramoPK != null) || (this.poaRecursoTramoPK != null && !this.poaRecursoTramoPK.equals(other.poaRecursoTramoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.PoaRecursoTramo[ poaRecursoTramoPK=" + poaRecursoTramoPK + " ]";
    }
    
}
