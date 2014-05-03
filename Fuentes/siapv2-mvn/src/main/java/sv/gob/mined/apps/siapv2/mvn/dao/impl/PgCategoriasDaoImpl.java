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
import sv.gob.mined.apps.siapv2.mvn.dao.PgCategoriasDao;
import sv.gob.mined.apps.siapv2.mvn.dto.CategoriasDto;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgCategorias;

/**
 *
 * @author Infosoft
 */
@Repository
public class PgCategoriasDaoImpl implements PgCategoriasDao {

    String sqlCategorias = "select pg_categorias.id_categoria, "
            + "    pg_categorias.descripcion, "
            + "    ISNULL(sum(fteppal.monto_aprobado),0) as monto_apr_fte_ppal, "
            + "    ISNULL(sum(ftecont.monto_aprobado),0) as monto_apr_fte_cont, "
            + "    ISNULL(sum(fteppal.monto_preliminar),0) as monto_pre_fte_ppal, "
            + "    ISNULL(sum(ftecont.monto_preliminar),0) as monto_pre_fte_cont, "
            + "    ISNULL(sum(fteppal.monto_aprobado),0)+ISNULL(sum(ftecont.monto_aprobado),0) as monto_saldo_ppal, "
            + "    ISNULL(sum(fteppal.monto_preliminar),0)+ISNULL(sum(ftecont.monto_preliminar),0) as monto_saldo_cont "
            + "from pg_categorias "
            + "    inner join poa_recursos on pg_categorias.id_categoria = poa_recursos.id_categoria "
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
            + "    and pg_convenio.convenio = %d "
            + "group by pg_categorias.id_categoria, "
            + "    pg_categorias.descripcion";

    public PgCategoriasDaoImpl() {
    }
    @Autowired
    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<PgCategorias> findAll() {
        String sql = "SELECT * FROM pg_categorias";
        List<PgCategorias> pgcategorias = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PgCategorias.class));
        return pgcategorias;
    }

    @Override
    public List<CategoriasDto> finAllCategoriasDtoByConvenio(Integer idConvenio) {
        return getJdbcTemplate().query(String.format(sqlCategorias, idConvenio), new BeanPropertyRowMapper(CategoriasDto.class));
    }
}