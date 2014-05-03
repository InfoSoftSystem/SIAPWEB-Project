/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao;

import java.util.List;
import sv.gob.mined.apps.siapv2.mvn.modelo.Empresa;

/**
 *
 * @author Infosoft
 */
public interface EmpresaDao {

    public List<Empresa> findEmpresaByRazonSocial(String razonSocial);

    public List<Empresa> findEmpresaByNit(String numeroNit);

    public int trasladoOferente(Integer identificadorPrimarioDeLaEmpresa);
    
    public List<Empresa> findbyAll();
}
