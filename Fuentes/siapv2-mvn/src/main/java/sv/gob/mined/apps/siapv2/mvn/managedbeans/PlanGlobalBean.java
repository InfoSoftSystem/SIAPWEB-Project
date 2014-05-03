/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.managedbeans;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.event.ActionEvent;
import org.primefaces.component.datatable.DataTable;
import org.primefaces.context.RequestContext;
import org.primefaces.event.CellEditEvent;
import org.primefaces.event.NodeSelectEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import sv.gob.mined.apps.siapv2.mvn.bo.PlanGlobalBo;
import sv.gob.mined.apps.siapv2.mvn.dto.CategoriasDto;
import sv.gob.mined.apps.siapv2.mvn.dto.ComponentesDto;
import sv.gob.mined.apps.siapv2.mvn.dto.MontosPapDto;
import sv.gob.mined.apps.siapv2.mvn.modelo.DetalleCompPorPlantilla;
import sv.gob.mined.apps.siapv2.mvn.modelo.EstadoEjecConvenio;
import sv.gob.mined.apps.siapv2.mvn.modelo.GCatalogoProductos;
import sv.gob.mined.apps.siapv2.mvn.modelo.OrigenDeLosRecursos;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgActividades;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgAnosPlanGlobal;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgCategorias;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgComponentes;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgConvenio;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgMetas;
import sv.gob.mined.apps.siapv2.mvn.modelo.PoaRecursos;
import sv.gob.mined.apps.siapv2.mvn.modelo.PoaRecursosSaldos;
import sv.gob.mined.apps.siapv2.mvn.modelo.TipoDeMetas;
import sv.gob.mined.apps.siapv2.mvn.modelo.TipoRecurso;
import sv.gob.mined.apps.siapv2.mvn.util.JsfUtil;

/**
 *
 * @author Infosoft
 */
@Component(value = "planGlobalBean")
@Scope(value = "view")
public class PlanGlobalBean {

    private Boolean contrapartida = true;
    private Boolean showMeta = false;
    private Boolean showActividad = false;
    private Boolean showRecurso = false;
    private Boolean visibleComponentes = false;
    private Boolean visibleMetas = false;
    private Boolean visibleActividades = false;
    private Boolean visibleAnhoPap = false;
    private Boolean visibleBtnActividades = false;
    private Boolean deshabilitarRecurso = true;
    private Integer nivelEdicion = 1;
    private Integer idConvenio = 0;
    private Integer idOrigen = 0;
    private Integer idComponente = 0;
    private Integer idOrganismo = 0;
    private Integer idEstadoEjeConvenio = 0;
    private Integer idPoa = 0;
    private String nombreComponente;
    private String clasificadorPresupuestario = "";
    private String nombreFtePpal = "";
    private String nombreFteCont = "";
    private List<PgMetas> lstMetas = new ArrayList<PgMetas>();
    private List<PgActividades> lstActividades = new ArrayList<PgActividades>();
    private List<PoaRecursos> lstRecuros = new ArrayList<PoaRecursos>();
    private List<TipoDeMetas> lstTipoMeta = new ArrayList<TipoDeMetas>();
    private PgMetas pgMeta;
    private PgActividades pgActividad;
    private PoaRecursos currentRecurso;
    private PoaRecursosSaldos recursoFtePpal;
    private PoaRecursosSaldos recursoFteCont;
    private DetalleCompPorPlantilla detCompPlanilla;
    private TreeNode nodoComponentes;
    @Autowired
    private PlanGlobalBo planGlobalBo;

    public PlanGlobalBean() {
    }

    @PostConstruct
    public void init() {
        lstTipoMeta = planGlobalBo.getLstTipoMetas();
    }

    public PlanGlobalBo getPlanGlobalBo() {
        return planGlobalBo;
    }

    public Boolean getContrapartida() {
        return contrapartida;
    }

    public void setContrapartida(Boolean contrapartida) {
        this.contrapartida = contrapartida;
    }

