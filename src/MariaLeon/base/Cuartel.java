/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MariaLeon.base;

import java.util.List;

/**
 *
 * @author Maria liz
 */
public class Cuartel {
     private String codigo;
    private String nombre;
    private String direccion;
    private  int capacidad;
    private List<ElementoMilitar > unidadesAlojadas;

    public Cuartel(String codigo, String nombre, String direccion, int capacidad, List<ElementoMilitar> unidadesAlojadas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.capacidad = capacidad;
        this.unidadesAlojadas = unidadesAlojadas;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public List<ElementoMilitar> getUnidadesAlojadas() {
        return unidadesAlojadas;
    }

    public void setUnidadesAlojadas(List<ElementoMilitar> unidadesAlojadas) {
        this.unidadesAlojadas = unidadesAlojadas;
    }
    
}
