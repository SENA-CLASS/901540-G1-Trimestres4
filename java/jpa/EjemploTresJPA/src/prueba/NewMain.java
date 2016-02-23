/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author hernando
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("EjemploTresJPAPU");
        EntityManager em  = emf.createEntityManager();
//        em.getTransaction().begin();
//        
//        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
}
