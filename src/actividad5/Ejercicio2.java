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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String starwars [][] = new String [5][5];
        // TODO code application logic here
        starwars[0][0]="DARTH VADER";
        starwars[0][1]="YODA";
        starwars[0][2]="CHEWBACCA";
        starwars[0][3]="R2-D2";
        starwars[0][4]="OBI-WAN KENOBI";
        starwars[1][0]="ANAKIN SKYWALKER";
        starwars[1][1]="LUKE SKYWALKER";
        starwars[1][2]="C3PO";
        starwars[1][3]="HAN SOLO";
        starwars[1][4]="LEIA SKYWALKER";
        starwars[2][0]="BB8";
        starwars[2][1]="KYLO REN";
        starwars[2][2]="REY";
        starwars[2][3]="QUI-GON JINN";
        starwars[2][4]="PADME AMIDALA";
        starwars[3][0]="DARTH MAUL";
        starwars[3][1]="JAR JAR BINKS";
        starwars[3][2]="GENERAL GRIEVOUS";
        starwars[3][3]="DARTH SIDIOUS";
        starwars[3][4]="CONDE DOOKU";
        starwars[4][0]="MACE WINDU";
        starwars[4][1]="FINN";
        starwars[4][2]="POE DAMERON";
        starwars[4][3]="MAZ KANATA";
        starwars[4][4]="SNOKE";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("["+i+"]["+j+"]="+starwars[i][j]+"   ");
            }
            System.out.println("");
            System.out.println("");
        }
        // TODO code application logic here
    }
    
}
