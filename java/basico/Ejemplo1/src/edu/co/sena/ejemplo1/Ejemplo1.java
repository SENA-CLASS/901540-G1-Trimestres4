/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author hernando
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] arreglito = new Integer[5];
        arreglito[0]= 4;
        arreglito[4]= 4;
        arreglito[1]= 3;
        arreglito[2]= 2;
        arreglito[3]= 1;
        
        System.out.println("contendio arreglito");
        for (int i=0; i<arreglito.length; i++) {
            System.out.println(arreglito[i]);
            
        }
        System.out.println("arregito pero ordenado asc");
        
        Arrays.sort(arreglito);
        
        for (int i=0; i<arreglito.length; i++) {
            System.out.println(arreglito[i]);
            
        }
        System.out.println("busqueda binaria");
        System.out.println(Arrays.binarySearch(arreglito, 4));
        
        List<Integer> lista = Arrays.asList(arreglito);
        System.out.println("---------");
        System.out.println(lista.size());
        
        for (Object object : lista) {
            System.out.println(object);
        }
            
        
        
        
    }
    
}
