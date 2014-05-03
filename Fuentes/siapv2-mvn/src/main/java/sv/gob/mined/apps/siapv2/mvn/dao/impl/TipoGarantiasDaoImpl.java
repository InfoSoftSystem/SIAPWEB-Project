/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import sv.gob.mined.apps.siapv2.mvn.dao.TipoGarantiasDao;
import sv.gob.mined.apps.siapv2.mvn.dao.XJdbcTemplate;
import sv.gob.mined.apps.siapv2.mvn.modelo.TipoGarantias;

/**
 * 
 * @author Infosoft
 */
@Repository
public class TipoGarantiasDaoImpl extends XJdbcTemplate implements TipoGarantiasDao {

    public TipoGarantiasDaoImpl() {
    }
    
    @Override
    public List<TipoGarantias> findTipoGarantias() {
        String sql = "SELECT * FROM TipoGarantias";
        return getJdbcTemplate().query(sql, new BeanPropertyRowMapper(TipoGarantias.class));
    }
    
}
