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
public interface DAOFactory {
    public  CatalogoDAO createCatalogoDAO();
}
