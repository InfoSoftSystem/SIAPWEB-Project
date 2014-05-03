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
import sv.gob.mined.apps.siapv2.mvn.dao.DetalleMacroConvenioDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.DetalleMacroConvenio;

/**
 *
 * @author Infosoft
 */
@Repository
public class DetalleMacroConvenioDaoImpl implements DetalleMacroConvenioDao{

    public DetalleMacroConvenioDaoImpl() {
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
    public List<DetalleMacroConvenio> findAll() {
        String sql = "SELECT * FROM DetalleMacroConvenio";
        List<DetalleMacroConvenio> detallemacroconvenio = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(DetalleMacroConvenio.class));
        return detallemacroconvenio;
    }
    
}
