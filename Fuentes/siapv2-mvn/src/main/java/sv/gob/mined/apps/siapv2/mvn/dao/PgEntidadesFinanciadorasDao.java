/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao;

import java.util.List;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgEntidadesFinanciadoras;

/**
 *
 * @author Infosoft
 */
public interface PgEntidadesFinanciadorasDao {
    public List<PgEntidadesFinanciadoras> findAll();
}
