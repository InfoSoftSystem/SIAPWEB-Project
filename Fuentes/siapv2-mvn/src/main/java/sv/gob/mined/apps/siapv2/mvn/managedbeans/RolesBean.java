/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.managedbeans;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import org.primefaces.component.datatable.DataTable;
import org.primefaces.context.RequestContext;
import org.primefaces.event.CellEditEvent;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.DualListModel;
import org.primefaces.model.TreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import sv.gob.mined.apps.siapv2.mvn.bo.RolesBo;
import sv.gob.mined.apps.siapv2.mvn.model.EntidadDataModel;
import sv.gob.mined.apps.siapv2.mvn.modelo.ActorDelProceso;
import sv.gob.mined.apps.siapv2.mvn.modelo.EntidadCincoListado;
import sv.gob.mined.apps.siapv2.mvn.modelo.EntidadCuatro;
import sv.gob.mined.apps.siapv2.mvn.modelo.EntidadDos;
import sv.gob.mined.apps.siapv2.mvn.modelo.EntidadSeis;
import sv.gob.mined.apps.siapv2.mvn.modelo.EntidadTres;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgActividades;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgMetas;
import sv.gob.mined.apps.siapv2.mvn.modelo.PoaRecursos;
import sv.gob.mined.apps.siapv2.mvn.modelo.EntidadUno;
import sv.gob.mined.apps.siapv2.mvn.modelo.GEstructuraOrganizativa;
import sv.gob.mined.apps.siapv2.mvn.modelo.MacroProcesos;
import sv.gob.mined.apps.siapv2.mvn.modelo.TipoRolControl;

/**
 *
 * @author infosoft
 */
@Component(value = "rolesBean")
@Scope(value = "view")
public class RolesBean {

    private Boolean showEstructuraOp = false;
    private Boolean showProcesosInst = false;
    private Boolean showPlantillaRoles = false;
    private Boolean showAsigRolesUsuarios = false;
    private Boolean showAsigRolesPorPlantilla = false;
    private Integer nivelEdicion = 1;
    private List<EntidadUno> entidades1 = new ArrayList<EntidadUno>();
    private List<MacroProcesos> listaMacroprocesos = new ArrayList<MacroProcesos>();
    private List<GEstructuraOrganizativa> listaGestructuraOrganizativa = new ArrayList<GEstructuraOrganizativa>();
    private List<ActorDelProceso> listaActorDelProceso = new ArrayList<ActorDelProceso>();
    private List<TipoRolControl> listaTipoRolControl = new ArrayList<TipoRolControl>();
    private List<EntidadDos> entidades2 = new ArrayList<EntidadDos>();
    private List<EntidadTres> entidades3 = new ArrayList<EntidadTres>();
    private List<EntidadCuatro> entidades4 = new ArrayList<EntidadCuatro>();
    private List<EntidadSeis> entidades6 = new ArrayList<EntidadSeis>();
    private EntidadDataModel model;
    private List<EntidadTres> listaselected = new ArrayList<EntidadTres>();
    private DualListModel<EntidadCincoListado> usuarios;
    private TreeNode treePlanDeTrabajo;
    @Autowired
    private RolesBo rolesBo;

    /**
     * Creates a new instance of RolesBean
     */
    public RolesBean() {
        llenarValores();
        model = new EntidadDataModel(entidades3);

    }
      @PostConstruct
    public void init() {
        this.listaMacroprocesos = rolesBo.getLstMacroProcesos();
        this.listaGestructuraOrganizativa = rolesBo.getLstGEstructuraOrganizativa();
        this.listaActorDelProceso = rolesBo.getLstActorDelProceso();
        
    }

