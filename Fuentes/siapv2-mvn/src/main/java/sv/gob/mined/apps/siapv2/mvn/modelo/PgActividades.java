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
public class PgActividades implements PersistenciaDao {

    private Integer actividad;
    private Integer meta;
    private Integer identificadorAnoPap;
    private String estructuraOrganizativa;
    private Integer pgActividad;
    private Integer estadoPlan;
    private Integer tipoActividad;
    private Integer modificacion;
    private String actividadNombre;
    private String actividadDescripcion;
    private BigDecimal financiamientoBanco;
    private BigDecimal financiamientoGoes;
    private Integer actividadPrioridad;
    private Integer actividadAntecesor;
    private Date actividadInicioPrevisto;
    private Date actividadFinPrevisto;
    private Date actividadFinReal;
    private Date actividadInicioReal;
    private Integer activo;
    private Integer codigoActividad;
    private String nombre;
    private Integer estadoActivacion;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private PgMetas pgMeta;    
    private PgAnosPlanGlobal pgAnosPlanGlobal;
    private List<PoaRecursos> lstPoaRecursos;

    public PgActividades() {
    }

    public PgActividades(Integer actividad) {
        this.actividad = actividad;
    }

    public Integer getActividad() {
        return actividad;
    }

    public void setActividad(Integer actividad) {
        this.actividad = actividad;
    }

    public Integer getEstadoPlan() {
        return estadoPlan;
    }

    public void setEstadoPlan(Integer estadoPlan) {
        this.estadoPlan = estadoPlan;
    }

    public String getEstructuraOrganizativa() {
        return estructuraOrganizativa;
    }

    public void setEstructuraOrganizativa(String estructuraOrganizativa) {
        this.estructuraOrganizativa = estructuraOrganizativa;
    }

    public Integer getMeta() {
        return meta;
    }

    public void setMeta(Integer meta) {
        this.meta = meta;
    }

    public Integer getTipoActividad() {
        return tipoActividad;
    }

    public void setTipoActividad(Integer tipoActividad) {
        this.tipoActividad = tipoActividad;
    }

    public Integer getModificacion() {
        return modificacion;
    }

    public void setModificacion(Integer modificacion) {
        this.modificacion = modificacion;
    }

    public Integer getPgActividad() {
        return pgActividad;
    }

    public void setPgActividad(Integer pgActividad) {
        this.pgActividad = pgActividad;
    }

    public String getActividadNombre() {
        return actividadNombre;
    }

    public void setActividadNombre(String actividadNombre) {
        this.actividadNombre = actividadNombre;
    }

    public String getActividadDescripcion() {
        return actividadDescripcion;
    }

    public void setActividadDescripcion(String actividadDescripcion) {
        this.actividadDescripcion = actividadDescripcion;
    }

    public BigDecimal getFinanciamientoBanco() {
        return financiamientoBanco;
    }

    public void setFinanciamientoBanco(BigDecimal financiamientoBanco) {
        this.financiamientoBanco = financiamientoBanco;
    }

    public BigDecimal getFinanciamientoGoes() {
        return financiamientoGoes;
    }

    public void setFinanciamientoGoes(BigDecimal financiamientoGoes) {
        this.financiamientoGoes = financiamientoGoes;
    }

    public Integer getActividadPrioridad() {
        return actividadPrioridad;
    }

    public void setActividadPrioridad(Integer actividadPrioridad) {
        this.actividadPrioridad = actividadPrioridad;
    }

    public Integer getActividadAntecesor() {
        return actividadAntecesor;
    }

    public void setActividadAntecesor(Integer actividadAntecesor) {
        this.actividadAntecesor = actividadAntecesor;
    }

    public Date getActividadInicioPrevisto() {
        return actividadInicioPrevisto;
    }

    public void setActividadInicioPrevisto(Date actividadInicioPrevisto) {
        this.actividadInicioPrevisto = actividadInicioPrevisto;
    }

    public Date getActividadFinPrevisto() {
        return actividadFinPrevisto;
    }

    public void setActividadFinPrevisto(Date actividadFinPrevisto) {
        this.actividadFinPrevisto = actividadFinPrevisto;
    }

    public Date getActividadFinReal() {
        return actividadFinReal;
    }

    public void setActividadFinReal(Date actividadFinReal) {
        this.actividadFinReal = actividadFinReal;
    }

    public Date getActividadInicioReal() {
        return actividadInicioReal;
    }

    public void setActividadInicioReal(Date actividadInicioReal) {
        this.actividadInicioReal = actividadInicioReal;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }

    public Integer getCodigoActividad() {
        return codigoActividad;
    }

