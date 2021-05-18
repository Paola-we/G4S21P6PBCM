/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s21p6pbcm;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author megaybte
 */
public class G4S21P6PBCM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> lista = new ArrayList <String>(Arrays.asList("A","B","C","D")); 
        System.out.println("Desplegando contenido por medio de foreach... \n \n");
        lista.forEach(contenido ->{
        System.out.println("El contenido de el arreglo " + contenido);
        });
        lista.add("E");
        lista.add("PAOLA");
        lista.add("Linea de texto");
        System.out.println("\n Desplegando contenido por medio de for...\n");
        
        for (String contenido1 : lista){
        System.out.println("El conyenido del arreglo " + contenido1);
        }
        lista.add("F");
        lista.add("G");
        lista.add("H");
        System.out.println("\n \n Desplegando contenido con stream");
        lista.stream().forEach(contenido2->{
        System.out.println("El contenido del arreglo" + contenido2);
        });
        
        String cadena1 = "variable1";
        String cadena2 = "variable2";
        String cadena3 = "variable3";
        
        lista.add(cadena1);
        lista.add(cadena2);
        lista.add(cadena3);
         //lista.add(4); tipo de dato no valido}
         lista.add(String.valueOf(512)); //se convierte a cadena.
         System.out.println("\n \n Desplegando contenido que se agrego con variables");
         for (String contenido3 : lista){
             System.out.println("El contenido del arreglo es: " + contenido3);
         }
         
         System.out.println("\n \n Buscando un valor...");
         lista.forEach(contenido4 ->{
         if (contenido4.equals("H")){
         System.out.println("\n El valor fue encontrado");
         }
         });
           
    }
    
}
