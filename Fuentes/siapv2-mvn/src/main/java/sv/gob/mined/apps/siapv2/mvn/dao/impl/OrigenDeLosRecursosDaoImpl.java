/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import sv.gob.mined.apps.siapv2.mvn.dao.OrigenDeLosRecursosDao;
import sv.gob.mined.apps.siapv2.mvn.dao.XJdbcTemplate;
import sv.gob.mined.apps.siapv2.mvn.modelo.OrigenDeLosRecursos;

/**
 *
 * @author Infosoft
 */
@Repository
public class OrigenDeLosRecursosDaoImpl extends XJdbcTemplate implements OrigenDeLosRecursosDao {

    public OrigenDeLosRecursosDaoImpl() {
    }
    
    @Override
    public List<OrigenDeLosRecursos> findAll() {
        String sql = "SELECT * FROM OrigenDeLosRecursos";
        List<OrigenDeLosRecursos> origendelosrecursos = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(OrigenDeLosRecursos.class));
        return origendelosrecursos;
    }
}