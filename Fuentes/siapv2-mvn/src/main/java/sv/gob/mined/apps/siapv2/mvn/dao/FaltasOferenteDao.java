/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao;

import java.util.List;
import sv.gob.mined.apps.siapv2.mvn.modelo.FaltasOferente;
import sv.gob.mined.apps.siapv2.mvn.modelo.view.VwFaltasEmpresa;

/**
 *
 * @author Infosoft
 */
public interface FaltasOferenteDao {

    public List<VwFaltasEmpresa> findAllByOferente(Integer identificadorPrimarioOferente);
    
    public FaltasOferente findById(Integer idFalta);

    public int create();

    public int update();
    
    public void setFaltasOferente(FaltasOferente falta);
}