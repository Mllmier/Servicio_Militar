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
public class Rango {
    private String codigo;
    private String nombre;
    private String descripcion;
    private String insignia;
    private String linea;
    private int tiempoMinAscenso;
    private List<CriterioAscenso> criteriosAscenso;
    private CuerpoMilitar cuerpoMilitar;
    private Rango rangoSuperior;
     public  Rango(){
         
     }
    public Rango(String codigo, String nombre, String descripcion, String insignia, String linea, int tiempoMinAscenso, List<CriterioAscenso> criteriosAscenso, CuerpoMilitar cuerpoMilitar, Rango rangoSuperior) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.insignia = insignia;
        this.linea = linea;
        this.tiempoMinAscenso = tiempoMinAscenso;
        this.criteriosAscenso = criteriosAscenso;
        this.cuerpoMilitar = cuerpoMilitar;
        this.rangoSuperior = rangoSuperior;
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
