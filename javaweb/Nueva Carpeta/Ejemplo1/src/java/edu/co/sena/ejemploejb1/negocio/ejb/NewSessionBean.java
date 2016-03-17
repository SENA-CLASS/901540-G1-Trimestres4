/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemploejb1.negocio.ejb;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;

/**
 *
 * @author hernando
 */
@Stateless(name = "primerejb")
public class NewSessionBean implements NewSessionBeanLocal, NewInterfaceRemote {

    public String hola() {
        return "hola mundo";
    }
    @PostConstruct
    public void hola1() {
        System.out.println("postcontruc"); ;
        
    }
    @PreDestroy
    public void hola2() {
        System.out.println("predestroy");
    }
    
    
    
    
}
