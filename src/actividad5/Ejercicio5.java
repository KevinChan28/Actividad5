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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String alfabeto[][] = new String[7][4];
        alfabeto[0][0] = "A .- ";
        alfabeto[1][0] = "B -... ";
        alfabeto[2][0] = "C -.-. ";
        alfabeto[3][0] = "D -.. ";
        alfabeto[4][0] = "E .";
        alfabeto[5][0] = "F ..-. ";
        alfabeto[6][0] = "G --. ";
        alfabeto[0][1] = "H .... ";
        alfabeto[1][1] = "I .. ";
        alfabeto[2][1] = "J .--- ";
        alfabeto[3][1] = "K -.- ";
        alfabeto[4][1] = "L .-.. ";
        alfabeto[5][1] = "M -- ";
        alfabeto[6][1] = "N -. ";
        alfabeto[0][2] = "O --- ";
        alfabeto[1][2] = "P .--.";
        alfabeto[2][2] = "Q --.- ";
        alfabeto[3][2] = "R .-. ";
        alfabeto[4][2] = "S ... ";
        alfabeto[5][2] = "T - ";
        alfabeto[6][2] = "U ..- ";
        alfabeto[0][3] = "V ...- ";
        alfabeto[1][3] = "W .-- ";
        alfabeto[2][3] = "X -..- ";
        alfabeto[3][3] = "Y -.-- ";
        alfabeto[4][3] = "Z --.. ";
        alfabeto[5][3] = " ";
        alfabeto[6][3] = " ";

        for (int i = 0; i < alfabeto.length; i++) {
            for (int j = 0; j < alfabeto[i].length; j++) {
                System.out.print(" " + alfabeto[i][j] + "      ");
            }
            System.out.println("");
            System.out.println("");
        }

        Scanner teclado = new Scanner(System.in);
        int asciiValue;
        char caracter;
        int cont = 0;
        int comision = 10;
        int resta;
        int mult;
  
        System.out.println("Ingrese una palabra: ");
        String palabra = teclado.next();

        char[] aChar = palabra.toCharArray();
        for (int i = 0; i < aChar.length; i++) {

            caracter = aChar[i];
            cont = cont + 1;
            asciiValue = (int) caracter;
            switch (asciiValue) {
                case 65:
                    System.out.println("" + alfabeto[0][0]);
                    break;
                case 66:
                    System.out.println("" + alfabeto[1][0]);
                    break;
                case 67:
                    System.out.println("" + alfabeto[2][0]);
                    break;
                case 68:
                    System.out.println("" + alfabeto[3][0]);
                    break;
                case 69:
                    System.out.println("" + alfabeto[4][0]);
                    break;
                case 70:
                    System.out.println("" + alfabeto[5][0]);
                    break;
                case 71:
                    System.out.println("" + alfabeto[6][0]);
                    break;
                case 72:
                    System.out.println("" + alfabeto[0][1]);
                    break;
                case 73:
                    System.out.println("" + alfabeto[1][1]);
                    break;
                case 74:
                    System.out.println("" + alfabeto[2][1]);
                    break;
                case 75:
                    System.out.println("" + alfabeto[3][1]);
                    break;
                case 76:
                    System.out.println("" + alfabeto[4][1]);
                    break;
                case 77:
                    System.out.println("" + alfabeto[5][1]);
                    break;
                case 78:
                    System.out.println("" + alfabeto[6][1]);
                    break;
                case 79:
                    System.out.println("" + alfabeto[0][2]);
                    break;
                case 80:
                    System.out.println("" + alfabeto[1][2]);
                    break;
                case 81:
                    System.out.println("" + alfabeto[2][2]);
                    break;
                case 82:
                    System.out.println("" + alfabeto[3][2]);
                    break;
                case 83:
                    System.out.println("" + alfabeto[4][2]);
                    break;
                case 84:
                    System.out.println("" + alfabeto[5][2]);
                    break;
                case 85:
                    System.out.println("" + alfabeto[6][2]);
                    break;
                case 86:
                    System.out.println("" + alfabeto[0][3]);
                    break;
                case 87:
                    System.out.println("" + alfabeto[1][3]);
                    break;
                case 88:
                    System.out.println("" + alfabeto[2][3]);
                    break;
                case 89:
                    System.out.println("" + alfabeto[3][3]);
                    break;
                case 90:
                    System.out.println("" + alfabeto[4][3]);
                    break;
            }
        }

        if (cont < 5) {
            System.out.println("Total a pagar: " + comision);
        } else {
            resta = cont - 4;
            mult = resta * 3;
            comision = comision + mult;
            System.out.println("Total a pagar= " + comision);
        }
    }

}
    

