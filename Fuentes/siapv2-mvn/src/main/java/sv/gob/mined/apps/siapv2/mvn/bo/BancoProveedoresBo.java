/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.bo;

import java.util.List;
import sv.gob.mined.apps.siapv2.mvn.modelo.Empresa;
import sv.gob.mined.apps.siapv2.mvn.modelo.FaltasOferente;
import sv.gob.mined.apps.siapv2.mvn.modelo.GarantiasOferente;
import sv.gob.mined.apps.siapv2.mvn.modelo.MultasOferente;
import sv.gob.mined.apps.siapv2.mvn.modelo.RecesionesOferente;
import sv.gob.mined.apps.siapv2.mvn.modelo.TipoFaltas;
import sv.gob.mined.apps.siapv2.mvn.modelo.TipoGarantias;
import sv.gob.mined.apps.siapv2.mvn.modelo.TipoMultas;
import sv.gob.mined.apps.siapv2.mvn.modelo.TipoRecesion;
import sv.gob.mined.apps.siapv2.mvn.modelo.view.VwFaltasEmpresa;
import sv.gob.mined.apps.siapv2.mvn.modelo.view.VwGarantiasEmpresa;
import sv.gob.mined.apps.siapv2.mvn.modelo.view.VwMultasEmpresa;
import sv.gob.mined.apps.siapv2.mvn.modelo.view.VwRecesionesEmpresa;
import sv.gob.mined.apps.siapv2.mvn.modelo.view.VwTrasladoEmpresa;

/**
 *
 * @author Infosoft
 */
public interface BancoProveedoresBo {

    public List<Empresa> getLstEmpresaByRazonSocial(String razonSocial);

    public List<Empresa> getLstEmpresaByNit(String numeroDeNit);

    public List<TipoFaltas> getLstTipoFaltas();
    
    public List<TipoMultas> getLstTipoMultas();
    
    public List<TipoGarantias> getLstTipoGarantias();
    
    public List<TipoRecesion> getLstTipoRecesiones();

    public List<VwFaltasEmpresa> getLstFaltasOferente(Integer idOferente);
    
    public List<VwMultasEmpresa> getLstMultasOferente(Integer idOferente);
    
    public List<VwGarantiasEmpresa> getLstGarantiasOferente(Integer idOferente);
    
    public List<VwRecesionesEmpresa> getLstRecesionesOferente(Integer idOferente);
    
    public List<VwTrasladoEmpresa> getLstTrasladoEmpresa();

    public int saveFaltaOferente(FaltasOferente falta);
    
    public FaltasOferente getFaltaById(Integer id);
    
    public GarantiasOferente getGarantiaById(Integer id);
    
    public MultasOferente getMultaById(Integer id);
    
    public RecesionesOferente getRecesionById(Integer id);
    
    public int saveMultaOferente(MultasOferente multa);
    
    public int saveGarantiaOferente(GarantiasOferente garantia);
    
    public int saveRecesionOferente(RecesionesOferente recesion);
    
    public int trasladoOferente(Integer identificadorPrimerioDeLaEmpresa);
}
