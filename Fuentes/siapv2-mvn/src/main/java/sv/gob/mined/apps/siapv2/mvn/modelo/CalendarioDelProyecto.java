/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;

import java.util.Date;

/**
 *
 * @author Infosoft
 */

public class CalendarioDelProyecto {
    
    private Integer identificadorDelCalendario;
    private String descripcionDelEvento;
    private Date fechaInicioPrevisto;
    private Date fechaFinPrevisto;
    private Date fechaDeInicioEfectivo;
    private Date fechaDeFinEfectivo;
    private TipoDeCalendario idTipoCalendaro;
    private PgConvenio convenio;

    public CalendarioDelProyecto() {
    }

    public CalendarioDelProyecto(Integer identificadorDelCalendario) {
        this.identificadorDelCalendario = identificadorDelCalendario;
    }

    public Integer getIdentificadorDelCalendario() {
        return identificadorDelCalendario;
    }

    public void setIdentificadorDelCalendario(Integer identificadorDelCalendario) {
        this.identificadorDelCalendario = identificadorDelCalendario;
    }

    public String getDescripcionDelEvento() {
        return descripcionDelEvento;
    }

    public void setDescripcionDelEvento(String descripcionDelEvento) {
        this.descripcionDelEvento = descripcionDelEvento;
    }

    public Date getFechaInicioPrevisto() {
        return fechaInicioPrevisto;
    }

    public void setFechaInicioPrevisto(Date fechaInicioPrevisto) {
        this.fechaInicioPrevisto = fechaInicioPrevisto;
    }

    public Date getFechaFinPrevisto() {
        return fechaFinPrevisto;
    }

    public void setFechaFinPrevisto(Date fechaFinPrevisto) {
        this.fechaFinPrevisto = fechaFinPrevisto;
    }

    public Date getFechaDeInicioEfectivo() {
        return fechaDeInicioEfectivo;
    }

    public void setFechaDeInicioEfectivo(Date fechaDeInicioEfectivo) {
        this.fechaDeInicioEfectivo = fechaDeInicioEfectivo;
    }

    public Date getFechaDeFinEfectivo() {
        return fechaDeFinEfectivo;
    }

    public void setFechaDeFinEfectivo(Date fechaDeFinEfectivo) {
        this.fechaDeFinEfectivo = fechaDeFinEfectivo;
    }

    public TipoDeCalendario getIdTipoCalendaro() {
        return idTipoCalendaro;
    }

    public void setIdTipoCalendaro(TipoDeCalendario idTipoCalendaro) {
        this.idTipoCalendaro = idTipoCalendaro;
    }

    public PgConvenio getConvenio() {
        return convenio;
    }

    public void setConvenio(PgConvenio convenio) {
        this.convenio = convenio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (identificadorDelCalendario != null ? identificadorDelCalendario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CalendarioDelProyecto)) {
            return false;
        }
        CalendarioDelProyecto other = (CalendarioDelProyecto) object;
        if ((this.identificadorDelCalendario == null && other.identificadorDelCalendario != null) || (this.identificadorDelCalendario != null && !this.identificadorDelCalendario.equals(other.identificadorDelCalendario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.CalendarioDelProyecto[ identificadorDelCalendario=" + identificadorDelCalendario + " ]";
    }
    
}
