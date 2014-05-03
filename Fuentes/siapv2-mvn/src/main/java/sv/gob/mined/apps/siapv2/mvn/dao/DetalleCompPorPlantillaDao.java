/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao;

import java.util.List;
import sv.gob.mined.apps.siapv2.mvn.modelo.DetalleCompPorPlantilla;

/**
 *
 * @author InfoSoft
 */
public interface DetalleCompPorPlantillaDao {
    public List<DetalleCompPorPlantilla> findAll();
    public List<DetalleCompPorPlantilla> findAllByConvenio(Integer convenio);    
    public DetalleCompPorPlantilla findByConvenio(Integer convenio);    
}
