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

public class EjerciciosPresupuestarios {
    private Integer ejercicioPresupuestario;
    private Date fechaApertura;
    private Date fechaCierre;
    private Integer actual;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private List<DetallePep> detallePepList;
    private List<EstructuraPresupuestaria> estructuraPresupuestariaList;
    private List<EstructuraPresupuestaria> estructuraPresupuestariaList1;
    private List<Pep> pepList;

    public EjerciciosPresupuestarios() {
    }

    public EjerciciosPresupuestarios(Integer ejercicioPresupuestario) {
        this.ejercicioPresupuestario = ejercicioPresupuestario;
    }

    public Integer getEjercicioPresupuestario() {
        return ejercicioPresupuestario;
    }

    public void setEjercicioPresupuestario(Integer ejercicioPresupuestario) {
        this.ejercicioPresupuestario = ejercicioPresupuestario;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public Date getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public Integer getActual() {
        return actual;
    }

    public void setActual(Integer actual) {
        this.actual = actual;
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

    public List<EstructuraPresupuestaria> getEstructuraPresupuestariaList() {
        return estructuraPresupuestariaList;
    }

    public void setEstructuraPresupuestariaList(List<EstructuraPresupuestaria> estructuraPresupuestariaList) {
        this.estructuraPresupuestariaList = estructuraPresupuestariaList;
    }

    public List<EstructuraPresupuestaria> getEstructuraPresupuestariaList1() {
        return estructuraPresupuestariaList1;
    }

    public void setEstructuraPresupuestariaList1(List<EstructuraPresupuestaria> estructuraPresupuestariaList1) {
        this.estructuraPresupuestariaList1 = estructuraPresupuestariaList1;
    }

    public List<Pep> getPepList() {
        return pepList;
    }

    public void setPepList(List<Pep> pepList) {
        this.pepList = pepList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ejercicioPresupuestario != null ? ejercicioPresupuestario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EjerciciosPresupuestarios)) {
            return false;
        }
        EjerciciosPresupuestarios other = (EjerciciosPresupuestarios) object;
        if ((this.ejercicioPresupuestario == null && other.ejercicioPresupuestario != null) || (this.ejercicioPresupuestario != null && !this.ejercicioPresupuestario.equals(other.ejercicioPresupuestario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.EjerciciosPresupuestarios[ ejercicioPresupuestario=" + ejercicioPresupuestario + " ]";
    }
    
}
