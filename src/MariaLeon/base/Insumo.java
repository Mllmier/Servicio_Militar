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
public class Insumo {
    private String codigo;
    private String nombreHerramienta;
    private String marca;
    private String modelo;
    private String foto;
    private Date fechaAdquisicion;
    private String tipo;
    private int unidadesAdquiridas;
    private double precio;
    private String estado;
    private boolean esDeConsumo;

    public Insumo(String codigo, String nombreHerramienta, String marca, String modelo, String foto, Date fechaAdquisicion, String tipo, int unidadesAdquiridas, double precio, String estado, boolean esDeConsumo) {
        this.codigo = codigo;
        this.nombreHerramienta = nombreHerramienta;
        this.marca = marca;
        this.modelo = modelo;
        this.foto = foto;
        this.fechaAdquisicion = fechaAdquisicion;
        this.tipo = tipo;
        this.unidadesAdquiridas = unidadesAdquiridas;
        this.precio = precio;
        this.estado = estado;
        this.esDeConsumo = esDeConsumo;
    }
    public boolean estaDisponible() {
        return "Disponible".equals(this.estado) && this.unidadesAdquiridas > 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreHerramienta() {
        return nombreHerramienta;
    }

    public void setNombreHerramienta(String nombreHerramienta) {
        this.nombreHerramienta = nombreHerramienta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Date getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(Date fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getUnidadesAdquiridas() {
        return unidadesAdquiridas;
    }

    public void setUnidadesAdquiridas(int unidadesAdquiridas) {
        this.unidadesAdquiridas = unidadesAdquiridas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isEsDeConsumo() {
        return esDeConsumo;
    }

    public void setEsDeConsumo(boolean esDeConsumo) {
        this.esDeConsumo = esDeConsumo;
    }
    
    
}
