/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ingresito.modelo.factory;

import edu.co.sena.ingresito.modelo.dao.CatalogoDAO;

/**
 *
 * @author hernando
 */
public abstract class DAOAbstractFactory implements DAOFactory{
       
    public static final int MYSQL_FACTORY = 1;
    

    public static DAOAbstractFactory getDAOFactory(int factoryType) {
        switch (factoryType) {
           
            case MYSQL_FACTORY:
                return new MysqlDAOFactory();

            default:
                System.out.println("Esa base de datos no esta disponible");
                return null;

        }
    }

 
}