    private void llenarValores() {        
        EntidadUno valor1 = new EntidadUno();
        valor1.setId(1);
        valor1.setValor("Planificacion");
        this.entidades1.add(valor1);
        EntidadUno valor2 = new EntidadUno();
        valor2.setId(2);
        valor2.setValor("Programacion");
        this.entidades1.add(valor2);

        EntidadUno valor3 = new EntidadUno();
        valor3.setId(3);
        valor3.setValor("Presupuestacion");
        this.entidades1.add(valor3);

        EntidadDos ent2valor2 = new EntidadDos();
        ent2valor2.setId(1);
        ent2valor2.setDescripcion("Presupuesto");
        this.entidades2.add(ent2valor2);

        EntidadDos ent2valor3 = new EntidadDos();
        ent2valor3.setId(2);
        ent2valor3.setDescripcion("Proyectos");
        this.entidades2.add(ent2valor3);

        EntidadTres ent4valor1 = new EntidadTres();
        ent4valor1.setId(1);
        ent4valor1.setNombreEntidad("UACI");
        ent4valor1.setAsociadoHerramienta(true);
        this.entidades3.add(ent4valor1);
        EntidadTres ent4valor2 = new EntidadTres();
        ent4valor2.setId(2);
        ent4valor2.setNombreEntidad("Negociacion");
        ent4valor2.setAsociadoHerramienta(false);
        this.entidades3.add(ent4valor2);
        EntidadTres ent4valor3 = new EntidadTres();
        ent4valor3.setId(3);
        ent4valor3.setNombreEntidad("oferta");
        ent4valor3.setAsociadoHerramienta(false);
        this.entidades3.add(ent4valor3);

        EntidadCuatro ent5valor1 = new EntidadCuatro();
        ent5valor1.setId(1);
        ent5valor1.setProcedimiento("Mantenimientos");
        ent5valor1.setDisponible(true);
        ent5valor1.setCrear(true);
        ent5valor1.setModificar(true);
        ent5valor1.setGuardar(false);
        this.entidades4.add(ent5valor1);

        EntidadCuatro ent5valor2 = new EntidadCuatro();
        ent5valor2.setId(2);
        ent5valor2.setProcedimiento("Procesos");
        ent5valor2.setDisponible(false);
        ent5valor2.setCrear(true);
        ent5valor2.setModificar(false);
        ent5valor2.setGuardar(true);
        this.entidades4.add(ent5valor2);
        llenarPickListUsuarios();
        llenarTreePlanDeTrabajo();

        //-------llenar entidad6------------------

        EntidadSeis ent6 = new EntidadSeis();
        ent6.setId(1);
        ent6.setNombre("NIVEL DE PLAN DE TRABAJO-ACCESO A TODA LA INSTITUCION");
        this.entidades6.add(ent6);
        ent6 = new EntidadSeis();
        ent6.setId(2);
        ent6.setNombre("NIVEL DE PLAN DE TRABAJO-ACCESO A LAS DIRECCIONES NACIONALES");
        this.entidades6.add(ent6);

        ent6 = new EntidadSeis();
        ent6.setId(3);
        ent6.setNombre("NIVEL DE PLAN DE TRABAJO-ACCESO A LOS DEPARTAMENTOS DE UNA DIRECCION");
        this.entidades6.add(ent6);

        ent6 = new EntidadSeis();
        ent6.setId(4);
        ent6.setNombre("NIVEL DE FUENTES DE FINANCIAMIENTO GESTOS DE FUNCIONAMIENTO Y ACTIVIDADES");
        this.entidades6.add(ent6);

    }

    public void cerrarPopupEstructuraOp() {
        nivelEdicion -= 1;
        showEstructuraOp = true;
    }

    public void cerrarPopupProcesosInst() {
        nivelEdicion -= 1;
        showProcesosInst = true;
    }

    public void cerrarPopupPlantillaRoles() {
        nivelEdicion -= 1;
        showPlantillaRoles = true;
    }
    
