/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.coleccioniterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author hernando
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("a");
        lista.add("b");
        lista.add("c");
        lista.add("d");
        System.out.println("usando el foreach");
        for (String l : lista) {
            System.out.println(l);
        }
        System.out.println("---------------------");
        System.out.println("usndo el patron iterator");

        System.out.println("imrpesion con el lambda expresion");
        Iterator i = lista.iterator();
        i.forEachRemaining(t -> System.out.println(t));

        System.out.println("impresion con el while");
        Iterator i2 = lista.iterator();

        while (i2.hasNext()) {
            System.out.println(i2.next());

        }

        //el siguiente while ya no funciona por el que el objeto iterator se encuentra en la ultia posicion
        while (i.hasNext()) {
            System.out.println(i.next());

        }

        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("juan"));
        listaPersonas.add(new Persona("pedro"));
        listaPersonas.add(new Persona("felipe"));

        System.out.println("con el iterator clasico");
        //iterator clasico
        Iterator i3 = listaPersonas.iterator();
        while (i3.hasNext()) {
            Persona next = (Persona) i3.next();
            System.out.println(next.getNombre());

        }
        System.out.println("con el foreach");
        //foreach
        for (Persona listaPersona : listaPersonas) {
            System.out.println(listaPersona.getNombre());
        }
        //lambda expresion
        System.out.println("con lamnda expresion");
        Iterator i4 = listaPersonas.iterator();
        i4.forEachRemaining((t -> {
            Persona pt = (Persona) t;
            System.out.println(pt.getNombre());
        }));
        
        //con clase anonima 
        System.out.println("con clase anonima");
        Iterator i5 = listaPersonas.iterator();
        i5.forEachRemaining((new Consumer() {
            @Override
            public void accept(Object t) {
                Persona pt = (Persona) t;
                System.out.println(pt.getNombre());
            }
        }));
        
    }
    
}
