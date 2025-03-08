/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MariaLeon.base;

import java.time.LocalDate;
import java.util.List;

/**
 * Clase que representa una actividad de formación dentro del sistema.
 */
public class ActividadFormacion extends Actividad {
    private String tematicaCapacitacion;
    private String bibliografia;
    private List<String> objetivosAprendizaje;
    private List<String> competencias;

    // Constructor con parámetros obligatorios
    public ActividadFormacion(String codigoActividad, String nombre, String descripcion, 
                              String areaAplicacion, String tipo, LocalDate fecha,
                              String tematicaCapacitacion, String bibliografia, 
                              List<String> objetivosAprendizaje, List<String> competencias) {
        super(codigoActividad, nombre, descripcion, areaAplicacion, tipo, fecha);
        this.tematicaCapacitacion = tematicaCapacitacion;
        this.bibliografia = bibliografia;
        this.objetivosAprendizaje = objetivosAprendizaje;
        this.competencias = competencias;
    }

    // Métodos de acceso (getters y setters)
    public String getTematicaCapacitacion() {
        return tematicaCapacitacion;
    }

    public void setTematicaCapacitacion(String tematicaCapacitacion) {
        this.tematicaCapacitacion = tematicaCapacitacion;
    }

    public String getBibliografia() {
        return bibliografia;
    }

    public void setBibliografia(String bibliografia) {
        this.bibliografia = bibliografia;
    }

    public List<String> getObjetivosAprendizaje() {
        return objetivosAprendizaje;
    }

    public void setObjetivosAprendizaje(List<String> objetivosAprendizaje) {
        this.objetivosAprendizaje = objetivosAprendizaje;
    }

    public List<String> getCompetencias() {
        return competencias;
    }

    public void setCompetencias(List<String> competencias) {
        this.competencias = competencias;
    }

    
    
}
