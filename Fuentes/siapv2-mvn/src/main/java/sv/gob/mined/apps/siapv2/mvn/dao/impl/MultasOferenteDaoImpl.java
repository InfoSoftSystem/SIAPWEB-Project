/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import sv.gob.mined.apps.siapv2.mvn.dao.MultasOferenteDao;
import sv.gob.mined.apps.siapv2.mvn.dao.XJdbcTemplate;
import sv.gob.mined.apps.siapv2.mvn.modelo.MultasOferente;
import sv.gob.mined.apps.siapv2.mvn.modelo.view.VwMultasEmpresa;

/**
 * 
 * @author Infosoft
 */
@Repository
public class MultasOferenteDaoImpl extends XJdbcTemplate implements MultasOferenteDao {

    @Override
    public List<VwMultasEmpresa> findAllByOferente(Integer identificadorPrimarioOferente) {
        String sql = "SELECT * FROM vw_multas_empresa "
                + " WHERE identificadorPrimarioOferente = " + identificadorPrimarioOferente 
                + "   and estadodeeliminacion = 0 "
                + "   ORDER BY identificadorMulta desc";
        return getJdbcTemplate().query(sql, new BeanPropertyRowMapper(VwMultasEmpresa.class));
    }

    @Override
    public int create() {
        return super.create();
    }

    @Override
    public int update() {
        return super.update();
    }

    @Override
    public void setMultaOferente(MultasOferente multa) {
        super.setObjeto(multa);
    }

    @Override
    public MultasOferente findById(Integer idMulta) {
        String sql = "SELECT * FROM MultasOferente WHERE identificadorMulta = " + idMulta;
        List<MultasOferente> lst = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(MultasOferente.class));
        if (lst.isEmpty()) {
            return null;
        } else {
            return lst.get(0);
        }
    }
    
}
