/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao;

import java.util.List;
import sv.gob.mined.apps.siapv2.mvn.modelo.FuentesFinanciamientos;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgEntidadesFinanciadoras;

/**
 *
 * @author Infosoft
 */
public interface FuentesFinanciamientosDao {

    public List<FuentesFinanciamientos> findAll();

    public int findOrganismoByConvenio(Integer convenio, Boolean ftePrincipal);

    public FuentesFinanciamientos findFuenteByConvenio(Integer convenio, Boolean ftePrincipal);

    public PgEntidadesFinanciadoras findEntidadesFinanByConvenio(Integer convenio, Boolean ftePrincipal);
}
