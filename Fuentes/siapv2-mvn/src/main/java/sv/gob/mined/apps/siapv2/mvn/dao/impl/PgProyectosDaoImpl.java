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
import sv.gob.mined.apps.siapv2.mvn.dao.PgProyectosDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgProyectos;

/**
 *
 * @author Infosoft
 */
@Repository
public class PgProyectosDaoImpl implements PgProyectosDao{

    public PgProyectosDaoImpl() {
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
    public List<PgProyectos> findAll() {
        String sql = "SELECT * FROM pg_proyectos";
        List<PgProyectos> tiposactividad = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PgProyectos.class));
        return tiposactividad;
    }
}
