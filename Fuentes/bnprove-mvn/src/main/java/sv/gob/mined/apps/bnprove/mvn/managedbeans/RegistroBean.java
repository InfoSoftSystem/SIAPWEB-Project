/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.bnprove.mvn.managedbeans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import org.primefaces.component.inputmask.InputMask;
import org.primefaces.component.inputtext.InputText;
import org.primefaces.component.selectonemenu.SelectOneMenu;
import org.primefaces.context.RequestContext;
import org.primefaces.event.FlowEvent;
import org.primefaces.model.DefaultTreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import sv.gob.mined.apps.bnprove.mvn.bo.ProveedoresBo;
import sv.gob.mined.apps.bnprove.mvn.modelo.ClasificacionEmpresaEconomico;
import sv.gob.mined.apps.bnprove.mvn.modelo.CoberturaTerritorio;
import sv.gob.mined.apps.bnprove.mvn.modelo.Departamento;
import sv.gob.mined.apps.bnprove.mvn.modelo.Empresa;
import sv.gob.mined.apps.bnprove.mvn.modelo.EstadoDeRegistro;
import sv.gob.mined.apps.bnprove.mvn.modelo.Genero;
import sv.gob.mined.apps.bnprove.mvn.modelo.Municipio;
import sv.gob.mined.apps.bnprove.mvn.modelo.OrigenDelCiudadano;
import sv.gob.mined.apps.bnprove.mvn.modelo.Pais;
import sv.gob.mined.apps.bnprove.mvn.modelo.Persona;
import sv.gob.mined.apps.bnprove.mvn.modelo.RegimenDeAdministracion;
import sv.gob.mined.apps.bnprove.mvn.modelo.SectorEconomico;
import sv.gob.mined.apps.bnprove.mvn.modelo.TipoDePersoneria;
import sv.gob.mined.apps.bnprove.mvn.modelo.TiposDeDocumentoLegal;
import sv.gob.mined.apps.bnprove.mvn.util.ArbolRecursivo;
import sv.gob.mined.apps.bnprove.mvn.util.JsfUtil;

/**
 *
 * @author Infosoft
 */
@Component(value = "registroBean")
@Scope(value = "view")
public class RegistroBean {

    private Persona currentPersona;
    private Empresa currentEmpresa;
    private List<String> departamentosUbicacion = new ArrayList<String>();
    private List<CoberturaTerritorio> lstCobertura;
    private List<SectorEconomico> lstSubSector;
    private List<ClasificacionEmpresaEconomico> lstClasificacion;
    private Integer idGenero;
    private Integer idTipoDoc;
    private Integer idPersoneria;
    private String codPais;
    private Integer idOrigen;
    private Integer idEstadoReg;
    private Integer idSector;
    private Integer idSubSector;
    private String espClasificacion;
    private Integer idRegimen;
    private Short numPaso = 0;
    private DefaultTreeNode arbol;
    private Boolean especificacion = false;
    private SectorEconomico subSector;
    /**
     * variables de funcionalidad
     */
    private boolean skip;
    private boolean mostrarPnlJuridica = false;
    private String paso1 = "../../resources/images/personas_enable.png";
    private String paso2 = "../../resources/images/empresa_enable.png";
    private String paso3 = "../../resources/images/ubicacion_enable.png";
    private String paso4 = "../../resources/images/productos_enable.png";
    private Boolean disable = false;
    private String usuario;
    private String tituloWizard = "1 - Persona o Representante Legal";
    @Autowired
    private ProveedoresBo provBo;

    /**
     * Creates a new instance of registroBean
     */
    public RegistroBean() {
    }

    @PostConstruct
    public void init() {
        FacesContext context = FacesContext.getCurrentInstance();
        if (context != null) {
            if (context.getExternalContext().getSessionMap().containsKey(JsfUtil.sUsuario)) {
                usuario = context.getExternalContext().getSessionMap().get(JsfUtil.sUsuario).toString();
                Integer idPersona = (Integer) context.getExternalContext().getSessionMap().get(JsfUtil.sIdPersona);
                currentPersona = provBo.findPersonaById(idPersona);
                currentEmpresa = provBo.findEmpresaByIdOferente(currentPersona.getIdentificadorPrimarioOferente());

                if (currentEmpresa == null) {
                    currentEmpresa = new Empresa();
                    currentEmpresa.setEsContribuyente(0);
                    currentEmpresa.setRegimenDeAdministracion(1);
                    currentEmpresa.setTipoDeEstablecimiento(1);
                } else {
                    idPersoneria = currentEmpresa.getIdentificadorDePersoneria();

                    //cargar Cobertura
                    cargarCobertura(currentEmpresa.getIdentificadorPrimarioDeLaEmpresa());

                    cargarOferta(currentEmpresa.getIdentificadorPrimarioDeLaEmpresa());
                }
            }
        }
    }

