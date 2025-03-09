/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MariaLeon.base;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Maria liz
 */
public class Soldado {
    private String nombre;
     private DocumentoIdentidad documentoIdentidad;
    private String codigoMilitar;
    private Date fechaIngreso;
    private String oficioInicial;
    private String apellido;
    private Date fechaNacimiento;
    private int edad;
    private String genero;
    private double alturaInicial;
    private double pesoInicial;
    private String direccion;
    private String telefono;
    private String email;
    private Rango rango;
    private CuerpoMilitar cuerpoMilitar;
    private Soldado superior;
    private List<ContactoEmergencia> contactosEmergencia;
    private List<Labor>labores;
    private List<Actividad>listaActividades;
    public Soldado(){
        
    }

    public Soldado(DocumentoIdentidad documentoIdentidad, String codigoMilitar, Date fechaIngreso, String oficioInicial, String apellido, Date fechaNacimiento, int edad, String genero,String nombre, double alturaInicial, double pesoInicial, String direccion, String telefono, String email, Rango rango, CuerpoMilitar cuerpoMilitar, Soldado superior, List<ContactoEmergencia> contactosEmergencia, List<Labor> labores, List<Actividad> listaActividades) {
        this.documentoIdentidad = documentoIdentidad;
        this.codigoMilitar = codigoMilitar;
        this.fechaIngreso = fechaIngreso;
        this.oficioInicial = oficioInicial;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.genero = genero;
        this.alturaInicial = alturaInicial;
        this.pesoInicial = pesoInicial;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.rango = rango;
        this.cuerpoMilitar = cuerpoMilitar;
        this.superior = superior;
        this.contactosEmergencia = contactosEmergencia;
        this.labores = labores;
        this.listaActividades = listaActividades;
        this.nombre=nombre;
    }

    public DocumentoIdentidad getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(DocumentoIdentidad documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getCodigoMilitar() {
        return codigoMilitar;
    }

    public void setCodigoMilitar(String codigoMilitar) {
        this.codigoMilitar = codigoMilitar;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getOficioInicial() {
        return oficioInicial;
    }

    public void setOficioInicial(String oficioInicial) {
        this.oficioInicial = oficioInicial;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getAlturaInicial() {
        return alturaInicial;
    }

    public void setAlturaInicial(double alturaInicial) {
        this.alturaInicial = alturaInicial;
    }

    public double getPesoInicial() {
        return pesoInicial;
    }

    public void setPesoInicial(double pesoInicial) {
        this.pesoInicial = pesoInicial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Rango getRango() {
        return rango;
    }

    public void setRango(Rango rango) {
        this.rango = rango;
    }

    public CuerpoMilitar getCuerpoMilitar() {
        return cuerpoMilitar;
    }

    public void setCuerpoMilitar(CuerpoMilitar cuerpoMilitar) {
        this.cuerpoMilitar = cuerpoMilitar;
    }

    public Soldado getSuperior() {
        return superior;
    }

    public void setSuperior(Soldado superior) {
        this.superior = superior;
    }

    public List<ContactoEmergencia> getContactosEmergencia() {
        return contactosEmergencia;
    }

    public void setContactosEmergencia(List<ContactoEmergencia> contactosEmergencia) {
        this.contactosEmergencia = contactosEmergencia;
    }

    public List<Labor> getLabores() {
        return labores;
    }

    public void setLabores(List<Labor> labores) {
        this.labores = labores;
    }

    public List<Actividad> getListaActividades() {
        return listaActividades;
    }

    public void setListaActividades(List<Actividad> listaActividades) {
        this.listaActividades = listaActividades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
