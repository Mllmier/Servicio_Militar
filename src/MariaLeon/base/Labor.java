/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MariaLeon.base;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Maria liz
 */
public class Labor {
    private String codigo;
    private String nombre;
    private String descripcion;
    private Date fechaAsignacion;
    private Date fechaInicio;
    private Date fechaFin;
    private List<Funcion> funciones;
    private static Set<String> codigosLaborRegistrados = new HashSet<>();


    public Labor(String codigo, String nombre, String descripcion, Date fechaAsignacion, Date fechaInicio, Date fechaFin) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaAsignacion = fechaAsignacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
            if (codigosLaborRegistrados.contains(codigo)) {
            throw new IllegalArgumentException("El código de la labor ya está en uso.");
        }
        codigosLaborRegistrados.add(codigo);

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

    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(List<Funcion> funciones) {
        this.funciones = funciones;
    }
    
    
}
