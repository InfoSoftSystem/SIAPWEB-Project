/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import sv.gob.mined.apps.siapv2.mvn.dao.RecesionesOferenteDao;
import sv.gob.mined.apps.siapv2.mvn.dao.XJdbcTemplate;
import sv.gob.mined.apps.siapv2.mvn.modelo.RecesionesOferente;
import sv.gob.mined.apps.siapv2.mvn.modelo.view.VwRecesionesEmpresa;

/**
 * 
 * @author Infosoft
 */
@Repository
public class RecesionesOferenteDaoImpl extends XJdbcTemplate implements RecesionesOferenteDao {

    public RecesionesOferenteDaoImpl() {
    }

    @Override
    public List<VwRecesionesEmpresa> findAllByOferente(Integer identificadorPrimarioOferente) {
        String sql = "SELECT * FROM vw_recesiones_empresa WHERE identificadorPrimarioOferente = " + identificadorPrimarioOferente;
        return getJdbcTemplate().query(sql, new BeanPropertyRowMapper(VwRecesionesEmpresa.class));
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
    public void setRecesionOferente(RecesionesOferente recesion) {
        super.setObjeto(recesion);
    }

    @Override
    public RecesionesOferente findById(Integer idRecesion) {
        String sql = "SELECT * FROM RecesionesOferente WHERE identificadorRecesion = " + idRecesion;
        List<RecesionesOferente> lst = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(RecesionesOferente.class));
        if (lst.isEmpty()) {
            return null;
        } else {
            return lst.get(0);
        }
    }
}
