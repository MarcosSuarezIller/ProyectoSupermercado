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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author DAM125
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({proyectosupermercado.EstanteriaTest.class, proyectosupermercado.TReponedorTest.class, proyectosupermercado.CompraTest.class, proyectosupermercado.grafica.GraficaSuite.class, proyectosupermercado.PeonAlmacenTest.class, proyectosupermercado.AlmacenTest.class, proyectosupermercado.JefeAlmacenTest.class, proyectosupermercado.ClienteTest.class, proyectosupermercado.TrabajadorTest.class, proyectosupermercado.TCajeroTest.class, proyectosupermercado.ProductoTest.class, proyectosupermercado.TAlmacenTest.class})
public class ProyectosupermercadoSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
