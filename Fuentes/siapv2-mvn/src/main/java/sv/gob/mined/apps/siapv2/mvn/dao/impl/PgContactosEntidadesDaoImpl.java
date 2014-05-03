/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import sv.gob.mined.apps.siapv2.mvn.dao.PgContactosEntidadesDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgContactosEntidades;

/**
 *
 * 
 */
public class PgContactosEntidadesDaoImpl implements PgContactosEntidadesDao{

    public PgContactosEntidadesDaoImpl() {
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
    public List<PgContactosEntidades> findAll() {
        String sql = "SELECT * FROM pg_contactos_entidades";
        List<PgContactosEntidades> pgcontactoentidades = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PgContactosEntidades.class));
        return pgcontactoentidades;
    }
    
}
