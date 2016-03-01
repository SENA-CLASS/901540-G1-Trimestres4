/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ingresoceet.interacion.entities;

import edu.co.sena.ingresoceet.interacion.util.EntityManagerHelper;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
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
public class EquipoTest {

    public EquipoTest() {
    }
    EntityManager em;

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
    public void testInsertEquipo() {
        Equipo e = new Equipo();
        e.setSerial("1234567");
        e.setDescripcion("Asus 5024");
        e.setEstado("Activo");
        e.setMarca("Asus");
        EntityManagerHelper.beginTransaction();
        em.persist(e);
        EntityManagerHelper.commit();
        
    }
    
    @Test
    public void testInsertEquipoConPropietario() {
        Equipo e = new Equipo();
        e.setSerial("12345675");
        e.setDescripcion("Asus 5024");
        e.setEstado("Activo");
        e.setMarca("Asus");
        List<Propietario> propietarios =new ArrayList<>();
        propietarios.add(new Propietario("12345675", "CC", "80013833"));
        e.setPropietarioCollection(propietarios);
        EntityManagerHelper.beginTransaction();
        em.persist(e);
        EntityManagerHelper.commit();
        
    }
    
    

}
