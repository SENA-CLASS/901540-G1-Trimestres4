/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ingresito.modelo.factory;

import edu.co.sena.ingresito.modelo.dao.CatalogoDAO;
import edu.co.sena.ingresito.modelo.dao.mysql.CatalogoDAOImpl;


/**
 *
 * @author hernando
 */
public class MysqlDAOFactory extends DAOAbstractFactory{
    @Override
    public CatalogoDAO createCatalogoDAO(){
        return new CatalogoDAOImpl();
    }
}
