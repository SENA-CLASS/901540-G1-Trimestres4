/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ingresoceet.interacion.entities;

import edu.co.sena.ingresoceet.interacion.util.EntityManagerHelper;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TemporalType;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author hernando
 */
public class CuentaTest {

    EntityManager em;

    public CuentaTest() {
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

    @Test
    public void cargueImagen(){
    File file = new File("C:\\imagenes\\images.jpg");
        System.out.println(file.getAbsolutePath());
      
    
    }
    
    
    @Test
    public void insertarCuenta() throws IOException {
        assertNotNull(em);
        
        
        
        Cuenta c = new Cuenta();
        c.setCuentaPK(new CuentaPK("CC", "80013833"));
        c.setEstado("Activo");
        try {
            c.setFoto(Files.readAllBytes(new File("C:\\imagenes\\images.jpg").toPath()));
        } catch (Exception e) {
            System.out.println("error al cargar la imagen "+e.getMessage());
        }
        
        
        
        c.setFechaTerminacion(new Date());
        c.setCargoidCargo(em.createNamedQuery("Cargo.findByIdCargo", Cargo.class)
                .setParameter("idCargo", "Instructor")
                .getSingleResult());
        c.setPrimerNombre("Hernando");
        c.setSegundoNombre("Enrique");
        c.setPrimerApellido("Moreno");
        c.setSegundoApellido("Moreno");
        assertNotNull(c);
        EntityManagerHelper.beginTransaction();
        em.persist(c);
        EntityManagerHelper.commit();
        assertSame(c, em.find(Cuenta.class, new CuentaPK("CC", "80013833")));
    }
    
    @Test
    public void findPK() {
        Cuenta c =em.find(Cuenta.class, new CuentaPK("CC", "80013833"));
        System.out.println(c.toString());
        
        
        
    }

    @Test
    public void findBetween() {
        Date startDate = new Date();
        Date endDate = new Date(startDate.getTime() +1000000000);
        
        Query query = em.createQuery("SELECT u from Cuenta u where u.fechaTerminacion BETWEEN :startDate AND :endDate ",Cuenta.class);
        query.setParameter("startDate", startDate, TemporalType.DATE);
        query.setParameter("endDate", endDate, TemporalType.DATE);
        List<Cuenta> lista = query.getResultList();
        System.out.println("fecha inicial "+startDate.toString());
        System.out.println("fecha final "+endDate.toString());
        for (Cuenta c : lista) {
            System.out.println(c.getPrimerNombre());
        }
        
        
        
    }
    

}
