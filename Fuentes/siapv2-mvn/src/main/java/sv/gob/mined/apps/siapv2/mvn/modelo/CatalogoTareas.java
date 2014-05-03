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

public class CatalogoTareas{
    
    private Integer identificadorDeLaTarea;
    private String descripcionDeLaTarea;
    private Integer secuencia;
    private Integer predecesor;
    private Integer tipoDeTarea;
    private Integer objetoDeLaAplicacion;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private SecurityUsers name;
    private Procesos identificacionDelProceso;
    private List<ProcedimientoTarea> procedimientoTareaList;

    public CatalogoTareas() {
    }

    public CatalogoTareas(Integer identificadorDeLaTarea) {
        this.identificadorDeLaTarea = identificadorDeLaTarea;
    }

    public Integer getIdentificadorDeLaTarea() {
        return identificadorDeLaTarea;
    }

    public void setIdentificadorDeLaTarea(Integer identificadorDeLaTarea) {
        this.identificadorDeLaTarea = identificadorDeLaTarea;
    }

    public String getDescripcionDeLaTarea() {
        return descripcionDeLaTarea;
    }

    public void setDescripcionDeLaTarea(String descripcionDeLaTarea) {
        this.descripcionDeLaTarea = descripcionDeLaTarea;
    }

    public Integer getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(Integer secuencia) {
        this.secuencia = secuencia;
    }

    public Integer getPredecesor() {
        return predecesor;
    }

    public void setPredecesor(Integer predecesor) {
        this.predecesor = predecesor;
    }

    public Integer getTipoDeTarea() {
        return tipoDeTarea;
    }

    public void setTipoDeTarea(Integer tipoDeTarea) {
        this.tipoDeTarea = tipoDeTarea;
    }

    public Integer getObjetoDeLaAplicacion() {
        return objetoDeLaAplicacion;
    }

    public void setObjetoDeLaAplicacion(Integer objetoDeLaAplicacion) {
        this.objetoDeLaAplicacion = objetoDeLaAplicacion;
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

    public SecurityUsers getName() {
        return name;
    }

    public void setName(SecurityUsers name) {
        this.name = name;
    }

    public Procesos getIdentificacionDelProceso() {
        return identificacionDelProceso;
    }

    public void setIdentificacionDelProceso(Procesos identificacionDelProceso) {
        this.identificacionDelProceso = identificacionDelProceso;
    }

    public List<ProcedimientoTarea> getProcedimientoTareaList() {
        return procedimientoTareaList;
    }

    public void setProcedimientoTareaList(List<ProcedimientoTarea> procedimientoTareaList) {
        this.procedimientoTareaList = procedimientoTareaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (identificadorDeLaTarea != null ? identificadorDeLaTarea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatalogoTareas)) {
            return false;
        }
        CatalogoTareas other = (CatalogoTareas) object;
        if ((this.identificadorDeLaTarea == null && other.identificadorDeLaTarea != null) || (this.identificadorDeLaTarea != null && !this.identificadorDeLaTarea.equals(other.identificadorDeLaTarea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.CatalogoTareas[ identificadorDeLaTarea=" + identificadorDeLaTarea + " ]";
    }
    
}
