/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.managedbeans;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import org.primefaces.component.datatable.DataTable;
import org.primefaces.context.RequestContext;
import org.primefaces.event.CellEditEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import sv.gob.mined.apps.siapv2.mvn.bo.ReprogramacionBo;
import sv.gob.mined.apps.siapv2.mvn.dto.ElementoReproDto;
import sv.gob.mined.apps.siapv2.mvn.modelo.DetalleCompPorPlantilla;
import sv.gob.mined.apps.siapv2.mvn.modelo.EstadoPoaReprogramaciones;
import sv.gob.mined.apps.siapv2.mvn.modelo.OrigenDeLosRecursos;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgConvenio;
import sv.gob.mined.apps.siapv2.mvn.modelo.PoaAnosPlanAccion;
import sv.gob.mined.apps.siapv2.mvn.modelo.PoaDetalleReprogramaciones;
import sv.gob.mined.apps.siapv2.mvn.modelo.PoaRecursos;
import sv.gob.mined.apps.siapv2.mvn.modelo.PoaReprogramaciones;
import sv.gob.mined.apps.siapv2.mvn.modelo.TiposPoaReprogramaciones;

/**
 *
 * @author Infosoft
 */
@Component(value = "reprogramacionBean")
@Scope(value = "view")
public class ReprogramacionBean {

    private Integer tipoReprogramacion = 1;
    private Integer idOrigen = 0;
    private Integer idConvenio = 0;
    private Integer nivelEdicion = 1;
    private Integer actividad;
    private Boolean showFichaRepro = false;
    private Boolean contrapartida = true;
    private Boolean showAumento = true;
    private Boolean showDisminucion = true;
    private Boolean showNuevoRecurso = false;
    private Boolean showEditReprogramacion = false;
    private Boolean deshabilitar = true;
    private String tituloDialog;
    private String totalAumentos = "$ 0.00";
    private String totalDisminuciones = "$ 0.00";
    private String total = "$ 0.00";
    private PoaReprogramaciones poaReprogramacion = new PoaReprogramaciones();
    private List<PoaDetalleReprogramaciones> lstDetalleReproDisminucion = new ArrayList<PoaDetalleReprogramaciones>();
    private List<PoaDetalleReprogramaciones> lstDetalleReproAumento = new ArrayList<PoaDetalleReprogramaciones>();
    private List<PoaReprogramaciones> lstReprogramaciones;
    private List<OrigenDeLosRecursos> lstOrigenRecursos;
    @Autowired
    private ReprogramacionBo reprogramacionBo;

    public ReprogramacionBean() {
    }
    
    @PostConstruct
    public void init(){
        lstOrigenRecursos = reprogramacionBo.getLstOrigenRecursos();
    }
    
    public ReprogramacionBo getReprogramacionBo() {
        return reprogramacionBo;
    }

    public Boolean getDeshabilitar() {
        return deshabilitar;
    }

    public Integer getNivelEdicion() {
        return nivelEdicion;
    }

    public Boolean getContrapartida() {
        return contrapartida;
    }

    public Boolean getShowFichaRepro() {
        return showFichaRepro;
    }

    public Boolean getShowEditReprogramacion() {
        return showEditReprogramacion;
    }

    public void setShowEditReprogramacion(Boolean showEditReprogramacion) {
        this.showEditReprogramacion = showEditReprogramacion;
    }

    public void setShowFichaRepro(Boolean showFichaRepro) {
        this.showFichaRepro = showFichaRepro;
    }

    public void setContrapartida(Boolean contrapartida) {
        this.contrapartida = contrapartida;
    }

    public String getTituloDialog() {
        return tituloDialog;
    }

    public void setTituloDialog(String tituloDialog) {
        this.tituloDialog = tituloDialog;
    }

    public String getTotalAumentos() {
        return totalAumentos;
    }

    public void setTotalAumentos(String totalAumentos) {
        this.totalAumentos = totalAumentos;
    }

    public String getTotalDisminuciones() {
        return totalDisminuciones;
    }

