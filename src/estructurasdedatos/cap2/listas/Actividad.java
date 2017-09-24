/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.listas;


public class Actividad {

      private String nombre;
    private String fecha;
    private String responsable;
    private float porcentaje;

    public Actividad(String nombre, String fecha, String responsable) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.responsable = responsable;
        
    }

  
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  
    public String getFecha() {
        return fecha;
    }

 
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    public String getReponsable() {
        return responsable;
    }


    public void setReponsable(String reponsable) {
        this.responsable = reponsable;
    }


    public float getPorsentaje() {
        return porcentaje;
    }


    public void setPorsentaje(float porcentaje) {
        this.porcentaje = porcentaje;
    }
}