    public Integer getNumColSpanFuentes() {
        if (contrapartida) {
            return 3;
        } else {
            return 1;
        }
    }

    public Integer getNivelEdicion() {
        return nivelEdicion;
    }

    public void setNivelEdicion(Integer nivelEdicion) {
        this.nivelEdicion = nivelEdicion;
    }

    public void nuevo() {
        deshabilitarRecurso = true;
        switch (nivelEdicion) {
            case 1:
                showMeta = true;
                newMeta();
                RequestContext.getCurrentInstance().update("frmPrincipal:dlgMeta");
                break;
            case 2:
                PgActividades actividad = new PgActividades();
                actividad.setFinanciamientoBanco(BigDecimal.ZERO);
                actividad.setFinanciamientoGoes(BigDecimal.ZERO);
                actividad.setPgMeta(pgMeta);
                actividad.setEstadoDeEliminacion(0);
                if (getLstAnhosPg().isEmpty()) {
                    JsfUtil.addWarningMessage("No se han registrados los años para este Plan Global");
                } else {
                    actividad.setPgAnosPlanGlobal(getLstAnhosPg().get(0));
                    if (pgMeta.getLstPgActividades() == null) {
                        pgMeta.setLstPgActividades(new ArrayList<PgActividades>());
                    }
                    pgMeta.getLstPgActividades().add(actividad);
                }
                RequestContext.getCurrentInstance().update("frmPrincipal:dlgActividad");
                break;
            case 3:
                PoaRecursos recurso = new PoaRecursos();
                recurso.setPoa(planGlobalBo.getAnhosPgPgAnnosPlanGlobal(pgActividad.getIdentificadorAnoPap()).getPoa());
                recurso.setActividad(pgActividad.getActividad());
                recurso.setPgActividad(pgActividad);
                recurso.setPrecioUnitario(BigDecimal.ZERO);
                recurso.setCantidad(0);
                recurso.setEstadoDeEliminacion(0);
                lstRecuros.add(recurso);
                currentRecurso = recurso;
                deshabilitarRecurso = false;

                PoaRecursosSaldos rFtePpal = new PoaRecursosSaldos();
                rFtePpal.setMontoPreliminar(BigDecimal.ZERO);
                rFtePpal.setActivo(1);
                rFtePpal.setConvenio(idConvenio);
                rFtePpal.setEstadoDeEliminacion(0);
                rFtePpal.setOrganismo(planGlobalBo.getOrganismoByConvenio(idConvenio, true));
                currentRecurso.getLstPoaRecursosSaldos().add(rFtePpal);
                recursoFtePpal = rFtePpal;

                if (contrapartida) {
                    PoaRecursosSaldos rFteCont = new PoaRecursosSaldos();
                    rFteCont.setMontoPreliminar(BigDecimal.ZERO);
                    rFteCont.setActivo(1);
                    rFteCont.setConvenio(idConvenio);
                    rFteCont.setEstadoDeEliminacion(0);
                    rFteCont.setOrganismo(planGlobalBo.getOrganismoByConvenio(idConvenio, false));
                    currentRecurso.getLstPoaRecursosSaldos().add(rFteCont);
                    recursoFteCont = rFteCont;
                }
                RequestContext.getCurrentInstance().update("frmPrincipal:dlgRecurso");

                break;
        }
    }

    private void newMeta() {
        PgMetas meta = new PgMetas();
        meta.setDescripcion(" ");
        meta.setActivo(1);
        meta.setMontoBanco(BigDecimal.ZERO);
        meta.setMontoGoes(BigDecimal.ZERO);
        if (visibleComponentes) {
            meta.setComponente(idComponente);
        } else {
            if (planGlobalBo.getLstComponente(idConvenio).isEmpty()) {
                JsfUtil.addWarningMessage("Este existen componentes.");
            } else {
                meta.setComponente(planGlobalBo.getLstComponente(idConvenio).get(0).getComponente());
            }
        }
        meta.setIdTipoMeta(lstTipoMeta.get(0).getIdTipoMeta());
        meta.setTipoDeMetas(lstTipoMeta.get(0));
        meta.setEstadoDeEliminacion(0);
        lstMetas.add(meta);
    }