    private void cargarCobertura(Integer idEmpresa) {
        lstCobertura = provBo.findAllCobertura(idEmpresa);
        departamentosUbicacion = new ArrayList<String>();

        if (lstCobertura == null) {
            lstCobertura = new ArrayList<CoberturaTerritorio>();
        } else {
            for (CoberturaTerritorio coberturaTerritorio : lstCobertura) {
                departamentosUbicacion.add(coberturaTerritorio.getIdentificadorDelDepartamento().toString());
            }
        }
    }

    private void cargarOferta(Integer idEmpresa) {
        lstClasificacion = provBo.findAllClasificacion(idEmpresa);
    }

    public List<String> getDepartamentosUbicacion() {
        return departamentosUbicacion;
    }

    public void setDepartamentosUbicacion(List<String> departamentosUbicacion) {
        this.departamentosUbicacion = departamentosUbicacion;
    }

    public String getEstadoRegistro() {
        List<EstadoDeRegistro> lst = getLstEstadoRegistros();
        for (EstadoDeRegistro estadoDeRegistro : lst) {
            if (estadoDeRegistro.getIdentificadorDelEstadoDeRegistro() == getCurrentEmpresa().getEstadoDeRegistro()) {
                return estadoDeRegistro.getDescripcionDeEstado();
            }
        }
        return "";
    }

    public void prepareCreate() {
        disable = false;
        currentPersona = new Persona();
    }

    public String onFlowProcess(FlowEvent event) {
        numPaso = Short.parseShort(event.getNewStep().replace("paso", ""));

        if (skip) {
            skip = false;   //reset in case user goes back  
            return "confirm";
        } else {
            if (event.getNewStep().equals("paso1")) {
                tituloWizard = "1 - Persona o Representante Legal";
            }
            if (event.getNewStep().equals("paso2")) {
                tituloWizard = "2 - Empresa";
                /*RequestContext.getCurrentInstance().update("frIncial:imgPaso1");
                 paso1 = "../../resources/images/personas_disable.png";*/
            }
            if (event.getNewStep().equals("paso3")) {
                tituloWizard = "3 - Ubicación";
                /*RequestContext.getCurrentInstance().update("frIncial:imgPaso2");
                 paso2 = "../../resources/images/empresa_disable.png";*/
            }
            if (event.getNewStep().equals("paso4")) {
                tituloWizard = "4 - Que Ofrece";
                /*RequestContext.getCurrentInstance().update("frIncial:imgPaso3");
                 paso3 = "../../resources/images/ubicacion_disable.png";*/
            }
            if (event.getOldStep().equals("paso4")) {
                /*RequestContext.getCurrentInstance().update("frIncial:imgPaso4");
                 paso4 = "../../resources/images/productos_disable.png";*/
            }

            RequestContext.getCurrentInstance().update("frIncial:tituloWizard");
            return event.getNewStep();
        }
    }

    public void tipoPersoneria() {
        mostrarPnlJuridica = (currentEmpresa.getIdentificadorDePersoneria() == 2);
    }

    public boolean isMostrarPnlJuridica() {
        return mostrarPnlJuridica;
    }

    public void setMostrarPnlJuridica(boolean mostrarPnlJuridica) {
        this.mostrarPnlJuridica = mostrarPnlJuridica;
    }

    public String getPaso1() {
        return paso1;
    }

    public void setPaso1(String paso1) {
        this.paso1 = paso1;
    }

    public String getPaso2() {
        return paso2;
    }

    public void setPaso2(String paso2) {
        this.paso2 = paso2;
    }

    public String getPaso3() {
        return paso3;
    }

    public void setPaso3(String paso3) {
        this.paso3 = paso3;
    }

    public String getPaso4() {
        return paso4;
    }

