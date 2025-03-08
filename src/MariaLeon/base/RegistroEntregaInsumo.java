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
public class RegistroEntregaInsumo {
    private Date fechaEntrega;
    private Date fechaRetorno;  
    private Soldado soldado;
    private Insumo insumo;
    private Actividad actividad;

    public RegistroEntregaInsumo(Date fechaEntrega, Date fechaRetorno, Soldado soldado, Insumo insumo, Actividad actividad) {
        this.fechaEntrega = fechaEntrega;
        this.fechaRetorno = fechaRetorno;
        this.soldado = soldado;
        this.insumo = insumo;
        this.actividad = actividad;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Date getFechaRetorno() {
        return fechaRetorno;
    }

    public void setFechaRetorno(Date fechaRetorno) {
        this.fechaRetorno = fechaRetorno;
    }

    public Soldado getSoldado() {
        return soldado;
    }

    public void setSoldado(Soldado soldado) {
        this.soldado = soldado;
    }

    public Insumo getInsumo() {
        return insumo;
    }

    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }
    
    
}
