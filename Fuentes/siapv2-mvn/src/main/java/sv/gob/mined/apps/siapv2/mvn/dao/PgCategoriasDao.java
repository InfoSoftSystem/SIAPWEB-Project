/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao;

import java.util.List;
import sv.gob.mined.apps.siapv2.mvn.dto.CategoriasDto;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgCategorias;

/**
 *
 * @author Infosfot
 */
public interface PgCategoriasDao {

    public List<PgCategorias> findAll();

    public List<CategoriasDto> finAllCategoriasDtoByConvenio(Integer idConvenio);
}
