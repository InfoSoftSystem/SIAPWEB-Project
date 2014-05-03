/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import sv.gob.mined.apps.siapv2.mvn.dao.MacroProcesosDao;
import sv.gob.mined.apps.siapv2.mvn.dao.XJdbcTemplate;
import sv.gob.mined.apps.siapv2.mvn.modelo.MacroProcesos;

/**
 *
 * @author infosoft
 */
@Repository
public class MacroProcesosDaoImpl extends XJdbcTemplate implements MacroProcesosDao {

    @Override
    public List<MacroProcesos> findAll() {
         String sql = "select * from MacroProcesos";
        return getJdbcTemplate().query(sql, new BeanPropertyRowMapper(MacroProcesos.class));
    }
    
}
