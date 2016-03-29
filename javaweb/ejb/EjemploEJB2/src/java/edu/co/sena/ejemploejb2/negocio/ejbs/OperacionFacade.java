/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemploejb2.negocio.ejbs;

import javax.ejb.Stateless;

/**
 *
 * @author hernando
 */
@Stateless
public class OperacionFacade implements OperacionFacadeLocal {

    
    @Override
    public double suma(double numero1, double numero2) {
        return numero1+numero2;
    }

    
}
