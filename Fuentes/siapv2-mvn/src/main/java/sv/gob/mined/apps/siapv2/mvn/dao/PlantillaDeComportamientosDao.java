/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao;

import java.util.List;
import sv.gob.mined.apps.siapv2.mvn.modelo.NivelDesagregacionPAP;
import sv.gob.mined.apps.siapv2.mvn.modelo.PlantillaDeComportamientos;

/**
 *
 * @author Infosoft
 */
public interface PlantillaDeComportamientosDao {
    public List<PlantillaDeComportamientos> findAll();
    public List<PlantillaDeComportamientos> findAllByOrigen(Integer origen);
    public List<PlantillaDeComportamientos> findAllByConvenio(Integer convenio);
    public PlantillaDeComportamientos findByConvenio(Integer convenio);
    public NivelDesagregacionPAP findByPlantilla(Integer idPlantilla);
}
