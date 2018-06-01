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
public class TReponedorTest {
    
    public TReponedorTest() {
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
     * Test of getIdReponedor method, of class TReponedor.
     */
    @Test
    public void testGetIdReponedor() {
        System.out.println("getIdReponedor");
        TReponedor instance = new TReponedor();
        int expResult = 0;
        int result = instance.getIdReponedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdReponedor method, of class TReponedor.
     */
    @Test
    public void testSetIdReponedor() {
        System.out.println("setIdReponedor");
        int idReponedor = 0;
        TReponedor instance = new TReponedor();
        instance.setIdReponedor(idReponedor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class TReponedor.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        TReponedor instance = new TReponedor();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