    public void setTotalDisminuciones(String totalDisminuciones) {
        this.totalDisminuciones = totalDisminuciones;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public Integer getNumColSpanFuentes() {
        if (contrapartida) {
            return 3;
        } else {
            return 1;
        }
    }

    public Boolean getShowAumento() {
        return showAumento;
    }

    public Boolean getShowDisminucion() {
        return showDisminucion;
    }

    public void showDisminucionAumento() {
        showAumento = true;
        showDisminucion = true;

        switch (tipoReprogramacion) {
            case 3://aumento
                showDisminucion = false;
                break;
            case 4://disminucion
                showAumento = false;
                break;
            default:
                break;
        }
    }

    public void showDialgoNuevoRecurso() {
        showNuevoRecurso = true;
    }

    public Boolean getShowNuevoRecurso() {
        return showNuevoRecurso;
    }

    public List<EstadoPoaReprogramaciones> getEstadoPoaReprogramacion() {
        return reprogramacionBo.findAllEstadoPoaReprogramacion();
    }

    public List<TiposPoaReprogramaciones> getTiposPoaReprogramaciones() {
        return reprogramacionBo.findAllTiposPoaReprogramaciones();
    }

    public Integer getTipoReprogramacion() {
        return tipoReprogramacion;
    }

    public void setTipoReprogramacion(Integer tipoReprogramacion) {
        this.tipoReprogramacion = tipoReprogramacion;
    }

    public Integer getIdOrigen() {
        return idOrigen;
    }

    public void setIdOrigen(Integer idOrigen) {
        this.idOrigen = idOrigen;
    }

    public List<OrigenDeLosRecursos> getLstOrigenRecursos() {
        return lstOrigenRecursos;
    }

    public List<PgConvenio> getLstConvenios() {
        return reprogramacionBo.getLstConvenios(idOrigen);
    }

    public Integer getIdConvenio() {
        return idConvenio;
    }

    public void setIdConvenio(Integer idConvenio) {
        this.idConvenio = idConvenio;
    }

    public DetalleCompPorPlantilla getDetCompPlantilla() {
        if (idConvenio == null) {
            return new DetalleCompPorPlantilla();
        } else {
            return reprogramacionBo.getDetCompPorPlantilla(idConvenio);
        }
    }

    public PoaReprogramaciones getPoaReprogramacion() {
        if (poaReprogramacion == null) {
            poaReprogramacion = new PoaReprogramaciones();
        }
        return poaReprogramacion;
    }

    public void setPoaReprogramacion(PoaReprogramaciones poaReprogramacion) {
        this.poaReprogramacion = poaReprogramacion;
    }

    public void cerrarPopupCabecera() {
        RequestContext.getCurrentInstance().execute("frmPrincipal:dlgDetalle");
    }

    public List<PoaDetalleReprogramaciones> getLstDetalleReproDisminucion() {
        return lstDetalleReproDisminucion;
    }

    public void setLstDetalleReproDisminucion(List<PoaDetalleReprogramaciones> lstDetalleReproDisminucion) {
        this.lstDetalleReproDisminucion = lstDetalleReproDisminucion;
    }

    public List<PoaDetalleReprogramaciones> getLstDetalleReproAumento() {
        return lstDetalleReproAumento;
    }

    public void setLstDetalleReproAumento(List<PoaDetalleReprogramaciones> lstDetalleReproAumento) {
        this.lstDetalleReproAumento = lstDetalleReproAumento;
    }

    public void addDetalleDiminucion() {
        PoaDetalleReprogramaciones det = new PoaDetalleReprogramaciones();
        det.setActividad(0);
        lstDetalleReproDisminucion.add(det);
    }

    public void addDetalleAumento() {
        lstDetalleReproDisminucion.add(new PoaDetalleReprogramaciones());
    }

    public List<PoaReprogramaciones> getLstReprogramaciones() {
        if (lstReprogramaciones == null) {
            lstReprogramaciones = new ArrayList<PoaReprogramaciones>();
        }
        return lstReprogramaciones;
    }

    public void cargarReprogramaciones() {
        if (getPoaReprogramacion().getPoa() == null) {
            lstReprogramaciones.clear();
        } else {
            lstReprogramaciones = reprogramacionBo.getLstReprogramaciones(poaReprogramacion.getPoa());
        }
    }

    public List<PoaAnosPlanAccion> getLstPoaAnhosPlanAccion() {
        return reprogramacionBo.getLstPoaAnhosPlanAccion(idConvenio);
    }

    public void nuevo() {
        deshabilitar = false;
        switch (nivelEdicion) {
            case 1:

                RequestContext.getCurrentInstance().update("frmPrincipal:dlgFicha");
                break;
            case 2:
                break;
        }
    }

    public void guardar() {
        switch (nivelEdicion) {
            case 1:
                if (poaReprogramacion.getReprogramacion() == null) {
                    poaReprogramacion.setEstadoPoaReprogramaciones(1);
                }
                reprogramacionBo.saveFichaReprogramacion(poaReprogramacion);
                cargarReprogramaciones();
                RequestContext.getCurrentInstance().update("frmPrincipal:dlgFicha");
                RequestContext.getCurrentInstance().update("frmPrincipal:tblReprogramaciones");
                break;
        }
    }

    public void fichaReprogramacion() {
        showFichaRepro = true;
    }

    public void editReprogramacion() {
        switch (nivelEdicion) {
            case 1:
                showFichaRepro = false;
                showEditReprogramacion = true;
                RequestContext.getCurrentInstance().update("frmPrincipal:dlgFicha");
                RequestContext.getCurrentInstance().update("frmPrincipal:dlgDetalle");
                break;
        }
    }

    public List<ElementoReproDto> getLstElementoReprog() {
        return reprogramacionBo.getLstElementoRepro(idConvenio);
    }

    public List<PoaRecursos> getLstRecursos() {
        return reprogramacionBo.getLstRecursosByActividad(actividad);
    }

    public void onCellEditDisminucion(CellEditEvent event) {
        DataTable tbl = (DataTable) event.getSource();
        actividad = ((PoaDetalleReprogramaciones) tbl.getRowData()).getActividad();
        RequestContext.getCurrentInstance().update(tbl.getClientId(FacesContext.getCurrentInstance()) + ":" + event.getRowIndex() + ":columnRecurso");
    }
}