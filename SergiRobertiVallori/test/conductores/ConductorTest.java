/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conductores;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sergi
 */
public class ConductorTest {

    public ConductorTest() {
    }

    public void TestValoraciones() {
        Conductor conductor = new Conductor();

        conductor.setNumeroValoraciones(4);
        conductor.setValoracionMedia(5);
        conductor.setValoracion((byte) 4);
        
        assertEquals(4.8,conductor.getValoracionMedia(),0.1);
        
    }
}
