/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MariaLeon.base;

/**
 *
 * @author Maria liz
 */
public class ComponenteMilitar {
    private String codigo;
    private String nombre;
    private String descripcion;
    private Soldado soldado;
    private Rango rango;
public ComponenteMilitar(){}
    public ComponenteMilitar(String codigo, String nombre, String descripcion, Soldado soldado, Rango rango) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.soldado = soldado;
        this.rango = rango;
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

    public Soldado getSoldado() {
        return soldado;
    }

    public void setSoldado(Soldado soldado) {
        this.soldado = soldado;
    }

    public Rango getRango() {
        return rango;
    }

    public void setRango(Rango rango) {
        this.rango = rango;
    }
    

}
