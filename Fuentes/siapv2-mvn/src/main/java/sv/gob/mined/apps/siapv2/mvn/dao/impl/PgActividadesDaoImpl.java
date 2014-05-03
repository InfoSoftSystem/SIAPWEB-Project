/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import sv.gob.mined.apps.siapv2.mvn.dao.PgActividadesDao;
import sv.gob.mined.apps.siapv2.mvn.dao.XJdbcTemplate;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgActividades;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgAnosPlanGlobal;

/**
 *
 * @author Infosoft
 */
@Repository
public class PgActividadesDaoImpl extends XJdbcTemplate implements PgActividadesDao {

    private PgActividades pgActividad;

    public PgActividadesDaoImpl() {
    }

    @Override
    public List<PgActividades> findAll() {
        String sql = "SELECT * FROM pg_actividades";
        List<PgActividades> pgactividades = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PgActividades.class));
        
        return pgactividades;
    }
    
    private PgAnosPlanGlobal findByKey(Integer id) {
        String sql = "SELECT * FROM pg_anos_plan_global WHERE identificadorAnoPap = " + id;
        List<PgAnosPlanGlobal> pganosplanglobal = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PgAnosPlanGlobal.class));
        if (pganosplanglobal.isEmpty()) {
            return null;
        } else {
            return pganosplanglobal.get(0);
        }
    }


    @Override
    public int create() {
        super.setObjeto(pgActividad);
        int idActividad = super.create();
        this.pgActividad.setActividad(idActividad);
        return idActividad;
    }

    @Override
    public int update() {
        super.setObjeto(pgActividad);
        return super.update();
    }

    @Override
    public void setPgActividad(PgActividades pgActividad) {
        this.pgActividad = pgActividad;
    }

    @Override
    public PgActividades getPgActividad() {
        return pgActividad;
    }

    @Override
    public List<PgActividades> findAllByMeta(Integer meta) {
        String sql = "SELECT * FROM pg_actividades WHERE meta = " + meta;
        List<PgActividades> pgactividades = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PgActividades.class));
        for (PgActividades pgActividades : pgactividades) {
            pgActividades.setPgAnosPlanGlobal(findByKey(pgActividades.getIdentificadorAnoPap()));
        }
        return pgactividades;
    }
}
