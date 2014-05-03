/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao;

import java.util.List;
import sv.gob.mined.apps.siapv2.mvn.modelo.PoaRecursosSaldos;

/**
 * 
 * @author Infosoft
 */
public interface PoaRecursosSaldosDao {

    public List<PoaRecursosSaldos> findAll();

    public int create();

    public int update();

    public void setPoaRecursosSaldos(PoaRecursosSaldos recurso);

    public PoaRecursosSaldos getPoaRecursosSaldos();
    
    public PoaRecursosSaldos getPoaRecursosSaldos(Integer recurso, Integer convenio, Integer organismo);
}
