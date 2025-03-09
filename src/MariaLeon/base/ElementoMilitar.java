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
public class ElementoMilitar {
     private String codigo;
    private String nombre;
    private String tipoElementoMilitar;
    private String descripcion;
    private Date fechaCreacion;
    private String direccion;
    private String objetivo;
    private String mision;
    private Soldado soldadoDirigente;
    private String tipoUnidad;
    private ComponenteMilitar componenteMilitar;
    private List<Soldado>soldados;
    //+obtenerDetalles(): String;

    public ElementoMilitar(String codigo, String nombre, String tipoElementoMilitar, String descripcion, Date fechaCreacion, String direccion, String objetivo, String mision, Soldado soldadoDirigente, String tipoUnidad, ComponenteMilitar componenteMilitar, List<Soldado> soldados) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipoElementoMilitar = tipoElementoMilitar;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.direccion = direccion;
        this.objetivo = objetivo;
        this.mision = mision;
        this.soldadoDirigente = soldadoDirigente;
        this.tipoUnidad = tipoUnidad;
        this.componenteMilitar = componenteMilitar;
        this.soldados = soldados;
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

    public String getTipoElementoMilitar() {
        return tipoElementoMilitar;
    }

    public void setTipoElementoMilitar(String tipoElementoMilitar) {
        this.tipoElementoMilitar = tipoElementoMilitar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public Soldado getSoldadoDirigente() {
        return soldadoDirigente;
    }

    public void setSoldadoDirigente(Soldado soldadoDirigente) {
        this.soldadoDirigente = soldadoDirigente;
    }

    public String getTipoUnidad() {
        return tipoUnidad;
    }

    public void setTipoUnidad(String tipoUnidad) {
        this.tipoUnidad = tipoUnidad;
    }

    public ComponenteMilitar getComponenteMilitar() {
        return componenteMilitar;
    }

    public void setComponenteMilitar(ComponenteMilitar componenteMilitar) {
        this.componenteMilitar = componenteMilitar;
    }

    public List<Soldado> getSoldados() {
        return soldados;
    }

    public void setSoldados(List<Soldado> soldados) {
        this.soldados = soldados;
    }
   
}
