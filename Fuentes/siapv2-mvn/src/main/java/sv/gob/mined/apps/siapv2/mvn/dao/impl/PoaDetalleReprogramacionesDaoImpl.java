/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import sv.gob.mined.apps.siapv2.mvn.dao.PoaDetalleReprogramacionesDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.PoaDetalleReprogramaciones;

/**
 *
 *
 */
public class PoaDetalleReprogramacionesDaoImpl implements PoaDetalleReprogramacionesDao {

    public PoaDetalleReprogramacionesDaoImpl() {
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
    public List<PoaDetalleReprogramaciones> findAll() {
        String sql = "SELECT * FROM poa_detalle_reprogramaciones";
        List<PoaDetalleReprogramaciones> poadetallereprogramacion = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PoaDetalleReprogramaciones.class));
        return poadetallereprogramacion;
    }
}
