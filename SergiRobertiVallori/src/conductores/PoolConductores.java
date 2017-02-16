/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conductores;

import java.util.ArrayList;

/**
 *
 * @author Sergi
 */
public class PoolConductores {

    private Conductor[] poolConducores = null;
    private Conductor conductor = new Conductor();

    public PoolConductores() {
    }

    public PoolConductores(Conductor[] poolConducores) {
        this.poolConducores = poolConducores;
    }
//    
//    public Conductor asignarConductor(){
//        
//        for (int i = 0; i < poolConducores.length; i++) {
//            
//            if(!poolConducores[i].isOcupado()){
//                
//                return conductor;
//                
//                
//            }else{
//                return
//            }
//            
//            
//        }
//        
//    }

//    
//    El constructor PoolConductores(conductores) recibe un array de longitud variable de conductores.
//asignarConductor()selecciona un conductor libre entre la flota y lo devuelve, estableciendo que ese conductor está ahora ocupado.

    public PoolConductores(ArrayList<Conductor> poolConductores) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
