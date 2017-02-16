/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conductores;

/**
 *
 * @author Sergi
 */
public class Conductor {

    private String nombre=null;
    private String modelo=null;
    private String matricula=null;
    private double valoracionMedia=0d;
    private double valoraciones=0d;
    private boolean ocupado;
    private int numeroValoraciones=0;

    public Conductor() {
    }

    public Conductor(String nombre) {
         this.nombre = nombre;
    }
    

    public Conductor(String nombre, String modelo, String matricula, double valoracionMedia, double valoraciones, boolean ocupado) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.matricula = matricula;
        this.valoracionMedia = valoracionMedia;
        this.valoraciones = valoraciones;
        this.ocupado = ocupado;
    }
    
    public void setValoracion(int valoracion){
        
        setValoraciones(getValoraciones()+valoracion);
        setNumeroValoraciones(getNumeroValoraciones() +1);
        setValoracionMedia(getValoraciones()/getNumeroValoraciones());
        
        
    }
    public double getValoracion(){
        return this.valoracionMedia;
    }
    
    
    

     /*
    GETTERS Y SETTERS
     */

    public int getNumeroValoraciones() {
        return numeroValoraciones;
    }

    //setValoracion(valoracion) añade la nueva valoración y actualiza la valoración media del conductor.
   
    public void setNumeroValoraciones(int numeroValoraciones) {
        this.numeroValoraciones = numeroValoraciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public double getValoracionMedia() {
        return valoracionMedia;
    }

    public void setValoracionMedia(double valoracionMedia) {
        this.valoracionMedia = valoracionMedia;
    }

    public double getValoraciones() {
        return valoraciones;
    }

    public void setValoraciones(double valoraciones) {
        this.valoraciones = valoraciones;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
    

    
    
    
    
}
