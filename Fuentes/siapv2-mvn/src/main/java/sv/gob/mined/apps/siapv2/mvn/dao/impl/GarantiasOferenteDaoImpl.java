/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import sv.gob.mined.apps.siapv2.mvn.dao.GarantiasOferenteDao;
import sv.gob.mined.apps.siapv2.mvn.dao.XJdbcTemplate;
import sv.gob.mined.apps.siapv2.mvn.modelo.GarantiasOferente;
import sv.gob.mined.apps.siapv2.mvn.modelo.view.VwGarantiasEmpresa;

/**
 * 
 * @author Infosoft
 */
@Repository
public class GarantiasOferenteDaoImpl extends XJdbcTemplate implements GarantiasOferenteDao {

    public GarantiasOferenteDaoImpl() {
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
    public void setGarantiaOferente(GarantiasOferente garantia) {
        super.setObjeto(garantia);
    }

    @Override
    public List<VwGarantiasEmpresa> findAllByOferente(Integer identificadorPrimarioOferente) {
        String sql = "SELECT * "
                + "  FROM vw_garantias_empresa "
                + " WHERE identificadorPrimarioOferente = " + identificadorPrimarioOferente 
                + "   AND estadodeeliminacion = 0 "
                + "   ORDER BY identificadorGarantia desc";
        return getJdbcTemplate().query(sql, new BeanPropertyRowMapper(VwGarantiasEmpresa.class));
    }

    @Override
    public GarantiasOferente findById(Integer idGarantia) {
        String sql = "SELECT * FROM GarantiasOferente WHERE identificadorGarantia = " + idGarantia;
        List<GarantiasOferente> lst = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(GarantiasOferente.class));
        if (lst.isEmpty()) {
            return null;
        } else {
            return lst.get(0);
        }
    }
    
}
