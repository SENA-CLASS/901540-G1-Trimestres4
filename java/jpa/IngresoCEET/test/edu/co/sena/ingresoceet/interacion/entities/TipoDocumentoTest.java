/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ingresoceet.interacion.entities;

import edu.co.sena.ingresoceet.interacion.util.EntityManagerHelper;
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
public class TipoDocumentoTest {

    public TipoDocumentoTest() {
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
    public void insertarTipoDocumento() {
        TipoDocumento tp = new TipoDocumento();
        tp.setTipoDocumento("CC");
        tp.setDescripcion("Cedula de Ciudadania");
        tp.setEstado("Activo");
        EntityManagerHelper.beginTransaction();
        em.persist(tp);
        EntityManagerHelper.commit();
    }

}
