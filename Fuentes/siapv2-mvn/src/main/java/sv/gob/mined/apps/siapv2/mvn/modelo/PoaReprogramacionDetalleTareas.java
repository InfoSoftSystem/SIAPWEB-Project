/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;

import java.util.Date;

/**
 *
 * @author Infosoft
 */

public class PoaReprogramacionDetalleTareas {
    
    private Integer detalleTareaProceso;
    private Integer procesoTarea;
    private Date fechaInicio;
    private Date fechaFin;
    private Integer finalizada;
    private String responsable;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private PoaReprogramaciones reprogramacion;

    public PoaReprogramacionDetalleTareas() {
    }

    public PoaReprogramacionDetalleTareas(Integer detalleTareaProceso) {
        this.detalleTareaProceso = detalleTareaProceso;
    }

    public Integer getDetalleTareaProceso() {
        return detalleTareaProceso;
    }

    public void setDetalleTareaProceso(Integer detalleTareaProceso) {
        this.detalleTareaProceso = detalleTareaProceso;
    }

    public Integer getProcesoTarea() {
        return procesoTarea;
    }

    public void setProcesoTarea(Integer procesoTarea) {
        this.procesoTarea = procesoTarea;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getFinalizada() {
        return finalizada;
    }

    public void setFinalizada(Integer finalizada) {
        this.finalizada = finalizada;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
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

    public PoaReprogramaciones getReprogramacion() {
        return reprogramacion;
    }

    public void setReprogramacion(PoaReprogramaciones reprogramacion) {
        this.reprogramacion = reprogramacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detalleTareaProceso != null ? detalleTareaProceso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PoaReprogramacionDetalleTareas)) {
            return false;
        }
        PoaReprogramacionDetalleTareas other = (PoaReprogramacionDetalleTareas) object;
        if ((this.detalleTareaProceso == null && other.detalleTareaProceso != null) || (this.detalleTareaProceso != null && !this.detalleTareaProceso.equals(other.detalleTareaProceso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.PoaReprogramacionDetalleTareas[ detalleTareaProceso=" + detalleTareaProceso + " ]";
    }
    
}
