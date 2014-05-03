/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao;

import java.util.List;
import sv.gob.mined.apps.siapv2.mvn.modelo.EtapasPep;

/**
 *
 * @author Infosoft
 */
public interface EtapasPepDao {
    public List<EtapasPep> findAll();
}
