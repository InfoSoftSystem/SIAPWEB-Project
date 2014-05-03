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
import sv.gob.mined.apps.siapv2.mvn.dao.EstadoMovimientosPresupuestariosDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.EstadoMovimientosPresupuestarios;

/**
 *
 * @author Infosoft
 */
@Repository
public class EstadoMovimientosPresupuestariosDaoImpl implements EstadoMovimientosPresupuestariosDao {

    public EstadoMovimientosPresupuestariosDaoImpl() {
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
    public List<EstadoMovimientosPresupuestarios> findAll() {
        String sql = "SELECT * FROM estado_movimientos_presupuestarios";
        List<EstadoMovimientosPresupuestarios> estadomovimientospresupuestarios = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(EstadoMovimientosPresupuestarios.class));
        return estadomovimientospresupuestarios;
    }
}
