/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import sv.gob.mined.apps.siapv2.mvn.dao.PoaReprogramacionesDetalleEstadosDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.PoaReprogramacionesDetalleEstados;

/**
 *
 * 
 */
public class PoaReprogramacionesDetalleEstadosDaoImpl implements PoaReprogramacionesDetalleEstadosDao{

    public PoaReprogramacionesDetalleEstadosDaoImpl() {
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
    public List<PoaReprogramacionesDetalleEstados> findAll() {
        String sql = "SELECT * FROM poa_reprogramaciones_detalle_estados";
        List<PoaReprogramacionesDetalleEstados> poareprogramacionesdetalleestados = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PoaReprogramacionesDetalleEstados.class));
        return poareprogramacionesdetalleestados; 
    }
    
}
