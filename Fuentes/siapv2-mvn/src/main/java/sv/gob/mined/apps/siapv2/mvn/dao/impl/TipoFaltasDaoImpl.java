/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import sv.gob.mined.apps.siapv2.mvn.dao.CatalogoFaltasDao;
import sv.gob.mined.apps.siapv2.mvn.dao.XJdbcTemplate;
import sv.gob.mined.apps.siapv2.mvn.modelo.TipoFaltas;
import sv.gob.mined.apps.siapv2.mvn.modelo.TipoGarantias;
import sv.gob.mined.apps.siapv2.mvn.modelo.TipoMultas;
import sv.gob.mined.apps.siapv2.mvn.modelo.TipoRescision;

/**
 *
 * @author Infosoft
 */
@Repository
public class TipoFaltasDaoImpl extends XJdbcTemplate implements CatalogoFaltasDao {

    public TipoFaltasDaoImpl() {
    }
    
    @Override
    public List<TipoFaltas> findTipoFaltas() {
        String sql = "SELECT * FROM TipoFaltas";
        return getJdbcTemplate().query(sql, new BeanPropertyRowMapper(TipoFaltas.class));
    }

    @Override
    public List<TipoMultas> findTipoMultas() {
        String sql = "SELECT * FROM TipoMultas";
        return getJdbcTemplate().query(sql, new BeanPropertyRowMapper(TipoMultas.class));
    }

    @Override
    public List<TipoGarantias> findTipoGarantias() {
        String sql = "SELECT * FROM TipoGarantias";
        return getJdbcTemplate().query(sql, new BeanPropertyRowMapper(TipoGarantias.class));
    }

    @Override
    public List<TipoRescision> findTipoRescision() {
        String sql = "SELECT * FROM TipoRecesion";
        return getJdbcTemplate().query(sql, new BeanPropertyRowMapper(TipoRescision.class));
    }
}
