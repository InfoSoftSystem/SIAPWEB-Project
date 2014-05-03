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

public class PgEstadoPlanAccion  {
    private Integer estadoPlan;
    private String estadoDescripcion;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private List<PoaAnosPlanAccion> poaAnosPlanAccionList;

    public PgEstadoPlanAccion() {
    }

    public PgEstadoPlanAccion(Integer estadoPlan) {
        this.estadoPlan = estadoPlan;
    }

    public Integer getEstadoPlan() {
        return estadoPlan;
    }

    public void setEstadoPlan(Integer estadoPlan) {
        this.estadoPlan = estadoPlan;
    }

    public String getEstadoDescripcion() {
        return estadoDescripcion;
    }

    public void setEstadoDescripcion(String estadoDescripcion) {
        this.estadoDescripcion = estadoDescripcion;
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

    public List<PoaAnosPlanAccion> getPoaAnosPlanAccionList() {
        return poaAnosPlanAccionList;
    }

    public void setPoaAnosPlanAccionList(List<PoaAnosPlanAccion> poaAnosPlanAccionList) {
        this.poaAnosPlanAccionList = poaAnosPlanAccionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (estadoPlan != null ? estadoPlan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PgEstadoPlanAccion)) {
            return false;
        }
        PgEstadoPlanAccion other = (PgEstadoPlanAccion) object;
        if ((this.estadoPlan == null && other.estadoPlan != null) || (this.estadoPlan != null && !this.estadoPlan.equals(other.estadoPlan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.PgEstadoPlanAccion[ estadoPlan=" + estadoPlan + " ]";
    }
    
}
