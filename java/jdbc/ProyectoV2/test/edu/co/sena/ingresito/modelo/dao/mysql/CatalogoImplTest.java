/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ingresito.modelo.dao.mysql;

import edu.co.sena.ingresito.modelo.dto.Catalogo;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hernando
 */
public class CatalogoImplTest {
    
    public CatalogoImplTest() {
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
     * Test of findAll method, of class CatalogoImpl.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        CatalogoImpl instance = new CatalogoImpl();
        List<Catalogo> result = instance.findAll();
        for (Catalogo catalogo : result) {
            System.out.println(catalogo.toString());
        }
    }

    /**
     * Test of getTableName method, of class CatalogoImpl.
     */
    @Test
    public void testGetTableName() {
        System.out.println("getTableName");
        CatalogoImpl instance = new CatalogoImpl();
        String expResult = "";
        String result = instance.getTableName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
