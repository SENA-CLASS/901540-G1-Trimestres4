/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ceetregistro.negocio.ejbs;

import edu.co.sena.ceetregistro.integracion.entitites.Cargo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author hernando
 */
@Stateless
public class CargoFacade extends AbstractFacade<Cargo> {

    @PersistenceContext(unitName = "ProyectoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    public void updatepk(String viejo, String nuevo){
        getEntityManager().createNamedQuery("Cargo.updatepk")
                .setParameter("cargoNuevo", nuevo)
                .setParameter("cargoViejo", viejo)
                .executeUpdate()
                ;
        
    }

    public CargoFacade() {
        super(Cargo.class);
    }
    
}
