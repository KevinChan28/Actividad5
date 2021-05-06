/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad5;

/**
 *
 * @author USER
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String alfabeto[][]= new String [7][4];
       alfabeto[0][0]="A .- ";
        alfabeto[1][0]="B -... ";
        alfabeto[2][0]="C -.-. ";
        alfabeto[3][0]="D -.. ";
        alfabeto[4][0]="E .";
        alfabeto[5][0]="F ..-. ";
        alfabeto[6][0]="G --. ";
        alfabeto[0][1]="H .... ";
        alfabeto[1][1]="I .. ";
        alfabeto[2][1]="J .--- ";
        alfabeto[3][1]="K -.- ";
        alfabeto[4][1]="L .-.. ";
        alfabeto[5][1]="M -- ";
        alfabeto[6][1]="N -. ";
        alfabeto[0][2]="O --- ";
        alfabeto[1][2]="P .--.";
        alfabeto[2][2]="Q --.- ";
        alfabeto[3][2]="R .-. ";
        alfabeto[4][2]="S ... ";
        alfabeto[5][2]="T - ";
        alfabeto[6][2]="U ..- ";
        alfabeto[0][3]="V ...- ";
        alfabeto[1][3]="W .-- ";
        alfabeto[2][3]="X -..- ";
        alfabeto[3][3]="Y -.-- ";
        alfabeto[4][3]="Z --.. ";
        alfabeto[5][3]=" ";
        alfabeto[6][3]=" ";
      
        for (int i = 0; i < alfabeto.length; i++) {
            for (int j = 0; j <alfabeto[i].length ; j++) {
                System.out.print(" "+alfabeto[i][j]+"      ");
            }
            System.out.println("");
            System.out.println("");
        }
        
        // TODO code application logic here
    }
    
  
}

