/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao;

import java.util.List;
import sv.gob.mined.apps.siapv2.mvn.modelo.PoaRecursos;

/**
 *
 *
 */
public interface PoaRecursosDao {

    public List<PoaRecursos> findAll();
    
    public List<PoaRecursos> findAllByActividad(Integer actividad);

    public int create();

    public int update();

    public void setPoaRecursos(PoaRecursos recurso);

    public PoaRecursos getPoaRecursos();
}