    public void eliminar() {
        switch (nivelEdicion) {
            case 1:
                if (pgMeta != null) {
                    if (pgMeta.getMeta() == 0) {
                        lstMetas.remove(pgMeta);
                        pgMeta = null;
                    } else {
                        //validacion para eliminar una meta 
                    }
                }
                break;
            case 2:
                if (pgActividad != null) {
                    if (pgActividad.getActividad() == 0) {
                        pgMeta.getLstPgActividades().remove(pgActividad);
                    } else {
                        //validacion para eliminar una actividad 
                    }
                }
                break;
            case 3:
                if (currentRecurso != null) {
                    if (currentRecurso.getRecurso() == 0) {
                        lstRecuros.remove(currentRecurso);
                    } else {
                        //validacion para eliminar una meta 
                    }
                }
                break;
        }
    }

    public void guardar() {
        for (PgMetas pgMetas : lstMetas) {
            BigDecimal ftePpalRecurso = BigDecimal.ZERO;
            BigDecimal fteContRecurso = BigDecimal.ZERO;
            BigDecimal ftePpalAct = BigDecimal.ZERO;
            BigDecimal fteContAct = BigDecimal.ZERO;

            Boolean metaValida = true;
            if (pgMetas.getCodigoMeta() != null && (pgMetas.getMetaNombre() != null && !pgMetas.getMetaNombre().isEmpty())) {
                if (metaValida) {
                    planGlobalBo.saveMeta(pgMetas);
                    //persistir actividades
                    for (PgActividades pgAct : pgMetas.getLstPgActividades()) {
                        if (pgAct.getMeta() == pgMetas.getMeta()) {
                            planGlobalBo.saveActividad(pgAct);
                            //Persistir Recursos
                            for (PoaRecursos poaRecur : pgAct.getLstPoaRecursos()) {
                                planGlobalBo.saveRecurso(poaRecur);
                                poaRecur.getRecursosSaldos(true).setRecurso(poaRecur.getRecurso());
                                planGlobalBo.saveRecursoSaldo(poaRecur.getRecursosSaldos(true));
                                ftePpalRecurso = ftePpalRecurso.add(poaRecur.getRecursosSaldos(true).getMontoPreliminar());

                                if (contrapartida) {
                                    poaRecur.getRecursosSaldos(false).setRecurso(poaRecur.getRecurso());
                                    planGlobalBo.saveRecursoSaldo(poaRecur.getRecursosSaldos(false));
                                    fteContRecurso = fteContRecurso.add(poaRecur.getRecursosSaldos(false).getMontoPreliminar());
                                }
                            }

                            //actualizar montos de pg_actividades
                            if (idOrganismo == 5) {
                                pgAct.setFinanciamientoBanco(BigDecimal.ZERO);
                                pgAct.setFinanciamientoGoes(ftePpalRecurso);
                            } else {
                                pgAct.setFinanciamientoBanco(ftePpalRecurso);
                                pgAct.setFinanciamientoGoes(fteContRecurso);
                            }

                            planGlobalBo.saveActividad(pgAct);
                        }
                        ftePpalAct = fteContAct.add(pgAct.getFinanciamientoBanco());
                        fteContAct = fteContAct.add(pgAct.getFinanciamientoGoes());
                    }

                    if (idOrganismo == 5) {
                        pgMetas.setMontoBanco(BigDecimal.ZERO);
                        pgMetas.setMontoGoes(ftePpalAct);
                    } else {
                        pgMetas.setMontoBanco(ftePpalAct);
                        pgMetas.setMontoGoes(fteContAct);
                    }

                    planGlobalBo.saveMeta(pgMetas);
                }
            }
        }

        JsfUtil.addSuccessMessage("Datos almacenados correctamente");
    }

