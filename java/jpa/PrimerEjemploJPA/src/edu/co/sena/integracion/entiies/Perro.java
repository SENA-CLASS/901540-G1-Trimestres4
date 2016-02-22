/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.integracion.entiies;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hernando
 */
@Entity// el parametro name se coloca para usarlo en el JDNI
@XmlRootElement
public class Perro implements Serializable{
    
    @EmbeddedId
    private PerroPK perroPk;
    @Column(name = "RAZA", length = 40)
    private String raza;
   

    @Override
    public String toString() {
        return "Perro{" + "perroPk=" + perroPk + ", raza=" + raza + '}';
    }

    
   
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }


    public PerroPK getPerroPk() {
        return perroPk;
    }

    public void setPerroPk(PerroPK perroPk) {
        this.perroPk = perroPk;
    }

    
}
