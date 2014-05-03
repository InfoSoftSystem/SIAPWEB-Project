/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.dao;

import java.util.Date;

/**
 *
 * @author Infosoft
 */
public interface PersistenciaDao {

    public String generarInsertSQL();

    public Object[] getDatosInsert();

    public String generarUpdateSQL();

    public Object[] getDatosUpdate();

    public void setName(String name);

    public void setFechaDeInsercion(Date fechaDeInsercion);

    public void setFechaDeModificacion(Date fechaDeModificacion);

    public void setFechaDeEliminacion(Date fechaDeEliminacion);

    public Integer getEstadoDeEliminacion();
}