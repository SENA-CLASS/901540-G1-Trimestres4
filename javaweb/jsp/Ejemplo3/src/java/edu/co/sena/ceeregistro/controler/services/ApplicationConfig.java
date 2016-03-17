/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ceeregistro.controler.services;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author hernando
 */
@javax.ws.rs.ApplicationPath("api")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(edu.co.sena.ceeregistro.controler.services.CargoFacadeREST.class);
        resources.add(edu.co.sena.ceeregistro.controler.services.CuentaFacadeREST.class);
        resources.add(edu.co.sena.ceeregistro.controler.services.EquipoFacadeREST.class);
        resources.add(edu.co.sena.ceeregistro.controler.services.PropietarioFacadeREST.class);
        resources.add(edu.co.sena.ceeregistro.controler.services.RegistroFacadeREST.class);
        resources.add(edu.co.sena.ceeregistro.controler.services.TipoDocumentoFacadeREST.class);
        resources.add(edu.co.sena.ceeregistro.controler.services.UsuarioFacadeREST.class);
    }
    
}
