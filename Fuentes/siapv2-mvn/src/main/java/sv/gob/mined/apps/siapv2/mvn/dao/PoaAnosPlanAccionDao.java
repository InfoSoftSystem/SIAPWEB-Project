/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao;

import java.util.List;
import sv.gob.mined.apps.siapv2.mvn.modelo.PoaAnosPlanAccion;

/**
 *
 *
 */
public interface PoaAnosPlanAccionDao {

    public List<PoaAnosPlanAccion> findAll();

    public PoaAnosPlanAccion getAnhoByAnoPlanGlobal(Integer idAnhoPG);
    
    public List<PoaAnosPlanAccion> getAnhoByConvenio(Integer convenio);
}