/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;
import sv.gob.mined.apps.siapv2.mvn.dao.EmpresaDao;
import sv.gob.mined.apps.siapv2.mvn.dao.XJdbcTemplate;
import sv.gob.mined.apps.siapv2.mvn.modelo.Empresa;

/**
 *
 * @author Infosoft
 */
@Repository
public class EmpresaDaoImpl extends XJdbcTemplate implements EmpresaDao {

    public EmpresaDaoImpl() {
    }

    @Override
    public List<Empresa> findEmpresaByRazonSocial(String razonSocial) {
        String sql = "SELECT * FROM Empresa WHERE razonSocial like '%" + razonSocial + "%'";
        return getJdbcTemplate().query(sql, new BeanPropertyRowMapper(Empresa.class));
    }

    @Override
    public List<Empresa> findEmpresaByNit(String numeroNit) {
        String sql = "SELECT * FROM Empresa WHERE numeroDeNit = '" + numeroNit + "'";
        return getJdbcTemplate().query(sql, new BeanPropertyRowMapper(Empresa.class));
    }

    @Override
    public int trasladoOferente(Integer identificadorPrimarioDeLaEmpresa) {
        SimpleJdbcCall jdbcCall;
        jdbcCall =  new SimpleJdbcCall(getJdbcTemplate()).withProcedureName("sp_traslado_oferentes");
        SqlParameterSource in = new MapSqlParameterSource().addValue("idOferente", identificadorPrimarioDeLaEmpresa);
        jdbcCall.execute(in);
        return 1;
    }

    @Override
    public List<Empresa> findbyAll() {
       String sql = "SELECT * FROM Empresa";
       return getJdbcTemplate().query(sql, new BeanPropertyRowMapper(Empresa.class));
    }
}