     public void newUsers() {        
         System.out.println("este es mi metodo");
         showAsigRolesUsuarios=false;
         showAsigRolesPorPlantilla=true;
         RequestContext.getCurrentInstance().execute("dlgAsigRolesPorPlantilla.show();");
         RequestContext.getCurrentInstance().update("frmPrincipal:dlgAsigRolesUsuarios");
    }

    public void cerrarPopupRolesUsuario() {
        nivelEdicion -= 1;
        showAsigRolesUsuarios = true;
    }

    public void cerrarPopupRolesPorPlantilla() {
        nivelEdicion -= 1;
        showAsigRolesUsuarios = true;
        RequestContext.getCurrentInstance().update("frmPrincipal:dlgAsigRolesUsuarios");
        RequestContext.getCurrentInstance().execute("dlgAsigRolesUsuarios.show();");
    }

    private void llenarPickListUsuarios() {
        usuarios = new DualListModel<EntidadCincoListado>();
        List<EntidadCincoListado> usuariosSource = new ArrayList<EntidadCincoListado>();
        List<EntidadCincoListado> usuariosTarget = new ArrayList<EntidadCincoListado>();

        EntidadCincoListado ent1 = new EntidadCincoListado();
        ent1.setId(1);
        ent1.setUsuario("Jose");

        EntidadCincoListado ent2 = new EntidadCincoListado();
        ent2.setId(2);
        ent2.setUsuario("Alex");

        EntidadCincoListado ent3 = new EntidadCincoListado();
        ent3.setId(3);
        ent3.setUsuario("Henry");
        usuariosSource.add(ent1);
        usuariosSource.add(ent2);
        usuariosTarget.add(ent3);
        usuarios = new DualListModel<EntidadCincoListado>(usuariosSource, usuariosTarget);
    }

    public void nuevo() {
        switch (nivelEdicion) {
            case 1:
                showEstructuraOp = true;
                PgMetas meta = new PgMetas(0);
                meta.setDescripcion(" ");
                meta.setActivo(1);
                meta.setMontoBanco(BigDecimal.ZERO);
                meta.setMontoGoes(BigDecimal.ZERO);
                //meta.setComponente(idComponente);
                //lstMetas.add(meta);
                break;
            case 2:
                PgActividades actividad = new PgActividades(0);
                actividad.setFinanciamientoBanco(BigDecimal.ZERO);
                actividad.setFinanciamientoGoes(BigDecimal.ZERO);
                // actividad.setPgMeta(pgMeta);
                //lstActividades.add(actividad);
                break;
            case 3:
                PoaRecursos recurso = new PoaRecursos(0);
                // recurso.setActividad(currentActividad.getActividad());
                recurso.setPrecioUnitario(BigDecimal.ZERO);
                recurso.setCantidad(0);
                // lstRecuros.add(recurso);
                break;
        }
    }

    public void llenarTreePlanDeTrabajo() {
        treePlanDeTrabajo = new DefaultTreeNode("Root", null);
        TreeNode node0 = new DefaultTreeNode("1.Plan de Trabajo", treePlanDeTrabajo);

        TreeNode node00 = new DefaultTreeNode("2.Fuente de Financiamiento", node0);

        TreeNode node000 = new DefaultTreeNode("3.Plan Operativo Anual y Plan de Accion del Proyecto(PAP)", node00);

        TreeNode node001 = new DefaultTreeNode("4.Meta", node000);

        TreeNode node011 = new DefaultTreeNode("5.Actividad", node001);

        TreeNode node010 = new DefaultTreeNode("6.Recursos Financieros", node011);



    }

    public void onCellEditMeta(CellEditEvent event) {
        DataTable tbl = (DataTable) event.getSource();
        RequestContext.getCurrentInstance().update(tbl.getClientId(FacesContext.getCurrentInstance()) + ":" + event.getRowIndex() + ":modelInput");
        RequestContext.getCurrentInstance().update("frmPrincipal:tblProcedimientos:modelInput");

    }

    public List<EntidadUno> getEntidades1() {
        return entidades1;
    }

