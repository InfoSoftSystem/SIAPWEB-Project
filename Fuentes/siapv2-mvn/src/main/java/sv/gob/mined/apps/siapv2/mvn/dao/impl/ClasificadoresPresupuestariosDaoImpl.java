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
import sv.gob.mined.apps.siapv2.mvn.dao.ClasificadoresPresupuestariosDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.ClasificadoresPresupuestarios;

/**
 *
 * @author Infosoft
 */
@Repository
public class ClasificadoresPresupuestariosDaoImpl implements ClasificadoresPresupuestariosDao{

    public ClasificadoresPresupuestariosDaoImpl() {
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
    public List<ClasificadoresPresupuestarios> findAll() {
        String sql = "SELECT * FROM clasificadores_presupuestarios";
        List<ClasificadoresPresupuestarios> clasificadorespresupuestarios = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(ClasificadoresPresupuestarios.class));
        return clasificadorespresupuestarios;
    }
}
