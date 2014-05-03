/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;

import java.util.List;

/**
 *
 * @author Infosoft
 */
public class ClasificadoresPresupuestarios{
    
    private String clasificadorPresupuestario;
    private String descripcion;
    private Integer nivel;
    private Integer periodo;
    private List<DetallePep> detallePepList;

    public ClasificadoresPresupuestarios() {
    }

    public ClasificadoresPresupuestarios(String clasificadorPresupuestario) {
        this.clasificadorPresupuestario = clasificadorPresupuestario;
    }

    public String getClasificadorPresupuestario() {
        return clasificadorPresupuestario;
    }

    public void setClasificadorPresupuestario(String clasificadorPresupuestario) {
        this.clasificadorPresupuestario = clasificadorPresupuestario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Integer getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }

    public List<DetallePep> getDetallePepList() {
        return detallePepList;
    }

    public void setDetallePepList(List<DetallePep> detallePepList) {
        this.detallePepList = detallePepList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clasificadorPresupuestario != null ? clasificadorPresupuestario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClasificadoresPresupuestarios)) {
            return false;
        }
        ClasificadoresPresupuestarios other = (ClasificadoresPresupuestarios) object;
        if ((this.clasificadorPresupuestario == null && other.clasificadorPresupuestario != null) || (this.clasificadorPresupuestario != null && !this.clasificadorPresupuestario.equals(other.clasificadorPresupuestario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.ClasificadoresPresupuestarios[ clasificadorPresupuestario=" + clasificadorPresupuestario + " ]";
    }
    
}
