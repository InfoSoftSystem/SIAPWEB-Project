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
import sv.gob.mined.apps.siapv2.mvn.dao.PgEstadoPlanAccionDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgEstadoPlanAccion;

/**
 *
 * @author Infosoft
 */
@Repository
public class PgEstadoPlanAccionDaoImpl implements PgEstadoPlanAccionDao {

    public PgEstadoPlanAccionDaoImpl() {
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
    public List<PgEstadoPlanAccion> findAll() {
        String sql = "SELECT * FROM pg_estado_plan_accion";
        List<PgEstadoPlanAccion> pgestadoplanaccion = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PgEstadoPlanAccion.class));
        return pgestadoplanaccion;
    }
    
}
