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
import sv.gob.mined.apps.siapv2.mvn.dao.GEstructuraOrganizativaDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.GEstructuraOrganizativa;

/**
 *
 * @author Infosoft
 */
@Repository
public class GEstructuraOrganizativaDaoImpl implements GEstructuraOrganizativaDao {

    public GEstructuraOrganizativaDaoImpl() {
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
    public List<GEstructuraOrganizativa> findAll() {
        String sql = "SELECT * FROM g_estructura_organizativa";
        List<GEstructuraOrganizativa> gestructuraorganizativa = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(GEstructuraOrganizativa.class));
        return gestructuraorganizativa;
    }
    
    
}
