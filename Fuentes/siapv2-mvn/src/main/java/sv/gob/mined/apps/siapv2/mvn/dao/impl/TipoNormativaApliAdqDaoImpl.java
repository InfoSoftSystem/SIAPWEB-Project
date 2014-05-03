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
import sv.gob.mined.apps.siapv2.mvn.dao.TipoNormativaApliAdqDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.TipoNormativaApliAdq;

/**
 *
 * @author Infosoft
 */
@Repository
public class TipoNormativaApliAdqDaoImpl implements TipoNormativaApliAdqDao{

    public TipoNormativaApliAdqDaoImpl() {
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
    public List<TipoNormativaApliAdq> findAll() {
        String sql = "SELECT * FROM TipoNormativaApliAdq";
        List<TipoNormativaApliAdq> tiponormativaapli = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(TipoNormativaApliAdq.class));
        return tiponormativaapli;
    }
}
