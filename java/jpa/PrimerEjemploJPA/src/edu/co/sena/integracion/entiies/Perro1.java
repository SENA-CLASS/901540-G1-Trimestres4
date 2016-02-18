/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.integracion.entiies;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author hernando
 */
@Entity
public class Perro1 {
    @Id
    private String idPerro;

    public String getIdPerro() {
        return idPerro;
    }

    public void setIdPerro(String idPerro) {
        this.idPerro = idPerro;
    }
    
}
