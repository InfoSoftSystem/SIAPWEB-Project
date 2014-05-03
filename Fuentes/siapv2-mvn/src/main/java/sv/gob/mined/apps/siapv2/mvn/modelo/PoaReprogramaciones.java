/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;

import java.util.Date;
import sv.gob.mined.apps.siapv2.mvn.dao.PersistenciaDao;

/**
 *
 * @author Infosoft
 */

public class PoaReprogramaciones implements PersistenciaDao{
    
    private Integer reprogramacion;
    private Integer poa;
    private String estructuraOrganizativa;
    private Integer tipoPoaReprog;
    private Integer estadoPoaReprogramaciones;
    private String justificacion;
    private Date fechaAprobacion;
    private String numeroReprogramacion;
    private Integer tipoAprobacion;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;

    public PoaReprogramaciones() {
    }

    public PoaReprogramaciones(Integer reprogramacion) {
        this.reprogramacion = reprogramacion;
    }

    public Integer getReprogramacion() {
        return reprogramacion;
    }

    public void setReprogramacion(Integer reprogramacion) {
        this.reprogramacion = reprogramacion;
    }

    public String getJustificacion() {
        return justificacion;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }

    public Date getFechaAprobacion() {
        return fechaAprobacion;
    }

    public void setFechaAprobacion(Date fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }

    public String getNumeroReprogramacion() {
        return numeroReprogramacion;
    }

    public void setNumeroReprogramacion(String numeroReprogramacion) {
        this.numeroReprogramacion = numeroReprogramacion;
    }

    public Integer getTipoAprobacion() {
        return tipoAprobacion;
    }

    public void setTipoAprobacion(Integer tipoAprobacion) {
        this.tipoAprobacion = tipoAprobacion;
    }

    public Date getFechaDeInsercion() {
        return fechaDeInsercion;
    }

    @Override
    public void setFechaDeInsercion(Date fechaDeInsercion) {
        this.fechaDeInsercion = fechaDeInsercion;
    }

    public Date getFechaDeModificacion() {
        return fechaDeModificacion;
    }

    @Override
    public void setFechaDeModificacion(Date fechaDeModificacion) {
        this.fechaDeModificacion = fechaDeModificacion;
    }

    public Date getFechaDeEliminacion() {
        return fechaDeEliminacion;
    }

    @Override
    public void setFechaDeEliminacion(Date fechaDeEliminacion) {
        this.fechaDeEliminacion = fechaDeEliminacion;
    }

    @Override
    public Integer getEstadoDeEliminacion() {
        return estadoDeEliminacion;
    }

    public void setEstadoDeEliminacion(Integer estadoDeEliminacion) {
        this.estadoDeEliminacion = estadoDeEliminacion;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Integer getPoa() {
        return poa;
    }

    public void setPoa(Integer poa) {
        this.poa = poa;
    }

    public String getEstructuraOrganizativa() {
        return estructuraOrganizativa;
    }

    public void setEstructuraOrganizativa(String estructuraOrganizativa) {
        this.estructuraOrganizativa = estructuraOrganizativa;
    }

    public Integer getTipoPoaReprog() {
        return tipoPoaReprog;
    }

    public void setTipoPoaReprog(Integer tipoPoaReprog) {
        this.tipoPoaReprog = tipoPoaReprog;
    }

    public Integer getEstadoPoaReprogramaciones() {
        return estadoPoaReprogramaciones;
    }

    public void setEstadoPoaReprogramaciones(Integer estadoPoaReprogramaciones) {
        this.estadoPoaReprogramaciones = estadoPoaReprogramaciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reprogramacion != null ? reprogramacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PoaReprogramaciones)) {
            return false;
        }
        PoaReprogramaciones other = (PoaReprogramaciones) object;
        if ((this.reprogramacion == null && other.reprogramacion != null) || (this.reprogramacion != null && !this.reprogramacion.equals(other.reprogramacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.PoaReprogramaciones[ reprogramacion=" + reprogramacion + " ]";
    }

    @Override
    public String generarInsertSQL() {
        return "INSERT INTO dbo.poa_reprogramaciones (poa, estructura_organizativa, tipo_poa_reprog, estado_poa_reprogramaciones, justificacion, fecha_aprobacion, numero_reprogramacion, tipo_aprobacion, fechaDeInsercion, fechaDeModificacion, fechaDeEliminacion, estadoDeEliminacion, name) " +
                    " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    }

    @Override
    public Object[] getDatosInsert() {
        return new Object[]{poa, estructuraOrganizativa, tipoPoaReprog, estadoPoaReprogramaciones, justificacion, fechaAprobacion, numeroReprogramacion, tipoAprobacion, fechaDeInsercion, fechaDeModificacion, fechaDeEliminacion, estadoDeEliminacion, name};
    }

    @Override
    public String generarUpdateSQL() {
        return "UPDATE dbo.poa_reprogramaciones SET poa=?, estructura_organizativa=?, tipo_poa_reprog=?, estado_poa_reprogramaciones=?, justificacion=?, fecha_aprobacion=?, numero_reprogramacion=?, tipo_aprobacion=?, fechaDeInsercion=?, fechaDeModificacion=?, fechaDeEliminacion=?, estadoDeEliminacion=?, name =? " +
                    " WHERE reprogramacion=?";
    }

    @Override
    public Object[] getDatosUpdate() {
        return new Object[]{poa, estructuraOrganizativa, tipoPoaReprog, estadoPoaReprogramaciones, justificacion, fechaAprobacion, numeroReprogramacion, tipoAprobacion, fechaDeInsercion, fechaDeModificacion, fechaDeEliminacion, estadoDeEliminacion, name, reprogramacion};
    }
    
}
