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
public class ActividadFormacion extends Actividad {
     private String tematicaCapacitacion;
    private String bibliografia;
    private String objetivosAprendizaje;
    private List<String> competencias;
    public ActividadFormacion(){
        
    }

    public ActividadFormacion(String tematicaCapacitacion, String bibliografia,String objetivosAprendizaje, List<String> competencias, String codigo, String nombre, String descripcion, String areaAplicacion, String tipo, List<String> objetivos, Soldado soldadoResponsable, List<Soldado> instructores, Date fecha, List<Insumo> listaInsumos) {
        super(codigo, nombre, descripcion, areaAplicacion, tipo, objetivos, soldadoResponsable, instructores, fecha, listaInsumos);
        this.tematicaCapacitacion = tematicaCapacitacion;
        this.bibliografia = bibliografia;
        this.objetivosAprendizaje = objetivosAprendizaje;
        this.competencias = competencias;
    }

   

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

    public String getObjetivosAprendizaje() {
        return objetivosAprendizaje;
    }

    public void setObjetivosAprendizaje(String  objetivosAprendizaje) {
        this.objetivosAprendizaje = objetivosAprendizaje;
    }

    public List<String> getCompetencias() {
        return competencias;
    }

    public void setCompetencias(List<String> competencias) {
        this.competencias = competencias;
    }
    
}