    public void setCodigoActividad(Integer codigoActividad) {
        this.codigoActividad = codigoActividad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEstadoActivacion() {
        return estadoActivacion;
    }

    public void setEstadoActivacion(Integer estadoActivacion) {
        this.estadoActivacion = estadoActivacion;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (actividad != null ? actividad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PgActividades)) {
            return false;
        }
        PgActividades other = (PgActividades) object;
        if ((this.actividad == null && other.actividad != null) || (this.actividad != null && !this.actividad.equals(other.actividad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return actividadNombre;
    }

    public Integer getIdentificadorAnoPap() {
        return identificadorAnoPap;
    }

    public void setIdentificadorAnoPap(Integer identificadorAnoPap) {
        this.identificadorAnoPap = identificadorAnoPap;
    }

    @Override
    public String generarInsertSQL() {
        return "INSERT INTO dbo.pg_actividades (meta, identificadorAnoPap, estructura_organizativa, pg__actividad, estado_plan, tipo_actividad, modificacion, actividad_nombre, actividad_descripcion, financiamiento_banco, financiamiento_goes, actividad_prioridad, actividad_antecesor, actividad_inicio_previsto, actividad_fin_previsto, actividad_fin_real, actividad_inicio_real, activo, codigo_actividad, nombre, estado_activacion, fechaDeInsercion, fechaDeModificacion, fechaDeEliminacion, estadoDeEliminacion, name) "
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    }

    @Override
    public Object[] getDatosInsert() {
        return new Object[]{pgMeta.getMeta(), identificadorAnoPap, estructuraOrganizativa, pgActividad, estadoPlan, tipoActividad, modificacion, actividadNombre, actividadDescripcion, financiamientoBanco, financiamientoGoes, actividadPrioridad, actividadAntecesor, actividadInicioPrevisto, actividadFinPrevisto, actividadFinReal, actividadInicioReal, activo, codigoActividad, nombre, estadoActivacion, fechaDeInsercion, fechaDeModificacion, fechaDeEliminacion, estadoDeEliminacion, name};
    }

    @Override
    public String generarUpdateSQL() {
        return "UPDATE dbo.pg_actividades SET meta=?, identificadorAnoPap=?, estructura_organizativa=?, pg__actividad=?, estado_plan=?, tipo_actividad=?, modificacion=?, actividad_nombre=?, actividad_descripcion=?, financiamiento_banco=?, financiamiento_goes=?, actividad_prioridad=?, actividad_antecesor=?, actividad_inicio_previsto=?, actividad_fin_previsto=?, actividad_fin_real=?, actividad_inicio_real=?, activo=?, codigo_actividad=?, nombre=?, estado_activacion=?, fechaDeInsercion=?, fechaDeModificacion=?, fechaDeEliminacion=?, estadoDeEliminacion=?, name=? "
                + " WHERE actividad = ?";
    }

    @Override
    public Object[] getDatosUpdate() {
        return new Object[]{meta, identificadorAnoPap, estructuraOrganizativa, pgActividad, estadoPlan, tipoActividad, modificacion, actividadNombre, actividadDescripcion, financiamientoBanco, financiamientoGoes, actividadPrioridad, actividadAntecesor, actividadInicioPrevisto, actividadFinPrevisto, actividadFinReal, actividadInicioReal, activo, codigoActividad, nombre, estadoActivacion, fechaDeInsercion, fechaDeModificacion, fechaDeEliminacion, estadoDeEliminacion, name, actividad};
    }

    public PgMetas getPgMeta() {
        return pgMeta;
    }

    public void setPgMeta(PgMetas pgMeta) {
        this.pgMeta = pgMeta;
        this.meta = pgMeta.getMeta();
    }

    /*public PgAnosPlanGlobal getPgAnhoPg() {
        return pgAnhoPg;
    }

    public void setPgAnhoPg(PgAnosPlanGlobal pgAnhoPg) {
        this.pgAnhoPg = pgAnhoPg;
        this.identificadorAnoPap = pgAnhoPg.getIdentificadorAnoPap();
    }

    public Integer getPgAnho() {
        return pgAnhoPg.getAno();
    }*/

    public PgAnosPlanGlobal getPgAnosPlanGlobal() {
        return pgAnosPlanGlobal;
    }

    public void setPgAnosPlanGlobal(PgAnosPlanGlobal pgAnosPlanGlobal) {
        this.pgAnosPlanGlobal = pgAnosPlanGlobal;
        this.identificadorAnoPap = pgAnosPlanGlobal.getIdentificadorAnoPap();
    }

    public String getAnhoPg() {
        if (pgAnosPlanGlobal != null) {
            return pgAnosPlanGlobal.getAno().toString();
        } else {
            return "0";
        }
    }

    public List<PoaRecursos> getLstPoaRecursos() {
        if(lstPoaRecursos == null){
            lstPoaRecursos = new ArrayList<PoaRecursos>();
        }
        return lstPoaRecursos;
    }

    public void setLstPoaRecursos(List<PoaRecursos> lstPoaRecursos) {
        this.lstPoaRecursos = lstPoaRecursos;
    }
}