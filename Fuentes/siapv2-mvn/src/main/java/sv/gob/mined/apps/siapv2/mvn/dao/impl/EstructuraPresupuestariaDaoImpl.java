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
import sv.gob.mined.apps.siapv2.mvn.dao.EstructuraPresupuestariaDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.EstructuraPresupuestaria;

/**
 *
 * @author Infosoft
 */
@Repository
public class EstructuraPresupuestariaDaoImpl implements EstructuraPresupuestariaDao {

    public EstructuraPresupuestariaDaoImpl() {
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
    public List<EstructuraPresupuestaria> findAll() {
        String sql = "SELECT * FROM estructura_presupuestaria";
        List<EstructuraPresupuestaria> estructuraspresupuestarias = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(EstructuraPresupuestaria.class));
        return estructuraspresupuestarias;
    }
}
