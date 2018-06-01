/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosupermercado.grafica;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import proyectosupermercado.Almacen;
import proyectosupermercado.Cliente;

/**
 *
 * @author DAM125
 */
public class InterfazTest {
    
    public InterfazTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Interfaz.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
//        Interfaz.main(args);
Almacen a1 = new Almacen();
Almacen a2 = new Almacen();
Almacen a3 = new Almacen();
        try {
            Cliente c1 = new Cliente("1", "Pepe", "942701083", "Calle la Pepa");
        } catch (Exception ex) {
            Logger.getLogger(InterfazTest.class.getName()).log(Level.SEVERE, null, ex);
        }



    }
    
}
