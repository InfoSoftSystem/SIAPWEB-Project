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

public class SecurityUsers {
    
    private String name;
    private List<BitacoraRegistroProce> bitacoraRegistroProceList;
    private Persona identificadorDeLaPersona;
    private List<CatalogoTareas> catalogoTareasList;
    private List<ProcedimientoTarea> procedimientoTareaList;
    private SecurityGroupings securityGroupings;
    private List<MacroProcesos> macroProcesosList;
    private List<EstadoGeneralAplicacion> estadoGeneralAplicacionList;

    public SecurityUsers() {
    }

    public SecurityUsers(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BitacoraRegistroProce> getBitacoraRegistroProceList() {
        return bitacoraRegistroProceList;
    }

    public void setBitacoraRegistroProceList(List<BitacoraRegistroProce> bitacoraRegistroProceList) {
        this.bitacoraRegistroProceList = bitacoraRegistroProceList;
    }

    public Persona getIdentificadorDeLaPersona() {
        return identificadorDeLaPersona;
    }

    public void setIdentificadorDeLaPersona(Persona identificadorDeLaPersona) {
        this.identificadorDeLaPersona = identificadorDeLaPersona;
    }

    public List<CatalogoTareas> getCatalogoTareasList() {
        return catalogoTareasList;
    }

    public void setCatalogoTareasList(List<CatalogoTareas> catalogoTareasList) {
        this.catalogoTareasList = catalogoTareasList;
    }

    public List<ProcedimientoTarea> getProcedimientoTareaList() {
        return procedimientoTareaList;
    }

    public void setProcedimientoTareaList(List<ProcedimientoTarea> procedimientoTareaList) {
        this.procedimientoTareaList = procedimientoTareaList;
    }

    public SecurityGroupings getSecurityGroupings() {
        return securityGroupings;
    }

    public void setSecurityGroupings(SecurityGroupings securityGroupings) {
        this.securityGroupings = securityGroupings;
    }

    public List<MacroProcesos> getMacroProcesosList() {
        return macroProcesosList;
    }

    public void setMacroProcesosList(List<MacroProcesos> macroProcesosList) {
        this.macroProcesosList = macroProcesosList;
    }

    public List<EstadoGeneralAplicacion> getEstadoGeneralAplicacionList() {
        return estadoGeneralAplicacionList;
    }

    public void setEstadoGeneralAplicacionList(List<EstadoGeneralAplicacion> estadoGeneralAplicacionList) {
        this.estadoGeneralAplicacionList = estadoGeneralAplicacionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (name != null ? name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SecurityUsers)) {
            return false;
        }
        SecurityUsers other = (SecurityUsers) object;
        if ((this.name == null && other.name != null) || (this.name != null && !this.name.equals(other.name))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.SecurityUsers[ name=" + name + " ]";
    }
    
}
