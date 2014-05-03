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
import sv.gob.mined.apps.siapv2.mvn.dao.PgAgentesComprasDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgAgentesCompras;

/**
 *
 * @author Infosoft
 */
@Repository
public class PgAgentesComprasDaoImpl implements PgAgentesComprasDao{

    public PgAgentesComprasDaoImpl() {
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
    public List<PgAgentesCompras> findAll() {
        String sql = "SELECT * FROM pg_agentes_compras";
        List<PgAgentesCompras> pgagentescompras = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PgAgentesCompras.class));
        return pgagentescompras;
    }
    
}
