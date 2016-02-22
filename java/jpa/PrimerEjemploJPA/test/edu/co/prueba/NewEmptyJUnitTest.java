/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.prueba;

import edu.co.sena.integracion.entiies.Perro;
import edu.co.sena.integracion.entiies.PerroPK;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
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
    @Test
    public void insertar() {
        
        Perro p1 = new Perro();
        p1.setPerroPk(new PerroPK("1", "pili"));
       
        p1.setRaza("dobermang");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PruebaJPAPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(p1);
        em.getTransaction().commit();
        em.close();
        emf.close();
     
    }
   
    
}
