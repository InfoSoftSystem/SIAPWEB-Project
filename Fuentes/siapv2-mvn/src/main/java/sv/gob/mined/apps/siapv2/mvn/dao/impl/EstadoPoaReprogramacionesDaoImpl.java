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
import sv.gob.mined.apps.siapv2.mvn.dao.EstadoPoaReprogramacionesDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.EstadoPoaReprogramaciones;

/**
 *
 * @author Infosoft
 */
@Repository
public class EstadoPoaReprogramacionesDaoImpl implements EstadoPoaReprogramacionesDao {

    public EstadoPoaReprogramacionesDaoImpl() {
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
    public List<EstadoPoaReprogramaciones> findAll() {
        String sql = "SELECT * FROM estado_poa_reprogramaciones";
        List<EstadoPoaReprogramaciones> estadopoareprogramamciones = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(EstadoPoaReprogramaciones.class));
        return estadopoareprogramamciones;
    }
}
