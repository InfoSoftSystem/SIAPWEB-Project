/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import sv.gob.mined.apps.siapv2.mvn.dao.PoaReprogramacionesDao;
import sv.gob.mined.apps.siapv2.mvn.dao.XJdbcTemplate;
import sv.gob.mined.apps.siapv2.mvn.modelo.PoaReprogramaciones;

/**
 *
 * @author Infosoft
 */
@Repository
public class PoaReprogramacionesDaoImpl extends XJdbcTemplate implements PoaReprogramacionesDao {

    private PoaReprogramaciones poaReprogramacion;

    public PoaReprogramacionesDaoImpl() {
    }

    @Override
    public List<PoaReprogramaciones> findAll() {
        String sql = "SELECT * FROM poa_reprogramaciones";
        List<PoaReprogramaciones> poareprogramaciones = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PoaReprogramaciones.class));
        return poareprogramaciones;
    }

    @Override
    public int create() {
        super.setObjeto(poaReprogramacion);
        int repro = super.create();
        this.poaReprogramacion.setReprogramacion(repro);
        return repro;
    }

    @Override
    public int update() {
        super.setObjeto(poaReprogramacion);
        return super.update();
    }

    @Override
    public PoaReprogramaciones getPoaReprogramacion() {
        return poaReprogramacion;
    }

    @Override
    public void setPoaReprogramacion(PoaReprogramaciones poaReprogramacion) {
        this.poaReprogramacion = poaReprogramacion;
    }

    @Override
    public List<PoaReprogramaciones> findAllByPoa(Integer poa) {
        String sql = "SELECT * FROM poa_reprogramaciones where poa = " + poa;
        List<PoaReprogramaciones> lstReprogramaciones = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PoaReprogramaciones.class));
        return lstReprogramaciones;
    }
}