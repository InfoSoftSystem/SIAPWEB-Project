/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import sv.gob.mined.apps.siapv2.mvn.dao.FaltasOferenteDao;
import sv.gob.mined.apps.siapv2.mvn.dao.XJdbcTemplate;
import sv.gob.mined.apps.siapv2.mvn.modelo.FaltasOferente;
import sv.gob.mined.apps.siapv2.mvn.modelo.view.VwFaltasEmpresa;

/**
 *
 * @author Infosoft
 */
@Repository
public class FaltasOferenteDaoImpl extends XJdbcTemplate implements FaltasOferenteDao {

    public FaltasOferenteDaoImpl() {
    }

    @Override
    public List<VwFaltasEmpresa> findAllByOferente(Integer identificadorPrimarioOferente) {
        String sql = "SELECT * "
                + " FROM vw_faltas_empresa "
                + " WHERE identificadorPrimarioOferente = " + identificadorPrimarioOferente + " "
                + "   and estadoeliminacion = 0 "
                + "   ORDER BY identificadorFalta desc";
        return getJdbcTemplate().query(sql, new BeanPropertyRowMapper(VwFaltasEmpresa.class));
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
    public void setFaltasOferente(FaltasOferente falta) {
        super.setObjeto(falta);
    }

    @Override
    public FaltasOferente findById(Integer idFalta) {
        String sql = "SELECT * FROM FaltasOferente WHERE identificadorFalta = " + idFalta;
        List<FaltasOferente> lst = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(FaltasOferente.class));
        if (lst.isEmpty()) {
            return null;
        } else {
            return lst.get(0);
        }
    }
}