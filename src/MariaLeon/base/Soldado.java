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
    private String codigoMilitar;
    private String nombre ;
    private String apellido;
    private int edad;
    private Date fechaNacimiento;
    private String genero;
    private double alturaInicial;
    private double pesoInicial;
    private String telefono;
    private String email;
    private Rango rango;
    private CuerpoMilitar cuerpoMilitar;
    private Soldado superior;
    private List<ContactoEmergencia> contactosEmergencia;
    private List<UnidadMilitar> unidadesAsignadas;
    private DocumentoIdentidad documentoIdentidad;
    
    public void Soldado(){
        
    }


    public Soldado(String codigoMilitar, String nombre, String apellido, int edad, String genero, double alturaInicial, double pesoInicial, String telefono,Date fechaNacimiento, String email, Rango rango, CuerpoMilitar cuerpoMilitar, Soldado superior, List<ContactoEmergencia> contactosEmergencia, List<UnidadMilitar> unidadesAsignadas, DocumentoIdentidad documentoIdentidad) {
        this.codigoMilitar = codigoMilitar;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.alturaInicial = alturaInicial;
        this.pesoInicial = pesoInicial;
        this.telefono = telefono;
        this.email = email;
        this.rango = rango;
        this.fechaNacimiento=fechaNacimiento;
        this.cuerpoMilitar = cuerpoMilitar;
        this.superior = superior;
        this.contactosEmergencia = contactosEmergencia;
        this.unidadesAsignadas = unidadesAsignadas;
        this.documentoIdentidad = documentoIdentidad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
  

    public String getCodigoMilitar() {
        return codigoMilitar;
    }

    public void setCodigoMilitar(String codigoMilitar) {
          if (codigoMilitar == null || codigoMilitar.isEmpty()) {
            throw new IllegalArgumentException("El código militar es obligatorio.");
        }
        this.codigoMilitar = codigoMilitar;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 18 || edad > 60) {
            throw new IllegalArgumentException("La edad debe estar entre 18 y 60 años.");
        }
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
         if (telefono == null || !telefono.matches("^[0-9]{10}$")) {
            throw new IllegalArgumentException("El número de teléfono debe tener 10 dígitos.");
        }
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new IllegalArgumentException("El email debe tener un formato válido.");
        }
        this.email = email;
    }

    public Rango getRango() {
        return rango;
    }

    public void setRango(Rango rango) {
        if (rango == null) {
            throw new IllegalArgumentException("El rango es obligatorio.");
        }
        this.rango = rango;
    }

    public CuerpoMilitar getCuerpoMilitar() {
        return cuerpoMilitar;
    }

    public void setCuerpoMilitar(CuerpoMilitar cuerpoMilitar) {
        
        if (cuerpoMilitar == null) {
            throw new IllegalArgumentException("El cuerpo militar es obligatorio.");
        }
        this.cuerpoMilitar = cuerpoMilitar;
    }
//falta esta validacion 
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
          if (contactosEmergencia == null || contactosEmergencia.size() < 2) {
            throw new IllegalArgumentException("Debe haber al menos dos contactos de emergencia.");
        }
        this.contactosEmergencia = contactosEmergencia;
    }

    public List<UnidadMilitar> getUnidadesAsignadas() {
        return unidadesAsignadas;
    }

    public void setUnidadesAsignadas(List<UnidadMilitar> unidadesAsignadas) {
        this.unidadesAsignadas = unidadesAsignadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
         if (apellido == null || apellido.isEmpty()) {
            throw new IllegalArgumentException("El apellido es obligatorio.");
        }
        this.apellido = apellido;
    }

    public DocumentoIdentidad getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(DocumentoIdentidad documentoIdentidad) {
          if (documentoIdentidad == null) {
        throw new IllegalArgumentException("El documento de identidad es obligatorio.");
    }

    String numeroDocumento = documentoIdentidad.getNumero();
    if (!DocumentoIdentidad.esNumeroDocumentoUnico(numeroDocumento)) {
        throw new IllegalArgumentException("El número de documento ya está en uso.");
    }        this.documentoIdentidad = documentoIdentidad;
    }

    @Override
    public String toString() {
        return "Soldado" + "codigoMilitar=" + codigoMilitar + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", genero=" + genero + ", alturaInicial=" + alturaInicial + ", pesoInicial=" + pesoInicial + ", telefono=" + telefono + ", email=" + email + ", rango=" + rango + ", cuerpoMilitar=" + cuerpoMilitar + ", superior=" + superior + ", contactosEmergencia=" + contactosEmergencia + ", unidadesAsignadas=" + unidadesAsignadas + ", documentoIdentidad=" + documentoIdentidad ;
    }

    
 
    
    
}
