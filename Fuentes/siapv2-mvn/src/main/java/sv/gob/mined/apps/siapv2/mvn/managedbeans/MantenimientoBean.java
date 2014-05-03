/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.managedbeans;

import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import sv.gob.mined.apps.siapv2.mvn.bo.ReprogramacionBo;
import sv.gob.mined.apps.siapv2.mvn.modelo.TiposPoaReprogramaciones;

/**
 *
 * @author Infosoft
 */
@Component(value = "mantenimientoBean")
@Scope(value = "view")
public class MantenimientoBean {
    private List<TiposPoaReprogramaciones> lstTiposPoaReprogramaciones;
    
    @Autowired
    ReprogramacionBo reprogramacionBo;
    
    public MantenimientoBean() {
    }
    
    @PostConstruct
    public void init(){
        lstTiposPoaReprogramaciones = reprogramacionBo.findAllTiposPoaReprogramaciones();
    }
    
    public void nuevo(){
        lstTiposPoaReprogramaciones.add(new TiposPoaReprogramaciones());
    }

    public List<TiposPoaReprogramaciones> getLstTiposPoaReprogramaciones() {
        return lstTiposPoaReprogramaciones;
    }

    public void setLstTiposPoaReprogramaciones(List<TiposPoaReprogramaciones> lstTiposPoaReprogramaciones) {
        this.lstTiposPoaReprogramaciones = lstTiposPoaReprogramaciones;
    }
    public ReprogramacionBo getReprogramacionBo() {
        return reprogramacionBo;
    }

    public void setReprogramacionBo(ReprogramacionBo reprogramacionBo) {
        this.reprogramacionBo = reprogramacionBo;
    }
}