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
public class TAlmacenTest {
    
    public TAlmacenTest() {
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
     * Test of getIdAlmacen method, of class TAlmacen.
     */
    @Test
    public void testGetIdAlmacen() {
        System.out.println("getIdAlmacen");
        TAlmacen instance = new TAlmacen();
        int expResult = 0;
        int result = instance.getIdAlmacen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdAlmacen method, of class TAlmacen.
     */
    @Test
    public void testSetIdAlmacen() {
        System.out.println("setIdAlmacen");
        int idAlmacen = 0;
        TAlmacen instance = new TAlmacen();
        instance.setIdAlmacen(idAlmacen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategoria method, of class TAlmacen.
     */
    @Test
    public void testGetCategoria() {
        System.out.println("getCategoria");
        TAlmacen instance = new TAlmacen();
        String expResult = "";
        String result = instance.getCategoria();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCategoria method, of class TAlmacen.
     */
    @Test
    public void testSetCategoria() {
        System.out.println("setCategoria");
        String categoria = "";
        TAlmacen instance = new TAlmacen();
        instance.setCategoria(categoria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class TAlmacen.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        TAlmacen instance = new TAlmacen();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
