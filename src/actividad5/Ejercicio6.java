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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        String sexo;
        String starwars[]=new String [14];
        starwars[0]="LUKE SKYWALKER  --  MALE    ";
        starwars[1]="HAN SOLO  --  MALE"    ;
        starwars[2]="OBI-WAN KENOBI  --  MALE    ";
        starwars[3]="DARTH VADER  --  MALE    ";
        starwars[4]="WILHUFF TARKIN  --  MALE    ";
        starwars[5]="LUKE SKYWALKER  --  MALE    ";
        starwars[6]="YODA  --  MALE    ";
        starwars[7]="CHEWBACCA  --  MALE    ";
        starwars[8]="LEIA ORGANA  --  FEMALE    ";
        starwars[9]="REY  --  FEMALE    ";
        starwars[10]="PADME AMIDALA  --  FEMALE    ";
        starwars[11]="JABBA EL HUTT  --  HERMAFRODITA    ";
        starwars[12]="C-3PO  --  ROBOT    ";
        starwars[13]="R2-D2  --  ROBOT    ";
        for (int i = 0; i < 14; i++) {
            
                System.out.println(""+starwars[i]);
            }
        
        System.out.println("Ingrese el sexo: ");
        sexo=teclado.next();
        switch (sexo) {
            case "male":
                for (int i = 0; i <8; i++) {
                    System.out.println(""+starwars[i]);
                }
                break;
                case "female":
                for (int i = 8; i <11; i++) {
                    System.out.println(""+starwars[i]);
                }
                break;
                case "hermafrodita":
                for (int i = 11; i <12; i++) {
                    System.out.println(""+starwars[i]);
                }
                break;
                 case "robot":
                for (int i = 12; i <14; i++) {
                    System.out.println(""+starwars[i]);
                }
                break;
                
            default:
                
        }
        // TODO code application logic here
    }
    
}
