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

public class BitacoraRegistroProce {
    
    
    private Integer idBitacoraRegistro;
    private Integer identificadorDeLaEntidad;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private SecurityUsers name;
    private ProcedimientoTarea idProcedimiento;
    private EstadoGeneralAplicacion idGeneralEstado;

    public BitacoraRegistroProce() {
    }

    public BitacoraRegistroProce(Integer idBitacoraRegistro) {
        this.idBitacoraRegistro = idBitacoraRegistro;
    }

    public Integer getIdBitacoraRegistro() {
        return idBitacoraRegistro;
    }

    public void setIdBitacoraRegistro(Integer idBitacoraRegistro) {
        this.idBitacoraRegistro = idBitacoraRegistro;
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

    public SecurityUsers getName() {
        return name;
    }

    public void setName(SecurityUsers name) {
        this.name = name;
    }

    public ProcedimientoTarea getIdProcedimiento() {
        return idProcedimiento;
    }

    public void setIdProcedimiento(ProcedimientoTarea idProcedimiento) {
        this.idProcedimiento = idProcedimiento;
    }

    public EstadoGeneralAplicacion getIdGeneralEstado() {
        return idGeneralEstado;
    }

    public void setIdGeneralEstado(EstadoGeneralAplicacion idGeneralEstado) {
        this.idGeneralEstado = idGeneralEstado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBitacoraRegistro != null ? idBitacoraRegistro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BitacoraRegistroProce)) {
            return false;
        }
        BitacoraRegistroProce other = (BitacoraRegistroProce) object;
        if ((this.idBitacoraRegistro == null && other.idBitacoraRegistro != null) || (this.idBitacoraRegistro != null && !this.idBitacoraRegistro.equals(other.idBitacoraRegistro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.BitacoraRegistroProce[ idBitacoraRegistro=" + idBitacoraRegistro + " ]";
    }
    
}
