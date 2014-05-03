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
import sv.gob.mined.apps.siapv2.mvn.dao.PgTiposBonosDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgTiposBonos;

/**
 *
 * @author Infosoft
 */
@Repository
public class PgTiposBonosDaoImpl implements PgTiposBonosDao {

    public PgTiposBonosDaoImpl() {
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
    public List<PgTiposBonos> findAll() {
        String sql = "SELECT * FROM pg_tipos_bonos";
        List<PgTiposBonos> pgtiposbonos = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PgTiposBonos.class));
        return pgtiposbonos;
    }
}
