/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.prueba;

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
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void conexion() {
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("PruebaJPAPU");
         EntityManager em = emf.createEntityManager();
         
         em.close();
         emf.close();
         EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("jpa2JPAPU");
         EntityManager em2 = emf2.createEntityManager();
         
         em2.close();
         emf2.close();
    
    }
}
