/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import sv.gob.mined.apps.siapv2.mvn.dao.DetalleCompPorPlantillaDao;
import sv.gob.mined.apps.siapv2.mvn.dao.XJdbcTemplate;
import sv.gob.mined.apps.siapv2.mvn.modelo.DetalleCompPorPlantilla;

/**
 *
 * @author InfoSoft
 */
@Repository
public class DetalleCompPorPlantillaDaoImpl extends XJdbcTemplate implements DetalleCompPorPlantillaDao {

    @Override
    public List<DetalleCompPorPlantilla> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DetalleCompPorPlantilla> findAllByConvenio(Integer convenio) {
        String sql = "select DetalleCompPorPlantilla.* "
                + "from DetalleCompPorPlantilla "
                + "    inner join pg_convenio on pg_convenio.identificadorDetalleComportamiento = DetalleCompPorPlantilla.identificadorDetalleComportamiento "
                + "where pg_convenio.convenio = " + convenio;
        List<DetalleCompPorPlantilla> plantillaComportamiento;
        try {
            plantillaComportamiento = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(DetalleCompPorPlantilla.class));
        } catch (Exception e) {
            plantillaComportamiento = new ArrayList<DetalleCompPorPlantilla>();
        }

        return plantillaComportamiento;
    }

    @Override
    public DetalleCompPorPlantilla findByConvenio(Integer convenio) {
        if (findAllByConvenio(convenio).isEmpty()) {
            return null;
        } else {
            return findAllByConvenio(convenio).get(0);
        }
    }
}
