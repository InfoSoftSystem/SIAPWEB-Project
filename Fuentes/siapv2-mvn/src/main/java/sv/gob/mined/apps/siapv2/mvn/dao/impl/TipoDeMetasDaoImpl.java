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
import sv.gob.mined.apps.siapv2.mvn.dao.TipoDeMetasDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.TipoDeMetas;

/**
 *
 * @author Infosoft
 */
@Repository
public class TipoDeMetasDaoImpl implements TipoDeMetasDao {

    public TipoDeMetasDaoImpl() {
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
    public List<TipoDeMetas> findAll() {
        String sql = "SELECT * FROM TipoDeMetas";
        List<TipoDeMetas> lstTipoMetas = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(TipoDeMetas.class));
        return lstTipoMetas;
    }

    @Override
    public TipoDeMetas findById(Integer id) {
        String sql = "SELECT * FROM TipoDeMetas WHERE idTipoMeta = " + id;
        List<TipoDeMetas> lstTipoMetas = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(TipoDeMetas.class));
        return lstTipoMetas.get(0);
    }
}
