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

public class PoaReprogramacionesDetalleTiposMov {
    
    protected PoaReprogramacionesDetalleTiposMovPK poaReprogramacionesDetalleTiposMovPK;
    private String comentario;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private TiposMovimientosPoa tiposMovimientosPoa;
    private PoaReprogramaciones poaReprogramaciones;

    public PoaReprogramacionesDetalleTiposMov() {
    }

    public PoaReprogramacionesDetalleTiposMov(PoaReprogramacionesDetalleTiposMovPK poaReprogramacionesDetalleTiposMovPK) {
        this.poaReprogramacionesDetalleTiposMovPK = poaReprogramacionesDetalleTiposMovPK;
    }

    public PoaReprogramacionesDetalleTiposMov(int tipoMovimiento, int reprogramacion) {
        this.poaReprogramacionesDetalleTiposMovPK = new PoaReprogramacionesDetalleTiposMovPK(tipoMovimiento, reprogramacion);
    }

    public PoaReprogramacionesDetalleTiposMovPK getPoaReprogramacionesDetalleTiposMovPK() {
        return poaReprogramacionesDetalleTiposMovPK;
    }

    public void setPoaReprogramacionesDetalleTiposMovPK(PoaReprogramacionesDetalleTiposMovPK poaReprogramacionesDetalleTiposMovPK) {
        this.poaReprogramacionesDetalleTiposMovPK = poaReprogramacionesDetalleTiposMovPK;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
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

    public TiposMovimientosPoa getTiposMovimientosPoa() {
        return tiposMovimientosPoa;
    }

    public void setTiposMovimientosPoa(TiposMovimientosPoa tiposMovimientosPoa) {
        this.tiposMovimientosPoa = tiposMovimientosPoa;
    }

    public PoaReprogramaciones getPoaReprogramaciones() {
        return poaReprogramaciones;
    }

    public void setPoaReprogramaciones(PoaReprogramaciones poaReprogramaciones) {
        this.poaReprogramaciones = poaReprogramaciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (poaReprogramacionesDetalleTiposMovPK != null ? poaReprogramacionesDetalleTiposMovPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PoaReprogramacionesDetalleTiposMov)) {
            return false;
        }
        PoaReprogramacionesDetalleTiposMov other = (PoaReprogramacionesDetalleTiposMov) object;
        if ((this.poaReprogramacionesDetalleTiposMovPK == null && other.poaReprogramacionesDetalleTiposMovPK != null) || (this.poaReprogramacionesDetalleTiposMovPK != null && !this.poaReprogramacionesDetalleTiposMovPK.equals(other.poaReprogramacionesDetalleTiposMovPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.PoaReprogramacionesDetalleTiposMov[ poaReprogramacionesDetalleTiposMovPK=" + poaReprogramacionesDetalleTiposMovPK + " ]";
    }
    
}
