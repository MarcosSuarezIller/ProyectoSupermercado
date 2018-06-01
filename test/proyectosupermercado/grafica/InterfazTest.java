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
import proyectosupermercado.Trabajador;

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
       
        
        
        try {
            Cliente c1 = new Cliente("1", "Pepe", "942701083", "Calle la Pepa");
            Cliente c2 = new Cliente(c1);
            Cliente c3 = new Cliente();
            
            Trabajador t1 = new Trabajador("12345678E", "Pepe", "Lolapo", "La Pepa", "987654321", true);
            Trabajador t2 = new Trabajador();
            
            Almacen a1 = new Almacen();
            Almacen a2 = new Almacen("3", "Pipas", "65123", "Santander");
            
            
            
        } catch (Exception ex) {
            Logger.getLogger(InterfazTest.class.getName()).log(Level.SEVERE, null, ex);
        }



    }
    
}
