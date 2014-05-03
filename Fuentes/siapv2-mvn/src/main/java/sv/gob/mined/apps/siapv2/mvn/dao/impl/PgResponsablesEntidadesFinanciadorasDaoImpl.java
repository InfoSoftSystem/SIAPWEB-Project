/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import sv.gob.mined.apps.siapv2.mvn.dao.PgResponsablesEntidadesFinanciadorasDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgResponsablesEntidadesFinanciadoras;

/**
 *
 * 
 */
public class PgResponsablesEntidadesFinanciadorasDaoImpl implements PgResponsablesEntidadesFinanciadorasDao{

    public PgResponsablesEntidadesFinanciadorasDaoImpl() {
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
    public List<PgResponsablesEntidadesFinanciadoras> findAll() {
        String sql = "SELECT * FROM pg_responsables_entidades_financiadoras";
        List<PgResponsablesEntidadesFinanciadoras> pgresponsablesentidadesfinancieras = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PgResponsablesEntidadesFinanciadoras.class));
        return pgresponsablesentidadesfinancieras;
    }
    
}
