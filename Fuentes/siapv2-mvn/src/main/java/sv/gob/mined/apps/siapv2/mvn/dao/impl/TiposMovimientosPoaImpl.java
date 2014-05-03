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
import sv.gob.mined.apps.siapv2.mvn.dao.TiposMovimientosPoaDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.TiposMovimientosPoa;

/**
 *
 * @author Infosoft
 */
@Repository
public class TiposMovimientosPoaImpl implements TiposMovimientosPoaDao {

    public TiposMovimientosPoaImpl() {
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
    public List<TiposMovimientosPoa> findAll() {
        String sql = "SELECT * FROM tipos_movimientos_poa";
        List<TiposMovimientosPoa> tiposmovimientospoa = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(TiposMovimientosPoa.class));
        return tiposmovimientospoa;
    }
}
