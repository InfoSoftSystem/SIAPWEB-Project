/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import sv.gob.mined.apps.siapv2.mvn.modelo.DetalleMacroProcAplicable;

/**
 *
 * @author Infosoft
 */
@Repository
public interface DetalleMacroProcAplicableDao {
    public List<DetalleMacroProcAplicable> findAll();
}
