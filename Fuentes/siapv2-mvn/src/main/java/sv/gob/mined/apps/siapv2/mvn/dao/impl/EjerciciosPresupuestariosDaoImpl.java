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
import sv.gob.mined.apps.siapv2.mvn.dao.EjerciciosPresupuestariosDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.EjerciciosPresupuestarios;

/**
 *
 * @author Infosoft
 */
@Repository
public class EjerciciosPresupuestariosDaoImpl implements EjerciciosPresupuestariosDao {

    public EjerciciosPresupuestariosDaoImpl() {
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
    public List<EjerciciosPresupuestarios> findAll() {
        String sql = "SELECT * FROM ejercicios_presupuestarios";
        List<EjerciciosPresupuestarios> ejerciciospresupuestarios = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(EjerciciosPresupuestarios.class));
        return ejerciciospresupuestarios;
    }
}
