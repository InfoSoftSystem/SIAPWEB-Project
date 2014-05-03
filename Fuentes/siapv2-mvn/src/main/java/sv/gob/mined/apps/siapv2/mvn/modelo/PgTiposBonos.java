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

public class PgTiposBonos {
    private Integer tipoBono;
    private String tipoBonoDescripcion;
    private Integer tipoBonoSmael;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private List<PgActividades> pgActividadesList;

    public PgTiposBonos() {
    }

    public PgTiposBonos(Integer tipoBono) {
        this.tipoBono = tipoBono;
    }

    public Integer getTipoBono() {
        return tipoBono;
    }

    public void setTipoBono(Integer tipoBono) {
        this.tipoBono = tipoBono;
    }

    public String getTipoBonoDescripcion() {
        return tipoBonoDescripcion;
    }

    public void setTipoBonoDescripcion(String tipoBonoDescripcion) {
        this.tipoBonoDescripcion = tipoBonoDescripcion;
    }

    public Integer getTipoBonoSmael() {
        return tipoBonoSmael;
    }

    public void setTipoBonoSmael(Integer tipoBonoSmael) {
        this.tipoBonoSmael = tipoBonoSmael;
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

    public List<PgActividades> getPgActividadesList() {
        return pgActividadesList;
    }

    public void setPgActividadesList(List<PgActividades> pgActividadesList) {
        this.pgActividadesList = pgActividadesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipoBono != null ? tipoBono.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PgTiposBonos)) {
            return false;
        }
        PgTiposBonos other = (PgTiposBonos) object;
        if ((this.tipoBono == null && other.tipoBono != null) || (this.tipoBono != null && !this.tipoBono.equals(other.tipoBono))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.PgTiposBonos[ tipoBono=" + tipoBono + " ]";
    }
    
}
