/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import sv.gob.mined.apps.siapv2.mvn.dao.PgMetasDao;
import sv.gob.mined.apps.siapv2.mvn.dao.XJdbcTemplate;
import sv.gob.mined.apps.siapv2.mvn.modelo.PgMetas;

/**
 *
 * @author Infosoft
 */
@Repository
public class PgMetasDaoImpl extends XJdbcTemplate implements PgMetasDao {

    private PgMetas pgMeta;

    public PgMetasDaoImpl() {
    }
    
    @Autowired
    private TipoDeMetasDaoImpl tipoMeta;

    public TipoDeMetasDaoImpl getTipoMeta() {
        return tipoMeta;
    }

    public void setTipoMeta(TipoDeMetasDaoImpl tipoMeta) {
        this.tipoMeta = tipoMeta;
    }

    @Override
    public List<PgMetas> findAll(Integer componente) {
        String sql = "SELECT * FROM pg_metas where componente = " + componente + " order by meta";
        List<PgMetas> pgmetas = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(PgMetas.class));
        for (PgMetas pgMetas : pgmetas) {
            pgMetas.setTipoDeMetas(tipoMeta.findById(pgMetas.getIdTipoMeta()));
        }
        return pgmetas;
    }

    @Override
    public int create() {
        super.setObjeto(pgMeta);
        int idMeta = super.create();
        this.pgMeta.setMeta(idMeta);
        return idMeta;
        /*KeyHolder keyHolder = new GeneratedKeyHolder();

        int valor = getJdbcTemplate().update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection cnctn) throws SQLException {
                PreparedStatement ps = cnctn.prepareStatement(getPgMeta().generarInsertSQL(), Statement.RETURN_GENERATED_KEYS);
                ps = JsfUtil.setValuesPreparedStatement(ps, getPgMeta().getDatosInsert());
                return ps;
            }
        }, keyHolder);
        Integer meta = keyHolder.getKey().intValue();
        pgMeta.setMeta(meta);
        return valor;*/
    }

    @Override
    public int update() {
        super.setObjeto(pgMeta);
        return super.update();
        //return getJdbcTemplate().update(pgMeta.generarUpdateSQL(), pgMeta.getDatosUpdate());
    }

    @Override
    public PgMetas getPgMeta() {
        return pgMeta;
    }

    @Override
    public void setPgMeta(PgMetas pgMeta) {
        this.pgMeta = pgMeta;
    }
}
