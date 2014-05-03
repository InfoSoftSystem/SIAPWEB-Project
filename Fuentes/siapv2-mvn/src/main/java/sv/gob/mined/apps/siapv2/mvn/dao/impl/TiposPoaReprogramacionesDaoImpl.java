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
import sv.gob.mined.apps.siapv2.mvn.dao.TiposPoaReprogramacionesDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.TiposPoaReprogramaciones;

/**
 *
 * @author Infosoft
 */
@Repository
public class TiposPoaReprogramacionesDaoImpl implements TiposPoaReprogramacionesDao {

    public TiposPoaReprogramacionesDaoImpl() {
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
    public List<TiposPoaReprogramaciones> findAll() {
        String sql = "SELECT * FROM tipos_poa_reprogramaciones";
        List<TiposPoaReprogramaciones> tipospoareprogramciones = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(TiposPoaReprogramaciones.class));
        return tipospoareprogramciones;
    }
}
