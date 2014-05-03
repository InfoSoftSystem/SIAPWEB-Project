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
import sv.gob.mined.apps.siapv2.mvn.dao.TipoRecursoDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.TipoRecurso;

/**
 *
 * @author Infosoft
 */
@Repository
public class TipoRecursoDaoImpl implements TipoRecursoDao{

    public TipoRecursoDaoImpl() {
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
    public List<TipoRecurso> findAll() {
        String sql = "SELECT * FROM tipo_recurso";
        List<TipoRecurso> tiporecurso = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(TipoRecurso.class));
        return tiporecurso;
    }
    
}
