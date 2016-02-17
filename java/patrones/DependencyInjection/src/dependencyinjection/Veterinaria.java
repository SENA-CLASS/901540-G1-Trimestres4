/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dependencyinjection;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hernando
 */
public class Veterinaria {
    
    private List<Perro> perros = new ArrayList<>();// se crea un dependencia a la clase ArrayList

    public List<Perro> getPerros() {
        return perros;
    }

    public void setPerros(List<Perro> perros) {
        this.perros = perros;
    }
    
    
}