    public void newActividad() {
        if (lstMetas.isEmpty()) {
            newMeta();
        }
        pgMeta = lstMetas.get(0);
        newActividad(pgMeta);
    }

    public void newActividad(ActionEvent event) {
        pgMeta = (PgMetas) event.getComponent().getAttributes().get("meta");
        newActividad(pgMeta);
    }

    private void newActividad(PgMetas pgMeta) {
        if (pgMeta != null) {
            showMeta = false;
            showActividad = true;
            nivelEdicion = 2;
            for (PgActividades pgAct : pgMeta.getLstPgActividades()) {
                if (pgAct.getMeta() == null) {
                    pgAct.setMeta(pgMeta.getMeta());
                }
            }
            lstActividades = pgMeta.getLstPgActividades();
            RequestContext.getCurrentInstance().update("frmPrincipal:dlgMeta");
            if (visibleActividades) {
                RequestContext.getCurrentInstance().update("frmPrincipal:dlgActividad");
                RequestContext.getCurrentInstance().execute("dlgActividad.show();");
            } else {
                if (lstActividades.isEmpty()) {
                    nuevo();
                }
                pgActividad = lstActividades.get(0);
                newRecurso();
            }
        }
    }

    public void newRecurso() {
        if (pgActividad != null) {
            nivelEdicion = 3;
            showActividad = false;
            showRecurso = true;
            /*if (pgActividad.getLstPoaRecursos().isEmpty()) {
             pgActividad.setLstPoaRecursos(planGlobalBo.getLstPoaRecursos(pgActividad.getActividad()));
             }*/
            for (PoaRecursos recurso : pgActividad.getLstPoaRecursos()) {
                if (recurso.getActividad() == null) {
                    recurso.setActividad(pgActividad.getActividad());
                }
            }
            lstRecuros = pgActividad.getLstPoaRecursos();
            RequestContext.getCurrentInstance().update("frmPrincipal:dlgActividad");
            RequestContext.getCurrentInstance().update("frmPrincipal:dlgRecurso");
            RequestContext.getCurrentInstance().execute("dlgRecurso.show();");
        }
    }

    public void cerrarPopupMeta() {
        nivelEdicion -= 1;
        showMeta = true;
    }

    public void cerrarPopupActividad() {
        nivelEdicion = 1;
        showMeta = true;
        showActividad = false;
        pgMeta.setLstPgActividades(lstActividades);
        RequestContext.getCurrentInstance().update("frmPrincipal:dlgMeta");
    }

    public void cerrarPopupRecurso() {
        if (visibleActividades) {
            nivelEdicion = 2;
            RequestContext.getCurrentInstance().execute("dlgActividad.show();");
        } else {
            cerrarPopupActividad();
        }
    }

    public Boolean getShowMeta() {
        return showMeta;
    }

    public void setShowMeta(Boolean showMeta) {
        this.showMeta = showMeta;
    }

    public Boolean getShowActividad() {
        return showActividad;
    }

    public void setShowActividad(Boolean showActividad) {
        this.showActividad = showActividad;
    }

    public Boolean getShowRecurso() {
        return showRecurso;
    }

    public void setShowRecurso(Boolean showRecurso) {
        this.showRecurso = showRecurso;
    }

    public List<PgMetas> getLstMetas() {
        return lstMetas;
    }

    public void setLstMetas(List<PgMetas> lstMetas) {
        this.lstMetas = lstMetas;
    }

    public List<PgActividades> getLstActividades() {
        return lstActividades;
    }

    public void setLstActividades(List<PgActividades> lstActividades) {
        this.lstActividades = lstActividades;
    }

    public List<PoaRecursos> getLstRecuros() {
        return lstRecuros;
    }

    public void setLstRecuros(List<PoaRecursos> lstRecuros) {
        this.lstRecuros = lstRecuros;
    }

