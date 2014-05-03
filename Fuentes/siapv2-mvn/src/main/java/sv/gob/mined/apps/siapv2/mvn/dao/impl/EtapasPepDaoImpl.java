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
import sv.gob.mined.apps.siapv2.mvn.dao.EtapasPepDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.EtapasPep;

/**
 *
 * @author Infosoft
 */
@Repository
public class EtapasPepDaoImpl implements EtapasPepDao {

    public EtapasPepDaoImpl() {
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
    public List<EtapasPep> findAll() {
        String sql = "SELECT * FROM etapas_pep";
        List<EtapasPep> etapaspep = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(EtapasPep.class));
        return etapaspep;
    }
}
