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

public class DetalleMacroConvenio {
    
    protected DetalleMacroConvenioPK detalleMacroConvenioPK;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private PgConvenio convenio;
    private DetalleMacroProcAplicable detalleMacroProcAplicable;

    public DetalleMacroConvenio() {
    }

    public DetalleMacroConvenio(DetalleMacroConvenioPK detalleMacroConvenioPK) {
        this.detalleMacroConvenioPK = detalleMacroConvenioPK;
    }

    public DetalleMacroConvenio(int idDetalleMacroAplicable, int idDetalleMacroProceso) {
        this.detalleMacroConvenioPK = new DetalleMacroConvenioPK(idDetalleMacroAplicable, idDetalleMacroProceso);
    }

    public DetalleMacroConvenioPK getDetalleMacroConvenioPK() {
        return detalleMacroConvenioPK;
    }

    public void setDetalleMacroConvenioPK(DetalleMacroConvenioPK detalleMacroConvenioPK) {
        this.detalleMacroConvenioPK = detalleMacroConvenioPK;
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

    public PgConvenio getConvenio() {
        return convenio;
    }

    public void setConvenio(PgConvenio convenio) {
        this.convenio = convenio;
    }

    public DetalleMacroProcAplicable getDetalleMacroProcAplicable() {
        return detalleMacroProcAplicable;
    }

    public void setDetalleMacroProcAplicable(DetalleMacroProcAplicable detalleMacroProcAplicable) {
        this.detalleMacroProcAplicable = detalleMacroProcAplicable;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detalleMacroConvenioPK != null ? detalleMacroConvenioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleMacroConvenio)) {
            return false;
        }
        DetalleMacroConvenio other = (DetalleMacroConvenio) object;
        if ((this.detalleMacroConvenioPK == null && other.detalleMacroConvenioPK != null) || (this.detalleMacroConvenioPK != null && !this.detalleMacroConvenioPK.equals(other.detalleMacroConvenioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.DetalleMacroConvenio[ detalleMacroConvenioPK=" + detalleMacroConvenioPK + " ]";
    }
    
}
