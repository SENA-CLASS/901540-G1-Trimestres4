/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo7.presentacion.managerbeans;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author hernando
 */
@Named(value = "newJSFManagedBean1")
@RequestScoped
public class NewJSFManagedBean1 {
    
    private String nombre= "hola";
    private String a;
    private String b;

    /**
     * Creates a new instance of NewJSFManagedBean1
     */
    public NewJSFManagedBean1() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
    
}
