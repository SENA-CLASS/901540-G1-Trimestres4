/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemploejb1.negocio.ejb;

import javax.ejb.DependsOn;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.Timer;

/**
 *
 * @author hernando
 */
@Singleton
@Startup
@DependsOn("ShopperCount")
public class LogShopperCount {
// Logs shopper count every 2 hours

    @Schedule(hour = "*/2")
    public void logShopperCount(Timer timer) {
// Log shopper count
        String timerInfo = (String) timer.getInfo();
        System.out.println(timerInfo);
    }
}
