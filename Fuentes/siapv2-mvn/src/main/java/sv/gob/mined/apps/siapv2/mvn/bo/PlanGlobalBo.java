/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.bo;

import java.util.List;
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
public interface PlanGlobalBo {

    public List<OrigenDeLosRecursos> getLstOrigenRecursos();

    public List<PgConvenio> getLstConvenios(Integer idOrigen);

    public List<EstadoEjecConvenio> getLstEstadoEjecConvenio();

    public NivelDesagregacionPAP getNivelDesagregacionByPlanilla(Integer idPlanilla);
    
    public DetalleCompPorPlantilla getDetCompPorPlantilla(Integer convenio);

    public List<PgComponentes> getLstComponente(Integer convenio);

    public List<PgComponentes> getLstSubComponente(Integer componente);

    public List<PgMetas> getLstMetas(Integer componente);

    public List<PgActividades> getLstActividades(Integer meta);
    
    public List<PoaRecursos> getLstPoaRecursos(Integer actividad);

    public List<TipoDeMetas> getLstTipoMetas();

    public List<PgAnosPlanGlobal> getLstAnhosPg(Integer convenio);

    public List<GCatalogoProductos> getLstCatalogoProductos();

    public List<TipoRecurso> getLstTipoRecurso();
    
    public List<CategoriasDto> getCategoriasDto(Integer idConvenio);
    
    public List<ComponentesDto> getComponentesDto(Integer idConvenio);

    public int getOrganismoByConvenio(Integer convenio, Boolean ftePrincipal);

    public GCatalogoProductos getCatalogoProductos(String producot);

    public List<ClasificadoresPresupuestarios> getLstClasificadoresPre();

    public List<PgCategorias> getLstPgCategorias();
    
    public PoaRecursosSaldos getPoaRercursoSaldo(Integer recurso, Integer convenio, Integer organismo);

    public PgAnosPlanGlobal getAnhosPgByKey(Integer id);
    
    public PoaAnosPlanAccion getAnhosPgPgAnnosPlanGlobal(Integer idAnoPlanGlobal);

    public TipoDeMetas getTipoMetaByKey(Integer id);

    public int saveMeta(PgMetas pgMeta);

    public int saveActividad(PgActividades pgAct);

    public int saveRecurso(PoaRecursos poaRecurso);
    
    public int saveRecursoSaldo(PoaRecursosSaldos poaRecursosSaldos);

    public Boolean isUnicaFuente(Integer convenio);
    
    public PgEntidadesFinanciadoras getEntidadesFinanciadoras(Integer convenio, Boolean ftePpal);

    public List<MontosPapDto> getMontoPapByConvenio(Integer idConvenio);
}