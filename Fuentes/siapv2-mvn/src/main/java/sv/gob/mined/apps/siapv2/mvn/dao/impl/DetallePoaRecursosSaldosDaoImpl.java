/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import sv.gob.mined.apps.siapv2.mvn.dao.DetallePoaRecursosSaldosDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.DetallePoaRecursosSaldos;

/**
 *
 * @
 */
public class DetallePoaRecursosSaldosDaoImpl implements DetallePoaRecursosSaldosDao{

    public DetallePoaRecursosSaldosDaoImpl() {
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
    public List<DetallePoaRecursosSaldos> findAll() {
       String sql = "SELECT * FROM detalle_poa_recursos_saldos";
        List<DetallePoaRecursosSaldos> detallerecsaldo = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(DetallePoaRecursosSaldos.class));
        return detallerecsaldo;
    }
    
}
