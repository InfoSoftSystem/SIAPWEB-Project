/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import sv.gob.mined.apps.siapv2.mvn.dao.PgCategoriasEntidadesDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgCategoriasEntidades;

/**
 *
 *
 */
public class PgCategoriasEntidadesDaoImpl implements PgCategoriasEntidadesDao {

    public PgCategoriasEntidadesDaoImpl() {
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
    public List<PgCategoriasEntidades> findAll() {
        String sql = "SELECT * FROM pg_categorias_entidades";
        List<PgCategoriasEntidades> pgcategoriasentidades = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PgCategoriasEntidades.class));
        return pgcategoriasentidades;
    }
}
