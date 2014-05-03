/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao;

import java.util.List;
import sv.gob.mined.apps.siapv2.mvn.dto.ElementoReproDto;
import sv.gob.mined.apps.siapv2.mvn.dto.MontosPapDto;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgConvenio;

/**
 *
 * @author Infosoft
 */
public interface PgConvenioDao {

    public List<PgConvenio> findAll(Integer idOrigen);

    public Boolean isUnicaFuente(Integer pgConvenio);

    public List<MontosPapDto> findAllByConvenio(Integer idConvenio);
    
    public List<ElementoReproDto> findByConvenio(Integer idConvenio);
}
