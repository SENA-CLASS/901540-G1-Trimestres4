/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemploejb1.negocio.ejb;

import javax.ejb.Local;
import javax.ejb.Timer;

/**
 *
 * @author hernando
 */
@Local
public interface LogShopperCountLocal {
    public void logShopperCount(Timer timer);
}
