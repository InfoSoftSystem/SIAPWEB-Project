/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Infosoft
 */
public class VersionesComponentes {
    
    private Integer idVersionComponente;
    private Integer pgComponente;
    private Integer activo;
    private String codigoComponente;
    private int componente;
    private Integer componenteNivel;
    private String componenteNombre;
    private String componenteObjetivo;
    private BigDecimal dispEjecFtePpal;
    private BigDecimal dispEjecFteSec;
    private BigDecimal disponibleGoes;
    private BigDecimal disponiblePrestamo;
    private String estructuraOrganizativa;
    private BigDecimal financiamientoBanco;
    private BigDecimal financiamientoGoes;
    private Integer modificacion;
    private BigDecimal montoDispPAPFtePpal;
    private BigDecimal montoDispPAPFteSec;
    private BigDecimal montoModifFuentePpal;
    private BigDecimal montoModifFuenteSec;
    private BigDecimal montoProgPAPFteSec;
    private BigDecimal montoReservadoFuentePppal;
    private BigDecimal montoReservadoFuenteSec;
    private BigDecimal montosProgrPAPFtePpal;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private VersionesDeLaAsignacion identificadorDeLaVersion;

    public VersionesComponentes() {
    }

    public VersionesComponentes(Integer idVersionComponente) {
        this.idVersionComponente = idVersionComponente;
    }

    public VersionesComponentes(Integer idVersionComponente, int componente) {
        this.idVersionComponente = idVersionComponente;
        this.componente = componente;
    }

    public Integer getIdVersionComponente() {
        return idVersionComponente;
    }

    public void setIdVersionComponente(Integer idVersionComponente) {
        this.idVersionComponente = idVersionComponente;
    }

    public Integer getPgComponente() {
        return pgComponente;
    }

    public void setPgComponente(Integer pgComponente) {
        this.pgComponente = pgComponente;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }

    public String getCodigoComponente() {
        return codigoComponente;
    }

    public void setCodigoComponente(String codigoComponente) {
        this.codigoComponente = codigoComponente;
    }

    public int getComponente() {
        return componente;
    }

    public void setComponente(int componente) {
        this.componente = componente;
    }

    public Integer getComponenteNivel() {
        return componenteNivel;
    }

    public void setComponenteNivel(Integer componenteNivel) {
        this.componenteNivel = componenteNivel;
    }

    public String getComponenteNombre() {
        return componenteNombre;
    }

    public void setComponenteNombre(String componenteNombre) {
        this.componenteNombre = componenteNombre;
    }

    public String getComponenteObjetivo() {
        return componenteObjetivo;
    }

    public void setComponenteObjetivo(String componenteObjetivo) {
        this.componenteObjetivo = componenteObjetivo;
    }

    public BigDecimal getDispEjecFtePpal() {
        return dispEjecFtePpal;
    }

    public void setDispEjecFtePpal(BigDecimal dispEjecFtePpal) {
        this.dispEjecFtePpal = dispEjecFtePpal;
    }

    public BigDecimal getDispEjecFteSec() {
        return dispEjecFteSec;
    }

    public void setDispEjecFteSec(BigDecimal dispEjecFteSec) {
        this.dispEjecFteSec = dispEjecFteSec;
    }

    public BigDecimal getDisponibleGoes() {
        return disponibleGoes;
    }

    public void setDisponibleGoes(BigDecimal disponibleGoes) {
        this.disponibleGoes = disponibleGoes;
    }

    public BigDecimal getDisponiblePrestamo() {
        return disponiblePrestamo;
    }

    public void setDisponiblePrestamo(BigDecimal disponiblePrestamo) {
        this.disponiblePrestamo = disponiblePrestamo;
    }

    public String getEstructuraOrganizativa() {
        return estructuraOrganizativa;
    }

    public void setEstructuraOrganizativa(String estructuraOrganizativa) {
        this.estructuraOrganizativa = estructuraOrganizativa;
    }

    public BigDecimal getFinanciamientoBanco() {
        return financiamientoBanco;
    }

    public void setFinanciamientoBanco(BigDecimal financiamientoBanco) {
        this.financiamientoBanco = financiamientoBanco;
    }

    public BigDecimal getFinanciamientoGoes() {
        return financiamientoGoes;
    }

    public void setFinanciamientoGoes(BigDecimal financiamientoGoes) {
        this.financiamientoGoes = financiamientoGoes;
    }

    public Integer getModificacion() {
        return modificacion;
    }

    public void setModificacion(Integer modificacion) {
        this.modificacion = modificacion;
    }

    public BigDecimal getMontoDispPAPFtePpal() {
        return montoDispPAPFtePpal;
    }

    public void setMontoDispPAPFtePpal(BigDecimal montoDispPAPFtePpal) {
        this.montoDispPAPFtePpal = montoDispPAPFtePpal;
    }

    public BigDecimal getMontoDispPAPFteSec() {
        return montoDispPAPFteSec;
    }

    public void setMontoDispPAPFteSec(BigDecimal montoDispPAPFteSec) {
        this.montoDispPAPFteSec = montoDispPAPFteSec;
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

    public BigDecimal getMontoProgPAPFteSec() {
        return montoProgPAPFteSec;
    }

    public void setMontoProgPAPFteSec(BigDecimal montoProgPAPFteSec) {
        this.montoProgPAPFteSec = montoProgPAPFteSec;
    }

    public BigDecimal getMontoReservadoFuentePppal() {
        return montoReservadoFuentePppal;
    }

    public void setMontoReservadoFuentePppal(BigDecimal montoReservadoFuentePppal) {
        this.montoReservadoFuentePppal = montoReservadoFuentePppal;
    }

    public BigDecimal getMontoReservadoFuenteSec() {
        return montoReservadoFuenteSec;
    }

    public void setMontoReservadoFuenteSec(BigDecimal montoReservadoFuenteSec) {
        this.montoReservadoFuenteSec = montoReservadoFuenteSec;
    }

    public BigDecimal getMontosProgrPAPFtePpal() {
        return montosProgrPAPFtePpal;
    }

    public void setMontosProgrPAPFtePpal(BigDecimal montosProgrPAPFtePpal) {
        this.montosProgrPAPFtePpal = montosProgrPAPFtePpal;
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

    public VersionesDeLaAsignacion getIdentificadorDeLaVersion() {
        return identificadorDeLaVersion;
    }

    public void setIdentificadorDeLaVersion(VersionesDeLaAsignacion identificadorDeLaVersion) {
        this.identificadorDeLaVersion = identificadorDeLaVersion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVersionComponente != null ? idVersionComponente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VersionesComponentes)) {
            return false;
        }
        VersionesComponentes other = (VersionesComponentes) object;
        if ((this.idVersionComponente == null && other.idVersionComponente != null) || (this.idVersionComponente != null && !this.idVersionComponente.equals(other.idVersionComponente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.VersionesComponentes[ idVersionComponente=" + idVersionComponente + " ]";
    }
    
}
