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
public class PoolConductores {

    private Conductor[] poolConducores = null;

    public PoolConductores() {
    }

    public PoolConductores(Conductor[] poolConducores) {
        this.poolConducores = poolConducores;
    }

//    
//    El constructor PoolConductores(conductores) recibe un array de longitud variable de conductores.
//asignarConductor()selecciona un conductor libre entre la flota y lo devuelve, estableciendo que ese conductor está ahora ocupado.
}
