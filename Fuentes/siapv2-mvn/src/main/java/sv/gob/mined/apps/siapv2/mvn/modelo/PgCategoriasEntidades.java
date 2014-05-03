/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;

import java.util.Date;
import java.util.List;


/**
 *
 * @author Infosoft
 */

public class PgCategoriasEntidades {
    private Integer categoria;
    private Integer organismo;
    private String categoriaCodigo;
    private String descripcion;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String name;
    private List<PgCategoriasEntidades> pgCategoriasEntidadesList;
    private PgCategoriasEntidades pgCategoria;
    private List<PgCategorias> pgCategoriasList;

    public PgCategoriasEntidades() {
    }

    public PgCategoriasEntidades(Integer categoria) {
        this.categoria = categoria;
    }

    public Integer getCategoria() {
        return categoria;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }

    public Integer getOrganismo() {
        return organismo;
    }

    public void setOrganismo(Integer organismo) {
        this.organismo = organismo;
    }

    public String getCategoriaCodigo() {
        return categoriaCodigo;
    }

    public void setCategoriaCodigo(String categoriaCodigo) {
        this.categoriaCodigo = categoriaCodigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaDeInsercion() {
        return fechaDeInsercion;
    }

    public void setFechaDeInsercion(Date fechaDeInsercion) {
        this.fechaDeInsercion = fechaDeInsercion;
    }

    public Date getFechaDeModificacion() {
        return fechaDeModificacion;
    }

    public void setFechaDeModificacion(Date fechaDeModificacion) {
        this.fechaDeModificacion = fechaDeModificacion;
    }

    public Date getFechaDeEliminacion() {
        return fechaDeEliminacion;
    }

    public void setFechaDeEliminacion(Date fechaDeEliminacion) {
        this.fechaDeEliminacion = fechaDeEliminacion;
    }

    public Integer getEstadoDeEliminacion() {
        return estadoDeEliminacion;
    }

    public void setEstadoDeEliminacion(Integer estadoDeEliminacion) {
        this.estadoDeEliminacion = estadoDeEliminacion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PgCategoriasEntidades> getPgCategoriasEntidadesList() {
        return pgCategoriasEntidadesList;
    }

    public void setPgCategoriasEntidadesList(List<PgCategoriasEntidades> pgCategoriasEntidadesList) {
        this.pgCategoriasEntidadesList = pgCategoriasEntidadesList;
    }

    public PgCategoriasEntidades getPgCategoria() {
        return pgCategoria;
    }

    public void setPgCategoria(PgCategoriasEntidades pgCategoria) {
        this.pgCategoria = pgCategoria;
    }

    public List<PgCategorias> getPgCategoriasList() {
        return pgCategoriasList;
    }

    public void setPgCategoriasList(List<PgCategorias> pgCategoriasList) {
        this.pgCategoriasList = pgCategoriasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (categoria != null ? categoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PgCategoriasEntidades)) {
            return false;
        }
        PgCategoriasEntidades other = (PgCategoriasEntidades) object;
        if ((this.categoria == null && other.categoria != null) || (this.categoria != null && !this.categoria.equals(other.categoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.gob.mined.apps.bnprove.mvn.modelo.PgCategoriasEntidades[ categoria=" + categoria + " ]";
    }
    
}
