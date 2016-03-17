/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemploejb1.negocio.ejb;

import javax.ejb.Stateful;

/**
 *
 * @author hernando
 */
@Stateful
public class EJBconEstado implements EJBconEstadoLocal, EJBconEStadoRemote {
    private int i=0;
    public String incrementador(){
        return String.valueOf(++i);
    }
}
