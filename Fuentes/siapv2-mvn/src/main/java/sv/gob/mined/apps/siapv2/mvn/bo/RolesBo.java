/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.bo;

import java.util.List;
import sv.gob.mined.apps.siapv2.mvn.modelo.ActorDelProceso;
import sv.gob.mined.apps.siapv2.mvn.modelo.GEstructuraOrganizativa;
import sv.gob.mined.apps.siapv2.mvn.modelo.MacroProcesos;
import sv.gob.mined.apps.siapv2.mvn.modelo.TipoRolControl;

/**
 *
 * @author Infosoft
 */
public interface RolesBo {
    public List<MacroProcesos> getLstMacroProcesos();
    public List<GEstructuraOrganizativa> getLstGEstructuraOrganizativa();
    public List<ActorDelProceso> getLstActorDelProceso();
    public List<TipoRolControl> getLstTipoRolControl();
}
