/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MariaLeon.base;

import java.time.LocalDate;
import java.util.List;

/**
 * Clase base para representar una actividad en el sistema.
 */
public class Actividad {
    private String codigoActividad;
    private String nombre;
    private String descripcion;
    private String areaAplicacion;
    private String tipo;
    private LocalDate fecha;
    private List<String> objetivos;
    private Soldado soldadoResponsable;
    private List<Soldado> instructores;

    public Actividad(String codigoActividad, String nombre, String descripcion, 
                     String areaAplicacion, String tipo, LocalDate fecha) {
        this.codigoActividad = codigoActividad;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.areaAplicacion = areaAplicacion;
        this.tipo = tipo;
        this.fecha = fecha;
    }

    // Métodos de acceso (getters y setters)
    public String getCodigoActividad() {
        return codigoActividad;
    }

    public void setCodigoActividad(String codigoActividad) {
        this.codigoActividad = codigoActividad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAreaAplicacion() {
        return areaAplicacion;
    }

    public void setAreaAplicacion(String areaAplicacion) {
        this.areaAplicacion = areaAplicacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public List<String> getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(List<String> objetivos) {
        this.objetivos = objetivos;
    }

    public Soldado getSoldadoResponsable() {
        return soldadoResponsable;
    }

    public void setSoldadoResponsable(Soldado soldadoResponsable) {
        this.soldadoResponsable = soldadoResponsable;
    }

    public List<Soldado> getInstructores() {
        return instructores;
    }

    public void setInstructores(List<Soldado> instructores) {
        this.instructores = instructores;
    }
}
