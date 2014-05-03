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

public class PgProyectos {
    private Integer identificadorDelProyecto;
    private String proyecto;
    private String proyectoNombre;
    private String proyectoDescripcion;
    private Date fechaInicio;
    private Date fechaFin;
    private Date fechaEfectivaInicio;
    private Date fechaEfectivaFin;
    private Date fechaActualizacion;
    private String fichaTecnica;
    private BigDecimal montoPrestamo;
    private BigDecimal montoGoes;
    private BigDecimal montoModifFuentePpal;
    private BigDecimal montoModifFuenteSec;
    private BigDecimal montoTotal;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private PgTiposProyectos tipoProyecto;
    private List<PgConvenio> pgConvenioList;

    public PgProyectos() {
    }

    public PgProyectos(Integer identificadorDelProyecto) {
        this.identificadorDelProyecto = identificadorDelProyecto;
    }

    public Integer getIdentificadorDelProyecto() {
        return identificadorDelProyecto;
    }

    public void setIdentificadorDelProyecto(Integer identificadorDelProyecto) {
        this.identificadorDelProyecto = identificadorDelProyecto;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    public String getProyectoNombre() {
        return proyectoNombre;
    }

    public void setProyectoNombre(String proyectoNombre) {
        this.proyectoNombre = proyectoNombre;
    }

    public String getProyectoDescripcion() {
        return proyectoDescripcion;
    }

    public void setProyectoDescripcion(String proyectoDescripcion) {
        this.proyectoDescripcion = proyectoDescripcion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getFechaEfectivaInicio() {
        return fechaEfectivaInicio;
    }

    public void setFechaEfectivaInicio(Date fechaEfectivaInicio) {
        this.fechaEfectivaInicio = fechaEfectivaInicio;
    }

    public Date getFechaEfectivaFin() {
        return fechaEfectivaFin;
    }

    public void setFechaEfectivaFin(Date fechaEfectivaFin) {
        this.fechaEfectivaFin = fechaEfectivaFin;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public String getFichaTecnica() {
        return fichaTecnica;
    }

    public void setFichaTecnica(String fichaTecnica) {
        this.fichaTecnica = fichaTecnica;
    }

    public BigDecimal getMontoPrestamo() {
        return montoPrestamo;
    }

    public void setMontoPrestamo(BigDecimal montoPrestamo) {
        this.montoPrestamo = montoPrestamo;
    }

    public BigDecimal getMontoGoes() {
        return montoGoes;
    }

    public void setMontoGoes(BigDecimal montoGoes) {
        this.montoGoes = montoGoes;
    }

    public BigDecimal getMontoModifFuentePpal() {
        return montoModifFuentePpal;
    }

    public void setMontoModifFuentePpal(BigDecimal montoModifFuentePpal) {
        this.montoModifFuentePpal = montoModifFuentePpal;
    }

    public BigDecimal getMontoModifFuenteSec() {
        return montoModifFuenteSec;
    }

    public void setMontoModifFuenteSec(BigDecimal montoModifFuenteSec) {
        this.montoModifFuenteSec = montoModifFuenteSec;
    }

    public BigDecimal getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(BigDecimal montoTotal) {
        this.montoTotal = montoTotal;
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

    public PgTiposProyectos getTipoProyecto() {
        return tipoProyecto;
    }

    public void setTipoProyecto(PgTiposProyectos tipoProyecto) {
        this.tipoProyecto = tipoProyecto;
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
        hash += (identificadorDelProyecto != null ? identificadorDelProyecto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PgProyectos)) {
            return false;
        }
        PgProyectos other = (PgProyectos) object;
        if ((this.identificadorDelProyecto == null && other.identificadorDelProyecto != null) || (this.identificadorDelProyecto != null && !this.identificadorDelProyecto.equals(other.identificadorDelProyecto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.PgProyectos[ identificadorDelProyecto=" + identificadorDelProyecto + " ]";
    }
    
}
