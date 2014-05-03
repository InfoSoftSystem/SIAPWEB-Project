/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao.impl;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import sv.gob.mined.apps.siapv2.mvn.dao.GCatalogoProductosDao;
import sv.gob.mined.apps.siapv2.mvn.dao.XJdbcTemplate;
import sv.gob.mined.apps.siapv2.mvn.modelo.GCatalogoProductos;

/**
 * 
 * @author Infosoft
 */
@Repository
public class GCatalogoProductosDaoImpl extends XJdbcTemplate implements GCatalogoProductosDao {

    public GCatalogoProductosDaoImpl() {
    }

    @Override
    public List<GCatalogoProductos> findAll() {
        String sql = "SELECT * FROM g_catalogo_productos";
        return getJdbcTemplate().query(sql, new BeanPropertyRowMapper(GCatalogoProductos.class));
    }

    @Override
    public GCatalogoProductos findByProducto(String producto) {
        String sql = "SELECT * FROM g_catalogo_productos where producto = '"+ producto + "'";
        List lst = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(GCatalogoProductos.class));
        if(lst.isEmpty()){
            return null;
        }else{
            return (GCatalogoProductos) lst.get(0);
}
    }
}