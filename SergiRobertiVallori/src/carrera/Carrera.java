/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrera;

/**
 *
 * @author Sergi
 */
public class Carrera {

    
    private double tiempoEsperado = 0d;
    private double tiempoCarrera = 0d;
    private double costeTotal = 0d;
    private String conductor = null;
    private String origen;
    private String destino;
    private double distancia;
    private String tarjetaDeCredito;
    
    /*
    CONSTRUCORES
    */

    public Carrera() {

    }

    public Carrera(double tiempoEsperado, double tiempoCarrera, double costeTotal, String conductor) {
        this.tiempoEsperado = tiempoEsperado;
        this.tiempoCarrera = tiempoCarrera;
        this.costeTotal = costeTotal;
        this.conductor = conductor;
    }

    public Carrera(String tarjetaDeCredito) {
        this.tarjetaDeCredito = tarjetaDeCredito;
    }
    
    

    //    getTarjetaCredito() devuelve el número de la tarjeta de crédito del usuario/a.
 
    
//getOrigen() devuelve el lugar de origen del trayecto.
    
   
    
    
    
//getDestino() devuelve el lugar de destino del trayecto.
    
    
//getDistancia() devuelve la distancia entre el origen y el destino.
    
    
//getCosteEsperado() devuelve el coste esperado del trayecto, cuyo cálculo es responsabilidad de la clase Tarifa.
    
    
//asignarConductor(PoolConductores conductores) recibe la flota de conductores y
    //asigna un conductor a la carrera. Le pide a la clase PoolConductores que le asigne un conductor.
    
    
    
public double getCosteEsperado() {
    
    
    
}
//realizarPago(pago) recibe el pago y lo almacena en el atributo costeTotal
//recibirPropina(propina) recibe la propina que paga el usuario
//liberarConductor() establece que el conductor asignado a la carrera queda libre tras el servicio.
            
            
            /*
            GETTERS Y SETTERS
            */

    public void setTiempoEsperado(double tiempoEsperado) {
        this.tiempoEsperado = tiempoEsperado;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getTiempoEsperado() {
        return tiempoEsperado;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public String getTarjetaDeCredito() {
        return tarjetaDeCredito;
    }
    
    
            
    
            
            
}
