/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.managedbeans;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import org.primefaces.event.NodeSelectEvent;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import sv.gob.mined.apps.siapv2.mvn.modelo.OpcionMenu;

/**
 *
 * @author Infosoft
 */
@Component(value = "menuTreeBean")
@Scope(value = "view")
public class MenuTreeBean {

    private TreeNode root;
    private TreeNode rootBn;
    private TreeNode selected;

    public MenuTreeBean() {
    }

    @PostConstruct
    public void init() {
        root = new DefaultTreeNode("root", null);
        TreeNode node = new DefaultTreeNode("POA, Reprogramaciones, Roles", root);
        TreeNode node0 = new DefaultTreeNode(new OpcionMenu("Planes Globales", "/app/regPlanGlobal2.jsf"), node);
        TreeNode node1 = new DefaultTreeNode(new OpcionMenu("Reprogramaciones POA", "/app/regReprogramacion.jsf"), node);
        TreeNode node2 = new DefaultTreeNode(new OpcionMenu("Roles", ""), node);
        TreeNode node9 = new DefaultTreeNode(new OpcionMenu("Administracion de la Autorizacion", "/app/roles/regRoles.jsf"), node2);
        TreeNode node10 = new DefaultTreeNode(new OpcionMenu("Administracion de Acceso a Datos", "/app/roles/regRolesAutorizacion.jsf"), node2);
        node2.setExpanded(true);
        node.setExpanded(true);

        TreeNode node3 = new DefaultTreeNode(new OpcionMenu("Translado de Oferentes", "/app/control/oferentes/regTrasladoOferentes.jsf"), root);
        TreeNode node4 = new DefaultTreeNode(new OpcionMenu("Control de Contratistas",""), root);
        TreeNode node5 = new DefaultTreeNode(new OpcionMenu("Regristo de Faltas", "/app/control/oferentes/regFaltas.jsf"), node4);
        TreeNode node6 = new DefaultTreeNode(new OpcionMenu("Regristo de Multas", "/app/control/oferentes/regMultas.jsf"), node4);
        TreeNode node7 = new DefaultTreeNode(new OpcionMenu("Regristo de Garantías", "/app/control/oferentes/regGarantias.jsf"), node4);
        TreeNode node8 = new DefaultTreeNode(new OpcionMenu("Regristo de Rescisiones", "/app/control/oferentes/regRescisiones.jsf"), node4);
        node4.setExpanded(true);
    }

    public TreeNode getRoot() {
        return root;
    }

    public TreeNode getRootBn() {
        return rootBn;
    }

    public TreeNode getSelected() {
        return selected;
    }

    public void setSelected(TreeNode selected) {
        this.selected = selected;
    }

    public void onNodeSelect(NodeSelectEvent event) {
        selected = event.getTreeNode();

        if (!(selected.getData() instanceof java.lang.String)) {
            FacesContext.getCurrentInstance().getApplication().getNavigationHandler().handleNavigation(FacesContext.getCurrentInstance(), "null", ((OpcionMenu) selected.getData()).getUrl() + "?faces-redirect=true");
        }
    }
}
