/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarifa;

import java.util.logging.Logger;

/**
 *
 * @author Sergi
 */
public class Tarifa {

    private String id = null;
    private double costeMilla = 0d;
    private double costeMinuto = 0d;
    private double costeMinimo = 0d;
    private double porcentajeComision = 0d;

    public Tarifa() {
    }

    public Tarifa(String id, double costeMilla, double costeMinuto, double costeMinimo, double porcentajeComision) {
        this.id = id;
        this.costeMilla = costeMilla;
        this.costeMinuto = costeMinuto;
        this.costeMinimo = costeMinimo;
        this.porcentajeComision = porcentajeComision;
    }

//    getCosteDistancia(distancia) devuelve la parte del coste del trayecto debido al a distancia.
//getCosteTiempo(minutos) devuelve la parte del coste del trayecto debido a su duración en minutos.
//getCosteTotalEsperado(carrera) devuelve el coste total esperado de la carrera que recibe en función de la distancia esperada
//y el tiempo esperado. El coste total esperado no puede ser inferior al mínimo.
//    
    
}