    public void setPaso4(String paso4) {
        this.paso4 = paso4;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void abrirAsistente() {
        String paso = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("opcion");
        RequestContext.getCurrentInstance().execute("wzRegistro.loadStep (wzRegistro.cfg.steps [" + paso + "], true)");
        RequestContext.getCurrentInstance().execute("dlgPersonas.show();");
    }

    public Boolean getDisable() {
        return disable;
    }

    public void setDisable(Boolean disable) {
        this.disable = disable;
    }

    public void cambioUbicacion(ValueChangeEvent event) {
        if (event.getOldValue() != null) {
            if (!((ArrayList<String>) event.getOldValue()).contains("0") && ((ArrayList<String>) event.getNewValue()).contains("0")) {
                departamentosUbicacion.clear();
                ((ArrayList<String>) event.getNewValue()).clear();
                ((ArrayList<String>) event.getNewValue()).add("0");
            } else if (((ArrayList<String>) event.getOldValue()).contains("0") && ((ArrayList<String>) event.getOldValue()).size() == 1
                    && ((ArrayList<String>) event.getNewValue()).indexOf("0") != 0) {
                String codDepa = ((ArrayList<String>) event.getNewValue()).get(0);
                departamentosUbicacion.clear();
                ((ArrayList<String>) event.getNewValue()).clear();
                ((ArrayList<String>) event.getNewValue()).add(codDepa);
            }
        }
    }

    public Persona getCurrentPersona() {
        if (currentPersona == null) {
            currentPersona = new Persona();
        }
        return currentPersona;
    }

    public void validarDepartamento() {
        if (!currentPersona.getIdentificadorDelDepartamento().equals("06")) {
            System.out.println("no ha seleccionado san salvador");
        }


    }

    public void setCurrentPersona(Persona currentPersona) {
        this.currentPersona = currentPersona;
    }

    public Empresa getCurrentEmpresa() {
        if (currentEmpresa == null) {
            currentEmpresa = new Empresa();
            currentEmpresa.setEstadoDeRegistro(1);
            currentEmpresa.setEsContribuyente(0);
        }
        return currentEmpresa;
    }

    public void setCurrentEmpresa(Empresa currenteEmpresa) {
        this.currentEmpresa = currenteEmpresa;
    }

    public void guardar() {
        if (guardarPersona()) {
            Boolean correcto = guardadoEnCascada();

            /*Boolean correcto = true;
             switch (numPaso) {
             case 2:
             correcto = guardarEmpresa();
             break;
             case 3:
             correcto = guardarEmpresa();
             if (correcto) {
             correcto = guardarUbicacion();
             }
             break;
             case 4:
             correcto = guardarEmpresa();
             if (correcto) {
             correcto = guardarUbicacion();
             if (correcto) {
             guardarOferta();
             }
             }
             break;
             }*/

            if (correcto) {
                JsfUtil.addSuccessMessage("Registro almacenado satisfactoriamente");
            }
        }
    }

    private Boolean guardadoEnCascada() {
        Boolean correcto;
        correcto = guardarEmpresa();
        if (correcto) {
            correcto = guardarUbicacion();
        }
        if (correcto) {
            guardarOferta();
        }

        return correcto;
    }

    private Boolean guardarPersona() {
        Boolean valor = isValidaPersona();
        if (valor) {
            if (currentPersona.getIdentificadorDeLaPersona() != null) {
                currentPersona.setFechaDeModificacion(new Date());
                currentEmpresa.setEstadoDeEliminacion(0);
            } else {
                currentPersona.setFechaDeInsercion(new Date());
            }
            provBo.savePersona(currentPersona);
        } else {
            JsfUtil.addErrorMessage("Los campos marcados con rojo son REQUERIDOS");
            abrirTab("0");
        }
        return valor;
    }

    private Boolean guardarEmpresa() {
        Boolean valido = isValidaEmpresa();
        if (valido) {
            if (currentEmpresa.getIdentificadorPrimarioDeLaEmpresa() != null) {
                currentEmpresa.setFechaDeModificacion(new Date());
            } else {
                currentEmpresa.setFechaDeInsercion(new Date());
                currentEmpresa.setIdentificadorPrimarioOferente(currentPersona.getIdentificadorPrimarioOferente());
            }
            if (currentEmpresa.getIdentificadorDePersoneria() == 1) {
                currentEmpresa.setNumeroDeNit(currentPersona.getNumeroDeNit());
            }
            currentEmpresa.setRazonSocial(currentEmpresa.getNombreComercial());
            provBo.saveEmpresa(currentEmpresa);
        } else {
            JsfUtil.addErrorMessage("Los campos marcados con rojo son REQUERIDOS");
            abrirTab("1");
        }
        return valido;
    }

    private Boolean guardarUbicacion() {
        Boolean valido = true;
        if (departamentosUbicacion != null && !departamentosUbicacion.isEmpty()) {
            for (CoberturaTerritorio cobertura : getLstCobertura()) {
                cobertura.setEstadoDeEliminacion(1);
            }

            for (String codDepa : departamentosUbicacion) {
                Boolean existe = false;
                for (CoberturaTerritorio cobertura : lstCobertura) {
                    if (cobertura.getIdentificadorDelDepartamento() == Integer.parseInt(codDepa)) {
                        cobertura.setEstadoDeEliminacion(0);
                        existe = true;
                        break;
                    }
                }

                if (!existe) {
                    CoberturaTerritorio cobertura = new CoberturaTerritorio();
                    cobertura.setIdentificadorDelDepartamento(codDepa.equals("0") ? 15 : Integer.parseInt(codDepa));
                    cobertura.setFechaDeInsercion(new Date());
                    cobertura.setEstadoDeEliminacion(0);
                    cobertura.setIdentificadorPrimarioDeLaEmpresa(currentEmpresa.getIdentificadorPrimarioDeLaEmpresa());

                    lstCobertura.add(cobertura);
                }
            }

            if (!lstCobertura.isEmpty()) {
                for (CoberturaTerritorio cobertura : lstCobertura) {
                    provBo.saveCobertura(cobertura);
                }

                cargarCobertura(currentEmpresa.getIdentificadorPrimarioDeLaEmpresa());
            }
        } else {
            JsfUtil.addErrorMessage("Debe de seleccionar al menos un departamento");
            abrirTab("2");
            valido = false;
        }
        return valido;
    }

    private void guardarOferta() {
        for (ClasificacionEmpresaEconomico clasificacionEmp : getLstClasificacion()) {
            provBo.saveClasificacionEmpresa(clasificacionEmp);
            currentEmpresa.setEstadoDeRegistro(2);
            provBo.saveEmpresa(currentEmpresa);
        }
    }

    public void agregarClasificacion() {
        if (idSector != null && idSubSector != null) {
            Boolean existe = false;
            for (ClasificacionEmpresaEconomico cla : getLstClasificacion()) {
                if (cla.getIdentificadorDelSectorEconomico().equals(idSubSector)) {
                    existe = true;
                    break;
                }
            }

            if (!existe) {
                ClasificacionEmpresaEconomico clasificacion = new ClasificacionEmpresaEconomico();

                if (subSector.getDescripcionDelSectorEconomico().contains("No aparece")) {
                    clasificacion.setEspecializacionPorSubsector(espClasificacion);
                } else {
                    clasificacion.setEspecializacionPorSubsector(subSector.getDescripcionDelSectorEconomico());
                }
                clasificacion.setIdentificadorDelSectorEconomico(idSubSector);
                clasificacion.setIdentificadorPrimarioDeLaEmpresa(currentEmpresa.getIdentificadorPrimarioDeLaEmpresa());
                clasificacion.setEstadoDeEliminacion(0);
                clasificacion.setFechaDeInsercion(new Date());
                clasificacion.setName("admin");
                lstClasificacion.add(clasificacion);
            }

            especificacion = false;
            idSector = null;
            idSubSector = null;
            subSector = null;
            espClasificacion = "";
        }
    }

    public List<Departamento> getLstDepaPer() {
        return provBo.findAllDepartamentos();
    }

    public List<Municipio> getLstMunPer() {
        if (currentPersona != null) {
            return provBo.findAllMunicipioByDepartamento(currentPersona.getIdentificadorDelDepartamento());
        } else {
            return null;
        }
    }

    public List<Departamento> getLstDepaEmp() {
        return provBo.findAllDepartamentos();
    }

    public List<Municipio> getLstMunEmp() {
        if (currentEmpresa != null) {
            return provBo.findAllMunicipioByDepartamento(currentEmpresa.getIdentificadorDelDepartamento());
        } else {
            return null;
        }
    }

    public List<Genero> getLstGeneros() {
        return provBo.findAllGeneros();
    }

    public List<EstadoDeRegistro> getLstEstadoRegistros() {
        return provBo.findAllEstadoRegistro();
    }

    public List<OrigenDelCiudadano> getLstOrigenCiudadano() {
        return provBo.findAllOrigenDelCiudadano();
    }

    public List<Pais> getLstPaises() {
        return provBo.findAllPais();
    }

    public List<SectorEconomico> getLstSectorEconomico() {
        return provBo.findAllSectorEconomico();
    }

    public void setLstSubSectorEconomico() {
        if (idSector != null) {
            lstSubSector = provBo.findAllSubSectorEconomico(idSector);
        }
    }

    public List<TipoDePersoneria> getLstTipoDePersoneria() {
        return provBo.findAllTipoDePersoneria();
    }

    public List<TiposDeDocumentoLegal> getLstTipoDocLegal() {
        return provBo.findAllTiposDeDocumentoLegal();
    }

    public List<RegimenDeAdministracion> getLstRegimenAdmon() {
        return provBo.findAllRegimenAdministracion();
    }

    public ProveedoresBo getProvBo() {
        return provBo;
    }

    public void setProvBo(ProveedoresBo provBo) {
        this.provBo = provBo;
    }

    public Integer getIdPersoneria() {
        return idPersoneria;
    }

    public void setIdPersoneria(Integer idPersoneria) {
        this.idPersoneria = idPersoneria;
    }

    public Integer getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Integer idGenero) {
        this.idGenero = idGenero;
    }

