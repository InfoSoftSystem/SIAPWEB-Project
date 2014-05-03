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
public class MultasOferente implements PersistenciaDao {

    private Integer identificadorMulta;
    private Integer identificadorPrimarioOferente;
    private Integer idTipoDeMulta;
    private String descripcionDeMulta;
    private String numeroContrato;
    private BigDecimal montoMulta;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;

    public MultasOferente() {
    }

    public MultasOferente(Integer identificadorMulta) {
        this.identificadorMulta = identificadorMulta;
    }

    public Integer getIdentificadorMulta() {
        return identificadorMulta;
    }

    public void setIdentificadorMulta(Integer identificadorMulta) {
        this.identificadorMulta = identificadorMulta;
    }

    public Integer getIdTipoDeMulta() {
        return idTipoDeMulta;
    }

    public void setIdTipoDeMulta(Integer idTipoDeMulta) {
        this.idTipoDeMulta = idTipoDeMulta;
    }

    public String getDescripcionDeMulta() {
        return descripcionDeMulta;
    }

    public void setDescripcionDeMulta(String descripcionDeMulta) {
        this.descripcionDeMulta = descripcionDeMulta;
    }

    public Integer getIdentificadorPrimarioOferente() {
        return identificadorPrimarioOferente;
    }

    public void setIdentificadorPrimarioOferente(Integer identificadorPrimarioOferente) {
        this.identificadorPrimarioOferente = identificadorPrimarioOferente;
    }

    @Override
    public Integer getEstadoDeEliminacion() {
        return estadoDeEliminacion;
    }

    public void setEstadoDeEliminacion(Integer estadoDeEliminacion) {
        this.estadoDeEliminacion = estadoDeEliminacion;
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
    public String toString() {
        return "sv.gob.mined.apps.siapv2.mvn.modelo.MultasOferente[ identificadorMulta=" + identificadorMulta + " ]";
    }

    public String getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(String numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public BigDecimal getMontoMulta() {
        return montoMulta;
    }

    public void setMontoMulta(BigDecimal montoMulta) {
        this.montoMulta = montoMulta;
    }

    @Override
    public String generarInsertSQL() {
        return "INSERT INTO dbo.MultasOferente (identificadorPrimarioOferente, idTipoDeMulta, descripcionDeMulta, numeroContrato, montoMulta, fechaDeInsercion, fechaDeModificacion, fechaDeEliminacion, estadoDeEliminacion, name) "
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    }

    @Override
    public Object[] getDatosInsert() {
        return new Object[]{identificadorPrimarioOferente, idTipoDeMulta, descripcionDeMulta, numeroContrato, montoMulta, fechaDeInsercion, fechaDeModificacion, fechaDeEliminacion, estadoDeEliminacion, name};
    }

    @Override
    public String generarUpdateSQL() {
        return "UPDATE dbo.MultasOferente SET identificadorPrimarioOferente=?, idTipoDeMulta=?, descripcionDeMulta=?, numeroContrato=?, montoMulta=?, fechaDeInsercion=?, fechaDeModificacion=?, fechaDeEliminacion=?, estadoDeEliminacion=?, name=? "
                + " WHERE identificadorMulta=?";
    }

    @Override
    public Object[] getDatosUpdate() {
        return new Object[]{identificadorPrimarioOferente, idTipoDeMulta, descripcionDeMulta, numeroContrato, montoMulta, fechaDeInsercion, fechaDeModificacion, fechaDeEliminacion, estadoDeEliminacion, name, identificadorMulta};
    }
}