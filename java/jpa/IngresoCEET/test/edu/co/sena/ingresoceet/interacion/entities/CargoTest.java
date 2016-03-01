/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ingresoceet.interacion.entities;

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
public class CargoTest {

    EntityManager em;

    public CargoTest() {
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
        assertNotNull(em);
        Cargo c1 = new Cargo();
        c1.setIdCargo("Instructor");
        c1.setDescripcionCargo("es un untructor");
        c1.setEstado("Activo");
        assertNotNull(c1);
        EntityManagerHelper.beginTransaction();
        em.persist(c1);
        EntityManagerHelper.commit();
        assertSame(c1, em.find(Cargo.class, "Instructor"));
    }
    @Test
    public void testDeleteCargo() {
        
        Cargo c1 = em.find(Cargo.class, "Instructor");
        assertNotNull(c1);
        EntityManagerHelper.beginTransaction();
        em.remove(c1);
        EntityManagerHelper.commit();
        
    }
    
    @Test
    public void testUpdateCargo() {
        
        Cargo c1 = em.find(Cargo.class, "Instructor");
        c1.setDescripcionCargo("asfasdfa");
        c1.setEstado("inactivo");
        assertNotNull(c1);
        EntityManagerHelper.beginTransaction();
        em.persist(c1);
        EntityManagerHelper.commit();
        
    }

    @Test
    public void testUpdatePK() {
        //no funciona por un problema llamado eclipselink.weaving ya que el 
        //entretegido de la persistencia esta activo siempre no deja actualizar llaves primarias
        Cargo c1 = em.find(Cargo.class, "Instructor");
        c1.setIdCargo("Instructor3");
        
        EntityManagerHelper.beginTransaction();
        em.merge(c1);
        EntityManagerHelper.commit();

    }

    @Test
    public void testUpdatePKNativeQuery() {
        String nuevo = "adsfadsf";
        String viejo = "Instructor";
        EntityManagerHelper.beginTransaction();
        em.createNativeQuery("UPDATE cargo\n"
                + "SET\n"
                + "idCargo = '" + nuevo + "'\n"
                + "WHERE idCargo = '" + viejo + "';").executeUpdate();
        EntityManagerHelper.commit();

    }

    @Test
    public void testUpdatePKJPQL() {
        String nuevo = "Instructor";
        String viejo = "adsfadsf";
        EntityManagerHelper.beginTransaction();
        Query query;
        query = em.createQuery("UPDATE Cargo c SET c.idCargo = :nuevo where c.idCargo = :viejo");
        query.setParameter("nuevo", nuevo);
        query.setParameter("viejo", viejo);
        int updateCount = query.executeUpdate();
        EntityManagerHelper.commit();
    }

    @Test
    public void testFindAll() {
        Query query = em.createNamedQuery("Cargo.findAll");
        List<Cargo> cargos = query.getResultList();
        for (Cargo cargo : cargos) {
            System.out.println(cargo);
        }
    }

    @Test
    public void testFindbyPk() {
        Cargo c = em.find(Cargo.class, "Instructor");
        System.out.println(c.getIdCargo());
        System.out.println(c.getEstado());
        System.out.println(c.getDescripcionCargo());
    }

    @Test
    public void testFindIdCargo() {
        Query query = em.createNamedQuery("Cargo.findByIdCargo");
        query.setParameter("idCargo", "Instructor");
        List<Cargo> cargos = query.getResultList();
        for (Cargo c : cargos) {
            System.out.println(c.getIdCargo());
            System.out.println(c.getEstado());
            System.out.println(c.getDescripcionCargo());
        }
    }

    @Test
    public void testFindByEstado() {
        Query query = em.createNamedQuery("Cargo.findByEstado");
        query.setParameter("estado", "Activo");
        List<Cargo> cargos = query.getResultList();
        for (Cargo c : cargos) {
            System.out.println("------------------");
            System.out.println(c.getIdCargo());
            System.out.println(c.getEstado());
            System.out.println(c.getDescripcionCargo());
        }
    }
    
    @Test
    public void testFindByDescripcionCargo() {
        Query query = em.createNamedQuery("Cargo.findByDescripcionCargo");
        query.setParameter("descripcionCargo", "asfasdfa");
        List<Cargo> cargos = query.getResultList();
        for (Cargo c : cargos) {
            System.out.println("------------------");
            System.out.println(c.getIdCargo());
            System.out.println(c.getEstado());
            System.out.println(c.getDescripcionCargo());
        }
    }
    
    @Test
    public void testFindIdCargoLike() {
        Query query = em.createNamedQuery("Cargo.findByIdCargoLike");
        query.setParameter("idCargo", "%n%");
        List<Cargo> cargos = query.getResultList();
        for (Cargo c : cargos) {
            System.out.println(c.getIdCargo());
            System.out.println(c.getEstado());
            System.out.println(c.getDescripcionCargo());
        }
    }
    

}
