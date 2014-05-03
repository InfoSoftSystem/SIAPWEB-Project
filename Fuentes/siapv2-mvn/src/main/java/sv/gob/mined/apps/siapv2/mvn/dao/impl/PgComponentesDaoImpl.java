/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import sv.gob.mined.apps.siapv2.mvn.dao.PgComponentesDao;
import sv.gob.mined.apps.siapv2.mvn.dao.XJdbcTemplate;
import sv.gob.mined.apps.siapv2.mvn.dto.ComponentesDto;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgComponentes;

/**
 *
 * @author Infosoft
 */
@Repository
public class PgComponentesDaoImpl extends XJdbcTemplate implements PgComponentesDao {

    private String sqlComponentes = "select pg_componentes.componente, "
            + "    pg_componentes.componente_nombre, "
            + "    ISNULL(sum(fteppal.monto_aprobado),0) as monto_apr_fte_ppal, "
            + "    ISNULL(sum(fteppal.monto_preliminar),0) as monto_pre_fte_ppal, "
            + "    ISNULL(sum(ftecont.monto_aprobado),0) as monto_apr_fte_cont, "
            + "    ISNULL(sum(ftecont.monto_preliminar),0) as monto_pre_fte_cont, "
            + "    ISNULL(sum(fteppal.monto_aprobado),0)-ISNULL(sum(ftecont.monto_aprobado),0) as monto_saldo_ppal, "
            + "    ISNULL(sum(fteppal.monto_preliminar),0)-ISNULL(sum(ftecont.monto_preliminar),0) as monto_saldo_cont "
            + "from poa_recursos "
            + "    inner join poa_recursos_saldos fteppal on poa_recursos.recurso = fteppal.recurso "
            + "    inner join fuentes_financiamientos ffppal on fteppal.organismo = ffppal.organismo "
            + "        and ffppal.contrapartida = 0 "
            + "    inner join poa_recursos_saldos ftecont on poa_recursos.recurso = ftecont.recurso "
            + "    inner join fuentes_financiamientos ffcont on ffcont.organismo = ftecont.organismo "
            + "        and ffcont.contrapartida = 0 "
            + "    inner join pg_actividades on poa_recursos.actividad = pg_actividades.actividad "
            + "    inner join pg_metas on pg_actividades.meta = pg_metas.meta "
            + "    inner join pg_componentes on pg_metas.componente = pg_componentes.componente "
            + "    inner join pg_convenio on pg_componentes.convenio = pg_convenio.convenio "
            + "        and ffppal.convenio = pg_convenio.convenio "
            + "where poa_recursos.estadoDeEliminacion = 0 "
            + "    and pg_actividades.estadoDeEliminacion = 0 "
            + "    and pg_metas.estadoDeEliminacion = 0 "
            + "    and pg_convenio.convenio = %d "
            + "group by pg_componentes.componente,"
            + "    pg_componentes.componente_nombre";

    public PgComponentesDaoImpl() {
    }

    @Override
    public List<PgComponentes> findAll(Integer convenio) {
        String sql = "SELECT * FROM pg_componentes where convenio=" + convenio + " and pg__componente is null order by componente, pg__componente";
        List<PgComponentes> pgcomponentes = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PgComponentes.class));
        return pgcomponentes;
    }

    @Override
    public List<PgComponentes> findAllSub(Integer componentePadre) {
        String sql = "SELECT * FROM pg_componentes where pg__componente = " + componentePadre;
        List<PgComponentes> pgcomponentes = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PgComponentes.class));
        return pgcomponentes;
    }

    @Override
    public List<ComponentesDto> finAllComponentesDtoByConvenio(Integer convenio) {
        return getJdbcTemplate().query(String.format(sqlComponentes, convenio), new BeanPropertyRowMapper(ComponentesDto.class));
    }
}