    public Integer getIdTipoDoc() {
        return idTipoDoc;
    }

    public void setIdTipoDoc(Integer idTipoDoc) {
        this.idTipoDoc = idTipoDoc;
    }

    public String getCodPais() {
        return codPais;
    }

    public void setIdPais(String codPais) {
        this.codPais = codPais;
    }

    public Integer getIdOrigen() {
        return idOrigen;
    }

    public void setIdOrigen(Integer idOrigen) {
        this.idOrigen = idOrigen;
    }

    public Integer getIdEstadoReg() {
        return idEstadoReg;
    }

    public void setIdEstadoReg(Integer idEstadoReg) {
        this.idEstadoReg = idEstadoReg;
    }

    public Integer getIdSector() {
        return idSector;
    }

    public void setIdSector(Integer idSector) {
        this.idSector = idSector;
    }

    public Integer getIdSubSector() {
        return idSubSector;
    }

    public void setIdSubSector(Integer idSubSector) {
        this.idSubSector = idSubSector;
    }

    public Integer getIdRegimen() {
        return idRegimen;
    }

    public void setIdRegimen(Integer idRegimen) {
        this.idRegimen = idRegimen;
    }

    public DefaultTreeNode getArbol() {
        if (arbol == null) {
            arbol = ArbolRecursivo.getArbolTblRecursiva(getLstSectorEconomico(), SectorEconomico.class, "getIdentificadorDelSectorEconomico", "getSec_identificadorDelSectorEconomico");
        }
        return arbol;
    }

