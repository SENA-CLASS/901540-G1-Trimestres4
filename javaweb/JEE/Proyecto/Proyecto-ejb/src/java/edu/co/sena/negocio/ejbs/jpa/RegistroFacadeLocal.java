/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.negocio.ejbs.jpa;

import edu.co.sena.integracion.entities.Registro;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author hernando
 */
@Local
public interface RegistroFacadeLocal {

    void create(Registro registro);

    void edit(Registro registro);

    void remove(Registro registro);

    Registro find(Object id);

    List<Registro> findAll();


    int count();
    
}
