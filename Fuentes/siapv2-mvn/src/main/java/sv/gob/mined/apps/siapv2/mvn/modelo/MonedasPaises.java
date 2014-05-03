/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Infosoft
 */

public class MonedasPaises  {
    private Integer moneda;
    private String descripcion;
    private BigDecimal tipoDeCambio;
    private Integer decimales;
    private String simboloDeLaMoneda;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private List<PgConvenio> pgConvenioList;

    public MonedasPaises() {
    }

    public MonedasPaises(Integer moneda) {
        this.moneda = moneda;
    }

    public Integer getMoneda() {
        return moneda;
    }

    public void setMoneda(Integer moneda) {
        this.moneda = moneda;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getTipoDeCambio() {
        return tipoDeCambio;
    }

    public void setTipoDeCambio(BigDecimal tipoDeCambio) {
        this.tipoDeCambio = tipoDeCambio;
    }

    public Integer getDecimales() {
        return decimales;
    }

    public void setDecimales(Integer decimales) {
        this.decimales = decimales;
    }

    public String getSimboloDeLaMoneda() {
        return simboloDeLaMoneda;
    }

    public void setSimboloDeLaMoneda(String simboloDeLaMoneda) {
        this.simboloDeLaMoneda = simboloDeLaMoneda;
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

    public List<PgConvenio> getPgConvenioList() {
        return pgConvenioList;
    }

    public void setPgConvenioList(List<PgConvenio> pgConvenioList) {
        this.pgConvenioList = pgConvenioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (moneda != null ? moneda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MonedasPaises)) {
            return false;
        }
        MonedasPaises other = (MonedasPaises) object;
        if ((this.moneda == null && other.moneda != null) || (this.moneda != null && !this.moneda.equals(other.moneda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.MonedasPaises[ moneda=" + moneda + " ]";
    }
    
}