    public void setArbol(DefaultTreeNode arbol) {
        this.arbol = arbol;
    }

    public void armarArbol() {
        //arbol = ArbolRecursivo.getArbolSectorEconomico(getLstSectorEconomico());
    }

    public Short getNumPaso() {
        return numPaso;
    }

    public void setNumPaso(Short numPaso) {
        this.numPaso = numPaso;
    }

    public List<ClasificacionEmpresaEconomico> getLstClasificacion() {
        if (lstClasificacion == null) {
            lstClasificacion = new ArrayList<ClasificacionEmpresaEconomico>();
        }
        return lstClasificacion;
    }

    public void setLstClasificacion(List<ClasificacionEmpresaEconomico> lstClasificacion) {
        this.lstClasificacion = lstClasificacion;
    }

    public String getEspClasificacion() {
        return espClasificacion;
    }

    public void setEspClasificacion(String espClasificacion) {
        this.espClasificacion = espClasificacion;
    }

    public List<SectorEconomico> getLstSubSector() {
        lstSubSector = provBo.findAllSubSectorEconomico(idSector);
        return lstSubSector;
    }

    public void setLstSubSector(List<SectorEconomico> lstSubSector) {
        this.lstSubSector = lstSubSector;
    }

    public void activarEspecificacion() {
        for (SectorEconomico ss : lstSubSector) {
            if (ss.getIdentificadorDelSectorEconomico().equals(idSubSector)) {
                subSector = ss;

                if (ss.getDescripcionDelSectorEconomico().contains("No aparece")) {
                    especificacion = true;
                    break;
                } else {
                    especificacion = false;
                }
            }
        }
    }

