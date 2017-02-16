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

    private int conductores;

    ArrayList<Conductor> poolConductores;

    private Conductor conductor = new Conductor();

    public PoolConductores() {
    }

    public PoolConductores(int conductores) {
        this.conductores = conductores;
    }
      public PoolConductores(ArrayList<Conductor> poolConductores) {
        this.poolConductores = poolConductores;
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

  
    

}
