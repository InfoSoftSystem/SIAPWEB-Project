/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Infosoft
 */
public class GCatalogoProductos implements Serializable {
    
    private String producto;
    private String name;
    private Integer unidad;
    private String clasificadorPresupuestario;
    private Integer presentacion;
    private String gCProducto;
    private Integer tipoUnidadMedida;
    private int tipoServicioBien;
    private String descripcion;
    private Date fechaActualizacion;
    private BigDecimal precio;
    private String catalogoLaci;
    private Short base;
    private Short posicionCotizado;
    private Short noUaci;
    private Short noReprogramable;
    private String productoOnu;
    private Short activo;

    public GCatalogoProductos() {
    }

    public GCatalogoProductos(String producto) {
        this.producto = producto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUnidad() {
        return unidad;
    }

    public void setUnidad(Integer unidad) {
        this.unidad = unidad;
    }

    public String getClasificadorPresupuestario() {
        return clasificadorPresupuestario;
    }

    public void setClasificadorPresupuestario(String clasificadorPresupuestario) {
        this.clasificadorPresupuestario = clasificadorPresupuestario;
    }

    public Integer getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(Integer presentacion) {
        this.presentacion = presentacion;
    }

    public String getGCProducto() {
        return gCProducto;
    }

    public void setGCProducto(String gCProducto) {
        this.gCProducto = gCProducto;
    }

    public Integer getTipoUnidadMedida() {
        return tipoUnidadMedida;
    }

    public void setTipoUnidadMedida(Integer tipoUnidadMedida) {
        this.tipoUnidadMedida = tipoUnidadMedida;
    }

    public int getTipoServicioBien() {
        return tipoServicioBien;
    }

    public void setTipoServicioBien(int tipoServicioBien) {
        this.tipoServicioBien = tipoServicioBien;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public String getCatalogoLaci() {
        return catalogoLaci;
    }

    public void setCatalogoLaci(String catalogoLaci) {
        this.catalogoLaci = catalogoLaci;
    }

    public Short getBase() {
        return base;
    }

    public void setBase(Short base) {
        this.base = base;
    }

    public Short getPosicionCotizado() {
        return posicionCotizado;
    }

    public void setPosicionCotizado(Short posicionCotizado) {
        this.posicionCotizado = posicionCotizado;
    }

    public Short getNoUaci() {
        return noUaci;
    }

    public void setNoUaci(Short noUaci) {
        this.noUaci = noUaci;
    }

    public Short getNoReprogramable() {
        return noReprogramable;
    }

    public void setNoReprogramable(Short noReprogramable) {
        this.noReprogramable = noReprogramable;
    }

    public String getProductoOnu() {
        return productoOnu;
    }

    public void setProductoOnu(String productoOnu) {
        this.productoOnu = productoOnu;
    }

    public Short getActivo() {
        return activo;
    }

    public void setActivo(Short activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return producto + " - " + descripcion;
    }
    
}
