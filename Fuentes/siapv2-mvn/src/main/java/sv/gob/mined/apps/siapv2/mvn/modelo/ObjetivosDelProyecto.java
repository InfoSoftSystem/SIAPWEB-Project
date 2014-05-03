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

public class ObjetivosDelProyecto  {
    private Integer identificadorDelObjetivo;
    private String descripcionDelObjetivo;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private PgConvenio convenio;

    public ObjetivosDelProyecto() {
    }

    public ObjetivosDelProyecto(Integer identificadorDelObjetivo) {
        this.identificadorDelObjetivo = identificadorDelObjetivo;
    }

    public Integer getIdentificadorDelObjetivo() {
        return identificadorDelObjetivo;
    }

    public void setIdentificadorDelObjetivo(Integer identificadorDelObjetivo) {
        this.identificadorDelObjetivo = identificadorDelObjetivo;
    }

    public String getDescripcionDelObjetivo() {
        return descripcionDelObjetivo;
    }

    public void setDescripcionDelObjetivo(String descripcionDelObjetivo) {
        this.descripcionDelObjetivo = descripcionDelObjetivo;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (identificadorDelObjetivo != null ? identificadorDelObjetivo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ObjetivosDelProyecto)) {
            return false;
        }
        ObjetivosDelProyecto other = (ObjetivosDelProyecto) object;
        if ((this.identificadorDelObjetivo == null && other.identificadorDelObjetivo != null) || (this.identificadorDelObjetivo != null && !this.identificadorDelObjetivo.equals(other.identificadorDelObjetivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.ObjetivosDelProyecto[ identificadorDelObjetivo=" + identificadorDelObjetivo + " ]";
    }
    
}
