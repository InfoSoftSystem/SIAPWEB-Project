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

public class Pep  {
    private Integer identificadorPepp;
    private Date fechaGeneracionPep;
    private Date fechaSolicitudPres;
    private Date fechaAprobacionPres;
    private Date fechaElaboracPep;
    private Date fechaAprobaPep;
    private Date fechaInicioEjec;
    private Date fechaActualizacion;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private List<DetallePep> detallePepList;
    private EtapasPep etapaPep;
    private EstadoPep estadoPep;
    private EjerciciosPresupuestarios ejercicioPresupuestario;

    public Pep() {
    }

    public Pep(Integer identificadorPepp) {
        this.identificadorPepp = identificadorPepp;
    }

    public Integer getIdentificadorPepp() {
        return identificadorPepp;
    }

    public void setIdentificadorPepp(Integer identificadorPepp) {
        this.identificadorPepp = identificadorPepp;
    }

    public Date getFechaGeneracionPep() {
        return fechaGeneracionPep;
    }

    public void setFechaGeneracionPep(Date fechaGeneracionPep) {
        this.fechaGeneracionPep = fechaGeneracionPep;
    }

    public Date getFechaSolicitudPres() {
        return fechaSolicitudPres;
    }

    public void setFechaSolicitudPres(Date fechaSolicitudPres) {
        this.fechaSolicitudPres = fechaSolicitudPres;
    }

    public Date getFechaAprobacionPres() {
        return fechaAprobacionPres;
    }

    public void setFechaAprobacionPres(Date fechaAprobacionPres) {
        this.fechaAprobacionPres = fechaAprobacionPres;
    }

    public Date getFechaElaboracPep() {
        return fechaElaboracPep;
    }

    public void setFechaElaboracPep(Date fechaElaboracPep) {
        this.fechaElaboracPep = fechaElaboracPep;
    }

    public Date getFechaAprobaPep() {
        return fechaAprobaPep;
    }

    public void setFechaAprobaPep(Date fechaAprobaPep) {
        this.fechaAprobaPep = fechaAprobaPep;
    }

    public Date getFechaInicioEjec() {
        return fechaInicioEjec;
    }

    public void setFechaInicioEjec(Date fechaInicioEjec) {
        this.fechaInicioEjec = fechaInicioEjec;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
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

    public EtapasPep getEtapaPep() {
        return etapaPep;
    }

    public void setEtapaPep(EtapasPep etapaPep) {
        this.etapaPep = etapaPep;
    }

    public EstadoPep getEstadoPep() {
        return estadoPep;
    }

    public void setEstadoPep(EstadoPep estadoPep) {
        this.estadoPep = estadoPep;
    }

    public EjerciciosPresupuestarios getEjercicioPresupuestario() {
        return ejercicioPresupuestario;
    }

    public void setEjercicioPresupuestario(EjerciciosPresupuestarios ejercicioPresupuestario) {
        this.ejercicioPresupuestario = ejercicioPresupuestario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (identificadorPepp != null ? identificadorPepp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pep)) {
            return false;
        }
        Pep other = (Pep) object;
        if ((this.identificadorPepp == null && other.identificadorPepp != null) || (this.identificadorPepp != null && !this.identificadorPepp.equals(other.identificadorPepp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.Pep[ identificadorPepp=" + identificadorPepp + " ]";
    }
    
}
