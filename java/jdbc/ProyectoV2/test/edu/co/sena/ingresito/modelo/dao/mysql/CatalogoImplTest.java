/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ingresito.modelo.dao.mysql;

import edu.co.sena.ingresito.modelo.dao.CatalogoDAO;
import edu.co.sena.ingresito.modelo.dto.Catalogo;
import edu.co.sena.ingresito.modelo.dto.CatalogoPk;
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
     * Test of findAll method, of class CatalogoDAOImpl.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        CatalogoDAO instance = new CatalogoDAOImpl();
        List<Catalogo> result = instance.findAll();
        for (Catalogo catalogo : result) {
            System.out.println(catalogo.toString());
        }
    }
    @Test
    public void testInsert() {
        System.out.println("insertar catalogo");
        Catalogo ct = new Catalogo();
        ct.setIdCatalogo(14);
        ct.setNombreCatalogo("nononon");
        ct.setDescripcion("asdfasdfasd");
        CatalogoDAO instance = new CatalogoDAOImpl();
        instance.insert(ct);
    }
    @Test
    public void testUpdate() {
        System.out.println("update catalogo");
        CatalogoPk llave = new CatalogoPk(1);
        Catalogo nuevoCatalogo = new Catalogo();
        nuevoCatalogo.setIdCatalogo(15);
        nuevoCatalogo.setNombreCatalogo("nononon");
        nuevoCatalogo.setDescripcion("asdfasdfasd");
        CatalogoDAO instance = new CatalogoDAOImpl();
        instance.update(llave, nuevoCatalogo);
    }

    @Test
    public void testUpdatePk() {
        System.out.println("update catalogo");
        CatalogoPk llaveVieja = new CatalogoPk(1);
        CatalogoPk llaveNueva = new CatalogoPk(100);
        
        CatalogoDAO instance = new CatalogoDAOImpl();
        instance.updatePk(llaveVieja, llaveNueva);
    }


    
   
    
}
