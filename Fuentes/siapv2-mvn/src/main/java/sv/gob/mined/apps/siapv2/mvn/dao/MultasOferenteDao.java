/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao;

import java.util.List;
import sv.gob.mined.apps.siapv2.mvn.modelo.MultasOferente;
import sv.gob.mined.apps.siapv2.mvn.modelo.view.VwMultasEmpresa;

/**
 *
 * @author Infosoft
 */
public interface MultasOferenteDao {

    public List<VwMultasEmpresa> findAllByOferente(Integer identificadorPrimarioOferente);

    public MultasOferente findById(Integer idMulta);
    
    public int create();

    public int update();

    public void setMultaOferente(MultasOferente multa);
}
