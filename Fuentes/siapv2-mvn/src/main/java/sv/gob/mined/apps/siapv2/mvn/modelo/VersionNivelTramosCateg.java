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

public class VersionNivelTramosCateg {
    
    private Integer idVersionTramos;
    private Integer tramo;
    private Integer modificacion;
    private Integer idCategoria;
    private Integer codTramo;
    private BigDecimal inicio;
    private BigDecimal fin;
    private Date fechaActualizacion;
    private BigDecimal asignadoBanco;
    private BigDecimal porcentajeBanco;
    private BigDecimal disponibleBanco;
    private BigDecimal asignadoGoes;
    private BigDecimal porcentajeGoes;
    private BigDecimal disponibleGoes;
    private BigDecimal disponibleFormulacionBanco;
    private BigDecimal disponibleFormulacionGoes;
    private Integer activo;
    private BigDecimal porcentajeInternacional;
    private BigDecimal porcentajeLocal;
    private BigDecimal disponibleEjecBanco;
    private BigDecimal disponibleEjecGoes;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private VersionesDeLaAsignacion identificadorDeLaVersion;

    public VersionNivelTramosCateg() {
    }

    public VersionNivelTramosCateg(Integer idVersionTramos) {
        this.idVersionTramos = idVersionTramos;
    }

    public Integer getIdVersionTramos() {
        return idVersionTramos;
    }

    public void setIdVersionTramos(Integer idVersionTramos) {
        this.idVersionTramos = idVersionTramos;
    }

    public Integer getTramo() {
        return tramo;
    }

    public void setTramo(Integer tramo) {
        this.tramo = tramo;
    }

    public Integer getModificacion() {
        return modificacion;
    }

    public void setModificacion(Integer modificacion) {
        this.modificacion = modificacion;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Integer getCodTramo() {
        return codTramo;
    }

    public void setCodTramo(Integer codTramo) {
        this.codTramo = codTramo;
    }

    public BigDecimal getInicio() {
        return inicio;
    }

    public void setInicio(BigDecimal inicio) {
        this.inicio = inicio;
    }

    public BigDecimal getFin() {
        return fin;
    }

    public void setFin(BigDecimal fin) {
        this.fin = fin;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public BigDecimal getAsignadoBanco() {
        return asignadoBanco;
    }

    public void setAsignadoBanco(BigDecimal asignadoBanco) {
        this.asignadoBanco = asignadoBanco;
    }

    public BigDecimal getPorcentajeBanco() {
        return porcentajeBanco;
    }

    public void setPorcentajeBanco(BigDecimal porcentajeBanco) {
        this.porcentajeBanco = porcentajeBanco;
    }

    public BigDecimal getDisponibleBanco() {
        return disponibleBanco;
    }

    public void setDisponibleBanco(BigDecimal disponibleBanco) {
        this.disponibleBanco = disponibleBanco;
    }

    public BigDecimal getAsignadoGoes() {
        return asignadoGoes;
    }

    public void setAsignadoGoes(BigDecimal asignadoGoes) {
        this.asignadoGoes = asignadoGoes;
    }

    public BigDecimal getPorcentajeGoes() {
        return porcentajeGoes;
    }

    public void setPorcentajeGoes(BigDecimal porcentajeGoes) {
        this.porcentajeGoes = porcentajeGoes;
    }

    public BigDecimal getDisponibleGoes() {
        return disponibleGoes;
    }

    public void setDisponibleGoes(BigDecimal disponibleGoes) {
        this.disponibleGoes = disponibleGoes;
    }

    public BigDecimal getDisponibleFormulacionBanco() {
        return disponibleFormulacionBanco;
    }

    public void setDisponibleFormulacionBanco(BigDecimal disponibleFormulacionBanco) {
        this.disponibleFormulacionBanco = disponibleFormulacionBanco;
    }

    public BigDecimal getDisponibleFormulacionGoes() {
        return disponibleFormulacionGoes;
    }

    public void setDisponibleFormulacionGoes(BigDecimal disponibleFormulacionGoes) {
        this.disponibleFormulacionGoes = disponibleFormulacionGoes;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }

    public BigDecimal getPorcentajeInternacional() {
        return porcentajeInternacional;
    }

    public void setPorcentajeInternacional(BigDecimal porcentajeInternacional) {
        this.porcentajeInternacional = porcentajeInternacional;
    }

    public BigDecimal getPorcentajeLocal() {
        return porcentajeLocal;
    }

    public void setPorcentajeLocal(BigDecimal porcentajeLocal) {
        this.porcentajeLocal = porcentajeLocal;
    }

    public BigDecimal getDisponibleEjecBanco() {
        return disponibleEjecBanco;
    }

    public void setDisponibleEjecBanco(BigDecimal disponibleEjecBanco) {
        this.disponibleEjecBanco = disponibleEjecBanco;
    }

    public BigDecimal getDisponibleEjecGoes() {
        return disponibleEjecGoes;
    }

    public void setDisponibleEjecGoes(BigDecimal disponibleEjecGoes) {
        this.disponibleEjecGoes = disponibleEjecGoes;
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
        hash += (idVersionTramos != null ? idVersionTramos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VersionNivelTramosCateg)) {
            return false;
        }
        VersionNivelTramosCateg other = (VersionNivelTramosCateg) object;
        if ((this.idVersionTramos == null && other.idVersionTramos != null) || (this.idVersionTramos != null && !this.idVersionTramos.equals(other.idVersionTramos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.VersionNivelTramosCateg[ idVersionTramos=" + idVersionTramos + " ]";
    }
    
}