    public Boolean getEspecificacion() {
        return especificacion;
    }

    public void setEspecificacion(Boolean especificacion) {
        this.especificacion = especificacion;
    }

    public String getTituloWizard() {
        return tituloWizard;
    }

    public void setTituloWizard(String tituloWizard) {
        this.tituloWizard = tituloWizard;
    }

    public Boolean isValidaPersona() {
        Boolean valido = true;
        if (currentPersona != null) {
            valido = JsfUtil.addErrorStyle("frIncial", "cbGenero", SelectOneMenu.class, currentPersona.getIdentificadorDeGenero());
            valido = JsfUtil.addErrorStyle("frIncial", "txtPriNombre", InputText.class, currentPersona.getPrimerNombre()) && valido;
            valido = JsfUtil.addErrorStyle("frIncial", "txtPriApellido", InputText.class, currentPersona.getPrimerApellido()) && valido;
            valido = JsfUtil.addErrorStyle("frIncial", "txtDomicilio", InputText.class, currentPersona.getDomicilio()) && valido;
            valido = JsfUtil.addErrorStyle("frIncial", "cbDepaPersona", SelectOneMenu.class, currentPersona.getIdentificadorDelDepartamento()) && valido;
            valido = JsfUtil.addErrorStyle("frIncial", "cbMuniPersona", SelectOneMenu.class, currentPersona.getIdMunicipio()) && valido;
            valido = JsfUtil.addErrorStyle("frIncial", "txtTelPersona", InputMask.class, currentPersona.getNumeroTelefono()) && valido;
            valido = JsfUtil.addErrorStyle("frIncial", "cbOrigen", SelectOneMenu.class, currentPersona.getIdentificadorOrigenlCiudadano()) && valido;
            valido = JsfUtil.addErrorStyle("frIncial", "cbTipoDoc", SelectOneMenu.class, currentPersona.getIdentificadorDeDocumentoLegal()) && valido;
            valido = JsfUtil.addErrorStyle("frIncial", "txtNumDoc", InputText.class, currentPersona.getNumeroDocumentoLegal()) && valido;
        }
        return valido;
    }

    public Boolean isValidaEmpresa() {
        Boolean valido = true;

        if (currentEmpresa != null) {
            valido = JsfUtil.addErrorStyle("frIncial", "cbPersoneria", SelectOneMenu.class, currentEmpresa.getIdentificadorDePersoneria());
            valido = JsfUtil.addErrorStyle("frIncial", "cbPais", SelectOneMenu.class, currentEmpresa.getPais()) && valido;

            if (currentEmpresa.getContribuyente()) {
                valido = JsfUtil.addErrorStyle("frIncial", "txtIva", InputText.class, currentEmpresa.getNumeroIVA()) && valido;
            }
            valido = JsfUtil.addErrorStyle("frIncial", "txtDireccion", InputText.class, currentEmpresa.getDireccionCompleta()) && valido;
            valido = JsfUtil.addErrorStyle("frIncial", "cbDepartamentoEmp", SelectOneMenu.class, currentEmpresa.getIdentificadorDelDepartamento()) && valido;
            valido = JsfUtil.addErrorStyle("frIncial", "cbMunicipioEmp", SelectOneMenu.class, currentEmpresa.getIdMunicipio()) && valido;
        }
        return valido;
    }

    public List<CoberturaTerritorio> getLstCobertura() {
        if (lstCobertura == null) {
            lstCobertura = new ArrayList<CoberturaTerritorio>();
        }
        return lstCobertura;
    }

    public void setLstCobertura(List<CoberturaTerritorio> lstCobertura) {
        this.lstCobertura = lstCobertura;
    }

    private void abrirTab(String numeroTab) {
        RequestContext.getCurrentInstance().execute("wzRegistro.loadStep (wzRegistro.cfg.steps [" + numeroTab + "], true)");
        RequestContext.getCurrentInstance().execute("dlgPersonas.show();");
    }
}