/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
/**
 *
 * @author Infosoft
 */

public class EstructuraPresupuestaria {
    private Integer idEstructuraPresupuestaria;
    private String descripcionEstructura;
    private Integer afectacionPresupuestaria;
    private Integer nivelEstrucPresup;
    private BigDecimal techoPresupuestario;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private List<DetallePep> detallePepList;
    private PgEntidadesFinanciadoras organismo;
    private PgConvenio convenio;
    private GEstructuraOrganizativa estructuraOrganizativa;
    private List<EstructuraPresupuestaria> estructuraPresupuestariaList;
    private EstructuraPresupuestaria estIdEstructuraPresupuestaria;
    private EjerciciosPresupuestarios ejercicioPresupuestario;
    private EjerciciosPresupuestarios ejeEjercicioPresupuestario;

    public EstructuraPresupuestaria() {
    }

    public EstructuraPresupuestaria(Integer idEstructuraPresupuestaria) {
        this.idEstructuraPresupuestaria = idEstructuraPresupuestaria;
    }

    public Integer getIdEstructuraPresupuestaria() {
        return idEstructuraPresupuestaria;
    }

    public void setIdEstructuraPresupuestaria(Integer idEstructuraPresupuestaria) {
        this.idEstructuraPresupuestaria = idEstructuraPresupuestaria;
    }

    public String getDescripcionEstructura() {
        return descripcionEstructura;
    }

    public void setDescripcionEstructura(String descripcionEstructura) {
        this.descripcionEstructura = descripcionEstructura;
    }

    public Integer getAfectacionPresupuestaria() {
        return afectacionPresupuestaria;
    }

    public void setAfectacionPresupuestaria(Integer afectacionPresupuestaria) {
        this.afectacionPresupuestaria = afectacionPresupuestaria;
    }

    public Integer getNivelEstrucPresup() {
        return nivelEstrucPresup;
    }

    public void setNivelEstrucPresup(Integer nivelEstrucPresup) {
        this.nivelEstrucPresup = nivelEstrucPresup;
    }

    public BigDecimal getTechoPresupuestario() {
        return techoPresupuestario;
    }

    public void setTechoPresupuestario(BigDecimal techoPresupuestario) {
        this.techoPresupuestario = techoPresupuestario;
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

    public List<DetallePep> getDetallePepList() {
        return detallePepList;
    }

    public void setDetallePepList(List<DetallePep> detallePepList) {
        this.detallePepList = detallePepList;
    }

    public PgEntidadesFinanciadoras getOrganismo() {
        return organismo;
    }

    public void setOrganismo(PgEntidadesFinanciadoras organismo) {
        this.organismo = organismo;
    }

    public PgConvenio getConvenio() {
        return convenio;
    }

    public void setConvenio(PgConvenio convenio) {
        this.convenio = convenio;
    }

    public GEstructuraOrganizativa getEstructuraOrganizativa() {
        return estructuraOrganizativa;
    }

    public void setEstructuraOrganizativa(GEstructuraOrganizativa estructuraOrganizativa) {
        this.estructuraOrganizativa = estructuraOrganizativa;
    }

    public List<EstructuraPresupuestaria> getEstructuraPresupuestariaList() {
        return estructuraPresupuestariaList;
    }

    public void setEstructuraPresupuestariaList(List<EstructuraPresupuestaria> estructuraPresupuestariaList) {
        this.estructuraPresupuestariaList = estructuraPresupuestariaList;
    }

    public EstructuraPresupuestaria getEstIdEstructuraPresupuestaria() {
        return estIdEstructuraPresupuestaria;
    }

    public void setEstIdEstructuraPresupuestaria(EstructuraPresupuestaria estIdEstructuraPresupuestaria) {
        this.estIdEstructuraPresupuestaria = estIdEstructuraPresupuestaria;
    }

    public EjerciciosPresupuestarios getEjercicioPresupuestario() {
        return ejercicioPresupuestario;
    }

    public void setEjercicioPresupuestario(EjerciciosPresupuestarios ejercicioPresupuestario) {
        this.ejercicioPresupuestario = ejercicioPresupuestario;
    }

    public EjerciciosPresupuestarios getEjeEjercicioPresupuestario() {
        return ejeEjercicioPresupuestario;
    }

    public void setEjeEjercicioPresupuestario(EjerciciosPresupuestarios ejeEjercicioPresupuestario) {
        this.ejeEjercicioPresupuestario = ejeEjercicioPresupuestario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstructuraPresupuestaria != null ? idEstructuraPresupuestaria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstructuraPresupuestaria)) {
            return false;
        }
        EstructuraPresupuestaria other = (EstructuraPresupuestaria) object;
        if ((this.idEstructuraPresupuestaria == null && other.idEstructuraPresupuestaria != null) || (this.idEstructuraPresupuestaria != null && !this.idEstructuraPresupuestaria.equals(other.idEstructuraPresupuestaria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.EstructuraPresupuestaria[ idEstructuraPresupuestaria=" + idEstructuraPresupuestaria + " ]";
    }
    
}
