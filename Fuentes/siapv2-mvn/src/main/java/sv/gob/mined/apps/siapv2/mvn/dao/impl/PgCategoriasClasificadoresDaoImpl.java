/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import sv.gob.mined.apps.siapv2.mvn.dao.PgCategoriasClasificadoresDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgCategoriasClasificadores;

/**
 *
 *
 */
public class PgCategoriasClasificadoresDaoImpl implements PgCategoriasClasificadoresDao {

    public PgCategoriasClasificadoresDaoImpl() {
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
    public List<PgCategoriasClasificadores> findAll() {
        String sql = "SELECT * FROM pg_categorias_clasificadores";
        List<PgCategoriasClasificadores> pgcategoriasclasificadores = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PgCategoriasClasificadores.class));
        return pgcategoriasclasificadores;
    }
}
