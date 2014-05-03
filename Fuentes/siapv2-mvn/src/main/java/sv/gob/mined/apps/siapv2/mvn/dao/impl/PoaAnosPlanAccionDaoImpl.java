/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import sv.gob.mined.apps.siapv2.mvn.dao.PoaAnosPlanAccionDao;
import sv.gob.mined.apps.siapv2.mvn.dao.XJdbcTemplate;
import sv.gob.mined.apps.siapv2.mvn.modelo.PoaAnosPlanAccion;

/**
 *
 * @author InfoSoft
 */
@Repository
public class PoaAnosPlanAccionDaoImpl extends XJdbcTemplate implements PoaAnosPlanAccionDao {

    public PoaAnosPlanAccionDaoImpl() {
    }

    @Override
    public List<PoaAnosPlanAccion> findAll() {
        String sql = "SELECT * FROM poa_anos_plan_accion";
        List<PoaAnosPlanAccion> poaAnosPlanAccion = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PoaAnosPlanAccion.class));
        return poaAnosPlanAccion;
    }

    @Override
    public PoaAnosPlanAccion getAnhoByAnoPlanGlobal(Integer idAnhoPG) {
        String sql = "SELECT * FROM poa_anos_plan_accion WHERE identificadorAnoPap=" + idAnhoPG;
        List<PoaAnosPlanAccion> lstAnhos = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PoaAnosPlanAccion.class));
        return lstAnhos.get(0);
    }

    @Override
    public List<PoaAnosPlanAccion> getAnhoByConvenio(Integer convenio) {
        String sql = "SELECT * FROM poa_anos_plan_accion WHERE convenio=" + convenio;
        List<PoaAnosPlanAccion> lstAnhos = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PoaAnosPlanAccion.class));
        return lstAnhos;
    }
}
