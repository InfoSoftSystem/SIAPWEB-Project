/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao;

import java.util.List;
import sv.gob.mined.apps.siapv2.mvn.modelo.RescisionesOferente;
import sv.gob.mined.apps.siapv2.mvn.modelo.view.VwRescisionesEmpresa;

/**
 *
 * @author Infosoft
 */
public interface RescisionesOferenteDao {

    public List<VwRescisionesEmpresa> findAllByOferente(Integer identificadorPrimarioOferente);
    
    public RescisionesOferente findById(Integer idRescision);

    public int create();

    public int update();

    public void setRescisionOferente(RescisionesOferente rescision);
}
