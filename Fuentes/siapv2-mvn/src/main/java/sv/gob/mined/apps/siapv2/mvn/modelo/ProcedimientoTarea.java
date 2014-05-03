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

public class ProcedimientoTarea {
    
    private Integer idProcedimiento;
    private String descripcionDelProcedimiento;
    private Integer identificadorDeLaEntidad;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private List<BitacoraRegistroProce> bitacoraRegistroProceList;
    private SecurityUsers name;
    private Procesos identificacionDelProceso;
    private CatalogoTareas identificadorDeLaTarea;

    public ProcedimientoTarea() {
    }

    public ProcedimientoTarea(Integer idProcedimiento) {
        this.idProcedimiento = idProcedimiento;
    }

    public Integer getIdProcedimiento() {
        return idProcedimiento;
    }

    public void setIdProcedimiento(Integer idProcedimiento) {
        this.idProcedimiento = idProcedimiento;
    }

    public String getDescripcionDelProcedimiento() {
        return descripcionDelProcedimiento;
    }

    public void setDescripcionDelProcedimiento(String descripcionDelProcedimiento) {
        this.descripcionDelProcedimiento = descripcionDelProcedimiento;
    }

    public Integer getIdentificadorDeLaEntidad() {
        return identificadorDeLaEntidad;
    }

    public void setIdentificadorDeLaEntidad(Integer identificadorDeLaEntidad) {
        this.identificadorDeLaEntidad = identificadorDeLaEntidad;
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

    public List<BitacoraRegistroProce> getBitacoraRegistroProceList() {
        return bitacoraRegistroProceList;
    }

    public void setBitacoraRegistroProceList(List<BitacoraRegistroProce> bitacoraRegistroProceList) {
        this.bitacoraRegistroProceList = bitacoraRegistroProceList;
    }

    public SecurityUsers getName() {
        return name;
    }

    public void setName(SecurityUsers name) {
        this.name = name;
    }

    public Procesos getIdentificacionDelProceso() {
        return identificacionDelProceso;
    }

    public void setIdentificacionDelProceso(Procesos identificacionDelProceso) {
        this.identificacionDelProceso = identificacionDelProceso;
    }

    public CatalogoTareas getIdentificadorDeLaTarea() {
        return identificadorDeLaTarea;
    }

    public void setIdentificadorDeLaTarea(CatalogoTareas identificadorDeLaTarea) {
        this.identificadorDeLaTarea = identificadorDeLaTarea;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProcedimiento != null ? idProcedimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProcedimientoTarea)) {
            return false;
        }
        ProcedimientoTarea other = (ProcedimientoTarea) object;
        if ((this.idProcedimiento == null && other.idProcedimiento != null) || (this.idProcedimiento != null && !this.idProcedimiento.equals(other.idProcedimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.ProcedimientoTarea[ idProcedimiento=" + idProcedimiento + " ]";
    }
    
}