    public PgActividades getPgActividad() {
        return pgActividad;
    }

    public void setPgActividad(PgActividades pgActividad) {
        if (pgActividad != null) {
            this.pgActividad = pgActividad;
        }
    }

    public PoaRecursos getCurrentRecurso() {
        if (currentRecurso == null) {
            currentRecurso = new PoaRecursos();
        }
        return currentRecurso;
    }

    public void setCurrentRecurso(PoaRecursos currentRecurso) {
        if (currentRecurso != null) {
            this.currentRecurso = currentRecurso;
        }
    }

    public List<OrigenDeLosRecursos> getLstOrigenRecursos() {
        return planGlobalBo.getLstOrigenRecursos();
    }

    public List<PgConvenio> getLstConvenios() {
        return planGlobalBo.getLstConvenios(idOrigen);
    }

    public List<PgAnosPlanGlobal> getLstAnhosPg() {
        return planGlobalBo.getLstAnhosPg(idConvenio);
    }

    public List<PgCategorias> getLstPgCategorias() {
        return planGlobalBo.getLstPgCategorias();
    }

    public List<GCatalogoProductos> getLstCatalogoProductos() {
        return planGlobalBo.getLstCatalogoProductos();
    }

    public void cargarClasificador() {
        if (currentRecurso == null) {
            clasificadorPresupuestario = "";
        } else {
            if (currentRecurso.getProducto() == null) {
                clasificadorPresupuestario = "";
            } else {
                clasificadorPresupuestario = planGlobalBo.getCatalogoProductos(currentRecurso.getProducto()).getClasificadorPresupuestario();
            }
        }
    }

    public DetalleCompPorPlantilla getDetCompPlanilla() {
        if (detCompPlanilla == null) {
            detCompPlanilla = new DetalleCompPorPlantilla();
        }
        return detCompPlanilla;
    }

    public void setDetCompPlanilla(DetalleCompPorPlantilla detCompPlanilla) {
        this.detCompPlanilla = detCompPlanilla;
    }

    public List<TipoRecurso> getLstTipoRecurso() {
        return planGlobalBo.getLstTipoRecurso();
    }

    public PgAnosPlanGlobal getAnhosPgByKey(Integer id) {
        return planGlobalBo.getAnhosPgByKey(id);
    }

    public TipoDeMetas getTipoMetaByKey(Integer id) {
        return planGlobalBo.getTipoMetaByKey(id);
    }

    public List<EstadoEjecConvenio> getLstEstadoEjecConvenio() {
        return planGlobalBo.getLstEstadoEjecConvenio();
    }

    public void cargarPlantillaComportamiento() {
        detCompPlanilla = planGlobalBo.getDetCompPorPlantilla(idConvenio);
        if (detCompPlanilla != null) {
            visibleComponentes = detCompPlanilla.getAplicaNivelDeComponentes() == 1;
            visibleAnhoPap = detCompPlanilla.getDuracionPrevistaMasDeUnAno() == 1;
            visibleMetas = false;
            visibleActividades = false;
            visibleBtnActividades = false;
            switch (planGlobalBo.getNivelDesagregacionByPlanilla(detCompPlanilla.getIdPlantillaComportamiento()).getIdNivelDesagregacion()) {
                case 1:
                    visibleMetas = true;
                    visibleActividades = true;
                    break;
                case 2:
                    visibleMetas = true;
                    break;
                case 3:
                    visibleActividades = true;
                    visibleBtnActividades = true;
                    break;
            }
            contrapartida = planGlobalBo.isUnicaFuente(idConvenio);
            idOrganismo = planGlobalBo.getOrganismoByConvenio(idConvenio, true);
            nombreFtePpal = planGlobalBo.getEntidadesFinanciadoras(idConvenio, true).getNombreCorto();
            nombreFteCont = planGlobalBo.getEntidadesFinanciadoras(idConvenio, false).getNombreCorto();
        }
    }

