/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemploejb1.negocio.ejb;

import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.Singleton;

/**
 *
 * @author hernando
 */
@Singleton
@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
public class EjemploSingleton implements EjemploSingletonLocal, EjemploSingletonRemote {

    @Override
    public String singleton(){
        return "hola mundo";
    
    }
    
    private int i = 0;

    public String incrementador() {
        
        return String.valueOf(++i);
        
    }
    
    
    
}
