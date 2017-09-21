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
public class Sequencia_de_Sequencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, cont = 1, numeros = 1;

        while (input.hasNext()) {
            n = input.nextShort();
            
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < i; j++) {
                    numeros++;
                }
            }

            if (numeros == 1) {
                System.out.println("Caso " + cont + ": " + (numeros) + " numero");
            } else {
                System.out.println("Caso " + cont + ": " + (numeros) + " numeros");
            }

            System.out.print("0");
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" " + i);
                }
            }
            System.out.println("\n");

            cont++;
            numeros = 1;
        }
    }
}
