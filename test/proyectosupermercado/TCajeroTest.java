/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosupermercado;

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
public class TCajeroTest {
    
    public TCajeroTest() {
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
     * Test of getIdCajero method, of class TCajero.
     */
    @Test
    public void testGetIdCajero() {
        System.out.println("getIdCajero");
        TCajero instance = new TCajero();
        int expResult = 0;
        int result = instance.getIdCajero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdCajero method, of class TCajero.
     */
    @Test
    public void testSetIdCajero() {
        System.out.println("setIdCajero");
        int idCajero = 0;
        TCajero instance = new TCajero();
        instance.setIdCajero(idCajero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class TCajero.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        TCajero instance = new TCajero();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
