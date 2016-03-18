/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemploejb1.negocio.ejb;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Remove;
import javax.ejb.Stateful;

/**
 *
 * @author hernando
 */
@Stateful
public class EJBconEstado implements EJBconEstadoLocal, EJBconEStadoRemote {

    private int i = 0;

    public String incrementador() {
        stopSession();
        return String.valueOf(++i);
        
    }

    @PostConstruct
    public void init() {
        System.out.println("postcontruc");
        stopSession();

    }

    @PreDestroy
    public void clean() {
        stopSession();
        System.out.println("predestroy");
        
    }

    @PrePassivate
    public void pause() {
        stopSession();
        System.out.println("prepasive");
    }

    @PostActivate
    public void active() {
        stopSession();
        System.out.println("postactive");
      
    }

    @Remove
    public void stopSession() {
// The method body can be empty.
        System.out.println("From stopSession method with @Remove annotation");
    }
    
}
