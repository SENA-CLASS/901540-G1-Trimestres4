/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemploejb2.negocio.ejbs;

import javax.ejb.Local;

/**
 *
 * @author hernando
 */
@Local
public interface OperacionFacadeLocal {

    double suma(double numero1, double numero2);
    
}
