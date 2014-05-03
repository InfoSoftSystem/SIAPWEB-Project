/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Infosoft
 */

public class VersionesActividadPG {
    
    private Integer idVesionActiviPG;
    private Integer meta;
    private Integer tipoActividad;
    private Integer modificacion;
    private int actividad;
    private String estructuraOrganizativa;
    private Integer estadoPlan;
    private Integer idEstructuraPresupuestaria;
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
    private VersionesDeLaAsignacion identificadorDeLaVersion;

    public VersionesActividadPG() {
    }

    public VersionesActividadPG(Integer idVesionActiviPG) {
        this.idVesionActiviPG = idVesionActiviPG;
    }

    public VersionesActividadPG(Integer idVesionActiviPG, int actividad) {
        this.idVesionActiviPG = idVesionActiviPG;
        this.actividad = actividad;
    }

    public Integer getIdVesionActiviPG() {
        return idVesionActiviPG;
    }

    public void setIdVesionActiviPG(Integer idVesionActiviPG) {
        this.idVesionActiviPG = idVesionActiviPG;
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

    public int getActividad() {
        return actividad;
    }

    public void setActividad(int actividad) {
        this.actividad = actividad;
    }

    public String getEstructuraOrganizativa() {
        return estructuraOrganizativa;
    }

    public void setEstructuraOrganizativa(String estructuraOrganizativa) {
        this.estructuraOrganizativa = estructuraOrganizativa;
    }

    public Integer getEstadoPlan() {
        return estadoPlan;
    }

    public void setEstadoPlan(Integer estadoPlan) {
        this.estadoPlan = estadoPlan;
    }

    public Integer getIdEstructuraPresupuestaria() {
        return idEstructuraPresupuestaria;
    }

    public void setIdEstructuraPresupuestaria(Integer idEstructuraPresupuestaria) {
        this.idEstructuraPresupuestaria = idEstructuraPresupuestaria;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VersionesDeLaAsignacion getIdentificadorDeLaVersion() {
        return identificadorDeLaVersion;
    }

    public void setIdentificadorDeLaVersion(VersionesDeLaAsignacion identificadorDeLaVersion) {
        this.identificadorDeLaVersion = identificadorDeLaVersion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVesionActiviPG != null ? idVesionActiviPG.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VersionesActividadPG)) {
            return false;
        }
        VersionesActividadPG other = (VersionesActividadPG) object;
        if ((this.idVesionActiviPG == null && other.idVesionActiviPG != null) || (this.idVesionActiviPG != null && !this.idVesionActiviPG.equals(other.idVesionActiviPG))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.VersionesActividadPG[ idVesionActiviPG=" + idVesionActiviPG + " ]";
    }
    
}
