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

public class PgAnosPlanGlobal  {
    
    private Integer identificadorAnoPap;
    private Integer ano;
    private Integer activo;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private Integer pgConvenio;
    private Integer convenio;

    public PgAnosPlanGlobal() {
    }

    public PgAnosPlanGlobal(Integer identificadorAnoPap) {
        this.identificadorAnoPap = identificadorAnoPap;
    }

    public Integer getIdentificadorAnoPap() {
        return identificadorAnoPap;
    }

    public void setIdentificadorAnoPap(Integer identificadorAnoPap) {
        this.identificadorAnoPap = identificadorAnoPap;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
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

    public Integer getPgConvenio() {
        return pgConvenio;
    }

    public void setPgConvenio(Integer pgConvenio) {
        this.pgConvenio = pgConvenio;
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
        hash += (identificadorAnoPap != null ? identificadorAnoPap.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PgAnosPlanGlobal)) {
            return false;
        }
        PgAnosPlanGlobal other = (PgAnosPlanGlobal) object;
        if ((this.identificadorAnoPap == null && other.identificadorAnoPap != null) || (this.identificadorAnoPap != null && !this.identificadorAnoPap.equals(other.identificadorAnoPap))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return ano.toString();
    }
    
}
