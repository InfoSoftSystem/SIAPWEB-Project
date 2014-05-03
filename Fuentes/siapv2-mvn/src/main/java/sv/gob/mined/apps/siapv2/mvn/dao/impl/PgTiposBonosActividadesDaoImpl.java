/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import sv.gob.mined.apps.siapv2.mvn.dao.PgTiposBonosActividadesDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgTiposBonosActividades;

/**
 *
 * 
 */
public class PgTiposBonosActividadesDaoImpl implements PgTiposBonosActividadesDao{

    public PgTiposBonosActividadesDaoImpl() {
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
    public List<PgTiposBonosActividades> findAll() {
        String sql = "SELECT * FROM pg_tipos_bonos_actividades";
        List<PgTiposBonosActividades> pgresponsablesentidadesfinancieras = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PgTiposBonosActividades.class));
        return pgresponsablesentidadesfinancieras;
    }
    
}