    public void setEntidades1(List<EntidadUno> entidades1) {
        this.entidades1 = entidades1;
    }

    public List<EntidadDos> getEntidades2() {
        return entidades2;
    }

    public void setEntidades2(List<EntidadDos> entidades2) {
        this.entidades2 = entidades2;
    }

    public List<EntidadTres> getEntidades3() {
        return entidades3;
    }

    public void setEntidades3(List<EntidadTres> entidades3) {
        this.entidades3 = entidades3;
    }

    public List<EntidadCuatro> getEntidades4() {
        return entidades4;
    }

    public void setEntidades4(List<EntidadCuatro> entidades4) {
        this.entidades4 = entidades4;
    }

    public List<EntidadTres> getListaselected() {
        return listaselected;
    }

    public void setListaselected(List<EntidadTres> listaselected) {
        this.listaselected = listaselected;
    }

    public EntidadDataModel getModel() {
        return model;
    }

    public void setModel(EntidadDataModel model) {
        this.model = model;
    }

    public DualListModel<EntidadCincoListado> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(DualListModel<EntidadCincoListado> usuarios) {
        this.usuarios = usuarios;
    }

    public Boolean getShowEstructuraOp() {
        return showEstructuraOp;
    }

    public void setShowEstructuraOp(Boolean showEstructuraOp) {
        this.showEstructuraOp = showEstructuraOp;
    }

    public Boolean getShowProcesosInst() {
        return showProcesosInst;
    }

    public void setShowProcesosInst(Boolean showProcesosInst) {
        this.showProcesosInst = showProcesosInst;
    }

    public Boolean getShowPlantillaRoles() {
        return showPlantillaRoles;
    }

    public void setShowPlantillaRoles(Boolean showPlantillaRoles) {
        this.showPlantillaRoles = showPlantillaRoles;
    }

    public Boolean getShowAsigRolesUsuarios() {
        return showAsigRolesUsuarios;
    }

    public void setShowAsigRolesUsuarios(Boolean showAsigRolesUsuarios) {
        this.showAsigRolesUsuarios = showAsigRolesUsuarios;
    }

    public Boolean getShowAsigRolesPorPlantilla() {
        return showAsigRolesPorPlantilla;
    }

    public void setShowAsigRolesPorPlantilla(Boolean showAsigRolesPorPlantilla) {
        this.showAsigRolesPorPlantilla = showAsigRolesPorPlantilla;
    }

    public TreeNode getTreePlanDeTrabajo() {
        return treePlanDeTrabajo;
    }

    public List<EntidadSeis> getEntidades6() {
        return entidades6;
    }

    public void setEntidades6(List<EntidadSeis> entidades6) {
        this.entidades6 = entidades6;
    }

    public List<MacroProcesos> getListaMacroprocesos() {
        return listaMacroprocesos;
    }

    public void setListaMacroprocesos(List<MacroProcesos> listaMacroprocesos) {
        this.listaMacroprocesos = listaMacroprocesos;
    }

    public List<GEstructuraOrganizativa> getListaGestructuraOrganizativa() {
        return listaGestructuraOrganizativa;
    }

    public void setListaGestructuraOrganizativa(List<GEstructuraOrganizativa> listaGestructuraOrganizativa) {
        this.listaGestructuraOrganizativa = listaGestructuraOrganizativa;
    }

    public List<ActorDelProceso> getListaActorDelProceso() {
        return listaActorDelProceso;
    }

    public void setListaActorDelProceso(List<ActorDelProceso> listaActorDelProceso) {
        this.listaActorDelProceso = listaActorDelProceso;
    }

    public List<TipoRolControl> getListaTipoRolControl() {
        return listaTipoRolControl;
    }

    public void setListaTipoRolControl(List<TipoRolControl> listaTipoRolControl) {
        this.listaTipoRolControl = listaTipoRolControl;
    }
        
}
