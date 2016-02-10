/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ingresito.modelo.dao;

import edu.co.sena.ingresito.modelo.dto.Catalogo;
import edu.co.sena.ingresito.modelo.dto.CatalogoPk;
import java.util.List;

/**
 *
 * @author hernando
 */
public interface CatalogoDAO {
    public List<Catalogo> findAll();
    public void insert(Catalogo dto);
      public void update(CatalogoPk llaveDto, Catalogo dto);
      public void updatePk(CatalogoPk viejo, CatalogoPk nuevo);
      public void delete(CatalogoPk dot);
      public List<Catalogo> findByPK(CatalogoPk dto);
      public int count();
}
