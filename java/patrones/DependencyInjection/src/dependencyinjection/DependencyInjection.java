/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dependencyinjection;

import java.util.List;

/**
 *
 * @author hernando
 */
public class DependencyInjection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Perro p1 = new Perro();
       Perro p2 = new Perro();
       Perro p3 = new Perro();
       Perro p4 = new Perro();
       Perro p5 = new Perro();
       
       Veterinaria v1 = new Veterinaria();
       v1.getPerros().add(p1);
       v1.getPerros().add(p2);
       v1.getPerros().add(p3);
       v1.getPerros().add(p4);
       v1.getPerros().add(p5);
       List<Perro> lista =v1.getPerros();
        for (Perro perro : lista) {
            System.out.println(perro);
        }
       
       
    }
    
}
