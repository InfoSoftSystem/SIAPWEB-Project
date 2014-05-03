/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao;

import java.util.List;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgActividades;

/**
 *
 * @author Infosoft
 */
public interface PgActividadesDao {

    public List<PgActividades> findAll();
    
    public List<PgActividades> findAllByMeta(Integer meta);

    public int create();

    public int update();

    public void setPgActividad(PgActividades pgAct);

    public PgActividades getPgActividad();
}
