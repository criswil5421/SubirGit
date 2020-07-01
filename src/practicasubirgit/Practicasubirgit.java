/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasubirgit;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Practicasubirgit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String hola;
       
        System.out.println("Escribe tu nombre");  
        hola = entrada.nextLine();
        
        System.out.println("hola " + hola);
        
    }
    
}
