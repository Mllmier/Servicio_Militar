/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MariaLeon.base;

/**
 *
 * @author Maria liz
 */
public class CuerpoMilitar {
    private String codigo;
    private String nombre;
    private String descripcion;
    private String estructuraMando;
    public CuerpoMilitar(){
        
    }

    public CuerpoMilitar(String codigo, String nombre, String descripcion, String estructuraMando) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estructuraMando = estructuraMando;
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

    public String getEstructuraMando() {
        return estructuraMando;
    }

    public void setEstructuraMando(String estructuraMando) {
        this.estructuraMando = estructuraMando;
    }
    
}
