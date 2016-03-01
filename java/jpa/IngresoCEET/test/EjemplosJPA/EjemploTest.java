/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemplosJPA;

import edu.co.sena.ingresoceet.interacion.entities.*;
import edu.co.sena.ingresoceet.interacion.util.EntityManagerHelper;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
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
public class EjemploTest {

    EntityManager em;

    public EjemploTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        em = EntityManagerHelper.getEntityManager();
    }

    @After
    public void tearDown() {
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();
    }

    /**
     * Test of getIdCargo method, of class Cargo.
     */
    @Test
    public void testInsertCargo() {

        Cargo c1 = new Cargo();
        c1.setIdCargo("Instructor");
        c1.setDescripcionCargo("es un untructor");
        c1.setEstado("Activo");
        EntityManagerHelper.beginTransaction();
        em.persist(c1);
        EntityManagerHelper.commit();
        em.clear();
        Cargo c2 = new Cargo();
        c2.setIdCargo("Aprendiz");
        c2.setDescripcionCargo("es un untructor");
        c2.setEstado("Activo");
        EntityManagerHelper.beginTransaction();
        em.persist(c2);
        EntityManagerHelper.commit();

    }

    /**
     * Test of getIdCargo method, of class Cargo.
     */
    @Test
    public void testFindAllQuery() {
        EntityManagerHelper.beginTransaction();
        Query query = em.createNamedQuery("Cargo.findAll");
        EntityManagerHelper.commit();
        List<Cargo> lista = query.getResultList();
        for (Cargo cargo : lista) {
            System.out.println(cargo.toString());
        }
        //usando una clase Cargo.class para que el query y retorne los objetos ya con casting
        EntityManagerHelper.beginTransaction();
        Query query2 = em.createNamedQuery("Cargo.findAll", Cargo.class);
        EntityManagerHelper.commit();
        List<Cargo> lista2 = query2.getResultList();
        for (Cargo cargo : lista2) {
            System.out.println(cargo.toString());
        }
    }

    @Test
    public void testFindAllTypeQuery() {
        EntityManagerHelper.beginTransaction();
        TypedQuery<Cargo> query = em.createNamedQuery("Cargo.findAll", Cargo.class);
        EntityManagerHelper.commit();
        List<Cargo> lista = query.getResultList();
        for (Cargo cargo : lista) {
            System.out.println(cargo.toString());
        }
    }

    @Test
    public void testFindByIdCargo() {
        EntityManagerHelper.beginTransaction();
        Query query = em.createNamedQuery("Cargo.findByIdCargo");
        query.setParameter("idCargo", "Aprendiz");
        EntityManagerHelper.commit();
        List<Cargo> lista = query.getResultList();
        for (Cargo cargo : lista) {
            System.out.println(cargo.toString());
        }
    }

    @Test
    public void testFindByIdCargoLike() {
        EntityManagerHelper.beginTransaction();
        Query query = em.createQuery("SELECT c FROM Cargo c WHERE c.idCargo LIKE :id");
        query.setParameter("id", "%n%");
        EntityManagerHelper.commit();
        List<Cargo> lista = query.getResultList();
        for (Cargo cargo : lista) {
            System.out.println(cargo.toString());
        }
    }

    @Test
    public void testFindByIdNative() {
        String variable = "Aprendiz";
        EntityManagerHelper.beginTransaction();
        Query query = em.createNativeQuery("select * from cargo where idcargo = '" + variable + "'", Cargo.class);
        EntityManagerHelper.commit();
        List<Cargo> lista = query.getResultList();
        for (Cargo cargo : lista) {
            System.out.println(cargo.toString());
        }
    }

    @Test
    public void testUpdatePK() {
        Cargo ct;
        EntityManagerHelper.beginTransaction();
        
        EntityManagerHelper.commit();
        
    }

}
