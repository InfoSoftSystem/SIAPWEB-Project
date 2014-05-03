/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import sv.gob.mined.apps.siapv2.mvn.dao.PlantillaDeComportamientosDao;
import sv.gob.mined.apps.siapv2.mvn.dao.XJdbcTemplate;
import sv.gob.mined.apps.siapv2.mvn.modelo.NivelDesagregacionPAP;
import sv.gob.mined.apps.siapv2.mvn.modelo.PlantillaDeComportamientos;

/**
 *
 * @author Infosoft
 */
@Repository
public class PlantillaDeComportamientosDaoImpl extends XJdbcTemplate implements PlantillaDeComportamientosDao {

    public PlantillaDeComportamientosDaoImpl() {
    }

    @Override
    public List<PlantillaDeComportamientos> findAll() {
        String sql = "SELECT * FROM PlantillaDeComportamientos";
        List<PlantillaDeComportamientos> plantillaComportamiento = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PlantillaDeComportamientos.class));
        return plantillaComportamiento;
    }

    @Override
    public List<PlantillaDeComportamientos> findAllByConvenio(Integer convenio) {
        String sql = "SELECT PlantillaDeComportamientos.* FROM PlantillaDeComportamientos inner join pg_convenio on PlantillaDeComportamientos.idPlantillaComportamiento = pg_convenio.idPlantillaComportamiento  WHERE convenio= " + convenio;
        List<PlantillaDeComportamientos> plantillaComportamiento;
        try {
            plantillaComportamiento = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PlantillaDeComportamientos.class));
        } catch (Exception e) {
            plantillaComportamiento = new ArrayList<PlantillaDeComportamientos>();
        }

        return plantillaComportamiento;
    }

    @Override
    public List<PlantillaDeComportamientos> findAllByOrigen(Integer origen) {
        String sql = "SELECT * FROM PlantillaDeComportamientos WHERE idOrigenRecursos= " + origen;
        List<PlantillaDeComportamientos> plantillaComportamiento = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PlantillaDeComportamientos.class));
        return plantillaComportamiento;
    }

    @Override
    public PlantillaDeComportamientos findByConvenio(Integer convenio) {
        if (findAllByConvenio(convenio).isEmpty()) {
            return null;
        } else {
            return findAllByConvenio(convenio).get(0);
        }
    }

    @Override
    public NivelDesagregacionPAP findByPlantilla(Integer idPlantilla) {
        String sql = "SELECT NivelDesagregacionPAP.* FROM PlantillaDeComportamientos inner join NivelDesagregacionPAP on PlantillaDeComportamientos.idNivelDesagregacion = NivelDesagregacionPAP.idNivelDesagregacion  WHERE idPlantillaComportamiento= " + idPlantilla;
        List<NivelDesagregacionPAP> nivelDesagregacionPap;
        try {
            nivelDesagregacionPap = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(NivelDesagregacionPAP.class));
        } catch (Exception e) {
            nivelDesagregacionPap = new ArrayList<NivelDesagregacionPAP>();
        }

        return nivelDesagregacionPap.get(0);
    }
}
