/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.integracion.entiies;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author hernando
 */
@Entity// el parametro name se coloca para usarlo en el JDNI
@Table (name = "perrito")
public class Perro {
    @Id
    private String idPerro;
    
    private String raza;
    
    private String nombre;

    
    public String getIdPerro() {
        return idPerro;
    }

    public void setIdPerro(String idPerro) {
        this.idPerro = idPerro;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Perro{" + "idPerro=" + idPerro + ", raza=" + raza + ", nombre=" + nombre + '}';
    }
    
}
