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

public class PgEntidadesFinanciadoras {
    private Integer organismo;
    private String descripcion;
    private String nombreCorto;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private List<DetallePep> detallePepList;
    private List<PlantillaDeComportamientos> plantillaDeComportamientosList;
    private List<FuentesFinanciamientos> fuentesFinanciamientosList;
    private List<PoaRecursosSaldos> poaRecursosSaldosList;
    private List<EstructuraPresupuestaria> estructuraPresupuestariaList;
    private List<PgContactosEntidades> pgContactosEntidadesList;

    public PgEntidadesFinanciadoras() {
    }

    public PgEntidadesFinanciadoras(Integer organismo) {
        this.organismo = organismo;
    }

    public Integer getOrganismo() {
        return organismo;
    }

    public void setOrganismo(Integer organismo) {
        this.organismo = organismo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreCorto() {
        return nombreCorto;
    }

    public void setNombreCorto(String nombreCorto) {
        this.nombreCorto = nombreCorto;
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

    public List<PlantillaDeComportamientos> getPlantillaDeComportamientosList() {
        return plantillaDeComportamientosList;
    }

    public void setPlantillaDeComportamientosList(List<PlantillaDeComportamientos> plantillaDeComportamientosList) {
        this.plantillaDeComportamientosList = plantillaDeComportamientosList;
    }

    public List<FuentesFinanciamientos> getFuentesFinanciamientosList() {
        return fuentesFinanciamientosList;
    }

    public void setFuentesFinanciamientosList(List<FuentesFinanciamientos> fuentesFinanciamientosList) {
        this.fuentesFinanciamientosList = fuentesFinanciamientosList;
    }

    public List<PoaRecursosSaldos> getPoaRecursosSaldosList() {
        return poaRecursosSaldosList;
    }

    public void setPoaRecursosSaldosList(List<PoaRecursosSaldos> poaRecursosSaldosList) {
        this.poaRecursosSaldosList = poaRecursosSaldosList;
    }

    public List<EstructuraPresupuestaria> getEstructuraPresupuestariaList() {
        return estructuraPresupuestariaList;
    }

    public void setEstructuraPresupuestariaList(List<EstructuraPresupuestaria> estructuraPresupuestariaList) {
        this.estructuraPresupuestariaList = estructuraPresupuestariaList;
    }

    public List<PgContactosEntidades> getPgContactosEntidadesList() {
        return pgContactosEntidadesList;
    }

    public void setPgContactosEntidadesList(List<PgContactosEntidades> pgContactosEntidadesList) {
        this.pgContactosEntidadesList = pgContactosEntidadesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (organismo != null ? organismo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PgEntidadesFinanciadoras)) {
            return false;
        }
        PgEntidadesFinanciadoras other = (PgEntidadesFinanciadoras) object;
        if ((this.organismo == null && other.organismo != null) || (this.organismo != null && !this.organismo.equals(other.organismo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.PgEntidadesFinanciadoras[ organismo=" + organismo + " ]";
    }
    
}
