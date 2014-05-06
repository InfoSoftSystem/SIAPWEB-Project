/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;

import java.math.BigDecimal;
import java.util.Date;
import sv.gob.mined.apps.siapv2.mvn.dao.PersistenciaDao;

/**
 *
 * @author Infososft
 */

public class RescisionesOferente implements PersistenciaDao{
    private Integer identificadorRecesion;
    private Integer identificadorPrimarioOferente;
    private Integer tipoRecesion;
    private String numeroContrato;
    private String descripcionRecesion;
    private BigDecimal montoPagado;
    private BigDecimal montoRemanente;
    private Date fechaRecesion;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;

    public RescisionesOferente() {
    }

    public RescisionesOferente(Integer identificadorRecesion) {
        this.identificadorRecesion = identificadorRecesion;
    }

    public Integer getIdentificadorRecesion() {
        return identificadorRecesion;
    }

    public void setIdentificadorRecesion(Integer identificadorRecesion) {
        this.identificadorRecesion = identificadorRecesion;
    }

    public Integer getTipoRecesion() {
        return tipoRecesion;
    }

    public void setTipoRecesion(Integer tipoRecesion) {
        this.tipoRecesion = tipoRecesion;
    }

    public String getDescripcionRecesion() {
        return descripcionRecesion;
    }

    public void setDescripcionRecesion(String descripcionRecesion) {
        this.descripcionRecesion = descripcionRecesion;
    }

    public Date getFechaRecesion() {
        return fechaRecesion;
    }

    public void setFechaRecesion(Date fechaRecesion) {
        this.fechaRecesion = fechaRecesion;
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

    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (identificadorRecesion != null ? identificadorRecesion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RescisionesOferente)) {
            return false;
        }
        RescisionesOferente other = (RescisionesOferente) object;
        if ((this.identificadorRecesion == null && other.identificadorRecesion != null) || (this.identificadorRecesion != null && !this.identificadorRecesion.equals(other.identificadorRecesion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.siapv2.mvn.modelo.RecesionesOferente[ identificadorRecesion=" + identificadorRecesion + " ]";
    }

    public Integer getIdentificadorPrimarioOferente() {
        return identificadorPrimarioOferente;
    }

    public void setIdentificadorPrimarioOferente(Integer identificadorPrimarioOferente) {
        this.identificadorPrimarioOferente = identificadorPrimarioOferente;
    }

    public String getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(String numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public BigDecimal getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(BigDecimal montoPagado) {
        this.montoPagado = montoPagado;
    }

    public BigDecimal getMontoRemanente() {
        return montoRemanente;
    }

    public void setMontoRemanente(BigDecimal montoRemanente) {
        this.montoRemanente = montoRemanente;
    }

    @Override
    public Integer getEstadoDeEliminacion() {
        return estadoDeEliminacion;
    }

    public void setEstadoDeEliminacion(Integer estadoDeEliminacion) {
        this.estadoDeEliminacion = estadoDeEliminacion;
    }

    @Override
    public String generarInsertSQL() {
        return "INSERT INTO dbo.RecesionesOferente (identificadorPrimarioOferente, tipoRecesion, numeroContrato, descripcionRecesion, montoPagado, montoRemanente, fechaRecesion, fechaDeInsercion, fechaDeModificacion, fechaDeEliminacion, estadoDeEliminacion, name) " +
                    " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    }

    @Override
    public Object[] getDatosInsert() {
        return new Object[]{identificadorPrimarioOferente, tipoRecesion, numeroContrato, descripcionRecesion, montoPagado, montoRemanente, fechaRecesion, fechaDeInsercion, fechaDeModificacion, fechaDeEliminacion, estadoDeEliminacion, name};
    }

    @Override
    public String generarUpdateSQL() {
        return "UPDATE dbo.RecesionesOferente SET identificadorPrimarioOferente=?, tipoRecesion=?, numeroContrato=?, descripcionRecesion=?, montoPagado=?, montoRemanente=?, fechaRecesion=?, fechaDeInsercion=?, fechaDeModificacion=?, fechaDeEliminacion=?, estadoDeEliminacion=?, name=? " +
                    " where identificadorRecesion =?";
    }

    @Override
    public Object[] getDatosUpdate() {
        return new Object[]{identificadorPrimarioOferente, tipoRecesion, numeroContrato, descripcionRecesion, montoPagado, montoRemanente, fechaRecesion, fechaDeInsercion, fechaDeModificacion, fechaDeEliminacion, estadoDeEliminacion, name, identificadorRecesion};
    }
}