/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;


import java.util.Date;
import java.util.List;

/**
 *
 * @author Infosoft
 */

public class VersionesDeLaAsignacion{
    
    private Integer identificadorDeLaVersion;
    private String descripcionDeLaVersion;
    private Date fechaGeneracion;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private List<VersionNivelCategorias> versionNivelCategoriasList;
    private List<VersionesComponentes> versionesComponentesList;
    private List<VersionNivelTramosCateg> versionNivelTramosCategList;
    private List<VersionesActividadPG> versionesActividadPGList;
    private List<VersionesMetasPG> versionesMetasPGList;
    private PgConvenio convenio;

    public VersionesDeLaAsignacion() {
    }

    public VersionesDeLaAsignacion(Integer identificadorDeLaVersion) {
        this.identificadorDeLaVersion = identificadorDeLaVersion;
    }

    public Integer getIdentificadorDeLaVersion() {
        return identificadorDeLaVersion;
    }

    public void setIdentificadorDeLaVersion(Integer identificadorDeLaVersion) {
        this.identificadorDeLaVersion = identificadorDeLaVersion;
    }

    public String getDescripcionDeLaVersion() {
        return descripcionDeLaVersion;
    }

    public void setDescripcionDeLaVersion(String descripcionDeLaVersion) {
        this.descripcionDeLaVersion = descripcionDeLaVersion;
    }

    public Date getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(Date fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
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

    public List<VersionNivelCategorias> getVersionNivelCategoriasList() {
        return versionNivelCategoriasList;
    }

    public void setVersionNivelCategoriasList(List<VersionNivelCategorias> versionNivelCategoriasList) {
        this.versionNivelCategoriasList = versionNivelCategoriasList;
    }

    public List<VersionesComponentes> getVersionesComponentesList() {
        return versionesComponentesList;
    }

    public void setVersionesComponentesList(List<VersionesComponentes> versionesComponentesList) {
        this.versionesComponentesList = versionesComponentesList;
    }

    public List<VersionNivelTramosCateg> getVersionNivelTramosCategList() {
        return versionNivelTramosCategList;
    }

    public void setVersionNivelTramosCategList(List<VersionNivelTramosCateg> versionNivelTramosCategList) {
        this.versionNivelTramosCategList = versionNivelTramosCategList;
    }

    public List<VersionesActividadPG> getVersionesActividadPGList() {
        return versionesActividadPGList;
    }

    public void setVersionesActividadPGList(List<VersionesActividadPG> versionesActividadPGList) {
        this.versionesActividadPGList = versionesActividadPGList;
    }

    public List<VersionesMetasPG> getVersionesMetasPGList() {
        return versionesMetasPGList;
    }

    public void setVersionesMetasPGList(List<VersionesMetasPG> versionesMetasPGList) {
        this.versionesMetasPGList = versionesMetasPGList;
    }

    public PgConvenio getConvenio() {
        return convenio;
    }

    public void setConvenio(PgConvenio convenio) {
        this.convenio = convenio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (identificadorDeLaVersion != null ? identificadorDeLaVersion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VersionesDeLaAsignacion)) {
            return false;
        }
        VersionesDeLaAsignacion other = (VersionesDeLaAsignacion) object;
        if ((this.identificadorDeLaVersion == null && other.identificadorDeLaVersion != null) || (this.identificadorDeLaVersion != null && !this.identificadorDeLaVersion.equals(other.identificadorDeLaVersion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.VersionesDeLaAsignacion[ identificadorDeLaVersion=" + identificadorDeLaVersion + " ]";
    }
    
}
