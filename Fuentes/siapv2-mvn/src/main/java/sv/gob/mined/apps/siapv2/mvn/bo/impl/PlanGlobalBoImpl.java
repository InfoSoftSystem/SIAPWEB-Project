/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.bo.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.gob.mined.apps.siapv2.mvn.bo.PlanGlobalBo;
import sv.gob.mined.apps.siapv2.mvn.dao.ClasificadoresPresupuestariosDao;
import sv.gob.mined.apps.siapv2.mvn.dao.DetalleCompPorPlantillaDao;
import sv.gob.mined.apps.siapv2.mvn.dao.EstadoEjecConvenioDao;
import sv.gob.mined.apps.siapv2.mvn.dao.FuentesFinanciamientosDao;
import sv.gob.mined.apps.siapv2.mvn.dao.GCatalogoProductosDao;
import sv.gob.mined.apps.siapv2.mvn.dao.OrigenDeLosRecursosDao;
import sv.gob.mined.apps.siapv2.mvn.dao.PgActividadesDao;
import sv.gob.mined.apps.siapv2.mvn.dao.PgAnosPlanGlobalDao;
import sv.gob.mined.apps.siapv2.mvn.dao.PgCategoriasDao;
import sv.gob.mined.apps.siapv2.mvn.dao.PgComponentesDao;
import sv.gob.mined.apps.siapv2.mvn.dao.PgConvenioDao;
import sv.gob.mined.apps.siapv2.mvn.dao.PgMetasDao;
import sv.gob.mined.apps.siapv2.mvn.dao.PlantillaDeComportamientosDao;
import sv.gob.mined.apps.siapv2.mvn.dao.PoaAnosPlanAccionDao;
import sv.gob.mined.apps.siapv2.mvn.dao.PoaRecursosDao;
import sv.gob.mined.apps.siapv2.mvn.dao.PoaRecursosSaldosDao;
import sv.gob.mined.apps.siapv2.mvn.dao.TipoDeMetasDao;
import sv.gob.mined.apps.siapv2.mvn.dao.TipoRecursoDao;
import sv.gob.mined.apps.siapv2.mvn.dto.CategoriasDto;
import sv.gob.mined.apps.siapv2.mvn.dto.ComponentesDto;
import sv.gob.mined.apps.siapv2.mvn.dto.MontosPapDto;
import sv.gob.mined.apps.siapv2.mvn.modelo.ClasificadoresPresupuestarios;
import sv.gob.mined.apps.siapv2.mvn.modelo.DetalleCompPorPlantilla;
import sv.gob.mined.apps.siapv2.mvn.modelo.EstadoEjecConvenio;
import sv.gob.mined.apps.siapv2.mvn.modelo.GCatalogoProductos;
import sv.gob.mined.apps.siapv2.mvn.modelo.NivelDesagregacionPAP;
import sv.gob.mined.apps.siapv2.mvn.modelo.OrigenDeLosRecursos;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgActividades;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgAnosPlanGlobal;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgCategorias;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgComponentes;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgConvenio;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgEntidadesFinanciadoras;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgMetas;
import sv.gob.mined.apps.siapv2.mvn.modelo.PoaAnosPlanAccion;
import sv.gob.mined.apps.siapv2.mvn.modelo.PoaRecursos;
import sv.gob.mined.apps.siapv2.mvn.modelo.PoaRecursosSaldos;
import sv.gob.mined.apps.siapv2.mvn.modelo.TipoDeMetas;
import sv.gob.mined.apps.siapv2.mvn.modelo.TipoRecurso;

/**
 *
 * @author Infosoft
 */
@Service
public class PlanGlobalBoImpl implements PlanGlobalBo {

    public PlanGlobalBoImpl() {
    }
    @Autowired
    private OrigenDeLosRecursosDao origenRecursos;
    @Autowired
    private PgConvenioDao pgConvenio;
    @Autowired
    private EstadoEjecConvenioDao estadoEjecConvenio;
    @Autowired
    private DetalleCompPorPlantillaDao detCompPlantilla;
    @Autowired
    private PlantillaDeComportamientosDao plantillaComp;
    @Autowired
    private PgComponentesDao pgComponentes;
    @Autowired
    private PgMetasDao pgMetas;
    @Autowired
    private PgActividadesDao pgActividades;
    @Autowired
    private PoaRecursosDao poaRecursos;
    @Autowired
    private PoaRecursosSaldosDao poaSaldo;
    @Autowired
    private TipoDeMetasDao tipoDeMetas;
    @Autowired
    private PgAnosPlanGlobalDao pgAnosPlanG;
    @Autowired
    private PoaAnosPlanAccionDao poaAnosPlanAccion;
    @Autowired
    private PgCategoriasDao pgCateogiras;
    @Autowired
    private GCatalogoProductosDao gCatalogoProductos;
    @Autowired
    private ClasificadoresPresupuestariosDao clasificadoresPresupuestarios;
    @Autowired
    private TipoRecursoDao tipoRecurso;
    @Autowired
    private FuentesFinanciamientosDao fuentesFinanciamientos;

    @Override
    public List<OrigenDeLosRecursos> getLstOrigenRecursos() {
        return origenRecursos.findAll();
    }

    @Override
    public List<PgConvenio> getLstConvenios(Integer idOrigen) {
        return pgConvenio.findAll(idOrigen);
    }

