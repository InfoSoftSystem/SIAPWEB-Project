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
public class PoaRecursos implements PersistenciaDao {

    private Integer recurso;
    private String producto;
    private Integer actividad;
    private Integer poa;
    private Integer trasferencia;
    private Integer grupoMacrotareas;
    private Integer poaRecurso;
    private Integer actividadPoa;
    private Integer reprogramacion;
    private Date fechaTdr;
    private Integer finalizado;
    private Date fechaAdquisicion;
    private String observacion;
    private BigDecimal precioUnitario;
    private Integer cantidad;
    private Integer valor;
    private Date fechaActualizacion;
    private Integer desfinanciado;
    private Integer activo;
    private Integer iniciado;
    private Date fechaUaci;
    private Integer ajustado;
    private Integer noAplicaIva;
    private Integer nuevo;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private Integer idCategoria;
    private String name;
    private PgActividades pgActividad;
    private List<PoaRecursosSaldos> lstPoaRecursosSaldos;

    public PoaRecursos() {
    }

    public PoaRecursos(Integer recurso) {
        this.recurso = recurso;
    }

    public Integer getRecurso() {
        return recurso;
    }

    public void setRecurso(Integer recurso) {
        this.recurso = recurso;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Integer getGrupoMacrotareas() {
        return grupoMacrotareas;
    }

    public void setGrupoMacrotareas(Integer grupoMacrotareas) {
        this.grupoMacrotareas = grupoMacrotareas;
    }

    public Integer getPoaRecurso() {
        return poaRecurso;
    }

    public void setPoaRecurso(Integer poaRecurso) {
        this.poaRecurso = poaRecurso;
    }

    public Integer getActividadPoa() {
        return actividadPoa;
    }

    public void setActividadPoa(Integer actividadPoa) {
        this.actividadPoa = actividadPoa;
    }

    public Integer getReprogramacion() {
        return reprogramacion;
    }

    public void setReprogramacion(Integer reprogramacion) {
        this.reprogramacion = reprogramacion;
    }

    public Date getFechaTdr() {
        return fechaTdr;
    }

    public void setFechaTdr(Date fechaTdr) {
        this.fechaTdr = fechaTdr;
    }

    public Integer getFinalizado() {
        return finalizado;
    }

    public void setFinalizado(Integer finalizado) {
        this.finalizado = finalizado;
    }

    public Date getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(Date fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public Integer getDesfinanciado() {
        return desfinanciado;
    }

    public void setDesfinanciado(Integer desfinanciado) {
        this.desfinanciado = desfinanciado;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }

    public Integer getIniciado() {
        return iniciado;
    }

    public void setIniciado(Integer iniciado) {
        this.iniciado = iniciado;
    }

    public Date getFechaUaci() {
        return fechaUaci;
    }

    public void setFechaUaci(Date fechaUaci) {
        this.fechaUaci = fechaUaci;
    }

    public Integer getAjustado() {
        return ajustado;
    }

    public void setAjustado(Integer ajustado) {
        this.ajustado = ajustado;
    }

    public Integer getNoAplicaIva() {
        return noAplicaIva;
    }

    public void setNoAplicaIva(Integer noAplicaIva) {
        this.noAplicaIva = noAplicaIva;
    }

    public Integer getNuevo() {
        return nuevo;
    }

    public void setNuevo(Integer nuevo) {
        this.nuevo = nuevo;
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

    public Integer getTrasferencia() {
        return trasferencia;
    }

    public void setTrasferencia(Integer trasferencia) {
        this.trasferencia = trasferencia;
    }

    public Integer getPoa() {
        return poa;
    }

    public void setPoa(Integer poa) {
        this.poa = poa;
    }

    public Integer getActividad() {
        return actividad;
    }

    public void setActividad(Integer actividad) {
        this.actividad = actividad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (recurso != null ? recurso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PoaRecursos)) {
            return false;
        }
        PoaRecursos other = (PoaRecursos) object;
        if ((this.recurso == null && other.recurso != null) || (this.recurso != null && !this.recurso.equals(other.recurso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return observacion;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Override
    public String generarInsertSQL() {
        return "INSERT INTO dbo.poa_recursos (producto, actividad, poa, trasferencia, grupo_macrotareas, poa_recurso, actividad_poa, reprogramacion, fecha_tdr, finalizado, fecha_adquisicion, observacion, precio_unitario, cantidad, valor, fecha_actualizacion, desfinanciado, activo, iniciado, fecha_uaci, ajustado, no_aplica_iva, nuevo, id_categoria, fechaDeInsercion, fechaDeModificacion, fechaDeEliminacion, estadoDeEliminacion, name) "
                + "	VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    }

    @Override
    public Object[] getDatosInsert() {
        return new Object[]{producto, actividad, poa, trasferencia, grupoMacrotareas, poaRecurso, actividadPoa, reprogramacion, fechaTdr, finalizado, fechaAdquisicion, observacion, precioUnitario, cantidad, valor, fechaActualizacion, desfinanciado, activo, iniciado, fechaUaci, ajustado, noAplicaIva, nuevo, idCategoria, fechaDeInsercion, fechaDeModificacion, fechaDeEliminacion, estadoDeEliminacion, name};
    }

    @Override
    public String generarUpdateSQL() {
        return "UPDATE dbo.poa_recursos set producto=?, actividad=?, poa=?, trasferencia=?, grupo_macrotareas=?, poa_recurso=?, actividad_poa=?, reprogramacion=?, fecha_tdr=?, finalizado=?, fecha_adquisicion=?, observacion=?, precio_unitario=?, cantidad=?, valor=?, fecha_actualizacion=?, desfinanciado=?, activo=?, iniciado=?, fecha_uaci=?, ajustado=?, no_aplica_iva=?, nuevo=?, id_categoria=?, fechaDeInsercion=?, fechaDeModificacion=?, fechaDeEliminacion=?, estadoDeEliminacion=?, name=? "
                + "	WHERE recurso=?";
    }

    @Override
    public Object[] getDatosUpdate() {
        return new Object[]{producto, actividad, poa, trasferencia, grupoMacrotareas, poaRecurso, actividadPoa, reprogramacion, fechaTdr, finalizado, fechaAdquisicion, observacion, precioUnitario, cantidad, valor, fechaActualizacion, desfinanciado, activo, iniciado, fechaUaci, ajustado, noAplicaIva, nuevo, idCategoria, fechaDeInsercion, fechaDeModificacion, fechaDeEliminacion, estadoDeEliminacion, name, recurso};
    }

    public PgActividades getPgActividad() {
        return pgActividad;
    }

    public void setPgActividad(PgActividades pgActividad) {
        this.pgActividad = pgActividad;
    }

    public List<PoaRecursosSaldos> getLstPoaRecursosSaldos() {
        if (lstPoaRecursosSaldos == null) {
            lstPoaRecursosSaldos = new ArrayList<PoaRecursosSaldos>();
        }
        return lstPoaRecursosSaldos;
    }

    public void setLstPoaRecursosSaldos(List<PoaRecursosSaldos> lstPoaRecursosSaldos) {
        this.lstPoaRecursosSaldos = lstPoaRecursosSaldos;
    }

    public PoaRecursosSaldos getRecursosSaldos(Boolean ftePpal) {
        if (getLstPoaRecursosSaldos().size() > 1) {
            for (PoaRecursosSaldos poaRecursosSaldos : getLstPoaRecursosSaldos()) {
                if (poaRecursosSaldos.getOrganismo() != 5 && ftePpal) {
                    return poaRecursosSaldos;
                } else if (poaRecursosSaldos.getOrganismo() == 5 && !ftePpal) {
                    return poaRecursosSaldos;
                }
            }
        }

        return getLstPoaRecursosSaldos().get(0);
    }
}