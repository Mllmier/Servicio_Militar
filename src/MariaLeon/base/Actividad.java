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
public class Actividad {
    protected String codigo;
    protected String nombre;
    protected String descripcion;
    protected String areaAplicacion;
    protected String tipo;
    protected List<String> objetivos;
    protected Soldado soldadoResponsable;
    protected List<Soldado> instructores;
    protected Date fecha;
    private List<Insumo>listaInsumos;
    public Actividad(){
        
    }


    public Actividad(String codigo, String nombre, String descripcion, String areaAplicacion, String tipo, List<String> objetivos, Soldado soldadoResponsable, List<Soldado> instructores, Date fecha, List<Insumo> listaInsumos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.areaAplicacion = areaAplicacion;
        this.tipo = tipo;
        this.objetivos = objetivos;
        this.soldadoResponsable = soldadoResponsable;
        this.instructores = instructores;
        this.fecha = fecha;
        this.listaInsumos = listaInsumos;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<Insumo> getListaInsumos() {
        return listaInsumos;
    }

    public void setListaInsumos(List<Insumo> listaInsumos) {
        this.listaInsumos = listaInsumos;
    }
    
}
