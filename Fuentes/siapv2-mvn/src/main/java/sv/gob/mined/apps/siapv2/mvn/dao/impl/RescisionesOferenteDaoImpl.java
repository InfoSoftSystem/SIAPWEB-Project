/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import sv.gob.mined.apps.siapv2.mvn.dao.RescisionesOferenteDao;
import sv.gob.mined.apps.siapv2.mvn.dao.XJdbcTemplate;
import sv.gob.mined.apps.siapv2.mvn.modelo.RescisionesOferente;
import sv.gob.mined.apps.siapv2.mvn.modelo.view.VwRescisionesEmpresa;

/**
 * 
 * @author Infosoft
 */
@Repository
public class RescisionesOferenteDaoImpl extends XJdbcTemplate implements RescisionesOferenteDao {

    public RescisionesOferenteDaoImpl() {
    }

    @Override
    public List<VwRescisionesEmpresa> findAllByOferente(Integer identificadorPrimarioOferente) {
        String sql = "SELECT * "
                + "     FROM vw_recesiones_empresa "
                + "     WHERE identificadorPrimarioOferente = " + identificadorPrimarioOferente 
                + "   AND estadoDeEliminacion = 0 "
                + "   ORDER BY identificadorRecesion desc";
        return getJdbcTemplate().query(sql, new BeanPropertyRowMapper(VwRescisionesEmpresa.class));
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
    public void setRescisionOferente(RescisionesOferente rescision) {
        super.setObjeto(rescision);
    }

    @Override
    public RescisionesOferente findById(Integer idRescision) {
        String sql = "SELECT * FROM RecesionesOferente WHERE identificadorRecesion = " + idRescision;
        List<RescisionesOferente> lst = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(RescisionesOferente.class));
        if (lst.isEmpty()) {
            return null;
        } else {
            return lst.get(0);
        }
    }
}
