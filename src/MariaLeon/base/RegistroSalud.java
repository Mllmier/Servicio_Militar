/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MariaLeon.base;

import java.util.Date;

/**
 *
 * @author Maria liz
 */
public class RegistroSalud {
     private double peso;
     private int ritmoCardiaco;
     private String condicionSalud;
     private Date fechaRegistro;
     private Soldado soldado;
    // public obtenerCondicionSalud(): String

    public RegistroSalud(double peso, int ritmoCardiaco, String condicionSalud, Date fechaRegistro) {
        this.peso = peso;
        this.ritmoCardiaco = ritmoCardiaco;
        this.condicionSalud = condicionSalud;
        this.fechaRegistro = fechaRegistro;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getRitmoCardiaco() {
        return ritmoCardiaco;
    }

    public void setRitmoCardiaco(int ritmoCardiaco) {
        this.ritmoCardiaco = ritmoCardiaco;
    }

    public String getCondicionSalud() {
        return condicionSalud;
    }

    public void setCondicionSalud(String condicionSalud) {
        this.condicionSalud = condicionSalud;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Soldado getSoldado() {
        return soldado;
    }

    public void setSoldado(Soldado soldado) {
        this.soldado = soldado;
    }
    
     
}
