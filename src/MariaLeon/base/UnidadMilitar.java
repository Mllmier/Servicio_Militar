/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MariaLeon.base;

import java.util.Date;
import java.util.List;
import java.util.UUID;


/**
 *
 * @author Maria liz
 */
public class UnidadMilitar {
    private String codigo;
    private String nombre;
    private String descripcion;
    private Date fechaCreacion;
    private String direccion;
    private String objetivo;
    private String mision;
    private Soldado soldadoDirigente;
    private String tipoUnidad;
    private List<UnidadMilitar> subUnidades;
    public UnidadMilitar(){

    }
  
    public UnidadMilitar(String codigo, String nombre, String descripcion, Date fechaCreacion, String direccion, String objetivo, String mision, Soldado soldadoDirigente, String tipoUnidad, List<UnidadMilitar> subUnidades) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.direccion = direccion;
        this.objetivo = objetivo;
        this.mision = mision;
        this.soldadoDirigente = soldadoDirigente;
        this.tipoUnidad = tipoUnidad;
        this.subUnidades = subUnidades;
        this.codigo = generarCodigoUnico();

    }
     private String generarCodigoUnico() {
        return UUID.randomUUID().toString();
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
         if (descripcion == null || descripcion.isEmpty()) {
            throw new IllegalArgumentException("La descripción es obligatoria.");
        }
        this.descripcion = descripcion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
           if (direccion == null || direccion.isEmpty()) {
            throw new IllegalArgumentException("La dirección es obligatoria.");
        }
        this.direccion = direccion;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public Soldado getSoldadoDirigente() {
        return soldadoDirigente;
    }

    public void setSoldadoDirigente(Soldado soldadoDirigente) {

        this.soldadoDirigente = soldadoDirigente;
    }

    public String getTipoUnidad() {
        return tipoUnidad;
    }

    public void setTipoUnidad(String tipoUnidad) {
        this.tipoUnidad = tipoUnidad;
    }

    public List<UnidadMilitar> getSubUnidades() {
        return subUnidades;
    }

    public void setSubUnidades(List<UnidadMilitar> subUnidades) {
        this.subUnidades = subUnidades;
    }

    @Override
    public String toString() {
        return "UnidadMilitar" + "\ncodigo:" + codigo + "\n nombre:" + nombre + "\n descripcion:" + descripcion + "\nfechaCreacion:" + fechaCreacion + "\ndireccion:" 
            + direccion + "\n objetivo:" + objetivo + "\n mision=" + mision + "\nsoldadoDirigente:"
                + soldadoDirigente + "\ntipoUnidad:" + tipoUnidad + "\nsubUnidades:" + subUnidades ;
    }
}
