/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import sv.gob.mined.apps.siapv2.mvn.dao.DetallePepDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.DetallePep;

/**
 *
 * 
 */
public class DetallePepDaoImpl implements DetallePepDao{

    public DetallePepDaoImpl() {
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
    public List<DetallePep> findAll() {
        String sql = "SELECT * FROM detalle_pep";
        List<DetallePep> detallepep = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(DetallePep.class));
        return detallepep;
    }
    
}
