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
import sv.gob.mined.apps.siapv2.mvn.dao.TipoDeCalendarioDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.TipoDeCalendario;

/**
 *
 * @author RCeron
 */
@Repository
public class TipoDeCalendarioDaoImpl implements TipoDeCalendarioDao {

    public TipoDeCalendarioDaoImpl() {
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
    public List<TipoDeCalendario> findAll() {
        String sql = "SELECT * FROM TipoDeCalendario";
        List<TipoDeCalendario> tipodecalendario = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(TipoDeCalendario.class));
        return tipodecalendario;
    }
}
