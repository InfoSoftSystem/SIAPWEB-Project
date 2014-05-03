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
public class FaltasOferente implements PersistenciaDao{
    private Integer identificadorFalta;
    private Integer identificadorPrimarioOferente;
    private Integer idTipoDeFalta;
    private String descripcionFalta;
    private String numeroContrato;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    
    private String razonSocial;
    
    public FaltasOferente() {
    }

    public FaltasOferente(Integer identificadorFalta) {
        this.identificadorFalta = identificadorFalta;
    }

    public FaltasOferente(Integer identificadorFalta, String descripcionFalta) {
        this.identificadorFalta = identificadorFalta;
        this.descripcionFalta = descripcionFalta;
    }

    public Integer getIdentificadorFalta() {
        return identificadorFalta;
    }

    public void setIdentificadorFalta(Integer identificadorFalta) {
        this.identificadorFalta = identificadorFalta;
    }

    public Integer getIdentificadorPrimarioOferente() {
        return identificadorPrimarioOferente;
    }

    public void setIdentificadorPrimarioOferente(Integer identificadorPrimarioOferente) {
        this.identificadorPrimarioOferente = identificadorPrimarioOferente;
    }

    public Integer getIdTipoDeFalta() {
        return idTipoDeFalta;
    }

    public void setIdTipoDeFalta(Integer idTipoDeFalta) {
        this.idTipoDeFalta = idTipoDeFalta;
    }

    public String getDescripcionFalta() {
        return descripcionFalta;
    }

    public void setDescripcionFalta(String descripcionFalta) {
        this.descripcionFalta = descripcionFalta;
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

    public String getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(String numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (identificadorFalta != null ? identificadorFalta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FaltasOferente)) {
            return false;
        }
        FaltasOferente other = (FaltasOferente) object;
        if ((this.identificadorFalta == null && other.identificadorFalta != null) || (this.identificadorFalta != null && !this.identificadorFalta.equals(other.identificadorFalta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return descripcionFalta;
    }

    @Override
    public String generarInsertSQL() {
        return "INSERT INTO dbo.FaltasOferente (identificadorPrimarioOferente, idTipoDeFalta, numeroContrato, descripcionFalta, fechaDeInsercion, fechaDeModificacion, fechaDeEliminacion, estadoDeEliminacion, name ) "  +
                    " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    }

    @Override
    public Object[] getDatosInsert() {
        return new Object[]{identificadorPrimarioOferente, idTipoDeFalta, numeroContrato, descripcionFalta, fechaDeInsercion, fechaDeModificacion, fechaDeEliminacion, estadoDeEliminacion, name };
    }

    @Override
    public String generarUpdateSQL() {
        return "UPDATE dbo.FaltasOferente SET identificadorPrimarioOferente=?, idTipoDeFalta=?, numeroContrato=?, descripcionFalta=?, fechaDeInsercion=?, fechaDeModificacion=?, fechaDeEliminacion=?, estadoDeEliminacion=?, name =? "  +
                    " WHERE identificadorFalta=?";
    }

    @Override
    public Object[] getDatosUpdate() {
        return new Object[]{identificadorPrimarioOferente, idTipoDeFalta, numeroContrato, descripcionFalta, fechaDeInsercion, fechaDeModificacion, fechaDeEliminacion, estadoDeEliminacion, name, identificadorFalta};
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
}