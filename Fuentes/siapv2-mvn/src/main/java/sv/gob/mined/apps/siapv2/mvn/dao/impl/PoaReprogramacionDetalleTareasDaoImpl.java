/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import sv.gob.mined.apps.siapv2.mvn.dao.PoaReprogramacionDetalleTareasDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.PoaReprogramacionDetalleTareas;

/**
 *
 * 
 */
public class PoaReprogramacionDetalleTareasDaoImpl implements PoaReprogramacionDetalleTareasDao{

    public PoaReprogramacionDetalleTareasDaoImpl() {
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
    public List<PoaReprogramacionDetalleTareas> findAll() {
        String sql = "SELECT * FROM poa_reprogramacion_detalle_tareas";
        List<PoaReprogramacionDetalleTareas> poareprogramciondetalletareas = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PoaReprogramacionDetalleTareas.class));
        return poareprogramciondetalletareas; 
    }
    
}
