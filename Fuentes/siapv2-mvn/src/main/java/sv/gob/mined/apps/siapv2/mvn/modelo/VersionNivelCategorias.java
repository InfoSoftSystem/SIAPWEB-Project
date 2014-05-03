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

public class VersionNivelCategorias {
    
    private Integer idVersionCategorias;
    private Integer convenio;
    private Integer categoria;
    private String descripcion;
    private Integer modificacion;
    private Integer estados;
    private Date fechaActualizacion;
    private Integer activo;
    private Integer iva;
    private BigDecimal porcFinanFtePpal;
    private BigDecimal porcFinanFteSec;
    private BigDecimal montosProgrPAPFtePpal;
    private BigDecimal montoProgPAPFteSec;
    private BigDecimal montoModifFuentePpal;
    private BigDecimal montoModifFuenteSec;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private VersionesDeLaAsignacion identificadorDeLaVersion;
    private PgCategorias idCategoria;

    public VersionNivelCategorias() {
    }

    public VersionNivelCategorias(Integer idVersionCategorias) {
        this.idVersionCategorias = idVersionCategorias;
    }

    public Integer getIdVersionCategorias() {
        return idVersionCategorias;
    }

    public void setIdVersionCategorias(Integer idVersionCategorias) {
        this.idVersionCategorias = idVersionCategorias;
    }

    public Integer getConvenio() {
        return convenio;
    }

    public void setConvenio(Integer convenio) {
        this.convenio = convenio;
    }

    public Integer getCategoria() {
        return categoria;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getModificacion() {
        return modificacion;
    }

    public void setModificacion(Integer modificacion) {
        this.modificacion = modificacion;
    }

    public Integer getEstados() {
        return estados;
    }

    public void setEstados(Integer estados) {
        this.estados = estados;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }

    public Integer getIva() {
        return iva;
    }

    public void setIva(Integer iva) {
        this.iva = iva;
    }

    public BigDecimal getPorcFinanFtePpal() {
        return porcFinanFtePpal;
    }

    public void setPorcFinanFtePpal(BigDecimal porcFinanFtePpal) {
        this.porcFinanFtePpal = porcFinanFtePpal;
    }

    public BigDecimal getPorcFinanFteSec() {
        return porcFinanFteSec;
    }

    public void setPorcFinanFteSec(BigDecimal porcFinanFteSec) {
        this.porcFinanFteSec = porcFinanFteSec;
    }

    public BigDecimal getMontosProgrPAPFtePpal() {
        return montosProgrPAPFtePpal;
    }

    public void setMontosProgrPAPFtePpal(BigDecimal montosProgrPAPFtePpal) {
        this.montosProgrPAPFtePpal = montosProgrPAPFtePpal;
    }

    public BigDecimal getMontoProgPAPFteSec() {
        return montoProgPAPFteSec;
    }

    public void setMontoProgPAPFteSec(BigDecimal montoProgPAPFteSec) {
        this.montoProgPAPFteSec = montoProgPAPFteSec;
    }

    public BigDecimal getMontoModifFuentePpal() {
        return montoModifFuentePpal;
    }

    public void setMontoModifFuentePpal(BigDecimal montoModifFuentePpal) {
        this.montoModifFuentePpal = montoModifFuentePpal;
    }

    public BigDecimal getMontoModifFuenteSec() {
        return montoModifFuenteSec;
    }

    public void setMontoModifFuenteSec(BigDecimal montoModifFuenteSec) {
        this.montoModifFuenteSec = montoModifFuenteSec;
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

    public PgCategorias getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(PgCategorias idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVersionCategorias != null ? idVersionCategorias.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VersionNivelCategorias)) {
            return false;
        }
        VersionNivelCategorias other = (VersionNivelCategorias) object;
        if ((this.idVersionCategorias == null && other.idVersionCategorias != null) || (this.idVersionCategorias != null && !this.idVersionCategorias.equals(other.idVersionCategorias))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.VersionNivelCategorias[ idVersionCategorias=" + idVersionCategorias + " ]";
    }
    
}
