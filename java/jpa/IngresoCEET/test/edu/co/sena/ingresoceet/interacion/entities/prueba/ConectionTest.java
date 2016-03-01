/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ingresoceet.interacion.entities.prueba;

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
public class ConectionTest {
    
    public ConectionTest() {
    }
  
    @Test
    public void testConection() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("IngresoCEETPU");
        EntityManager em = emf.createEntityManager();
        
        em.close();
        emf.close();
        
    
    }
}
