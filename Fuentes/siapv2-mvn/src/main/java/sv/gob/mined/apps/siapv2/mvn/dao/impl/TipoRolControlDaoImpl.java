/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import sv.gob.mined.apps.siapv2.mvn.dao.TipoRolControlDao;
import sv.gob.mined.apps.siapv2.mvn.dao.XJdbcTemplate;
import sv.gob.mined.apps.siapv2.mvn.modelo.TipoRolControl;

/**
 *
 * @author 
 */
@Repository
public class TipoRolControlDaoImpl extends XJdbcTemplate implements TipoRolControlDao{

    @Override
    public List<TipoRolControl> findAll() {
        String sql = "SELECT * FROM TipoRolControl";
        return getJdbcTemplate().query(sql, new BeanPropertyRowMapper(TipoRolControl.class));
    }
    
}
