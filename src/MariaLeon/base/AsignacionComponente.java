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
public class AsignacionComponente {
   
    private Date fechaIngreso;
    private String oficioInicial;
    private Soldado soldado;
    private UnidadMilitar unidadMilitar;

    public AsignacionComponente(Date fechaIngreso, String oficioInicial) {
        this.fechaIngreso = fechaIngreso;
        this.oficioInicial = oficioInicial;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getOficioInicial() {
        return oficioInicial;
    }

    public void setOficioInicial(String oficioInicial) {
        this.oficioInicial = oficioInicial;
    }

    public Soldado getSoldado() {
        return soldado;
    }

    public void setSoldado(Soldado soldado) {
        this.soldado = soldado;
    }

    public UnidadMilitar getUnidadMilitar() {
        return unidadMilitar;
    }

    public void setUnidadMilitar(UnidadMilitar unidadMilitar) {
        this.unidadMilitar = unidadMilitar;
    }

        
    
}
