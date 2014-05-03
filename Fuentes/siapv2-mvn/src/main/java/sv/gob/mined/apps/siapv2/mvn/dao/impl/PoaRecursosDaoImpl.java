/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import sv.gob.mined.apps.siapv2.mvn.dao.PoaRecursosDao;
import sv.gob.mined.apps.siapv2.mvn.dao.XJdbcTemplate;
import sv.gob.mined.apps.siapv2.mvn.modelo.PoaRecursos;
import sv.gob.mined.apps.siapv2.mvn.modelo.PoaRecursosSaldos;

/**
 *
 * @author Infosoft
 */
@Repository
public class PoaRecursosDaoImpl extends XJdbcTemplate implements PoaRecursosDao {

    private PoaRecursos recurso;

    public PoaRecursosDaoImpl() {
    }

    @Override
    public int create() {
        super.setObjeto(recurso);
        int idRecurso = super.create();
        this.recurso.setRecurso(idRecurso);
        return idRecurso;
    }

    @Override
    public int update() {
        super.setObjeto(recurso);
        return super.update();
    }

    @Override
    public List<PoaRecursos> findAll() {
        String sql = "SELECT * FROM poa_recursos where estadoDeEliminacion = 0";
        List<PoaRecursos> poarecursos = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PoaRecursos.class));
        return poarecursos;
    }

    @Override
    public void setPoaRecursos(PoaRecursos recurso) {
        this.recurso = recurso;
    }

    @Override
    public PoaRecursos getPoaRecursos() {
        return recurso;
    }

    @Override
    public List<PoaRecursos> findAllByActividad(Integer actividad) {
        String sql = "SELECT * FROM poa_recursos where estadoDeEliminacion = 0 and actividad = " + actividad;
        List<PoaRecursos> poarecursos = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PoaRecursos.class));
        for (PoaRecursos poaRecursos : poarecursos) {
            sql = "SELECT * FROM poa_recursos_saldos where estadoDeEliminacion = 0 and recurso = " + poaRecursos.getRecurso();
            poaRecursos.setLstPoaRecursosSaldos(getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PoaRecursosSaldos.class)));
        }
        
        return poarecursos;
    }
}
