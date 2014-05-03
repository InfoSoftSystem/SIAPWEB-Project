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

public class DefinicionPagosPrevistosNouaci {
    
    private Integer definicionPago;
    private Date fechaPrevista;
    private BigDecimal monto;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private PoaRecursos recurso;

    public DefinicionPagosPrevistosNouaci() {
    }

    public DefinicionPagosPrevistosNouaci(Integer definicionPago) {
        this.definicionPago = definicionPago;
    }

    public Integer getDefinicionPago() {
        return definicionPago;
    }

    public void setDefinicionPago(Integer definicionPago) {
        this.definicionPago = definicionPago;
    }

    public Date getFechaPrevista() {
        return fechaPrevista;
    }

    public void setFechaPrevista(Date fechaPrevista) {
        this.fechaPrevista = fechaPrevista;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
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

    public PoaRecursos getRecurso() {
        return recurso;
    }

    public void setRecurso(PoaRecursos recurso) {
        this.recurso = recurso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (definicionPago != null ? definicionPago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DefinicionPagosPrevistosNouaci)) {
            return false;
        }
        DefinicionPagosPrevistosNouaci other = (DefinicionPagosPrevistosNouaci) object;
        if ((this.definicionPago == null && other.definicionPago != null) || (this.definicionPago != null && !this.definicionPago.equals(other.definicionPago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.DefinicionPagosPrevistosNouaci[ definicionPago=" + definicionPago + " ]";
    }
    
}
