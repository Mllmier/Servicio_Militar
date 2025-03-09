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
public class ProgramaEntrenamiento {
    private String codigo;
    private String nombre;
    private String descripcion;
    private List<Actividad> actividades;
    private Soldado soldadoResponsable;
    private Date fechaInicio;
    private Date fechaFin;
   public ProgramaEntrenamiento(){
    
}

    public ProgramaEntrenamiento(String codigo, String nombre, String descripcion, List<Actividad> actividades, Soldado soldadoResponsable, Date fechaInicio, Date fechaFin) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.actividades = actividades;
        this.soldadoResponsable = soldadoResponsable;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public List<Actividad> getActividades() {
        return actividades;
    }

    public void setActividades(List<Actividad> actividades) {
        this.actividades = actividades;
    }

    public Soldado getSoldadoResponsable() {
        return soldadoResponsable;
    }

    public void setSoldadoResponsable(Soldado soldadoResponsable) {
        this.soldadoResponsable = soldadoResponsable;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    
}
