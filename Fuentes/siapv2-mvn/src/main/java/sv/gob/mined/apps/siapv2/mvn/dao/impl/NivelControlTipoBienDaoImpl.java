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
import sv.gob.mined.apps.siapv2.mvn.dao.NivelControlTipoBienDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.NivelControlTipoBien;

/**
 *
 * @author RCeron
 */
@Repository
public class NivelControlTipoBienDaoImpl implements NivelControlTipoBienDao {

    public NivelControlTipoBienDaoImpl() {
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
    public List<NivelControlTipoBien> findAll() {
        String sql = "SELECT * FROM NivelControlTipoBien";
        List<NivelControlTipoBien> nivelcontroltipobien = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(NivelControlTipoBien.class));
        return nivelcontroltipobien;
    }
    
}
