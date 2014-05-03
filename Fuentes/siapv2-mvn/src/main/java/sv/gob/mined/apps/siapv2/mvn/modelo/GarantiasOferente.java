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
 * @author Infosoft
 */

public class GarantiasOferente implements PersistenciaDao{
    private Integer identificadorGarantia;
    private Integer identificadorPrimarioOferente;
    private Integer idTipoGarantia;
    private String numeroContrato;
    private String descripcionGarantia;
    private Date fechaEmision;
    private Date fechaVencimiento;
    private BigDecimal montoGarantia;
    private Integer estadoGarantia;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;

    private Boolean efectiva = false;
    
    public GarantiasOferente() {
    }

    public GarantiasOferente(Integer identificadorGarantia) {
        this.identificadorGarantia = identificadorGarantia;
    }

    public Integer getIdentificadorGarantia() {
        return identificadorGarantia;
    }

    public void setIdentificadorGarantia(Integer identificadorGarantia) {
        this.identificadorGarantia = identificadorGarantia;
    }

    public Integer getIdentificadorPrimarioOferente() {
        return identificadorPrimarioOferente;
    }

    public void setIdentificadorPrimarioOferente(Integer identificadorPrimarioOferente) {
        this.identificadorPrimarioOferente = identificadorPrimarioOferente;
    }

    public Integer getIdTipoGarantia() {
        return idTipoGarantia;
    }

    public void setIdTipoGarantia(Integer idTipoGarantia) {
        this.idTipoGarantia = idTipoGarantia;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public BigDecimal getMontoGarantia() {
        return montoGarantia;
    }

    public void setMontoGarantia(BigDecimal montoGarantia) {
        this.montoGarantia = montoGarantia;
    }

    public Integer getEstadoGarantia() {
        return estadoGarantia;
    }

    public void setEstadoGarantia(Integer estadoGarantia) {
        this.estadoGarantia = estadoGarantia;
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
        hash += (identificadorGarantia != null ? identificadorGarantia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GarantiasOferente)) {
            return false;
        }
        GarantiasOferente other = (GarantiasOferente) object;
        if ((this.identificadorGarantia == null && other.identificadorGarantia != null) || (this.identificadorGarantia != null && !this.identificadorGarantia.equals(other.identificadorGarantia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.siapv2.mvn.modelo.GarantiasOferente[ identificadorGarantia=" + identificadorGarantia + " ]";
    }

    public String getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(String numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    @Override
    public Integer getEstadoDeEliminacion() {
        return estadoDeEliminacion;
    }

    public void setEstadoDeEliminacion(Integer estadoDeEliminacion) {
        this.estadoDeEliminacion = estadoDeEliminacion;
    }

    public String getDescripcionGarantia() {
        return descripcionGarantia;
    }

    public void setDescripcionGarantia(String descripcionGarantia) {
        this.descripcionGarantia = descripcionGarantia;
    }

    public Boolean getEfectiva() {
        return efectiva;
    }

    public void setEfectiva(Boolean efectiva) {
        this.efectiva = efectiva;
        if(efectiva){
            idTipoGarantia = 1;
        }else{
            idTipoGarantia = 0;
        }
    }

    @Override
    public String generarInsertSQL() {
        return "INSERT INTO dbo.GarantiasOferente (identificadorPrimarioOferente, idTipoGarantia, numeroContrato, fechaEmision, fechaVencimiento, montoGarantia, estadoGarantia, descripcionGarantia, fechaDeInsercion, fechaDeModificacion, fechaDeEliminacion, estadoDeEliminacion, name) " +
                    "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    }

    @Override
    public Object[] getDatosInsert() {
        return new Object[]{identificadorPrimarioOferente, idTipoGarantia, numeroContrato, fechaEmision, fechaVencimiento, montoGarantia, estadoGarantia, descripcionGarantia, fechaDeInsercion, fechaDeModificacion, fechaDeEliminacion, estadoDeEliminacion, name};
    }

    @Override
    public String generarUpdateSQL() {
        return "UPDATE dbo.GarantiasOferente SET identificadorPrimarioOferente=?, idTipoGarantia=?, numeroContrato=?, fechaEmision=?, fechaVencimiento=?, montoGarantia=?, estadoGarantia=?, descripcionGarantia=?, fechaDeInsercion=?, fechaDeModificacion=?, fechaDeEliminacion=?, estadoDeEliminacion=?, name=?  " +
                    " WHERE identificadorGarantia=?";
    }

    @Override
    public Object[] getDatosUpdate() {
        return new Object[]{identificadorPrimarioOferente, idTipoGarantia, numeroContrato, fechaEmision, fechaVencimiento, montoGarantia, estadoGarantia, descripcionGarantia, fechaDeInsercion, fechaDeModificacion, fechaDeEliminacion, estadoDeEliminacion, name, identificadorGarantia};
    }
}