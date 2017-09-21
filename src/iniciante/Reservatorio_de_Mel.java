/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iniciante;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Reservatorio_de_Mel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        float V, D, A, r, h; //Volume, diametro, raio e altura

        while (sc1.hasNext()) {
            while (sc2.hasNext()) {
                V = sc1.nextFloat();
                D = sc2.nextFloat();

                //O raio é a metade do diametro
                r = D / 2;

                //Area = π * r²
                A = (float) (3.14 * Math.pow(r, 2));
                
                //Volume = A * h | h = V / A
                h = V / A;
                
                System.out.printf("ALTURA = %.2f", h);
                System.out.printf("\nAREA = %.2f", A);
            }
        }
    }
}
