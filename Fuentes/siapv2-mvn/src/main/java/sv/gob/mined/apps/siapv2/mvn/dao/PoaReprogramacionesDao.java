/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao;

import java.util.List;
import sv.gob.mined.apps.siapv2.mvn.modelo.PoaReprogramaciones;

/**
 *
 *
 */
public interface PoaReprogramacionesDao {

    public List<PoaReprogramaciones> findAll();

    public List<PoaReprogramaciones> findAllByPoa(Integer poa);

    public int create();

    public int update();

    public PoaReprogramaciones getPoaReprogramacion();

    public void setPoaReprogramacion(PoaReprogramaciones poaReprogramacion);
}
