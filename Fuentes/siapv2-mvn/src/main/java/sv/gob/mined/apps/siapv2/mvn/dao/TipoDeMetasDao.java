/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao;

import java.util.List;
import sv.gob.mined.apps.siapv2.mvn.modelo.TipoDeMetas;

/**
 *
 * @author Infosoft
 */
public interface TipoDeMetasDao {
    public List<TipoDeMetas> findAll();    
    public TipoDeMetas findById(Integer id);    
}
