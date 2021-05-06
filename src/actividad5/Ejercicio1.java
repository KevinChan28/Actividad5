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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String semana [] = new String [7];
        semana [0]="LUNES";
        semana [1]="MARTES";
        semana [2]="MIERCOLES";        
        semana [3]="JUEVES";     
        semana [4]="VIERNES";        
        semana [5]="SABADO"; 
        semana [6]="DOMINGO";
        
        for (int i = 0; i <7; i++) {
            System.out.println(""+semana[i]);
        }
        // TODO code application logic here
    }
    
}
