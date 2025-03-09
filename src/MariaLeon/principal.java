/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MariaLeon;
import MariaLeon.base.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
/**
 *
 * @author Maria liz
 */


public class principal {
    public static void main(String[] args) {
        String uuid = UUID.randomUUID().toString();
        ComponenteMilitar componenteMilitar = new ComponenteMilitar( );
        componenteMilitar.setCodigo(uuid);
        componenteMilitar.setNombre("Mario");
        componenteMilitar.setDescripcion("tiene una ");
        
        CriterioAscenso ascenso=new CriterioAscenso();
        ascenso.setCodigo(uuid);
        ascenso.setDescripcion("Ascendido a Comandante ");
        ascenso.setTipo("Comandante ");
        
                
       CriterioAscenso ascenso2=new CriterioAscenso();
        ascenso2.setCodigo(uuid);
        ascenso2.setDescripcion("Ascendido a Coronel ");
        ascenso2.setTipo("Coronel ");
        List<CriterioAscenso> criteriosDeAscenso = new ArrayList<CriterioAscenso>();
               criteriosDeAscenso.add(ascenso);
               criteriosDeAscenso.add(ascenso2);
                     
        CuerpoMilitar cuerpoMilitar=new CuerpoMilitar();
        cuerpoMilitar.setDescripcion("Este es el ejercito Tierra ");
        cuerpoMilitar.setCodigo(uuid);
        cuerpoMilitar.setEstructuraMando("Coronel ");
        cuerpoMilitar.setNombre("Terrestre");
        
        
        DocumentoIdentidad documentoIdentidad=new DocumentoIdentidad();
        documentoIdentidad.setNumero(uuid);
        documentoIdentidad.setTipo("Cedula");
        documentoIdentidad.setTipoSangre("o+");
        documentoIdentidad.setNumero(uuid+"1102229564");
        
        
        ContactoEmergencia contactoEmergencia=new ContactoEmergencia();
        contactoEmergencia.setNombre("JUAN");
        contactoEmergencia.setApellido("Martinez");
        contactoEmergencia.setEmail("JuanMartinez@gmail.com");
        contactoEmergencia.setGenero("Masculino");
        contactoEmergencia.setParentesco("Padre");
        contactoEmergencia.setFechaNacimiento(new Date("10/25/1993"));
        
        ContactoEmergencia contactoEmergencia2=new ContactoEmergencia();
        contactoEmergencia2.setNombre("Yana");
        contactoEmergencia2.setApellido("Palacio");
        contactoEmergencia2.setEmail("YanaPalacio@gmail.com");
        contactoEmergencia2.setGenero("Femenino");
        contactoEmergencia2.setParentesco("Madre");
        contactoEmergencia2.setFechaNacimiento(new Date("10/25/1995"));
        List<ContactoEmergencia> ContactoEmergencia = new ArrayList<ContactoEmergencia>();
        ContactoEmergencia.add(contactoEmergencia2);

        
        System.out.println(""+contactoEmergencia.getFechaNacimiento());
        Funcion funcion=new Funcion();
        funcion.setCodigo("2345");
        funcion.setDescripcion("Limpiar Armamento  ");
        funcion.setNombre("Limpieza ");
        
        funcion.setProcedimiento("Limpiar todas las armas ");
        
        Funcion funcion2=new Funcion();
        funcion2.setCodigo("2345");
        funcion2.setDescripcion("Limpio Armamento  ");
        funcion2.setNombre("Limpio ");
        funcion2.setProcedimiento("Limpio todas las armas ");
        List<Funcion> listaFunciones = new ArrayList<Funcion>();
         listaFunciones.add(funcion2);

        Rango rango=new Rango();
        rango.setCodigo(uuid);
        rango.setTiempoMinAscenso(4);
        rango.setLinea("Defensa");
        rango.setDescripcion("Activo");
        rango.setInsignia("Estrella");
        rango.setNombre("Coronel");
        rango.setCuerpoMilitar(cuerpoMilitar);
        rango.setCriteriosAscenso(criteriosDeAscenso);
        
        Labor labor=new Labor();
        labor.setCodigo("23445");
        labor.setDescripcion("Nada");
        labor.setFechaAsignacion(new Date("03/09/2003"));
        labor.setFechaFin(new Date("10/09/2003"));
        labor.setFunciones(listaFunciones);
        
        Labor labor2=new Labor();
        labor2.setCodigo("23445");
        labor2.setDescripcion("Nada");
        labor2.setFechaAsignacion(new Date("03/09/2003"));
        labor2.setFechaFin(new Date("10/09/2003"));
        labor2.setFunciones(listaFunciones);
        List<Labor> listaLabores = new ArrayList<Labor>();
         listaLabores.add(labor2);

        Actividad actividad2=new Actividad();
        actividad2.setAreaAplicacion("Campamento");
        actividad2.setCodigo("3456");
        actividad2.setDescripcion("Selvatico");
        actividad2.setFecha(new Date(23/05/2004));
        List<Actividad> listaActividades = new ArrayList<Actividad>();
        listaActividades.add(actividad2);
        
        
        Soldado soldado=new Soldado();
        soldado.setAlturaInicial(1.80);
        soldado.setApellido("Alcazar");
        soldado.setCodigoMilitar(uuid);
        soldado.setContactosEmergencia(ContactoEmergencia);
        soldado.setCuerpoMilitar(cuerpoMilitar);
        soldado.setDireccion("San Diego");
        soldado.setDocumentoIdentidad(documentoIdentidad);
        soldado.setEdad(26);
        soldado.setEmail("Alcazar123@gmail.com");
        soldado.setFechaIngreso(new Date("23/10/2014"));
        soldado.setFechaNacimiento(new Date("10/10/1999"));
        soldado.setGenero("Femenino");
        soldado.setLabores(listaLabores);
        soldado.setListaActividades(listaActividades );
        soldado.setRango(rango);
        soldado.setTelefono("3205446987");
        List<Soldado> listaInstructores = new ArrayList<Soldado>();
        listaInstructores.add(soldado);
        
         Soldado soldado2=new Soldado();
        soldado2.setAlturaInicial(1.80);
        soldado2.setApellido("Montes");
        soldado2.setCodigoMilitar(uuid);
        soldado2.setContactosEmergencia(ContactoEmergencia);
        soldado2.setCuerpoMilitar(cuerpoMilitar);
        soldado2.setDireccion("San Diego");
        soldado2.setDocumentoIdentidad(documentoIdentidad);
        soldado2.setEdad(26);
        soldado2.setEmail("Alcazar123@gmail.com");
        soldado2.setFechaIngreso(new Date("23/10/2014"));
        soldado2.setFechaNacimiento(new Date("10/10/1999"));
        soldado2.setGenero("Femenino");
        soldado2.setLabores(listaLabores);
        soldado2.setListaActividades(listaActividades );
        soldado2.setRango(rango);
        soldado2.setTelefono("3205446987");
        listaInstructores.add(soldado2);
        
        
        
        Actividad actividad=new Actividad();
        actividad.setAreaAplicacion("Campo");
        actividad.setCodigo("2345");
        actividad.setDescripcion("De mando");
        actividad.setFecha(new Date("23/05/2004"));
        actividad.setInstructores(listaInstructores);
        
       
        Insumo insumo=new Insumo();
        insumo.setCodigo(uuid);
        insumo.setEstado("Agotado");
        insumo.setFechaAdquisicion(new Date("23/12/2017"));
        insumo.setFoto("Arma");
        insumo.setMarca("Glock");
        insumo.setModelo("23");
        insumo.setNombreHerramienta("Arma");
        insumo.setPrecio(100000);
        insumo.setTipo("Arma");
        insumo.setUnidadesAdquiridas(5);
        
        ControlInventario controlInventario=new ControlInventario();
        controlInventario.setCantidadDisponible(50);
        controlInventario.setFechaRegistro(new Date("23/07/2017"));
        controlInventario.setInsumo(insumo);
        
        RegistroInsumo registroInsumo=new RegistroInsumo();
        registroInsumo.setActividad(actividad);
        registroInsumo.setFechaEntrega(new Date("23/11/2017"));
        registroInsumo.setFechaRetorno(new Date("29/11/2017"));
        registroInsumo.setInsumo(insumo);
        registroInsumo.setSoldado(soldado);
        
        ProgramaEntrenamiento programaEntrenamiento=new ProgramaEntrenamiento();
        programaEntrenamiento.setActividades(listaActividades);
        programaEntrenamiento.setCodigo("12345");
        programaEntrenamiento.setDescripcion("Manejo Correcto de Vehiculos");
        programaEntrenamiento.setFechaFin(new Date("12/12/2018"));
        programaEntrenamiento.setFechaInicio(new Date("01/12/2018"));
        programaEntrenamiento.setNombre("Manejo Vehiculos");
        programaEntrenamiento.setSoldadoResponsable(soldado);
        
        
        RegistroSalud registrosSalud=new RegistroSalud();
        registrosSalud.setCondicionSalud("Saludable");
        registrosSalud.setFechaRegistro(new Date("12/07/2002"));
        registrosSalud.setPeso(32);
        registrosSalud.setRitmoCardiaco(60);
        registrosSalud.setSoldado(soldado2);
         
        ActividadEjercicio actividadEjercicio=new ActividadEjercicio();
        actividadEjercicio.setAreaAplicacion("Peleas");
        actividadEjercicio.setAreaCuerpoHumano("General");
        actividadEjercicio.setCantidadMinimaPracticas(10);
        actividadEjercicio.setCodigo(uuid);
        actividadEjercicio.setDescripcion("Adiestramiento");
        actividadEjercicio.setEjerciciosPrevios(listaActividades);
        actividadEjercicio.setFecha(new Date("24/12/2019"));
        actividadEjercicio.setIMCideal(40);
        actividadEjercicio.setInstructores(listaInstructores);
        actividadEjercicio.setLugarEntrenamiento("Gimnacio");
        actividadEjercicio.setSoldadoResponsable(soldado2);
        
        
        ActividadFormacion actividadFormacion=new ActividadFormacion();
        actividadFormacion.setAreaAplicacion("Cerebro");
        actividadFormacion.setBibliografia("Registrada");
        actividadFormacion.setTematicaCapacitacion("Abquirida");
        actividadFormacion.setObjetivosAprendizaje("Completos ");
               
    }
}