    public Boolean getVisibleBtnActividades() {
        return visibleBtnActividades;
    }

    public Boolean getVisibleMetas() {
        return visibleMetas;
    }

    public Boolean getVisibleActividades() {
        return visibleActividades;
    }

    public void armarTreeComponentes() {
        List<PgComponentes> lstComponente = planGlobalBo.getLstComponente(idConvenio);
        nodoComponentes = new DefaultTreeNode("Root", null);

        for (PgComponentes pgComponentes : lstComponente) {
            TreeNode node0 = new DefaultTreeNode(pgComponentes, nodoComponentes);

            setHijoComponente(node0, planGlobalBo.getLstSubComponente(pgComponentes.getComponente()));
            node0.setExpanded(true);
        }

        if (lstComponente.isEmpty()) {
            lstMetas.clear();
        }

        for (PgConvenio pgConvenio : planGlobalBo.getLstConvenios(idOrigen)) {
            if (pgConvenio.getConvenio() == idConvenio) {
                idEstadoEjeConvenio = pgConvenio.getIdEstadoEjecProyecto();
                break;
            }
        }
        cargarPlantillaComportamiento();
    }

    public Integer getIdEstadoEjeConvenio() {
        return idEstadoEjeConvenio;
    }

    public void setIdEstadoEjeConvenio(Integer idEstadoEjeConvenio) {
        this.idEstadoEjeConvenio = idEstadoEjeConvenio;
    }

    private TreeNode setHijoComponente(TreeNode nodoPadre, List<PgComponentes> subLstComponentes) {
        for (PgComponentes pgComponentes : subLstComponentes) {
            TreeNode node0 = new DefaultTreeNode(pgComponentes, nodoPadre);

            setHijoComponente(node0, planGlobalBo.getLstSubComponente(pgComponentes.getComponente()));
        }

        return nodoPadre;
    }

    public Integer getIdConvenio() {
        return idConvenio;
    }

    public void setIdConvenio(Integer idConvenio) {
        this.idConvenio = idConvenio;
    }

    public TreeNode getNodoComponentes() {
        return nodoComponentes;
    }

    public void setNodoComponentes(TreeNode nodoComponentes) {
        this.nodoComponentes = nodoComponentes;
    }

    public void onNodeSelect(NodeSelectEvent event) {
        idComponente = ((PgComponentes) event.getTreeNode().getData()).getComponente();
        nombreComponente = ((PgComponentes) event.getTreeNode().getData()).getComponenteNombre();
        lstMetas = planGlobalBo.getLstMetas(idComponente);
        for (PgMetas pgMetas : lstMetas) {
            pgMetas.setLstPgActividades(planGlobalBo.getLstActividades(pgMetas.getMeta()));

            for (PgActividades pgAct : pgMetas.getLstPgActividades()) {
                if (pgAct.getLstPoaRecursos().isEmpty()) {
                    pgAct.setLstPoaRecursos(planGlobalBo.getLstPoaRecursos(pgAct.getActividad()));
                }
            }
        }
    }

    public String getNombreComponente() {
        return nombreComponente;
    }

    public void setNombreComponente(String nombreComponente) {
        this.nombreComponente = nombreComponente;
    }

    public Integer getIdOrigen() {
        return idOrigen;
    }

    public void setIdOrigen(Integer idOrigen) {
        this.idOrigen = idOrigen;
    }

    public void onCellEditMeta(CellEditEvent event) {
        DataTable tbl = (DataTable) event.getSource();
        /*RequestContext.getCurrentInstance().update(tbl.getClientId(FacesContext.getCurrentInstance()) + ":" + event.getRowIndex() + ":totalMeta");
         RequestContext.getCurrentInstance().update(tbl.getClientId(FacesContext.getCurrentInstance()) + ":" + event.getRowIndex() + ":cbTipoMeta");
         RequestContext.getCurrentInstance().update("frmPrincipal:tblMetas:totalGoes");
         RequestContext.getCurrentInstance().update("frmPrincipal:tblMetas:totalBanco");*/
        //RequestContext.getCurrentInstance().update("frmPrincipal:tblMetas");
    }

