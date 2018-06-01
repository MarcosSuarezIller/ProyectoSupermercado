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
public class EstanteriaTest {
    
    public EstanteriaTest() {
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
     * Test of getId method, of class Estanteria.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Estanteria instance = new Estanteria();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Estanteria.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Estanteria instance = new Estanteria();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLugar method, of class Estanteria.
     */
    @Test
    public void testGetLugar() {
        System.out.println("getLugar");
        Estanteria instance = new Estanteria();
        String expResult = "";
        String result = instance.getLugar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLugar method, of class Estanteria.
     */
    @Test
    public void testSetLugar() {
        System.out.println("setLugar");
        String lugar = "";
        Estanteria instance = new Estanteria();
        instance.setLugar(lugar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLongitud method, of class Estanteria.
     */
    @Test
    public void testGetLongitud() {
        System.out.println("getLongitud");
        Estanteria instance = new Estanteria();
        double expResult = 0.0;
        double result = instance.getLongitud();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLongitud method, of class Estanteria.
     */
    @Test
    public void testSetLongitud() {
        System.out.println("setLongitud");
        double longitud = 0.0;
        Estanteria instance = new Estanteria();
        instance.setLongitud(longitud);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Estanteria.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Estanteria instance = new Estanteria();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
