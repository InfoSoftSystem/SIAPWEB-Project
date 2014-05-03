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

public class PoaRecursoTramoReal  {
    
    private Integer recursoTramo;
    private BigDecimal ejecutadoBancos;
    private BigDecimal ejecutadoGoes;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private PoaRecursos recurso;
    private PgTramosCategorias tramo;

    public PoaRecursoTramoReal() {
    }

    public PoaRecursoTramoReal(Integer recursoTramo) {
        this.recursoTramo = recursoTramo;
    }

    public Integer getRecursoTramo() {
        return recursoTramo;
    }

    public void setRecursoTramo(Integer recursoTramo) {
        this.recursoTramo = recursoTramo;
    }

    public BigDecimal getEjecutadoBancos() {
        return ejecutadoBancos;
    }

    public void setEjecutadoBancos(BigDecimal ejecutadoBancos) {
        this.ejecutadoBancos = ejecutadoBancos;
    }

    public BigDecimal getEjecutadoGoes() {
        return ejecutadoGoes;
    }

    public void setEjecutadoGoes(BigDecimal ejecutadoGoes) {
        this.ejecutadoGoes = ejecutadoGoes;
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

    public PoaRecursos getRecurso() {
        return recurso;
    }

    public void setRecurso(PoaRecursos recurso) {
        this.recurso = recurso;
    }

    public PgTramosCategorias getTramo() {
        return tramo;
    }

    public void setTramo(PgTramosCategorias tramo) {
        this.tramo = tramo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (recursoTramo != null ? recursoTramo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PoaRecursoTramoReal)) {
            return false;
        }
        PoaRecursoTramoReal other = (PoaRecursoTramoReal) object;
        if ((this.recursoTramo == null && other.recursoTramo != null) || (this.recursoTramo != null && !this.recursoTramo.equals(other.recursoTramo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.PoaRecursoTramoReal[ recursoTramo=" + recursoTramo + " ]";
    }
    
}