    public void onCellEditActividad(CellEditEvent event) {
        DataTable tbl = (DataTable) event.getSource();
        /*RequestContext.getCurrentInstance().update(tbl.getClientId(FacesContext.getCurrentInstance()) + ":" + event.getRowIndex() + ":anhoActividad");
         RequestContext.getCurrentInstance().update(tbl.getClientId(FacesContext.getCurrentInstance()) + ":" + event.getRowIndex() + ":montoGoes");
         RequestContext.getCurrentInstance().update(tbl.getClientId(FacesContext.getCurrentInstance()) + ":" + event.getRowIndex() + ":totalActividad");
         RequestContext.getCurrentInstance().update("frmPrincipal:tblActividades:totalGoes");
         RequestContext.getCurrentInstance().update("frmPrincipal:tblActividades:totalBanco");*/
        //RequestContext.getCurrentInstance().update("frmPrincipal:tblActividades");
    }

    public void selectRecurso() {
        recursoFtePpal = currentRecurso.getRecursosSaldos(true);
        //recursoFtePpal = planGlobalBo.getPoaRercursoSaldo(currentRecurso.getRecurso(), idConvenio, planGlobalBo.getOrganismoByConvenio(idConvenio, true));
        //currentRecurso.getLstPoaRecursosSaldos().add(recursoFtePpal);
        if (contrapartida) {
            recursoFteCont = currentRecurso.getRecursosSaldos(false);
            //recursoFteCont = planGlobalBo.getPoaRercursoSaldo(currentRecurso.getRecurso(), idConvenio, planGlobalBo.getOrganismoByConvenio(idConvenio, false));
            //currentRecurso.getLstPoaRecursosSaldos().add(recursoFteCont);
        }
        deshabilitarRecurso = false;
        RequestContext.getCurrentInstance().update("frmPrincipal:dlgRecurso");
    }

    public BigDecimal getTotalMontoGoesMeta() {
        BigDecimal totalMontoGoes = BigDecimal.ZERO;
        for (PgMetas pgMetas : lstMetas) {
            totalMontoGoes = totalMontoGoes.add(pgMetas.getMontoGoes());
        }
        return totalMontoGoes;
    }

    public BigDecimal getTotalMontoBancoMeta() {
        BigDecimal totalMontoBanco = BigDecimal.ZERO;
        for (PgMetas pgMetas : lstMetas) {
            totalMontoBanco = totalMontoBanco.add(pgMetas.getMontoBanco());
        }
        return totalMontoBanco;
    }

    public BigDecimal getTotalMeta() {
        if (contrapartida) {
            return getTotalMontoBancoMeta().add(getTotalMontoGoesMeta());
        } else {
            return getTotalMontoBancoMeta();
        }
    }

    public BigDecimal getTotalMontoGoesActividad() {
        BigDecimal totalMontoGoes = BigDecimal.ZERO;
        if (pgMeta != null) {
            for (PgActividades pgAct : pgMeta.getLstPgActividades()) {
                totalMontoGoes = totalMontoGoes.add(pgAct.getFinanciamientoGoes());
            }
        }
        return totalMontoGoes;
    }

    public BigDecimal getTotalMontoBancoActividad() {
        BigDecimal totalMontoBanco = BigDecimal.ZERO;
        if (pgMeta != null) {
            for (PgActividades pgAct : pgMeta.getLstPgActividades()) {
                totalMontoBanco = totalMontoBanco.add(pgAct.getFinanciamientoBanco());
            }
        }
        return totalMontoBanco;
    }

    public BigDecimal getTotalActividad() {
        if (contrapartida) {
            return getTotalMontoBancoActividad().add(getTotalMontoGoesActividad());
        } else {
            return getTotalMontoBancoActividad();
        }
    }

