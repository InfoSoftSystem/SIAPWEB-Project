/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import sv.gob.mined.apps.siapv2.mvn.dao.PoaReprogramacionesDetalleTiposMovDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.PoaReprogramacionesDetalleTiposMov;

/**
 *
 * 
 */
public class PoaReprogramacionesDetalleTiposMovDaoImpl implements PoaReprogramacionesDetalleTiposMovDao{

    public PoaReprogramacionesDetalleTiposMovDaoImpl() {
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
    public List<PoaReprogramacionesDetalleTiposMov> findAll() {
        String sql = "SELECT * FROM poa_reprogramaciones_detalle_tipos_mov";
        List<PoaReprogramacionesDetalleTiposMov> poareprogramacionesdetallestiposmov = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PoaReprogramacionesDetalleTiposMov.class));
        return poareprogramacionesdetallestiposmov; 
    }
    
}
