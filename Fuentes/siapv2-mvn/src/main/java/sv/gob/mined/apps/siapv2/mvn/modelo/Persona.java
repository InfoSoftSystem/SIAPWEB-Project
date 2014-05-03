/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.modelo;

import java.util.Date;

/**
 *
 * @author Infosoft
 */
public class Persona {
    private Integer identificadorDeLaPersona;
    private Integer identificadorDeCliente;
    private Integer identificadorDeGenero;
    private Integer identificadorDeDocumentoLegal;
    private Integer identificadorOrigenlCiudadano;
    private String primerApellido;
    private String segundoApellido;
    private String primerNombre;
    private String segundoNombre;
    private Date fechaDeNacimiento;
    private String numeroDeDui;
    private String numeroDeNit;
    private String numeroTelefono;
    private String numeroCelular;
    private String Domicilio;
    private String codigo_departamento;
    private Integer id_municipio;
    private String profesion;
    private String aCasada;
    private String eMail;
    private Integer inactivo;
    private String canton;
    private String direccionOficina;
    private String telefonoOficina;
    private String estadoOProvincia;
    private String lecturaDeFirma;
    private String numeroDocumentoLegal;
    private Date lugarYFechaExpedicion;
    private String isssPersonal;
    private String sitioWeb;
    private String name;
    private String usuarioDeLaPersona;
    private String claveDeAccesoDeLaPersona;
    private Date fechaDeInsercion;
    private Date fechaDeModificacion;
    private Date fechaDeEliminacion;
    private Integer estadoDeEliminacion;
    private String identificadorDeLaSesion;
    private String lugarEntregaDocumentos;
    private Persona per;
    
    public Persona() {
    }

    public Integer getIdentificadorDeLaPersona() {
        return identificadorDeLaPersona;
    }

    public void setIdentificadorDeLaPersona(Integer identificadorDeLaPersona) {
        this.identificadorDeLaPersona = identificadorDeLaPersona;
    }

