/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.List;
import javax.faces.model.SelectItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import sv.gob.mined.apps.siapv2.mvn.dao.PgAnosPlanGlobalDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgAnosPlanGlobal;
import sv.gob.mined.apps.siapv2.mvn.util.JsfUtil;

/**
 *
 *
 */
@Repository
public class PgAnosPlanGlobalDaoImpl implements PgAnosPlanGlobalDao {

    public PgAnosPlanGlobalDaoImpl() {
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
    public List<PgAnosPlanGlobal> findAll() {
        String sql = "SELECT * FROM pg_anos_plan_global";
        List<PgAnosPlanGlobal> pganosplanglobal = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PgAnosPlanGlobal.class));
        return pganosplanglobal;
    }

    @Override
    public List<PgAnosPlanGlobal> findAllByConvenio(Integer convenio) {
        String sql = "SELECT * FROM pg_anos_plan_global WHERE convenio = " + convenio;
        List<PgAnosPlanGlobal> pganosplanglobal = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PgAnosPlanGlobal.class));
        return pganosplanglobal;
    }

    @Override
    public PgAnosPlanGlobal findByKey(Integer id) {
        String sql = "SELECT * FROM pg_anos_plan_global WHERE identificadorAnoPap = " + id;
        List<PgAnosPlanGlobal> pganosplanglobal = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PgAnosPlanGlobal.class));
        if (pganosplanglobal.isEmpty()) {
            return null;
        } else {
            return pganosplanglobal.get(0);
        }
    }
}
