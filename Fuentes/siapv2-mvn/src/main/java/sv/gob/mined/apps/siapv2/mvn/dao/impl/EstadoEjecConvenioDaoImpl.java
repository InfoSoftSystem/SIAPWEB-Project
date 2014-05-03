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
import sv.gob.mined.apps.siapv2.mvn.dao.EstadoEjecConvenioDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.EstadoEjecConvenio;

/**
 *
 * @author Infosoft
 */
@Repository
public class EstadoEjecConvenioDaoImpl implements EstadoEjecConvenioDao {

    public EstadoEjecConvenioDaoImpl() {
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
    public List<EstadoEjecConvenio> findAll() {
        String sql = "SELECT * FROM EstadoEjecConvenio";
        List<EstadoEjecConvenio> estructuraspresupuestarias = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(EstadoEjecConvenio.class));
        return estructuraspresupuestarias;
    }
}
