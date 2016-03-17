/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemploejb2.presentacion.managerbeans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author hernando
 */
@Named(value = "operacionController")
@RequestScoped
public class OperacionController {
    
    private String numero1;
    private String numero2;
    private String operacion;
    private String resultado;
    private Double resultadoNumerico;

    /**
     * Creates a new instance of OperacionController
     */
    public OperacionController() {
    }

    public void operarSuma(){
        this.resultadoNumerico = Double.parseDouble(numero1)+Double.parseDouble(numero2);
            
    }
    
    public String getNumero1() {
        return numero1;
    }

    public void setNumero1(String numero1) {
        this.numero1 = numero1;
    }

    public String getNumero2() {
        return numero2;
    }

    public void setNumero2(String numero2) {
        this.numero2 = numero2;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Double getResultadoNumerico() {
        return resultadoNumerico;
    }

    public void setResultadoNumerico(Double resultadoNumerico) {
        this.resultadoNumerico = resultadoNumerico;
    }
    
}