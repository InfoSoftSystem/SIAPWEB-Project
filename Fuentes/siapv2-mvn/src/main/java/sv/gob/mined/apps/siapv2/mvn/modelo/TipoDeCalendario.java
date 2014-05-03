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
public class TipoDeCalendario {
    
    private Integer idTipoCalendaro;
    private String descTipoCalendario;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private List<CalendarioDelProyecto> calendarioDelProyectoList;

    public TipoDeCalendario() {
    }

    public TipoDeCalendario(Integer idTipoCalendaro) {
        this.idTipoCalendaro = idTipoCalendaro;
    }

    public Integer getIdTipoCalendaro() {
        return idTipoCalendaro;
    }

    public void setIdTipoCalendaro(Integer idTipoCalendaro) {
        this.idTipoCalendaro = idTipoCalendaro;
    }

    public String getDescTipoCalendario() {
        return descTipoCalendario;
    }

    public void setDescTipoCalendario(String descTipoCalendario) {
        this.descTipoCalendario = descTipoCalendario;
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

    public List<CalendarioDelProyecto> getCalendarioDelProyectoList() {
        return calendarioDelProyectoList;
    }

    public void setCalendarioDelProyectoList(List<CalendarioDelProyecto> calendarioDelProyectoList) {
        this.calendarioDelProyectoList = calendarioDelProyectoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoCalendaro != null ? idTipoCalendaro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoDeCalendario)) {
            return false;
        }
        TipoDeCalendario other = (TipoDeCalendario) object;
        if ((this.idTipoCalendaro == null && other.idTipoCalendaro != null) || (this.idTipoCalendaro != null && !this.idTipoCalendaro.equals(other.idTipoCalendaro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.TipoDeCalendario[ idTipoCalendaro=" + idTipoCalendaro + " ]";
    }
    
}