    @Override
    public List<EstadoEjecConvenio> getLstEstadoEjecConvenio() {
        return estadoEjecConvenio.findAll();
    }

    @Override
    public DetalleCompPorPlantilla getDetCompPorPlantilla(Integer convenio) {
        return detCompPlantilla.findByConvenio(convenio);
    }

    @Override
    public List<PgComponentes> getLstComponente(Integer convenio) {
        return pgComponentes.findAll(convenio);
    }

    @Override
    public List<PgComponentes> getLstSubComponente(Integer componente) {
        return pgComponentes.findAllSub(componente);
    }

    @Override
    public List<PgMetas> getLstMetas(Integer componente) {
        return pgMetas.findAll(componente);
    }

    @Override
    public List<TipoDeMetas> getLstTipoMetas() {
        return tipoDeMetas.findAll();
    }

    @Override
    public int saveMeta(PgMetas pgMeta) {
        pgMetas.setPgMeta(pgMeta);
        if (pgMeta.getMeta() != null) {
            return pgMetas.update();
        } else {
            pgMetas.getPgMeta().setMeta(null);
            return pgMetas.create();
        }
    }

    @Override
    public int saveActividad(PgActividades pgAct) {
        pgActividades.setPgActividad(pgAct);

        if (pgAct.getActividad() != null) {
            return pgActividades.update();
        } else {
            pgActividades.getPgActividad().setActividad(null);
            return pgActividades.create();
        }
    }

    @Override
    public int saveRecurso(PoaRecursos poaRecurso) {
        poaRecursos.setPoaRecursos(poaRecurso);

        if (poaRecurso.getRecurso() != null) {
            return poaRecursos.update();
        } else {
            poaRecursos.getPoaRecursos().setPoaRecurso(null);
            return poaRecursos.create();
        }
    }

    @Override
    public int saveRecursoSaldo(PoaRecursosSaldos poaRecursosSaldos) {
        poaSaldo.setPoaRecursosSaldos(poaRecursosSaldos);
        if (poaRecursosSaldos.getSaldoRecurso() != null) {
            return poaSaldo.update();
        } else {
            return poaSaldo.create();
        }
    }

    @Override
    public List<PgActividades> getLstActividades(Integer meta) {
        return pgActividades.findAllByMeta(meta);
    }

    @Override
    public List<PgAnosPlanGlobal> getLstAnhosPg(Integer convenio) {
        return pgAnosPlanG.findAllByConvenio(convenio);
    }

    @Override
    public PgAnosPlanGlobal getAnhosPgByKey(Integer id) {
        return pgAnosPlanG.findByKey(id);
    }

    @Override
    public TipoDeMetas getTipoMetaByKey(Integer id) {
        return tipoDeMetas.findById(id);
    }

    @Override
    public List<PgCategorias> getLstPgCategorias() {
        return pgCateogiras.findAll();
    }

    @Override
    public List<GCatalogoProductos> getLstCatalogoProductos() {
        return gCatalogoProductos.findAll();
    }

    @Override
    public GCatalogoProductos getCatalogoProductos(String producot) {
        return gCatalogoProductos.findByProducto(producot);
    }

    @Override
    public List<ClasificadoresPresupuestarios> getLstClasificadoresPre() {
        return clasificadoresPresupuestarios.findAll();
    }

    @Override
    public List<TipoRecurso> getLstTipoRecurso() {
        return tipoRecurso.findAll();
    }

    @Override
    public Boolean isUnicaFuente(Integer convenio) {
        return pgConvenio.isUnicaFuente(convenio);
    }

    @Override
    public int getOrganismoByConvenio(Integer convenio, Boolean ftePrincipal) {
        return fuentesFinanciamientos.findOrganismoByConvenio(convenio, ftePrincipal);
    }

    @Override
    public NivelDesagregacionPAP getNivelDesagregacionByPlanilla(Integer idPlanilla) {
        return plantillaComp.findByPlantilla(idPlanilla);
    }

    @Override
    public PgEntidadesFinanciadoras getEntidadesFinanciadoras(Integer convenio, Boolean ftePpal) {
        return fuentesFinanciamientos.findEntidadesFinanByConvenio(convenio, ftePpal);
    }

    @Override
    public List<PoaRecursos> getLstPoaRecursos(Integer actividad) {
        return poaRecursos.findAllByActividad(actividad);
    }

    @Override
    public PoaAnosPlanAccion getAnhosPgPgAnnosPlanGlobal(Integer idAnoPlanGlobal) {
        return poaAnosPlanAccion.getAnhoByAnoPlanGlobal(idAnoPlanGlobal);
    }

    @Override
    public PoaRecursosSaldos getPoaRercursoSaldo(Integer recurso, Integer convenio, Integer organismo) {
        return poaSaldo.getPoaRecursosSaldos(recurso, convenio, organismo);
    }

    @Override
    public List<CategoriasDto> getCategoriasDto(Integer idConvenio) {
        return pgCateogiras.finAllCategoriasDtoByConvenio(idConvenio);
    }

    @Override
    public List<ComponentesDto> getComponentesDto(Integer idConvenio) {
        return pgComponentes.finAllComponentesDtoByConvenio(idConvenio);
    }

    @Override
    public List<MontosPapDto> getMontoPapByConvenio(Integer idConvenio) {
        return pgConvenio.findAllByConvenio(idConvenio);
    }
}