/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao;

import java.util.List;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgAnosPlanGlobal;

/**
 *
 * 
 */
public interface PgAnosPlanGlobalDao {
   public List<PgAnosPlanGlobal> findAll();
   public List<PgAnosPlanGlobal> findAllByConvenio(Integer convenio);
   public PgAnosPlanGlobal findByKey(Integer id);
}
