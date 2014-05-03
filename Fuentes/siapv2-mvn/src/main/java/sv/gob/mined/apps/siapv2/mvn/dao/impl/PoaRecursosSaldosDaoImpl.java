/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import sv.gob.mined.apps.siapv2.mvn.dao.PoaRecursosSaldosDao;
import sv.gob.mined.apps.siapv2.mvn.dao.XJdbcTemplate;
import sv.gob.mined.apps.siapv2.mvn.modelo.PoaRecursosSaldos;

/**
 *
 * @author Infosoft
 */
@Repository
public class PoaRecursosSaldosDaoImpl extends XJdbcTemplate implements PoaRecursosSaldosDao {
    
    private PoaRecursosSaldos poaRecursosSaldos;
    
    public PoaRecursosSaldosDaoImpl() {
    }
    
    @Override
    public List<PoaRecursosSaldos> findAll() {
        String sql = "SELECT * FROM poa_recursos_saldos";
        List<PoaRecursosSaldos> poarecursossaldos = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PoaRecursosSaldos.class));
        return poarecursossaldos;
    }
    
    @Override
    public int create() {
        super.setObjeto(poaRecursosSaldos);
        Integer id = super.create();
        poaRecursosSaldos.setPoaSaldoRecurso(id);
        return id;
    }
    
    @Override
    public int update() {
        super.setObjeto(poaRecursosSaldos);
        return super.update();
    }
    
    @Override
    public void setPoaRecursosSaldos(PoaRecursosSaldos recurso) {
        poaRecursosSaldos = recurso;
    }
    
    @Override
    public PoaRecursosSaldos getPoaRecursosSaldos() {
        return poaRecursosSaldos;
    }
    
    @Override
    public PoaRecursosSaldos getPoaRecursosSaldos(Integer recurso, Integer convenio, Integer organismo) {
        String sql = "SELECT * FROM poa_recursos_saldos where estadoDeEliminacion = 0 and recurso=" + recurso + " and convenio = " + convenio + " and organismo = " + organismo;
        List<PoaRecursosSaldos> poarecursossaldos = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PoaRecursosSaldos.class));
        return poarecursossaldos.get(0);
    }
}