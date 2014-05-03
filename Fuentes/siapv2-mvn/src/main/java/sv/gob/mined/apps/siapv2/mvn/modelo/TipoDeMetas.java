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

public class TipoDeMetas {
    
    private Integer idTipoMeta;
    private String descripcionDelTipoDeMeta;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private List<PgMetas> pgMetasList;

    public TipoDeMetas() {
    }

    public TipoDeMetas(Integer idTipoMeta) {
        this.idTipoMeta = idTipoMeta;
    }

    public Integer getIdTipoMeta() {
        return idTipoMeta;
    }

    public void setIdTipoMeta(Integer idTipoMeta) {
        this.idTipoMeta = idTipoMeta;
    }

    public String getDescripcionDelTipoDeMeta() {
        return descripcionDelTipoDeMeta;
    }

    public void setDescripcionDelTipoDeMeta(String descripcionDelTipoDeMeta) {
        this.descripcionDelTipoDeMeta = descripcionDelTipoDeMeta;
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

    public List<PgMetas> getPgMetasList() {
        return pgMetasList;
    }

    public void setPgMetasList(List<PgMetas> pgMetasList) {
        this.pgMetasList = pgMetasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoMeta != null ? idTipoMeta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoDeMetas)) {
            return false;
        }
        TipoDeMetas other = (TipoDeMetas) object;
        if ((this.idTipoMeta == null && other.idTipoMeta != null) || (this.idTipoMeta != null && !this.idTipoMeta.equals(other.idTipoMeta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return descripcionDelTipoDeMeta;
    }
    
}
