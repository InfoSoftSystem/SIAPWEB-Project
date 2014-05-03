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

public class Grupos  {
    private Integer grupo;
    private List<DetalleGrupos> detalleGruposList;

    public Grupos() {
    }

    public Grupos(Integer grupo) {
        this.grupo = grupo;
    }

    public Integer getGrupo() {
        return grupo;
    }

    public void setGrupo(Integer grupo) {
        this.grupo = grupo;
    }

    public List<DetalleGrupos> getDetalleGruposList() {
        return detalleGruposList;
    }

    public void setDetalleGruposList(List<DetalleGrupos> detalleGruposList) {
        this.detalleGruposList = detalleGruposList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (grupo != null ? grupo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Grupos)) {
            return false;
        }
        Grupos other = (Grupos) object;
        if ((this.grupo == null && other.grupo != null) || (this.grupo != null && !this.grupo.equals(other.grupo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.Grupos[ grupo=" + grupo + " ]";
    }
    
}
