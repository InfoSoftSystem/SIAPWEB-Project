/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import sv.gob.mined.apps.siapv2.mvn.dao.PgConvenioDao;
import sv.gob.mined.apps.siapv2.mvn.dao.XJdbcTemplate;
import sv.gob.mined.apps.siapv2.mvn.dto.ElementoReproDto;
import sv.gob.mined.apps.siapv2.mvn.dto.MontosPapDto;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgConvenio;

/**
 *
 * @author Infosoft
 */
@Repository
public class PgConvenioDaoImpl extends XJdbcTemplate implements PgConvenioDao {

    public PgConvenioDaoImpl() {
    }

    @Override
    public List<PgConvenio> findAll(Integer idOrigen) {
        String sql = "SELECT * FROM pg_convenio where idOrigenRecursos = " + idOrigen;
        List<PgConvenio> pgconvenio = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PgConvenio.class));
        return pgconvenio;
    }

    @Override
    public Boolean isUnicaFuente(Integer pgConvenio) {
        String sql = "SELECT existeMasFuentesFinanc "
                + "FROM DetalleCompPorPlantilla "
                + "    inner join pg_convenio on DetalleCompPorPlantilla.identificadorDetalleComportamiento = pg_convenio.identificadorDetalleComportamiento where convenio=" + pgConvenio;
        try {
            return getJdbcTemplate().queryForInt(sql) == 1;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<MontosPapDto> findAllByConvenio(Integer idConvenio) {
        String sql = "select poa_recursos.poa, 'Año ' + cast(poa_anos_plan_accion.ano as varchar) + ' - ' + cast(poa_anos_plan_accion.ano_fiscal as varchar) as descripcionAnho, "
                + "    ISNULL(sum(fteppal.monto_preliminar),0) as montoFtePpal, "
                + "    ISNULL(sum(ftecont.monto_preliminar),0) as montoFteCont, "
                + "    ISNULL(sum(fteppal.monto_preliminar),0)+ISNULL(sum(ftecont.monto_preliminar),0) as montoTotal, "
                + "    pg_estado_plan_accion.estado_descripcion as estadoPap "
                + "from poa_recursos "
                + "    inner join poa_anos_plan_accion on poa_recursos.poa = poa_anos_plan_accion.poa "
                + "    inner join pg_estado_plan_accion on poa_anos_plan_accion.estado_plan = pg_estado_plan_accion.estado_plan "
                + "    inner join poa_recursos_saldos fteppal on poa_recursos.recurso = fteppal.recurso "
                + "    inner join fuentes_financiamientos ffppal on fteppal.organismo = ffppal.organismo "
                + "        and ffppal.contrapartida = 0 "
                + "    inner join poa_recursos_saldos ftecont on poa_recursos.recurso = ftecont.recurso "
                + "    inner join fuentes_financiamientos ffcont on ffcont.organismo = ftecont.organismo "
                + "        and ffcont.contrapartida = 1 "
                + "    inner join pg_actividades on poa_recursos.actividad = pg_actividades.actividad "
                + "    inner join pg_metas on pg_actividades.meta = pg_metas.meta "
                + "    inner join pg_componentes on pg_metas.componente = pg_componentes.componente "
                + "    inner join pg_convenio on pg_componentes.convenio = pg_convenio.convenio "
                + "        and ffppal.convenio = pg_convenio.convenio "
                + "where poa_recursos.estadoDeEliminacion = 0 "
                + "    and pg_actividades.estadoDeEliminacion = 0 "
                + "    and pg_metas.estadoDeEliminacion = 0 "
                + "    and pg_convenio.convenio = " + idConvenio
                + " group by poa_recursos.poa, 'Año ' + cast(poa_anos_plan_accion.ano as varchar) + ' - ' + cast(poa_anos_plan_accion.ano_fiscal as varchar) ,"
                + "    pg_estado_plan_accion.estado_descripcion";

        return getJdbcTemplate().query(sql, new BeanPropertyRowMapper(MontosPapDto.class));
    }

    @Override
    public List<ElementoReproDto> findByConvenio(Integer idConvenio) {
        String sql = "select pg_actividades.actividad, cast(componente_padre.codigo_componente as varchar) + '/' + cast(pg_componentes.codigo_componente as varchar) + '/' + "
                + "    cast(pg_metas.codigo_meta as varchar) + '/' + cast(pg_actividades.codigo_actividad as varchar) as descripcion "
                + "from dbo.pg_componentes "
                + "    inner join pg_componentes componente_padre on componente_padre.componente = pg_componentes.pg__componente "
                + "    inner join pg_metas on pg_componentes.componente = pg_metas.componente "
                + "    inner join pg_actividades on pg_actividades.meta = pg_metas.meta "
                + "where pg_metas.estadoDeEliminacion = 0 "
                + "    and pg_actividades.estadoDeEliminacion = 0 "
                + "    and pg_componentes.estadoDeEliminacion = 0 "
                + "    and componente_padre.estadoDeEliminacion = 0 "
                + "    and pg_componentes.convenio = " + idConvenio;
        return getJdbcTemplate().query(sql, new BeanPropertyRowMapper(ElementoReproDto.class));
    }
}