/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import sv.gob.mined.apps.siapv2.mvn.dao.PersistenciaDao;

/**
 *
 * @author Infosoft
 */
public class PgMetas implements PersistenciaDao{
    private Integer meta;
    private Integer componente;
    private Integer codigoMeta;
    private Integer pg__meta;
    private String metaNombre;
    private String descripcion;
    private Integer idTipoMeta;
    private Integer estados;
    private String estructura_organizativa;
    private Integer modificacion;
    private Date fechaActualizacion;
    private BigDecimal montoGoes;
    private BigDecimal montoBanco;
    private Integer activo;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    
    private TipoDeMetas tipoDeMetas;
    private List<PgActividades> lstPgActividades = null;
    
    public PgMetas() {
    }

    public PgMetas(Integer meta) {
        this.meta = meta;
    }

    public Integer getMeta() {
        return meta;
    }

    public void setMeta(Integer meta) {
        this.meta = meta;
    }

    public Integer getComponente() {
        return componente;
    }

    public void setComponente(Integer componente) {
        this.componente = componente;
    }

    public Integer getCodigoMeta() {
        return codigoMeta;
    }

    public void setCodigoMeta(Integer codigoMeta) {
        this.codigoMeta = codigoMeta;
    }

    public Integer getPg__meta() {
        return pg__meta;
    }

    public void setPg__meta(Integer pg__meta) {
        this.pg__meta = pg__meta;
    }

    public String getMetaNombre() {
        return metaNombre;
    }

    public void setMetaNombre(String metaNombre) {
        this.metaNombre = metaNombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdTipoMeta() {
        return idTipoMeta;
    }

    public void setIdTipoMeta(Integer idTipoMeta) {
        this.idTipoMeta = idTipoMeta;
    }

    public Integer getEstados() {
        return estados;
    }

    public void setEstados(Integer estados) {
        this.estados = estados;
    }

    public String getEstructura_organizativa() {
        return estructura_organizativa;
    }

    public void setEstructura_organizativa(String estructura_organizativa) {
        this.estructura_organizativa = estructura_organizativa;
    }

    public Integer getModificacion() {
        return modificacion;
    }

    public void setModificacion(Integer modificacion) {
        this.modificacion = modificacion;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public BigDecimal getMontoGoes() {
        return montoGoes;
    }

    public void setMontoGoes(BigDecimal montoGoes) {
        this.montoGoes = montoGoes;
    }

    public BigDecimal getMontoBanco() {
        return montoBanco;
    }

    public void setMontoBanco(BigDecimal montoBanco) {
        this.montoBanco = montoBanco;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
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
    
    public BigDecimal getTotal(){
        return montoBanco.add(montoGoes);
    }

    public Integer getEstadoDeEliminacion() {
        return estadoDeEliminacion;
    }

    public void setEstadoDeEliminacion(Integer estadoDeEliminacion) {
        this.estadoDeEliminacion = estadoDeEliminacion;
    }
    
    @Override
    public String generarInsertSQL(){
        return "INSERT INTO dbo.pg_metas (componente, codigo_meta, pg__meta, meta_nombre, descripcion, idTipoMeta, estados, estructura_organizativa, modificacion, fecha_actualizacion, monto_goes, monto_banco, activo, fechaDeInsercion, fechaDeModificacion, fechaDeEliminacion, estadoDeEliminacion, name) " +
                " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    }

    @Override
    public Object[] getDatosInsert() {
        return new Object[]{componente, codigoMeta, pg__meta, metaNombre, descripcion, idTipoMeta, estados, estructura_organizativa, modificacion, fechaActualizacion, montoGoes, montoBanco, activo, fechaDeInsercion, fechaDeModificacion, fechaDeEliminacion, estadoDeEliminacion, name};
    }

    @Override
    public String generarUpdateSQL() {
        return "UPDATE dbo.pg_metas SET componente=?, codigo_meta=?, pg__meta=?, meta_nombre=?, descripcion=?, idTipoMeta=?, estados=?, estructura_organizativa=?, modificacion=?, fecha_actualizacion=?, monto_goes=?, monto_banco=?, activo=?, fechaDeInsercion=?, fechaDeModificacion=?, fechaDeEliminacion=?, estadoDeEliminacion=?, name=? " +
                " WHERE meta=?";
    }

    @Override
    public Object[] getDatosUpdate() {
        return new Object[]{componente, codigoMeta, pg__meta, metaNombre, descripcion, idTipoMeta, estados, estructura_organizativa, modificacion, fechaActualizacion, montoGoes, montoBanco, activo, fechaDeInsercion, fechaDeModificacion, fechaDeEliminacion, estadoDeEliminacion, name, meta};
    }

    public TipoDeMetas getTipoDeMetas() {
        return tipoDeMetas;
    }

    public void setTipoDeMetas(TipoDeMetas tipoDeMetas) {
        this.tipoDeMetas = tipoDeMetas;
        this.idTipoMeta = tipoDeMetas.getIdTipoMeta();
    }
        
    public String getDesTipoDeMeta(){
        return tipoDeMetas.getDescripcionDelTipoDeMeta();
    }
    
    public void setEliminado(Boolean eliminado){
        if(eliminado){
            estadoDeEliminacion = 1;
        }else{
            estadoDeEliminacion = 0;
        }
    }
    
    public Boolean getEliminado(){
        return estadoDeEliminacion == 1;
    }

    public List<PgActividades> getLstPgActividades() {
        if(lstPgActividades == null){
            lstPgActividades = new ArrayList<PgActividades>();
        }
        return lstPgActividades;
    }

    public void setLstPgActividades(List<PgActividades> lstPgActividades) {
        this.lstPgActividades = lstPgActividades;
    }
}