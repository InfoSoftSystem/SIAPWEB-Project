/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;

/**
 *
 * @author Infosoft
 */

public class DetalleGrupos{
    
    private Integer detalleGrupo;
    private PoaRecursos recurso;
    private Grupos grupo;

    public DetalleGrupos() {
    }

    public DetalleGrupos(Integer detalleGrupo) {
        this.detalleGrupo = detalleGrupo;
    }

    public Integer getDetalleGrupo() {
        return detalleGrupo;
    }

    public void setDetalleGrupo(Integer detalleGrupo) {
        this.detalleGrupo = detalleGrupo;
    }

    public PoaRecursos getRecurso() {
        return recurso;
    }

    public void setRecurso(PoaRecursos recurso) {
        this.recurso = recurso;
    }

    public Grupos getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupos grupo) {
        this.grupo = grupo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detalleGrupo != null ? detalleGrupo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleGrupos)) {
            return false;
        }
        DetalleGrupos other = (DetalleGrupos) object;
        if ((this.detalleGrupo == null && other.detalleGrupo != null) || (this.detalleGrupo != null && !this.detalleGrupo.equals(other.detalleGrupo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.DetalleGrupos[ detalleGrupo=" + detalleGrupo + " ]";
    }
    
}
