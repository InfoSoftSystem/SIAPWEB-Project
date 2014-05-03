/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;

import java.util.Date;
import java.util.List;


/**
 *
 * @author Infosoft
 */

public class PoaAnosPlanAccion {
    
    private Integer poa;
    private Integer ano;
    private Date fechaInicio;
    private Date fechaFin;
    private Integer activo;
    private Integer anoFiscal;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private Integer estadoPlan;
    private Integer convenio;

    public PoaAnosPlanAccion() {
    }

    public PoaAnosPlanAccion(Integer poa) {
        this.poa = poa;
    }

    public Integer getPoa() {
        return poa;
    }

    public void setPoa(Integer poa) {
        this.poa = poa;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }

    public Integer getAnoFiscal() {
        return anoFiscal;
    }

    public void setAnoFiscal(Integer anoFiscal) {
        this.anoFiscal = anoFiscal;
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

    public Integer getEstadoPlan() {
        return estadoPlan;
    }

    public void setEstadoPlan(Integer estadoPlan) {
        this.estadoPlan = estadoPlan;
    }

    public Integer getConvenio() {
        return convenio;
    }

    public void setConvenio(Integer convenio) {
        this.convenio = convenio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (poa != null ? poa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PoaAnosPlanAccion)) {
            return false;
        }
        PoaAnosPlanAccion other = (PoaAnosPlanAccion) object;
        if ((this.poa == null && other.poa != null) || (this.poa != null && !this.poa.equals(other.poa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.PoaAnosPlanAccion[ poa=" + poa + " ]";
    }
}