/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MariaLeon.base;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Maria liz
 */
public class ActividadEjercicio extends Actividad{
    private String lugarEntrenamiento;
    private int cantidadMinimaPracticas;
    private String nivelDificultad;
    private List<Actividad> ejerciciosPrevios;
    private String areaCuerpoHumano;
    private double IMCideal;
    public ActividadEjercicio(){
        
    }

    public ActividadEjercicio(String lugarEntrenamiento, int cantidadMinimaPracticas, String nivelDificultad, List<Actividad> ejerciciosPrevios, String areaCuerpoHumano, double IMCideal, String codigo, String nombre, String descripcion, String areaAplicacion, String tipo, List<String> objetivos, Soldado soldadoResponsable, List<Soldado> instructores, Date fecha, List<Insumo> listaInsumos) {
        super(codigo, nombre, descripcion, areaAplicacion, tipo, objetivos, soldadoResponsable, instructores, fecha, listaInsumos);
        this.lugarEntrenamiento = lugarEntrenamiento;
        this.cantidadMinimaPracticas = cantidadMinimaPracticas;
        this.nivelDificultad = nivelDificultad;
        this.ejerciciosPrevios = ejerciciosPrevios;
        this.areaCuerpoHumano = areaCuerpoHumano;
        this.IMCideal = IMCideal;
    }

    

    public String getLugarEntrenamiento() {
        return lugarEntrenamiento;
    }

    public void setLugarEntrenamiento(String lugarEntrenamiento) {
        this.lugarEntrenamiento = lugarEntrenamiento;
    }

    public int getCantidadMinimaPracticas() {
        return cantidadMinimaPracticas;
    }

    public void setCantidadMinimaPracticas(int cantidadMinimaPracticas) {
        this.cantidadMinimaPracticas = cantidadMinimaPracticas;
    }

    public String getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(String nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public List<Actividad> getEjerciciosPrevios() {
        return ejerciciosPrevios;
    }

    public void setEjerciciosPrevios(List<Actividad> ejerciciosPrevios) {
        this.ejerciciosPrevios = ejerciciosPrevios;
    }

    public String getAreaCuerpoHumano() {
        return areaCuerpoHumano;
    }

    public void setAreaCuerpoHumano(String areaCuerpoHumano) {
        this.areaCuerpoHumano = areaCuerpoHumano;
    }

    public double getIMCideal() {
        return IMCideal;
    }

    public void setIMCideal(double IMCideal) {
        this.IMCideal = IMCideal;
    }
    
}
