/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.prueba;

import edu.co.sena.integracion.entiies.Perro;
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
        p1.setIdPerro("1");
        p1.setNombre("pili");
        p1.setRaza("dobermang");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PruebaJPAPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(p1);
        em.getTransaction().commit();
        em.close();
        emf.close();
     
    }
    @Test
    public void find() {
        
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PruebaJPAPU");
        EntityManager em = emf.createEntityManager();
        Perro pt = em.find(Perro.class, "1");
        em.close();
        emf.close();
        
        System.out.println(pt.toString());
        
    }
    @Test
    public void remove() {
        
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PruebaJPAPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Perro pt2 = em.find(Perro.class, "1");
       
        em.remove(pt2);
        em.getTransaction().commit();
        em.close();
        emf.close();
        
        
        
    }
    @Test
    public void update() {
        
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PruebaJPAPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Perro pt2 = em.find(Perro.class, "1");
        pt2.setNombre("g");
        em.merge(pt2); //se puede usar tambien el merge
        em.getTransaction().commit();
        em.close();
        emf.close();
        
        
        
    }
    @Test
    public void queryJPQLTypeQuery() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PruebaJPAPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        TypedQuery<Perro> query = em.createQuery("SELECT u FROM Perro u", Perro.class);
        List<Perro> lista = query.getResultList();
        
        em.getTransaction().commit();
        em.close();
        emf.close();
        
        for (Perro perro : lista) {
            System.out.println(perro.toString());
        }
        
        
        
    }
    @Test
    public void queryJPQLQuery() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PruebaJPAPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT u FROM Perro u");
        List<Perro> lista = query.getResultList();
        
        em.getTransaction().commit();
        em.close();
        emf.close();
        
        for (Perro perro : lista) {
            System.out.println(perro.toString());
        }
        
        
        
    }
    
    
}
