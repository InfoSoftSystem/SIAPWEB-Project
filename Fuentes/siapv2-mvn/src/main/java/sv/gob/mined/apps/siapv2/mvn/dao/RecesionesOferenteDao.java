/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao;

import java.util.List;
import sv.gob.mined.apps.siapv2.mvn.modelo.RecesionesOferente;
import sv.gob.mined.apps.siapv2.mvn.modelo.view.VwRecesionesEmpresa;

/**
 *
 * @author Infosoft
 */
public interface RecesionesOferenteDao {

    public List<VwRecesionesEmpresa> findAllByOferente(Integer identificadorPrimarioOferente);
    
    public RecesionesOferente findById(Integer idRecesion);

    public int create();

    public int update();

    public void setRecesionOferente(RecesionesOferente recesion);
}
