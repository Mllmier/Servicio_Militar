/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MariaLeon.base;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Maria liz
 */
public class Rango {
     private String nombre;
    private String descripcion;
    private String insignia;
    private String linea;
    private int tiempoMinAscenso;
    private List<CriterioAscenso> criteriosAscenso;
    private CuerpoMilitar cuerpoMilitar;
    private Rango rangoSuperior;
    private static Set<String> nombresRangosRegistrados = new HashSet<>();

    public Rango(String nombre, String descripcion, String insignia, String linea, int tiempoMinAscenso, List<CriterioAscenso> criteriosAscenso, CuerpoMilitar cuerpoMilitar, Rango rangoSuperior) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.insignia = insignia;
        this.linea = linea;
        this.tiempoMinAscenso = tiempoMinAscenso;
        this.criteriosAscenso = criteriosAscenso;
        this.cuerpoMilitar = cuerpoMilitar;
        this.rangoSuperior = rangoSuperior;
           if (nombresRangosRegistrados.contains(nombre)) {
            throw new IllegalArgumentException("El nombre del rango ya está en uso.");
        }
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

    public String getInsignia() {
        return insignia;
    }

    public void setInsignia(String insignia) {
        this.insignia = insignia;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public int getTiempoMinAscenso() {
        return tiempoMinAscenso;
    }

    public void setTiempoMinAscenso(int tiempoMinAscenso) {
        this.tiempoMinAscenso = tiempoMinAscenso;
    }

    public List<CriterioAscenso> getCriteriosAscenso() {
        return criteriosAscenso;
    }

    public void setCriteriosAscenso(List<CriterioAscenso> criteriosAscenso) {
        this.criteriosAscenso = criteriosAscenso;
    }

    public CuerpoMilitar getCuerpoMilitar() {
        return cuerpoMilitar;
    }

    public void setCuerpoMilitar(CuerpoMilitar cuerpoMilitar) {
        this.cuerpoMilitar = cuerpoMilitar;
    }

    public Rango getRangoSuperior() {
        return rangoSuperior;
    }

    public void setRangoSuperior(Rango rangoSuperior) {
        this.rangoSuperior = rangoSuperior;
    }
}
