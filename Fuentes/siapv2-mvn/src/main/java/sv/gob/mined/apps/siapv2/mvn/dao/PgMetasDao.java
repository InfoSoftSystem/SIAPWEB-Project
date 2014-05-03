/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao;

import java.util.List;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgMetas;

/**
 *
 * @author Infosoft
 */
public interface PgMetasDao {

    public List<PgMetas> findAll(Integer componente);

    public int create();

    public int update();

    public PgMetas getPgMeta();

    public void setPgMeta(PgMetas pgMeta);
}
