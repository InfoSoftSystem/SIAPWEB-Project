/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.bo.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.gob.mined.apps.siapv2.mvn.bo.BancoProveedoresBo;
import sv.gob.mined.apps.siapv2.mvn.dao.EmpresaDao;
import sv.gob.mined.apps.siapv2.mvn.dao.FaltasOferenteDao;
import sv.gob.mined.apps.siapv2.mvn.dao.CatalogoFaltasDao;
import sv.gob.mined.apps.siapv2.mvn.dao.GarantiasOferenteDao;
import sv.gob.mined.apps.siapv2.mvn.dao.MultasOferenteDao;
import sv.gob.mined.apps.siapv2.mvn.dao.RescisionesOferenteDao;
import sv.gob.mined.apps.siapv2.mvn.dao.TrasladoEmpresaDao;
import sv.gob.mined.apps.siapv2.mvn.modelo.Empresa;
import sv.gob.mined.apps.siapv2.mvn.modelo.FaltasOferente;
import sv.gob.mined.apps.siapv2.mvn.modelo.GarantiasOferente;
import sv.gob.mined.apps.siapv2.mvn.modelo.MultasOferente;
import sv.gob.mined.apps.siapv2.mvn.modelo.RescisionesOferente;
import sv.gob.mined.apps.siapv2.mvn.modelo.TipoFaltas;
import sv.gob.mined.apps.siapv2.mvn.modelo.TipoGarantias;
import sv.gob.mined.apps.siapv2.mvn.modelo.TipoMultas;
import sv.gob.mined.apps.siapv2.mvn.modelo.TipoRescision;
import sv.gob.mined.apps.siapv2.mvn.modelo.view.VwFaltasEmpresa;
import sv.gob.mined.apps.siapv2.mvn.modelo.view.VwGarantiasEmpresa;
import sv.gob.mined.apps.siapv2.mvn.modelo.view.VwMultasEmpresa;
import sv.gob.mined.apps.siapv2.mvn.modelo.view.VwRescisionesEmpresa;
import sv.gob.mined.apps.siapv2.mvn.modelo.view.VwTrasladoEmpresa;

/**
 *
 * @author Infosoft
 */
@Service
public class BancoProveedoresBoImpl implements BancoProveedoresBo {

    public BancoProveedoresBoImpl() {
    }
    @Autowired
    private EmpresaDao empresa;
    @Autowired
    private CatalogoFaltasDao tipoFaltas;
    @Autowired
    private FaltasOferenteDao faltasOferente;
    @Autowired
    private MultasOferenteDao multasOferente;
    @Autowired
    private GarantiasOferenteDao garantiasOferente;
    @Autowired
    private RescisionesOferenteDao rescisionesOferente;
    @Autowired
    private TrasladoEmpresaDao trasladoOferente;

    @Override
    public List<Empresa> getLstEmpresaByRazonSocial(String razonSocial) {
        return empresa.findEmpresaByRazonSocial(razonSocial);
    }

    @Override
    public List<Empresa> getLstEmpresaByNit(String numeroDeNit) {
        return empresa.findEmpresaByNit(numeroDeNit);
    }

    @Override
    public List<TipoFaltas> getLstTipoFaltas() {
        return tipoFaltas.findTipoFaltas();
    }

    @Override
    public List<VwFaltasEmpresa> getLstFaltasOferente(Integer idOferente) {
        return faltasOferente.findAllByOferente(idOferente);
    }

    @Override
    public int saveFaltaOferente(FaltasOferente falta) {
        faltasOferente.setFaltasOferente(falta);
        if (falta.getIdentificadorFalta() == null) {
            Integer id = faltasOferente.create();
            falta.setIdTipoDeFalta(id);
            return id;
        } else {
            return faltasOferente.update();
        }
    }

    @Override
    public int saveMultaOferente(MultasOferente multa) {
        multasOferente.setMultaOferente(multa);
        if (multa.getIdentificadorMulta() == null) {
            Integer id = multasOferente.create();
            multa.setIdentificadorMulta(id);
            return id;
        } else {
            return multasOferente.update();
        }
    }

    @Override
    public int saveGarantiaOferente(GarantiasOferente garantia) {
        garantiasOferente.setGarantiaOferente(garantia);
        if (garantia.getIdentificadorGarantia() == null) {
            Integer id = garantiasOferente.create();
            garantia.setIdentificadorGarantia(id);
            return id;
        } else {
            return garantiasOferente.update();
        }
    }

    @Override
    public int saveRescisionOferente(RescisionesOferente rescision) {
        rescisionesOferente.setRescisionOferente(rescision);
        if (rescision.getIdentificadorRecesion() == null) {
            Integer id = rescisionesOferente.create();
            rescision.setIdentificadorRecesion(id);
            return id;
        } else {
            return rescisionesOferente.update();
        }
    }

    @Override
    public List<TipoMultas> getLstTipoMultas() {
        return tipoFaltas.findTipoMultas();
    }

    @Override
    public List<VwMultasEmpresa> getLstMultasOferente(Integer idOferente) {
        return multasOferente.findAllByOferente(idOferente);
    }

    @Override
    public List<VwGarantiasEmpresa> getLstGarantiasOferente(Integer idOferente) {
        return garantiasOferente.findAllByOferente(idOferente);
    }

    @Override
    public List<VwRescisionesEmpresa> getLstRescisionesOferente(Integer idOferente) {
        return rescisionesOferente.findAllByOferente(idOferente);
    }

    @Override
    public List<TipoGarantias> getLstTipoGarantias() {
        return tipoFaltas.findTipoGarantias();
    }

    @Override
    public List<TipoRescision> getLstTipoRescisiones() {
        return tipoFaltas.findTipoRescision();
    }

    @Override
    public List<VwTrasladoEmpresa> getLstTrasladoEmpresa() {
        return trasladoOferente.findAllEmpresa();
    }

    @Override
    public FaltasOferente getFaltaById(Integer id) {
        return faltasOferente.findById(id);
    }

    @Override
    public GarantiasOferente getGarantiaById(Integer id) {
        return garantiasOferente.findById(id);
    }

    @Override
    public MultasOferente getMultaById(Integer id) {
        return multasOferente.findById(id);
    }

    @Override
    public RescisionesOferente getRescisionById(Integer id) {
        return rescisionesOferente.findById(id);
    }

    @Override
    public int trasladoOferente(Integer identificadorPrimerioDeLaEmpresa) {
        return empresa.trasladoOferente(identificadorPrimerioDeLaEmpresa);
    }
}