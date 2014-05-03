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
import sv.gob.mined.apps.siapv2.mvn.dao.DonacionAdministradaPorDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.DonacionAdministradaPor;

/**
 *
 * @author Infosoft
 */
@Repository
public class DonacionAdministradaPorDaoImpl implements DonacionAdministradaPorDao{

    public DonacionAdministradaPorDaoImpl() {
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
    public List<DonacionAdministradaPor> findAll() {
        String sql = "SELECT * FROM DonacionAdministradaPor";
        List<DonacionAdministradaPor> donacionadministradapor = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(DonacionAdministradaPor.class));
        return donacionadministradapor;
    }
    
}
