/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao;

import java.util.List;
import sv.gob.mined.apps.siapv2.mvn.dto.ComponentesDto;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgComponentes;

/**
 *
 * @author Infosoft
 */
public interface PgComponentesDao {

    public List<PgComponentes> findAll(Integer convenio);

    public List<PgComponentes> findAllSub(Integer componentePadre);

    public List<ComponentesDto> finAllComponentesDtoByConvenio(Integer convenio);
}
