/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import sv.gob.mined.apps.siapv2.mvn.dao.DetalleMacroProcAplicableDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.DetalleMacroProcAplicable;

/**
 *
 * @author Infosoft
 */
@Repository
public class DetalleMacroProcAplicableDaoImpl implements DetalleMacroProcAplicableDao {

    public DetalleMacroProcAplicableDaoImpl() {
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
    public List<DetalleMacroProcAplicable> findAll() {
        String sql = "SELECT * FROM DetalleMacroProcAplicable";
        List<DetalleMacroProcAplicable> detallemacroprocaplicable = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(DetalleMacroProcAplicable.class));
        return detallemacroprocaplicable;
    }
    
}
