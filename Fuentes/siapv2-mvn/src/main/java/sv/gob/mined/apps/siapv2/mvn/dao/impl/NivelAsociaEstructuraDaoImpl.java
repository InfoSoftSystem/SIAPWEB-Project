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
import sv.gob.mined.apps.siapv2.mvn.dao.NivelAsociaEstructuraDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.NivelAsociaEstructura;

/**
 *
 * @author Infosoft
 */
@Repository
public class NivelAsociaEstructuraDaoImpl implements NivelAsociaEstructuraDao{

    public NivelAsociaEstructuraDaoImpl() {
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
    public List<NivelAsociaEstructura> findAll() {
        String sql = "SELECT * FROM NivelAsociaEstructura";
        List<NivelAsociaEstructura> nivelasociaestructura = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(NivelAsociaEstructura.class));
        return nivelasociaestructura;
    }
    
}
