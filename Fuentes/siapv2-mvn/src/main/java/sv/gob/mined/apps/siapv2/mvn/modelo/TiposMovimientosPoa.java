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

public class TiposMovimientosPoa {
    
    private Integer tipoMovimiento;
    private String descMovimiento;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private List<PoaReprogramacionesDetalleTiposMov> poaReprogramacionesDetalleTiposMovList;

    public TiposMovimientosPoa() {
    }

    public TiposMovimientosPoa(Integer tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public Integer getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(Integer tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public String getDescMovimiento() {
        return descMovimiento;
    }

    public void setDescMovimiento(String descMovimiento) {
        this.descMovimiento = descMovimiento;
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

    public List<PoaReprogramacionesDetalleTiposMov> getPoaReprogramacionesDetalleTiposMovList() {
        return poaReprogramacionesDetalleTiposMovList;
    }

    public void setPoaReprogramacionesDetalleTiposMovList(List<PoaReprogramacionesDetalleTiposMov> poaReprogramacionesDetalleTiposMovList) {
        this.poaReprogramacionesDetalleTiposMovList = poaReprogramacionesDetalleTiposMovList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipoMovimiento != null ? tipoMovimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposMovimientosPoa)) {
            return false;
        }
        TiposMovimientosPoa other = (TiposMovimientosPoa) object;
        if ((this.tipoMovimiento == null && other.tipoMovimiento != null) || (this.tipoMovimiento != null && !this.tipoMovimiento.equals(other.tipoMovimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.TiposMovimientosPoa[ tipoMovimiento=" + tipoMovimiento + " ]";
    }
    
}
