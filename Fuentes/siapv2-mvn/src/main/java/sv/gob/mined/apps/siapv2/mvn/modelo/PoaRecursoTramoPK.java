/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;


/**
 *
 * @author Infosoft
 */

public class PoaRecursoTramoPK {
    private int recurso;
    private int tramo;

    public PoaRecursoTramoPK() {
    }

    public PoaRecursoTramoPK(int recurso, int tramo) {
        this.recurso = recurso;
        this.tramo = tramo;
    }

    public int getRecurso() {
        return recurso;
    }

    public void setRecurso(int recurso) {
        this.recurso = recurso;
    }

    public int getTramo() {
        return tramo;
    }

    public void setTramo(int tramo) {
        this.tramo = tramo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) recurso;
        hash += (int) tramo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PoaRecursoTramoPK)) {
            return false;
        }
        PoaRecursoTramoPK other = (PoaRecursoTramoPK) object;
        if (this.recurso != other.recurso) {
            return false;
        }
        if (this.tramo != other.tramo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.PoaRecursoTramoPK[ recurso=" + recurso + ", tramo=" + tramo + " ]";
    }
    
}
