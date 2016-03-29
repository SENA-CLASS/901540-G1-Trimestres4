/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemploproyecto.negocio.ejbs;

import edu.co.sena.ejemploproyecto.integracion.entities.Cargo;
import java.util.List;
import javax.ejb.Local;
import javax.persistence.EntityManager;

/**
 *
 * @author hernando
 */
@Local
public interface CargoFacadeLocal {
    public EntityManager getEntityManager();
    public void create(Cargo entity);

    public void edit(Cargo entity);

    public void remove(Cargo entity);

    public Cargo find(Object id);

    public List<Cargo> findAll();

    

    public int count();
    
}
