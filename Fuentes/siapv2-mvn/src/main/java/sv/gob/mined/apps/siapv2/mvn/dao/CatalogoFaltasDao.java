/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao;

import java.util.List;
import sv.gob.mined.apps.siapv2.mvn.modelo.TipoFaltas;
import sv.gob.mined.apps.siapv2.mvn.modelo.TipoGarantias;
import sv.gob.mined.apps.siapv2.mvn.modelo.TipoMultas;
import sv.gob.mined.apps.siapv2.mvn.modelo.TipoRescision;

/**
 *
 * @author Infosoft
 */
public interface CatalogoFaltasDao {
    public List<TipoFaltas> findTipoFaltas();
    public List<TipoMultas> findTipoMultas();
    public List<TipoGarantias> findTipoGarantias();
    public List<TipoRescision> findTipoRescision();
}
