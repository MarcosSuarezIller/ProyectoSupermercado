/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosupermercado;

import java.util.Calendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DAM125
 */
public class CompraTest {
    
    public CompraTest() {
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
     * Test of getNumCompra method, of class Compra.
     */
    @Test
    public void testGetNumCompra() {
        System.out.println("getNumCompra");
        Compra instance = new Compra();
        int expResult = 0;
        int result = instance.getNumCompra();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumCompra method, of class Compra.
     */
    @Test
    public void testSetNumCompra() {
        System.out.println("setNumCompra");
        int numCompra = 0;
        Compra instance = new Compra();
        instance.setNumCompra(numCompra);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class Compra.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Compra instance = new Compra();
        Calendar expResult = null;
        Calendar result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class Compra.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        Calendar fecha = null;
        Compra instance = new Compra();
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecioTotal method, of class Compra.
     */
    @Test
    public void testGetPrecioTotal() {
        System.out.println("getPrecioTotal");
        Compra instance = new Compra();
        double expResult = 0.0;
        double result = instance.getPrecioTotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecioTotal method, of class Compra.
     */
    @Test
    public void testSetPrecioTotal() {
        System.out.println("setPrecioTotal");
        double precioTotal = 0.0;
        Compra instance = new Compra();
        instance.setPrecioTotal(precioTotal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMetodoPago method, of class Compra.
     */
    @Test
    public void testGetMetodoPago() {
        System.out.println("getMetodoPago");
        Compra instance = new Compra();
        char expResult = ' ';
        char result = instance.getMetodoPago();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMetodoPago method, of class Compra.
     */
    @Test
    public void testSetMetodoPago() {
        System.out.println("setMetodoPago");
        char metodoPago = ' ';
        Compra instance = new Compra();
        instance.setMetodoPago(metodoPago);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Compra.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Compra instance = new Compra();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
