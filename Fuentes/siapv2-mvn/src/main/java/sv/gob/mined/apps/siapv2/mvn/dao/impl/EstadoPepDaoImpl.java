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
import sv.gob.mined.apps.siapv2.mvn.dao.EstadoPepDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.EstadoPep;

/**
 *
 * @author Infosoft
 */
@Repository
public class EstadoPepDaoImpl implements EstadoPepDao{

    public EstadoPepDaoImpl() {
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
    public List<EstadoPep> findAll() {
        String sql = "SELECT * FROM estado_pep";
        List<EstadoPep> estadopep = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(EstadoPep.class));
        return estadopep;
    }
    
}
