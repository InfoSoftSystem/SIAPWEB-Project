/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.bo;

import java.util.List;
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
public interface ReprogramacionBo {
    
    public int saveFichaReprogramacion(PoaReprogramaciones poaReprogramacion);

    public List<EstadoPoaReprogramaciones> findAllEstadoPoaReprogramacion();

    public List<TiposPoaReprogramaciones> findAllTiposPoaReprogramaciones();

    public List<OrigenDeLosRecursos> getLstOrigenRecursos();

    public List<PgConvenio> getLstConvenios(Integer idOrigen);

    public List<PlantillaDeComportamientos> getLstPlantillaDeComportamiento(Integer convenio);

    public DetalleCompPorPlantilla getDetCompPorPlantilla(Integer convenio);
    
    public List<PoaRecursos> getLstRecursosByActividad(Integer actividad);
    
    public List<PoaReprogramaciones> getLstReprogramaciones(Integer poa);
    
    public List<PoaAnosPlanAccion> getLstPoaAnhosPlanAccion(Integer convenio);
    
    public List<ElementoReproDto> getLstElementoRepro(Integer convenio);
}
