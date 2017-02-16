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

    private String nombre;
    private String modelo;
    private String matricula;
    private double valoracionMedia;
    private double valoraciones;
    private boolean ocupado;

    public Conductor() {
    }

    public Conductor(String nombre, String modelo, String matricula, double valoracionMedia, double valoraciones, boolean ocupado) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.matricula = matricula;
        this.valoracionMedia = valoracionMedia;
        this.valoraciones = valoraciones;
        this.ocupado = ocupado;
    }

    //setValoracion(valoracion) añade la nueva valoración y actualiza la valoración media del conductor.
}
