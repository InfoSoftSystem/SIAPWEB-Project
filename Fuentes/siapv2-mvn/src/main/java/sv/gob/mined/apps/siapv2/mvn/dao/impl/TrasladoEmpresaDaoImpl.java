/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import sv.gob.mined.apps.siapv2.mvn.dao.TrasladoEmpresaDao;
import sv.gob.mined.apps.siapv2.mvn.dao.XJdbcTemplate;
import sv.gob.mined.apps.siapv2.mvn.modelo.Empresa;
import sv.gob.mined.apps.siapv2.mvn.modelo.view.VwTrasladoEmpresa;

/**
 * 
 * @author Infosoft
 */
@Repository
public class TrasladoEmpresaDaoImpl extends XJdbcTemplate implements TrasladoEmpresaDao {

    public TrasladoEmpresaDaoImpl() {
    }

    @Override
    public List<VwTrasladoEmpresa> findAllEmpresa() {
        String sql = "SELECT * FROM vw_traslado_empresa";
        return getJdbcTemplate().query(sql, new BeanPropertyRowMapper(VwTrasladoEmpresa.class));
    }

    @Override
    public void trasladarEmpresa(Empresa emp) {
        
    }
    
}
