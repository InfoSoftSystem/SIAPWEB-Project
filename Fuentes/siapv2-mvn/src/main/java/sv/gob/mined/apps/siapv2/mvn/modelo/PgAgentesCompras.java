/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;

/**
 *
 * @author Infosoft
 */

public class PgAgentesCompras  {
    private Integer idAgenteCompra;
    private Integer idProveedor;
    private Integer convenio;
    private String name;

    public PgAgentesCompras() {
    }

    public PgAgentesCompras(Integer idAgenteCompra) {
        this.idAgenteCompra = idAgenteCompra;
    }

    public Integer getIdAgenteCompra() {
        return idAgenteCompra;
    }

    public void setIdAgenteCompra(Integer idAgenteCompra) {
        this.idAgenteCompra = idAgenteCompra;
    }

    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Integer getConvenio() {
        return convenio;
    }

    public void setConvenio(Integer convenio) {
        this.convenio = convenio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAgenteCompra != null ? idAgenteCompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PgAgentesCompras)) {
            return false;
        }
        PgAgentesCompras other = (PgAgentesCompras) object;
        if ((this.idAgenteCompra == null && other.idAgenteCompra != null) || (this.idAgenteCompra != null && !this.idAgenteCompra.equals(other.idAgenteCompra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.PgAgentesCompras[ idAgenteCompra=" + idAgenteCompra + " ]";
    }
    
}
