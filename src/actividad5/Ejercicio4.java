/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad5;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int asciiValue;
        char caracter;
        
        System.out.println("Ingrese una palabra: ");
        String palabra = teclado.next();

        char[] aChar = palabra.toCharArray();
        for (int i = 0; i < aChar.length; i++) {
            System.out.println(aChar[i]);
            caracter = aChar[i];
            asciiValue = (int) caracter;
        }
        // TODO code application logic here
    }
    
}
