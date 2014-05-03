/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import sv.gob.mined.apps.siapv2.mvn.dao.ActorDelProcesoDao;
import sv.gob.mined.apps.siapv2.mvn.dao.XJdbcTemplate;
import sv.gob.mined.apps.siapv2.mvn.modelo.ActorDelProceso;

/**
 *
 * @author 
 */
@Repository
public class ActorDelProcesoDaoImpl extends XJdbcTemplate implements ActorDelProcesoDao {

    @Override
    public List<ActorDelProceso> findAll() {
        String sql = "SELECT * FROM ActorDelProceso";
        return getJdbcTemplate().query(sql, new BeanPropertyRowMapper(ActorDelProceso.class));
        
    }
    
}
