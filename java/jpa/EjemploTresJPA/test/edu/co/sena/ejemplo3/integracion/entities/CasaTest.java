/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo3.integracion.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
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
public class CasaTest {
    
    public CasaTest() {
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
     * Test of getIdCasa method, of class Casa.
     */
    @Test
    public void testGetIdCasa() {
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("EjemploTresJPAPU");
        EntityManager em  = emf.createEntityManager();
//        em.getTransaction().begin();
//        
//        em.getTransaction().commit();
        Casa ct = em.find(Casa.class, 1);
        em.close();
        emf.close();
        System.out.println(ct.toString());
        for (Habitante object : ct.getHabitanteCollection()) {
            System.out.println(object.toString());
        }
    }
    @Test
    public void testInsert() {
        Casa c1 = new Casa();
        c1.setDireccionCasa("calle siempre viva");
        
        Habitante h1 = new Habitante();
        h1.setNombreHabitante("h1");
        h1.setCasaidCasa(c1);
        Habitante h2 = new Habitante();
        h2.setNombreHabitante("h2");
        h2.setCasaidCasa(c1);
        
        List<Habitante> habitantes = new ArrayList<>();
        habitantes.add(h1);
        habitantes.add(h2);
        c1.setHabitanteCollection(habitantes);
        
        
        
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("EjemploTresJPAPU");
        EntityManager em  = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(c1);
        em.getTransaction().commit();
        
        em.close();
        emf.close();
        
    }
    
    

    /**
     * Test of setIdCasa method, of class Casa.
     */
    @Test
    public void testSetIdCasa() {
        System.out.println("setIdCasa");
        Integer idCasa = null;
        Casa instance = new Casa();
        instance.setIdCasa(idCasa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDireccionCasa method, of class Casa.
     */
    @Test
    public void testGetDireccionCasa() {
        System.out.println("getDireccionCasa");
        Casa instance = new Casa();
        String expResult = "";
        String result = instance.getDireccionCasa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDireccionCasa method, of class Casa.
     */
    @Test
    public void testSetDireccionCasa() {
        System.out.println("setDireccionCasa");
        String direccionCasa = "";
        Casa instance = new Casa();
        instance.setDireccionCasa(direccionCasa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHabitanteCollection method, of class Casa.
     */
    @Test
    public void testGetHabitanteCollection() {
        System.out.println("getHabitanteCollection");
        Casa instance = new Casa();
        Collection<Habitante> expResult = null;
        Collection<Habitante> result = instance.getHabitanteCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHabitanteCollection method, of class Casa.
     */
    @Test
    public void testSetHabitanteCollection() {
        System.out.println("setHabitanteCollection");
        Collection<Habitante> habitanteCollection = null;
        Casa instance = new Casa();
        instance.setHabitanteCollection(habitanteCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Casa.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Casa instance = new Casa();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Casa.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Casa instance = new Casa();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Casa.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Casa instance = new Casa();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