    public List<TipoDeMetas> getLstTipoMeta() {
        return lstTipoMeta;
    }

    public void setLstTipoMeta(List<TipoDeMetas> lstTipoMeta) {
        this.lstTipoMeta = lstTipoMeta;
    }

    public PgMetas getPgMeta() {
        return pgMeta;
    }

    public String getClasificadorPresupuestario() {
        return clasificadorPresupuestario;
    }

    public void setClasificadorPresupuestario(String clasificadorPresupuestario) {
        this.clasificadorPresupuestario = clasificadorPresupuestario;
    }

    @FacesConverter(forClass = PgAnosPlanGlobal.class)
    public static class PgAnosPlanGlobalConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent uic, String value) {
            PlanGlobalBean pgB = (PlanGlobalBean) facesContext.getApplication().getELResolver().getValue(facesContext.getELContext(), null, "planGlobalBean");

            if (value == null || value.length() == 0) {
                return null;
            }

            return pgB.getAnhosPgByKey(getKey(value));
        }

        Integer getKey(String value) {
            Integer key;
            key = new Integer(value);
            return key;
        }

        String getStringKey(Integer value) {
            return value.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent uic, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof PgAnosPlanGlobal) {
                return getStringKey(((PgAnosPlanGlobal) object).getIdentificadorAnoPap());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + PgAnosPlanGlobal.class.getName());
            }
        }
    }

    @FacesConverter(forClass = TipoDeMetas.class)
    public static class TipoDeMetasConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent uic, String value) {
            PlanGlobalBean pgB = (PlanGlobalBean) facesContext.getApplication().getELResolver().getValue(facesContext.getELContext(), null, "planGlobalBean");

            if (value == null || value.length() == 0) {
                return null;
            }

            return pgB.getTipoMetaByKey(getKey(value));
        }

        Integer getKey(String value) {
            Integer key;
            key = new Integer(value);
            return key;
        }

        String getStringKey(Integer value) {
            return value.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent uic, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof TipoDeMetas) {
                return getStringKey(((TipoDeMetas) object).getIdTipoMeta());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + TipoDeMetas.class.getName());
            }
        }
    }

    public Boolean getVisibleComponentes() {
        return visibleComponentes;
    }

    public Boolean getVisibleAnhoPap() {
        return visibleAnhoPap;
    }

    public String getNombreFtePpal() {
        return nombreFtePpal;
    }

    public String getNombreFteCont() {
        return nombreFteCont;
    }

    public Boolean getDeshabilitarRecurso() {
        return deshabilitarRecurso;
    }

    public PoaRecursosSaldos getRecursoFtePpal() {
        return recursoFtePpal;
    }

    public void setRecursoFtePpal(PoaRecursosSaldos recursoFtePpal) {
        this.recursoFtePpal = recursoFtePpal;
    }

    public PoaRecursosSaldos getRecursoFteCont() {
        return recursoFteCont;
    }

    public void setRecursoFteCont(PoaRecursosSaldos recursoFteCont) {
        this.recursoFteCont = recursoFteCont;
    }

    public List<CategoriasDto> getLstCategorias() {
        return planGlobalBo.getCategoriasDto(idConvenio);
    }

    public List<ComponentesDto> getLstComponentes() {
        return planGlobalBo.getComponentesDto(idConvenio);
    }

    public List<MontosPapDto> getLstMontoPap() {
        return planGlobalBo.getMontoPapByConvenio(idConvenio);
    }

    public Integer getIdPoa() {
        return idPoa;
    }

    public void setIdPoa(Integer idPoa) {
        this.idPoa = idPoa;
    }

    public void handleDateSelect(SelectEvent event) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        String parametro = facesContext.getExternalContext().getRequestParameterMap().get("parametro");
        SimpleDateFormat format = new SimpleDateFormat("d/M/yyyy");
        RequestContext.getCurrentInstance().update("tblActividades:" + parametro + ":calendario");
    }
}