    public Persona(Persona per) {
        this.per = per;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public String getACasada() {
        return aCasada;
    }

    public void setACasada(String aCasada) {
        this.aCasada = aCasada;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getClaveDeAccesoDeLaPersona() {
        return claveDeAccesoDeLaPersona;
    }

    public void setClaveDeAccesoDeLaPersona(String claveDeAccesoDeLaPersona) {
        this.claveDeAccesoDeLaPersona = claveDeAccesoDeLaPersona;
    }

    public String getCodigo_departamento() {
        return codigo_departamento;
    }

    public void setCodigo_departamento(String codigo_departamento) {
        this.codigo_departamento = codigo_departamento;
    }

    public String getDireccionOficina() {
        return direccionOficina;
    }

    public void setDireccionOficina(String direccionOficina) {
        this.direccionOficina = direccionOficina;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public Integer getEstadoDeEliminacion() {
        return estadoDeEliminacion;
    }

    public void setEstadoDeEliminacion(Integer estadoDeEliminacion) {
        this.estadoDeEliminacion = estadoDeEliminacion;
    }

    public String getEstadoOProvincia() {
        return estadoOProvincia;
    }

    public void setEstadoOProvincia(String estadoOProvincia) {
        this.estadoOProvincia = estadoOProvincia;
    }

    public Date getFechaDeEliminacion() {
        return fechaDeEliminacion;
    }

    public void setFechaDeEliminacion(Date fechaDeEliminacion) {
        this.fechaDeEliminacion = fechaDeEliminacion;
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

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Integer getId_municipio() {
        return id_municipio;
    }

    public void setId_municipio(Integer id_municipio) {
        this.id_municipio = id_municipio;
    }

    public Integer getIdentificadorDeCliente() {
        return identificadorDeCliente;
    }

    public void setIdentificadorDeCliente(Integer identificadorDeCliente) {
        this.identificadorDeCliente = identificadorDeCliente;
    }

    public Integer getIdentificadorDeDocumentoLegal() {
        return identificadorDeDocumentoLegal;
    }

    public void setIdentificadorDeDocumentoLegal(Integer identificadorDeDocumentoLegal) {
        this.identificadorDeDocumentoLegal = identificadorDeDocumentoLegal;
    }

    public Integer getIdentificadorDeGenero() {
        return identificadorDeGenero;
    }

    public void setIdentificadorDeGenero(Integer identificadorDeGenero) {
        this.identificadorDeGenero = identificadorDeGenero;
    }

    public String getIdentificadorDeLaSesion() {
        return identificadorDeLaSesion;
    }

    public void setIdentificadorDeLaSesion(String identificadorDeLaSesion) {
        this.identificadorDeLaSesion = identificadorDeLaSesion;
    }

    public Integer getIdentificadorOrigenlCiudadano() {
        return identificadorOrigenlCiudadano;
    }

    public void setIdentificadorOrigenlCiudadano(Integer identificadorOrigenlCiudadano) {
        this.identificadorOrigenlCiudadano = identificadorOrigenlCiudadano;
    }

    public Integer getInactivo() {
        return inactivo;
    }

    public void setInactivo(Integer inactivo) {
        this.inactivo = inactivo;
    }

    public String getIsssPersonal() {
        return isssPersonal;
    }

    public void setIsssPersonal(String isssPersonal) {
        this.isssPersonal = isssPersonal;
    }

    public String getLecturaDeFirma() {
        return lecturaDeFirma;
    }

    public void setLecturaDeFirma(String lecturaDeFirma) {
        this.lecturaDeFirma = lecturaDeFirma;
    }

    public String getLugarEntregaDocumentos() {
        return lugarEntregaDocumentos;
    }

    public void setLugarEntregaDocumentos(String lugarEntregaDocumentos) {
        this.lugarEntregaDocumentos = lugarEntregaDocumentos;
    }

    public Date getLugarYFechaExpedicion() {
        return lugarYFechaExpedicion;
    }

    public void setLugarYFechaExpedicion(Date lugarYFechaExpedicion) {
        this.lugarYFechaExpedicion = lugarYFechaExpedicion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getNumeroDeDui() {
        return numeroDeDui;
    }

    public void setNumeroDeDui(String numeroDeDui) {
        this.numeroDeDui = numeroDeDui;
    }

    public String getNumeroDeNit() {
        return numeroDeNit;
    }

    public void setNumeroDeNit(String numeroDeNit) {
        this.numeroDeNit = numeroDeNit;
    }

    public String getNumeroDocumentoLegal() {
        return numeroDocumentoLegal;
    }

    public void setNumeroDocumentoLegal(String numeroDocumentoLegal) {
        this.numeroDocumentoLegal = numeroDocumentoLegal;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    public String getTelefonoOficina() {
        return telefonoOficina;
    }

    public void setTelefonoOficina(String telefonoOficina) {
        this.telefonoOficina = telefonoOficina;
    }

    public String getUsuarioDeLaPersona() {
        return usuarioDeLaPersona;
    }

    public void setUsuarioDeLaPersona(String usuarioDeLaPersona) {
        this.usuarioDeLaPersona = usuarioDeLaPersona;
    }
    

    public Persona getPer() {
        return per;
    }

    public void setPer(Persona per) {
        this.per = per;
    }

    public String generarInsertSQL() {
        String query = "INSERT INTO dbo.Persona (identificadorDeGenero, identificadorDeDocumentoLegal, identificadorOrigenlCiudadano, primerApellido, segundoApellido, primerNombre, segundoNombre, fechaDeNacimiento, numeroDeDui, numeroDeNit, numeroTelefono, numeroCelular, Domicilio, codigo_departamento, id_municipio, profesion, aCasada, eMail, inactivo, canton, direccionOficina, telefonoOficina, estadoOProvincia, lecturaDeFirma, numeroDocumentoLegal, lugarYFechaExpedicion, isssPersonal, sitioWeb,name , usuarioDeLaPersona, claveDeAccesoDeLaPersona, fechaDeInsercion, fechaDeModificacion, fechaDeEliminacion, estadoDeEliminacion, identificadorDeLaSesion, lugarEntregaDocumentos) VALUES ("+per.getIdentificadorDeGenero()+","+per.getIdentificadorDeDocumentoLegal()+","+per.getIdentificadorOrigenlCiudadano()+","+per.getPrimerApellido()+","+per.getSegundoApellido()+","+per.getPrimerNombre()+","+per.getSegundoNombre()+","+ per.getFechaDeNacimiento()+","+ per.getNumeroDeDui()+","+ per.getNumeroDeNit()+","+ per.getNumeroTelefono()+","+ per.getNumeroCelular()+","+ per.getDomicilio()+","+ per.getCodigo_departamento()+","+ per.getId_municipio()+","+ per.getProfesion()+","+ per.getACasada()+","+ per.getEMail()+","+ per.getInactivo()+","+ per.getCanton()+","+ per.getDireccionOficina()+","+ per.getTelefonoOficina()+","+ per.getEstadoOProvincia()+","+ per.getLecturaDeFirma()+","+ per.getNumeroDocumentoLegal()+","+ per.getLugarYFechaExpedicion()+","+ per.getIsssPersonal()+","+ per.getSitioWeb()+","+per.getName() +","+ per.getUsuarioDeLaPersona()+","+ per.getClaveDeAccesoDeLaPersona()+","+ per.getFechaDeInsercion()+","+ per.getFechaDeModificacion()+","+ per.getFechaDeEliminacion()+","+ per.getEstadoDeEliminacion()+","+ per.getIdentificadorDeLaSesion()+","+ per.getLugarEntregaDocumentos()+")";
        return query;
    }

    public Object[] getDatosInsert(){
        return new Object[]{identificadorDeCliente, identificadorDeGenero , identificadorDeDocumentoLegal ,identificadorOrigenlCiudadano, primerApellido, segundoApellido, primerNombre, segundoNombre, fechaDeNacimiento, numeroDeDui, numeroDeNit, numeroTelefono, numeroCelular, Domicilio, codigo_departamento, id_municipio, profesion, aCasada, eMail, inactivo, canton, direccionOficina, telefonoOficina, estadoOProvincia, lecturaDeFirma, numeroDocumentoLegal, lugarYFechaExpedicion, isssPersonal, sitioWeb, name, usuarioDeLaPersona, claveDeAccesoDeLaPersona, fechaDeInsercion, fechaDeModificacion, fechaDeEliminacion, estadoDeEliminacion, identificadorDeLaSesion, lugarEntregaDocumentos};
    }
    public String generarUpdateSQL() {
        String query = "UPDATE dbo.Persona SET identificadorDeLaSesion ="+ per.getIdentificadorDeLaSesion()+", fechaDeInsercion ="+ per.getFechaDeInsercion()+", identificadorDeGenero ="+per.getIdentificadorDeGenero()+", primerNombre ="+per.getPrimerNombre()+", segundoNombre ="+per.getSegundoNombre()+", primerApellido ="+per.getPrimerApellido()+", segundoApellido ="+per.getSegundoApellido()+", aCasada ="+per.getACasada()+", Domicilio = "+per.getDomicilio()+", numeroTelefono ="+per.getNumeroTelefono()+", canton ="+per.getCanton()+", codigo_departamento ="+per.getCodigo_departamento()+", id_municipio ="+per.getId_municipio()+", direccionOficina ="+per.getDireccionOficina()+", telefonoOficina ="+per.getTelefonoOficina()+", fechaDeNacimiento ="+per.getFechaDeNacimiento()+", lecturaDeFirma ="+per.getLecturaDeFirma()+", identificadorOrigenlCiudadano ="+per.getIdentificadorOrigenlCiudadano()+", identificadorDeDocumentoLegal ="+per.getIdentificadorDeDocumentoLegal()+", numeroDocumentoLegal ="+per.getNumeroDocumentoLegal()+", lugarYFechaExpedicion ="+per.getLugarYFechaExpedicion()+", numeroDeNit ="+per.getNumeroDeNit()+", numeroCelular ="+per.getNumeroCelular()+", eMail ="+per.getEMail()+", sitioWeb ="+per.getSitioWeb()+", isssPersonal ="+per.getIsssPersonal()+", profesion ="+per.getProfesion()+" WHERE identificadorDeLaPersona ="+ per.getIdentificadorDeLaPersona();
        return query;
    }
}