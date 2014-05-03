/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import sv.gob.mined.apps.siapv2.mvn.dao.FuentesFinanciamientosDao;
import sv.gob.mined.apps.siapv2.mvn.dao.XJdbcTemplate;
import sv.gob.mined.apps.siapv2.mvn.modelo.FuentesFinanciamientos;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgEntidadesFinanciadoras;

/**
 *
 * @author Infosoft
 */
@Repository
public class FuentesFinanciaminetosDaoImpl extends XJdbcTemplate implements FuentesFinanciamientosDao {

    public FuentesFinanciaminetosDaoImpl() {
    }

    @Override
    public List<FuentesFinanciamientos> findAll() {
        String sql = "SELECT * FROM fuentes_financiamientos";
        List<FuentesFinanciamientos> fuentesfinancimamientos = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(FuentesFinanciamientos.class));
        return fuentesfinancimamientos;
    }

    @Override
    public int findOrganismoByConvenio(Integer convenio, Boolean ftePrincipal) {
        String sql = "SELECT organismo FROM fuentes_financiamientos where convenio = " + convenio + " and contrapartida = " + (ftePrincipal?0:1);
        return getJdbcTemplate().queryForInt(sql);
    }

    @Override
    public FuentesFinanciamientos findFuenteByConvenio(Integer convenio, Boolean ftePrincipal) {
        String sql = "SELECT * FROM fuentes_financiamientos where convenio = " + convenio + " and contrapartida = " + (ftePrincipal?0:1);
        return (FuentesFinanciamientos) getJdbcTemplate().query(sql, new BeanPropertyRowMapper(FuentesFinanciamientos.class)).get(0);
    }

    @Override
    public PgEntidadesFinanciadoras findEntidadesFinanByConvenio(Integer convenio, Boolean ftePrincipal) {
        String sql = "SELECT pg_entidades_financiadoras.* FROM pg_entidades_financiadoras inner join fuentes_financiamientos on "
                + " pg_entidades_financiadoras.organismo = fuentes_financiamientos.organismo "
                + " where fuentes_financiamientos.convenio = " + convenio + " and fuentes_financiamientos.contrapartida = " + (ftePrincipal?0:1);
        return (PgEntidadesFinanciadoras) getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PgEntidadesFinanciadoras.class)).get(0);
    }
}
