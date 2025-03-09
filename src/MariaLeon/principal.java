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
        System.out.println("Nombre:"+componenteMilitar.getNombre());
        System.out.println("Codigo:"+componenteMilitar.getCodigo());
        System.out.println("Descripcion:"+componenteMilitar.getDescripcion());
         System.out.println("***************************************");


        CriterioAscenso ascenso=new CriterioAscenso();
        ascenso.setCodigo(uuid);
        ascenso.setDescripcion("Ascendido a Comandante ");
        ascenso.setTipo("Comandante ");
        System.out.println("Codigo Ascenso:"+ascenso.getCodigo());
        System.out.println("Descripcion:"+ascenso.getDescripcion());
        System.out.println("Tipo:"+ascenso.getTipo());

                        System.out.println("***************************************");

                
       CriterioAscenso ascenso2=new CriterioAscenso();
        ascenso2.setCodigo(uuid);
        ascenso2.setDescripcion("Ascendido a Coronel ");
        ascenso2.setTipo("Coronel ");
        List<CriterioAscenso> criteriosDeAscenso = new ArrayList<CriterioAscenso>();
         criteriosDeAscenso.add(ascenso);
         criteriosDeAscenso.add(ascenso2);
        System.out.println("Codigo Ascenso:"+ascenso2.getCodigo());
        System.out.println("Descripcion:"+ascenso2.getDescripcion());
        System.out.println("***************************************");

        CuerpoMilitar cuerpoMilitar=new CuerpoMilitar();
        cuerpoMilitar.setDescripcion("Este es el ejercito Tierra ");
        cuerpoMilitar.setCodigo(uuid);
        cuerpoMilitar.setEstructuraMando("Coronel ");
        cuerpoMilitar.setNombre("Terrestre");
        System.out.println("Nombre:"+cuerpoMilitar.getNombre());
        System.out.println("Codigo:"+cuerpoMilitar.getCodigo());
        System.out.println("Descripcion:"+cuerpoMilitar.getDescripcion());
        System.out.println("Estructura Mando:"+cuerpoMilitar.getEstructuraMando());
                        System.out.println("***************************************");

        DocumentoIdentidad documentoIdentidad=new DocumentoIdentidad();
        documentoIdentidad.setTipo("Cedula");
        documentoIdentidad.setTipoSangre("o+");
        documentoIdentidad.setNumero("1102229564");
        System.out.println("Tipo Sangre:"+documentoIdentidad.getTipoSangre());
        System.out.println("Numero Identificacion:"+documentoIdentidad.getNumero());
        System.out.println("Tipo Documento:"+documentoIdentidad.getTipo());

                      System.out.println("***************************************");

        ContactoEmergencia contactoEmergencia=new ContactoEmergencia();
        contactoEmergencia.setNombre("JUAN");
        contactoEmergencia.setApellido("Martinez");
        contactoEmergencia.setEmail("JuanMartinez@gmail.com");
        contactoEmergencia.setGenero("Masculino");
        contactoEmergencia.setParentesco("Padre");
        contactoEmergencia.setFechaNacimiento(new Date("10/25/1993"));
        System.out.println("Nombre:"+contactoEmergencia.getNombre());
        System.out.println("Apellido:"+contactoEmergencia.getApellido());
        System.out.println("Email:"+contactoEmergencia.getEmail());
        System.out.println("Genero:"+contactoEmergencia.getGenero());
        System.out.println("Parentesco:"+contactoEmergencia.getParentesco());
        System.out.println("Fecha Nacimiento:"+contactoEmergencia.getFechaNacimiento());
       
                System.out.println("***************************************");

        
        ContactoEmergencia contactoEmergencia2=new ContactoEmergencia();
        contactoEmergencia2.setNombre("Yana");
        contactoEmergencia2.setApellido("Palacio");
        contactoEmergencia2.setEmail("YanaPalacio@gmail.com");
        contactoEmergencia2.setGenero("Femenino");
        contactoEmergencia2.setParentesco("Madre");
        contactoEmergencia2.setFechaNacimiento(new Date("10/25/1995"));
        List<ContactoEmergencia> ContactoEmergencia = new ArrayList<ContactoEmergencia>();
        ContactoEmergencia.add(contactoEmergencia2);
         System.out.println("Nombre:"+contactoEmergencia2.getNombre());
        System.out.println("Apellido:"+contactoEmergencia2.getApellido());
        System.out.println("Email:"+contactoEmergencia2.getEmail());
        System.out.println("Genero:"+contactoEmergencia2.getGenero());
        System.out.println("Parentesco:"+contactoEmergencia2.getParentesco());
        System.out.println("Fecha Nacimiento:"+contactoEmergencia2.getFechaNacimiento());
                System.out.println("***************************************");


        Funcion funcion=new Funcion();
        funcion.setCodigo("2345");
        funcion.setDescripcion("Limpiar Armamento  ");
        funcion.setNombre("Limpieza ");
        funcion.setProcedimiento("Limpiar todas las armas ");
        System.out.println("Codigo Funcion:"+funcion.getCodigo());
        System.out.println("Descripcion:"+funcion.getDescripcion());
        System.out.println("Nombre:"+funcion.getNombre());
        System.out.println("Pocedimiento:"+funcion.getProcedimiento());
                System.out.println("***************************************");

        
        
        Funcion funcion2=new Funcion();
        funcion2.setCodigo("2345");
        funcion2.setDescripcion("Limpio Armamento  ");
        funcion2.setNombre("Limpio ");
        funcion2.setProcedimiento("Limpio todas las armas ");
        List<Funcion> listaFunciones = new ArrayList<Funcion>();
        listaFunciones.add(funcion2);
        System.out.println("Codigo Funcion:"+funcion2.getCodigo());
        System.out.println("Descripcion:"+funcion2.getDescripcion());
        System.out.println("Nombre:"+funcion2.getNombre());
      
                        System.out.println("***************************************");

        Rango rango=new Rango();
        rango.setCodigo(uuid);
        rango.setTiempoMinAscenso(4);
        rango.setLinea("Defensa");
        rango.setDescripcion("Activo");
        rango.setInsignia("Estrella");
        rango.setNombre("Coronel");
        rango.setCuerpoMilitar(cuerpoMilitar);
        rango.setCriteriosAscenso(criteriosDeAscenso);
        System.out.println("codigo Rango:"+rango.getCodigo());
        System.out.println("Linea:"+rango.getLinea());
        System.out.println("Tiempo Ascenso:"+rango.getTiempoMinAscenso());
        System.out.println("Insignia:"+rango.getInsignia());
        System.out.println("Nombre:"+rango.getNombre());
                System.out.println("***************************************");

        Labor labor=new Labor();
        labor.setCodigo("23445");
        labor.setDescripcion("Nada");
        labor.setFechaAsignacion(new Date("03/09/2003"));
        labor.setFechaFin(new Date("10/09/2003"));
        labor.setFunciones(listaFunciones);
        System.out.println("Codigo Labor:"+labor.getCodigo());
        System.out.println("Descripcion:"+labor.getDescripcion());
        System.out.println("Fecha Asiganacion:"+labor.getFechaAsignacion());
        System.out.println("Criterio Ascenso:"+labor.getFechaFin());
                System.out.println("***************************************");

        Labor labor2=new Labor();
        labor2.setCodigo("23445");
        labor2.setDescripcion("Nada");
        labor2.setFechaAsignacion(new Date("03/09/2003"));
        labor2.setFechaFin(new Date("10/09/2003"));
        labor2.setFunciones(listaFunciones);
        List<Labor> listaLabores = new ArrayList<Labor>();
        listaLabores.add(labor2);
        System.out.println("Codigo Labor:"+labor2.getCodigo());
        System.out.println("Descripcion:"+labor2.getDescripcion());
        System.out.println("Fecha Asiganacion:"+labor2.getFechaAsignacion());
        System.out.println("Criterio Ascenso:"+labor2.getFechaFin());
                        System.out.println("***************************************");

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
        List<Insumo> listaInsumo = new ArrayList<Insumo>();
        listaInsumo.add(insumo);
        System.out.println(" Codigo Insumo:"+insumo.getCodigo());
        System.out.println(" Estado:"+insumo.getEstado());
        System.out.println(" Fecha Abquision:"+insumo.getFechaAdquisicion());
        System.out.println(" Foto:"+insumo.getFoto());
        System.out.println(" Marca:"+insumo.getMarca());
        System.out.println(" Modelo"+insumo.getModelo());
         System.out.println(" Nombre Herramienta:"+insumo.getNombreHerramienta());
        System.out.println(" Unidades Abquiridas:"+insumo.getUnidadesAdquiridas());



                System.out.println("***************************************");

                
        Insumo insumo2=new Insumo();
        insumo2.setCodigo(uuid);
        insumo2.setEstado("Agotado");
        insumo2.setFechaAdquisicion(new Date("23/12/2017"));
        insumo2.setFoto("Arma");
        insumo2.setMarca("Glock");
        insumo2.setModelo("23");
        insumo2.setNombreHerramienta("Arma");
        insumo2.setPrecio(100000);
        insumo2.setTipo("Arma");
        insumo2.setUnidadesAdquiridas(5);
        listaInsumo.add(insumo2);
        System.out.println(" Estado:"+insumo2.getEstado());
        System.out.println(" Fecha Abquision:"+insumo2.getFechaAdquisicion());
        System.out.println(" Foto:"+insumo2.getFoto());
        System.out.println(" Marca:"+insumo2.getMarca());
        System.out.println(" Modelo:"+insumo2.getModelo());
         System.out.println(" Nombre Herramienta:"+insumo2.getNombreHerramienta());
        System.out.println(" Tipo Insumo:"+insumo2.getTipo());
        System.out.println(" Unidades Abquiridas:"+insumo2.getUnidadesAdquiridas());
                System.out.println("***************************************");


        Actividad actividad2=new Actividad();
        actividad2.setAreaAplicacion("Campamento");
        actividad2.setCodigo("3456");
        actividad2.setDescripcion("Selvatico");
        actividad2.setFecha(new Date(23/05/2004));
        List<Actividad> listaActividades = new ArrayList<Actividad>();
        listaActividades.add(actividad2);
        actividad2.setListaInsumos(listaInsumo);
        listaInsumo.add(insumo);
        System.out.println("Area Aplicacion:"+actividad2.getAreaAplicacion());
        System.out.println("Codigo Actividad:"+actividad2.getCodigo());
        System.out.println("Descripcion:"+actividad2.getDescripcion());
        System.out.println("Fecha:"+actividad2.getFecha());
                        System.out.println("***************************************");

       
       

        
        
        Soldado soldado=new Soldado();
        soldado.setAlturaInicial(1.80);
        soldado.setNombre("Pedro");
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
        System.out.println("Apellido: " + soldado.getApellido());
        System.out.println("Altura: " + soldado.getAlturaInicial());
        System.out.println("Código Militar: " + soldado.getCodigoMilitar());
        System.out.println("Dirección: " + soldado.getDireccion());
        System.out.println("Edad: " + soldado.getEdad());
        System.out.println("Email: " + soldado.getEmail());
        System.out.println("Fecha de Ingreso: " + soldado.getFechaIngreso());
        System.out.println("Fecha de Nacimiento: " + soldado.getFechaNacimiento());
        System.out.println("Género: " + soldado.getGenero());
        System.out.println("Teléfono: " + soldado.getTelefono());
        System.out.println("Documento Identidad: " + soldado.getDocumentoIdentidad());
        System.out.println("Nombre: " + soldado.getNombre());

                System.out.println("***************************************");

        Soldado soldado2=new Soldado();
        soldado2.setAlturaInicial(1.80);
        soldado2.setNombre("Marta");
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
        System.out.println("Apellido: " + soldado2.getApellido());
        System.out.println("Altura: " + soldado2.getAlturaInicial());
        System.out.println("Código Militar: " + soldado2.getCodigoMilitar());
        System.out.println("Dirección: " + soldado2.getDireccion());
        System.out.println("Edad: " + soldado2.getEdad());
        System.out.println("Email: " + soldado2.getEmail());
        System.out.println("Fecha de Ingreso: " + soldado2.getFechaIngreso());
        System.out.println("Fecha de Nacimiento: " + soldado2.getFechaNacimiento());
        System.out.println("Género: " + soldado2.getGenero());
        System.out.println("Teléfono: " + soldado2.getTelefono());
        System.out.println("Documento Identidad: " + soldado2.getDocumentoIdentidad());
        System.out.println("Rango: " + soldado2.getRango());
        System.out.println("Nombre: " + soldado2.getNombre());

                        System.out.println("***************************************");

        Actividad actividad=new Actividad();
        actividad.setAreaAplicacion("Campo");
        actividad.setCodigo("2345");
        actividad.setDescripcion("De mando");
        actividad.setFecha(new Date("23/05/2004"));
        actividad.setInstructores(listaInstructores);
        actividad.setListaInsumos(listaInsumo);
        System.out.println("Area Aplicacion:"+actividad.getAreaAplicacion());
        System.out.println("Codigo Actividad:"+actividad.getCodigo());
        System.out.println("Descripcion:"+actividad.getDescripcion());
        System.out.println("Fecha:"+actividad.getFecha());
                System.out.println("***************************************");


        ControlInventario controlInventario=new ControlInventario();
        controlInventario.setCantidadDisponible(50);
        controlInventario.setFechaRegistro(new Date("23/07/2017"));
        controlInventario.setInsumo(insumo);
        System.out.println("Cantidad Disponible:"+controlInventario.getCantidadDisponible());
        System.out.println("Fecha Registro:"+controlInventario.getFechaRegistro());
                System.out.println("***************************************");

        
        RegistroInsumo registroInsumo=new RegistroInsumo();
        registroInsumo.setActividad(actividad);
        registroInsumo.setFechaEntrega(new Date("23/11/2017"));
        registroInsumo.setFechaRetorno(new Date("29/11/2017"));
        registroInsumo.setInsumo(insumo);
        registroInsumo.setSoldado(soldado);
        System.out.println("Fecha Entrega:"+registroInsumo.getFechaEntrega());
                System.out.println("***************************************");

        
        ProgramaEntrenamiento programaEntrenamiento=new ProgramaEntrenamiento();
        programaEntrenamiento.setActividades(listaActividades);
        programaEntrenamiento.setCodigo("12345");
        programaEntrenamiento.setDescripcion("Manejo Correcto de Vehiculos");
        programaEntrenamiento.setFechaFin(new Date("12/12/2018"));
        programaEntrenamiento.setFechaInicio(new Date("01/12/2018"));
        programaEntrenamiento.setNombre("Manejo Vehiculos");
        System.out.println("Nombre Entrenamiento:"+programaEntrenamiento.getNombre());
        System.out.println("Descripcion:"+programaEntrenamiento.getDescripcion());
        System.out.println("Fecha Fin:"+programaEntrenamiento.getFechaFin());
        System.out.println("Fecha Inicio:"+programaEntrenamiento.getFechaInicio());
                System.out.println("***************************************");

        RegistroSalud registrosSalud=new RegistroSalud();
        registrosSalud.setCondicionSalud("Saludable");
        registrosSalud.setFechaRegistro(new Date("12/07/2002"));
        registrosSalud.setPeso(32);
        registrosSalud.setRitmoCardiaco(60);
        registrosSalud.setSoldado(soldado2);
        System.out.println("Condiciones Salus:"+registrosSalud.getCondicionSalud());
        System.out.println("Fecha Registro:"+registrosSalud.getFechaRegistro());
        System.out.println("Peso:"+registrosSalud.getPeso());
        System.out.println("Ritmo Cardiaco:"+registrosSalud.getRitmoCardiaco());
                         System.out.println("***************************************");

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
        System.out.println("Area Aplicacion:"+actividadEjercicio.getAreaAplicacion());
        System.out.println("Area Cuerpo:"+actividadEjercicio.getAreaCuerpoHumano());
        System.out.println("Cantidad Practica:"+actividadEjercicio.getCantidadMinimaPracticas());
        System.out.println("Codigo:"+actividadEjercicio.getCodigo());
        System.out.println("Descripcion:"+actividadEjercicio.getDescripcion());
         System.out.println("Fecha:"+actividadEjercicio.getFecha());
        System.out.println("IMC:"+actividadEjercicio.getIMCideal());
        System.out.println("Lugar Entrenamiento:"+actividadEjercicio.getLugarEntrenamiento());
                        System.out.println("***************************************");

        ActividadFormacion actividadFormacion=new ActividadFormacion();
        actividadFormacion.setAreaAplicacion("Cerebro");
        actividadFormacion.setBibliografia("Registrada");
        actividadFormacion.setTematicaCapacitacion("Abquirida");
        actividadFormacion.setObjetivosAprendizaje("Completos ");
        System.out.println("Bibliografia:"+actividadFormacion.getBibliografia());
        System.out.println(" Tematica Capacitacion:"+actividadFormacion.getTematicaCapacitacion());

               
    }
}