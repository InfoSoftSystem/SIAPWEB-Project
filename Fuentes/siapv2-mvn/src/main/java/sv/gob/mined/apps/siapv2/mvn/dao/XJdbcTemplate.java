/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import sv.gob.mined.apps.siapv2.mvn.util.JsfUtil;

/**
 *
 * @author Infosoft
 */
public class XJdbcTemplate {

    private String sUsuario;
    private PersistenciaDao Objeto;
    @Autowired
    JdbcTemplate jdbcTemplate;

    public XJdbcTemplate() {
        sUsuario = JsfUtil.getUsuarioSession();
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int update() {
        if (getObjeto().getEstadoDeEliminacion() == 0) {
            getObjeto().setFechaDeModificacion(new Date());
        } else {
            getObjeto().setFechaDeEliminacion(new Date());
        }
        getObjeto().setName(sUsuario);
        return getJdbcTemplate().update(getObjeto().generarUpdateSQL(), getObjeto().getDatosUpdate());
    }

    public int create() {
        getObjeto().setFechaDeInsercion(new Date());
        getObjeto().setName(sUsuario);
        KeyHolder keyHolder = new GeneratedKeyHolder();

        int valor = getJdbcTemplate().update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection cnctn) throws SQLException {
                PreparedStatement ps = cnctn.prepareStatement(getObjeto().generarInsertSQL(), Statement.RETURN_GENERATED_KEYS);
                ps = JsfUtil.setValuesPreparedStatement(ps, getObjeto().getDatosInsert());
                return ps;
            }
        }, keyHolder);
        Integer idGenerado = keyHolder.getKey().intValue();
        return idGenerado;
    }

    public PersistenciaDao getObjeto() {
        return Objeto;
    }

    public void setObjeto(PersistenciaDao Objeto) {
        this.Objeto = Objeto;
    }
}