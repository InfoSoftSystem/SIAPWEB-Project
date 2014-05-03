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

public class VersionesMetasPG {
    
    private Integer idMetaPlanG;
    private int idVersionPlanGlobal;
    private int meta;
    private Integer estados;
    private String estructuraOrganizativa;
    private Integer componente;
    private Integer modificacion;
    private String metaNombre;
    private String descripcion;
    private Date fechaActualizacion;
    private BigDecimal montoGoes;
    private BigDecimal montoBanco;
    private Integer activo;
    private Integer codigoMeta;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private VersionesDeLaAsignacion identificadorDeLaVersion;

    public VersionesMetasPG() {
    }

    public VersionesMetasPG(Integer idMetaPlanG) {
        this.idMetaPlanG = idMetaPlanG;
    }

    public VersionesMetasPG(Integer idMetaPlanG, int idVersionPlanGlobal, int meta) {
        this.idMetaPlanG = idMetaPlanG;
        this.idVersionPlanGlobal = idVersionPlanGlobal;
        this.meta = meta;
    }

    public Integer getIdMetaPlanG() {
        return idMetaPlanG;
    }

    public void setIdMetaPlanG(Integer idMetaPlanG) {
        this.idMetaPlanG = idMetaPlanG;
    }

    public int getIdVersionPlanGlobal() {
        return idVersionPlanGlobal;
    }

    public void setIdVersionPlanGlobal(int idVersionPlanGlobal) {
        this.idVersionPlanGlobal = idVersionPlanGlobal;
    }

    public int getMeta() {
        return meta;
    }

    public void setMeta(int meta) {
        this.meta = meta;
    }

    public Integer getEstados() {
        return estados;
    }

    public void setEstados(Integer estados) {
        this.estados = estados;
    }

    public String getEstructuraOrganizativa() {
        return estructuraOrganizativa;
    }

    public void setEstructuraOrganizativa(String estructuraOrganizativa) {
        this.estructuraOrganizativa = estructuraOrganizativa;
    }

    public Integer getComponente() {
        return componente;
    }

    public void setComponente(Integer componente) {
        this.componente = componente;
    }

    public Integer getModificacion() {
        return modificacion;
    }

    public void setModificacion(Integer modificacion) {
        this.modificacion = modificacion;
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

    public Integer getCodigoMeta() {
        return codigoMeta;
    }

    public void setCodigoMeta(Integer codigoMeta) {
        this.codigoMeta = codigoMeta;
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
        hash += (idMetaPlanG != null ? idMetaPlanG.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VersionesMetasPG)) {
            return false;
        }
        VersionesMetasPG other = (VersionesMetasPG) object;
        if ((this.idMetaPlanG == null && other.idMetaPlanG != null) || (this.idMetaPlanG != null && !this.idMetaPlanG.equals(other.idMetaPlanG))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.VersionesMetasPG[ idMetaPlanG=" + idMetaPlanG + " ]";
    }
    
}
