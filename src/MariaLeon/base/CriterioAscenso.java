/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MariaLeon.base;

/**
 *
 * @author Maria liz
 */
public class CriterioAscenso {
    private String codigoAscenso;
    private String descripcion;
    private String tipo;

    public CriterioAscenso(String codigoAscenso, String descripcion, String tipo) {
        this.codigoAscenso = codigoAscenso;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    public String getCodigoAscenso() {
        return codigoAscenso;
    }

    public void setCodigoAscenso(String codigoAscenso) {
        this.codigoAscenso = codigoAscenso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
