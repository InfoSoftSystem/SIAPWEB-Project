/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.bo.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.gob.mined.apps.siapv2.mvn.bo.ReprogramacionBo;
import sv.gob.mined.apps.siapv2.mvn.dao.DetalleCompPorPlantillaDao;
import sv.gob.mined.apps.siapv2.mvn.dao.EstadoPoaReprogramacionDao;
import sv.gob.mined.apps.siapv2.mvn.dao.OrigenDeLosRecursosDao;
import sv.gob.mined.apps.siapv2.mvn.dao.PgConvenioDao;
import sv.gob.mined.apps.siapv2.mvn.dao.PlantillaDeComportamientosDao;
import sv.gob.mined.apps.siapv2.mvn.dao.PoaAnosPlanAccionDao;
import sv.gob.mined.apps.siapv2.mvn.dao.PoaRecursosDao;
import sv.gob.mined.apps.siapv2.mvn.dao.PoaReprogramacionesDao;
import sv.gob.mined.apps.siapv2.mvn.dao.TiposPoaReprogramacionesDao;
import sv.gob.mined.apps.siapv2.mvn.dto.ElementoReproDto;
import sv.gob.mined.apps.siapv2.mvn.modelo.DetalleCompPorPlantilla;
import sv.gob.mined.apps.siapv2.mvn.modelo.EstadoPoaReprogramaciones;
import sv.gob.mined.apps.siapv2.mvn.modelo.OrigenDeLosRecursos;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgConvenio;
import sv.gob.mined.apps.siapv2.mvn.modelo.PlantillaDeComportamientos;
import sv.gob.mined.apps.siapv2.mvn.modelo.PoaAnosPlanAccion;
import sv.gob.mined.apps.siapv2.mvn.modelo.PoaRecursos;
import sv.gob.mined.apps.siapv2.mvn.modelo.PoaReprogramaciones;
import sv.gob.mined.apps.siapv2.mvn.modelo.TiposPoaReprogramaciones;

/**
 *
 * @author Infosoft
 */
@Service
public class ReprogramacionBoImpl implements ReprogramacionBo {

    public ReprogramacionBoImpl() {
    }
    @Autowired
    private EstadoPoaReprogramacionDao estadoPoaReprogramacion;
    @Autowired
    private TiposPoaReprogramacionesDao tiposPoaReprogramaciones;
    @Autowired
    private OrigenDeLosRecursosDao origenDeRecursos;
    @Autowired
    private PgConvenioDao pgConvenio;
    @Autowired
    private PlantillaDeComportamientosDao plantillaComportamiento;
    @Autowired
    private DetalleCompPorPlantillaDao detCompPlantilla;
    @Autowired
    private PoaAnosPlanAccionDao poaAnosPlanAccion;
    @Autowired
    private PoaReprogramacionesDao poaReprogramacion;
    @Autowired
    private PoaRecursosDao poaRecursos;

    @Override
    public List<EstadoPoaReprogramaciones> findAllEstadoPoaReprogramacion() {
        return estadoPoaReprogramacion.findAll();
    }

    @Override
    public List<TiposPoaReprogramaciones> findAllTiposPoaReprogramaciones() {
        return tiposPoaReprogramaciones.findAll();
    }

    @Override
    public List<OrigenDeLosRecursos> getLstOrigenRecursos() {
        return origenDeRecursos.findAll();
    }

    @Override
    public List<PgConvenio> getLstConvenios(Integer idOrigen) {
        return pgConvenio.findAll(idOrigen);
    }

    @Override
    public List<PlantillaDeComportamientos> getLstPlantillaDeComportamiento(Integer origen) {
        return plantillaComportamiento.findAllByOrigen(origen);
    }

    @Override
    public DetalleCompPorPlantilla getDetCompPorPlantilla(Integer convenio) {
        return detCompPlantilla.findByConvenio(convenio);
    }

    @Override
    public List<PoaReprogramaciones> getLstReprogramaciones(Integer poa) {
        return poaReprogramacion.findAllByPoa(poa);
    }

    @Override
    public List<PoaAnosPlanAccion> getLstPoaAnhosPlanAccion(Integer convenio) {
        return poaAnosPlanAccion.getAnhoByConvenio(convenio);
    }

    @Override
    public int saveFichaReprogramacion(PoaReprogramaciones poaReprogramacion) {
        this.poaReprogramacion.setPoaReprogramacion(poaReprogramacion);
        if (poaReprogramacion.getReprogramacion() == null) {
            return this.poaReprogramacion.create();
        } else {
            return this.poaReprogramacion.update();
        }
    }

    @Override
    public List<ElementoReproDto> getLstElementoRepro(Integer convenio) {
        return pgConvenio.findByConvenio(convenio);
    }

    @Override
    public List<PoaRecursos> getLstRecursosByActividad(Integer actividad) {
        return poaRecursos.findAllByActividad(actividad);
    }
}
