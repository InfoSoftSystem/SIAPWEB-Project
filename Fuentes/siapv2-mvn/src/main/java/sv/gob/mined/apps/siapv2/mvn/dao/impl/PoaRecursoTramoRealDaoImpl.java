/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import sv.gob.mined.apps.siapv2.mvn.dao.PoaRecursoTramoRealDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.PoaRecursoTramoReal;

/**
 *
 * 
 */
public class PoaRecursoTramoRealDaoImpl implements PoaRecursoTramoRealDao{

    public PoaRecursoTramoRealDaoImpl() {
    }
     @Autowired
    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<PoaRecursoTramoReal> findAll() {
        String sql = "SELECT * FROM poa_recurso_tramo_real";
        List<PoaRecursoTramoReal> poarecursotramoreal = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PoaRecursoTramoReal.class));
        return poarecursotramoreal;
    }
    
}
