/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;

/**
 *
 * @author Infosoft
 */

public class PgAgentesTramos {
    private Long agenteTramo;
    private Long porcentajeBanco;
    private Long porcentajeGoes;
    private short iva;

    public PgAgentesTramos() {
    }

    public PgAgentesTramos(Long agenteTramo) {
        this.agenteTramo = agenteTramo;
    }

    public PgAgentesTramos(Long agenteTramo, short iva) {
        this.agenteTramo = agenteTramo;
        this.iva = iva;
    }

    public Long getAgenteTramo() {
        return agenteTramo;
    }

    public void setAgenteTramo(Long agenteTramo) {
        this.agenteTramo = agenteTramo;
    }

    public Long getPorcentajeBanco() {
        return porcentajeBanco;
    }

    public void setPorcentajeBanco(Long porcentajeBanco) {
        this.porcentajeBanco = porcentajeBanco;
    }

    public Long getPorcentajeGoes() {
        return porcentajeGoes;
    }

    public void setPorcentajeGoes(Long porcentajeGoes) {
        this.porcentajeGoes = porcentajeGoes;
    }

    public short getIva() {
        return iva;
    }

    public void setIva(short iva) {
        this.iva = iva;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agenteTramo != null ? agenteTramo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PgAgentesTramos)) {
            return false;
        }
        PgAgentesTramos other = (PgAgentesTramos) object;
        if ((this.agenteTramo == null && other.agenteTramo != null) || (this.agenteTramo != null && !this.agenteTramo.equals(other.agenteTramo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.PgAgentesTramos[ agenteTramo=" + agenteTramo + " ]";
    }
    
}
