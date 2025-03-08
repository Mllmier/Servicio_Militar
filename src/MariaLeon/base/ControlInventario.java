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
public class ControlInventario {
   
    private Date fechaRegistro;
    private int cantidadDisponible;
    private Insumo insumo;

    public ControlInventario(Date fechaRegistro, int cantidadDisponible, Insumo insumo) {
        this.fechaRegistro = fechaRegistro;
        this.cantidadDisponible = cantidadDisponible;
        this.insumo = insumo;
    }
    

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public Insumo getInsumo() {
        return insumo;
    }

    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }
    public String obtenerEstadoInventario() {
        boolean disponible = insumo.estaDisponible();

        String estado = "Estado del inventario:\n" +
                        "Nombre del insumo: " + insumo.getNombreHerramienta() + "\n" +
                        "Cantidad disponible: " + cantidadDisponible + "\n" +
                        "Estado: " + (disponible ? "Disponible" : "No disponible");

        return estado;
    }

}
