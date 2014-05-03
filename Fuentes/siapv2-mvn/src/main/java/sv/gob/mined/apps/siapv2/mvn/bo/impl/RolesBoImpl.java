/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.bo.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.gob.mined.apps.siapv2.mvn.bo.RolesBo;
import sv.gob.mined.apps.siapv2.mvn.dao.ActorDelProcesoDao;
import sv.gob.mined.apps.siapv2.mvn.dao.GEstructuraOrganizativaDao;
import sv.gob.mined.apps.siapv2.mvn.dao.MacroProcesosDao;
import sv.gob.mined.apps.siapv2.mvn.dao.TipoRolControlDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.ActorDelProceso;
import sv.gob.mined.apps.siapv2.mvn.modelo.GEstructuraOrganizativa;
import sv.gob.mined.apps.siapv2.mvn.modelo.MacroProcesos;
import sv.gob.mined.apps.siapv2.mvn.modelo.TipoRolControl;

/**
 *
 * @author 
 */
@Service
public class RolesBoImpl implements RolesBo{

    public RolesBoImpl() {
    }
    @Autowired
    private  MacroProcesosDao macroprocesodao;
    @Autowired
    private GEstructuraOrganizativaDao gestruturaOrganizativadao;
    @Autowired
    private ActorDelProcesoDao actordelprocesodao;
    @Autowired
    private TipoRolControlDao tipoRolControlDao;

    @Override
    public List<MacroProcesos> getLstMacroProcesos() {
        return macroprocesodao.findAll();
    }

    @Override
    public List<GEstructuraOrganizativa> getLstGEstructuraOrganizativa() {
        return gestruturaOrganizativadao.findAll();
    }

    @Override
    public List<ActorDelProceso> getLstActorDelProceso() {
        return actordelprocesodao.findAll();
    }

    @Override
    public List<TipoRolControl> getLstTipoRolControl() {
        return tipoRolControlDao.findAll();
    }
    
}
