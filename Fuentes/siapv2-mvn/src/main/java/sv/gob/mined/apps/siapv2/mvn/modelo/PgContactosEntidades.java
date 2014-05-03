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

public class PgContactosEntidades  {
    private Integer contacto;
    private String contactoNombre;
    private String contactoApellido;
    private String contactoEmail;
    private String contactoTelefono;
    private String contactoFax;
    private Integer contactoSexo;
    private Integer contactoCargo;
    private String fechaActualizacion;
    private List<PgResponsablesEntidadesFinanciadoras> pgResponsablesEntidadesFinanciadorasList;
    private PgEntidadesFinanciadoras organismo;

    public PgContactosEntidades() {
    }

    public PgContactosEntidades(Integer contacto) {
        this.contacto = contacto;
    }

    public Integer getContacto() {
        return contacto;
    }

    public void setContacto(Integer contacto) {
        this.contacto = contacto;
    }

    public String getContactoNombre() {
        return contactoNombre;
    }

    public void setContactoNombre(String contactoNombre) {
        this.contactoNombre = contactoNombre;
    }

    public String getContactoApellido() {
        return contactoApellido;
    }

    public void setContactoApellido(String contactoApellido) {
        this.contactoApellido = contactoApellido;
    }

    public String getContactoEmail() {
        return contactoEmail;
    }

    public void setContactoEmail(String contactoEmail) {
        this.contactoEmail = contactoEmail;
    }

    public String getContactoTelefono() {
        return contactoTelefono;
    }

    public void setContactoTelefono(String contactoTelefono) {
        this.contactoTelefono = contactoTelefono;
    }

    public String getContactoFax() {
        return contactoFax;
    }

    public void setContactoFax(String contactoFax) {
        this.contactoFax = contactoFax;
    }

    public Integer getContactoSexo() {
        return contactoSexo;
    }

    public void setContactoSexo(Integer contactoSexo) {
        this.contactoSexo = contactoSexo;
    }

    public Integer getContactoCargo() {
        return contactoCargo;
    }

    public void setContactoCargo(Integer contactoCargo) {
        this.contactoCargo = contactoCargo;
    }

    public String getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(String fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public List<PgResponsablesEntidadesFinanciadoras> getPgResponsablesEntidadesFinanciadorasList() {
        return pgResponsablesEntidadesFinanciadorasList;
    }

    public void setPgResponsablesEntidadesFinanciadorasList(List<PgResponsablesEntidadesFinanciadoras> pgResponsablesEntidadesFinanciadorasList) {
        this.pgResponsablesEntidadesFinanciadorasList = pgResponsablesEntidadesFinanciadorasList;
    }

    public PgEntidadesFinanciadoras getOrganismo() {
        return organismo;
    }

    public void setOrganismo(PgEntidadesFinanciadoras organismo) {
        this.organismo = organismo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contacto != null ? contacto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PgContactosEntidades)) {
            return false;
        }
        PgContactosEntidades other = (PgContactosEntidades) object;
        if ((this.contacto == null && other.contacto != null) || (this.contacto != null && !this.contacto.equals(other.contacto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.PgContactosEntidades[ contacto=" + contacto + " ]";
    }
    
}
