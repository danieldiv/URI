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
public class Procurando_Subsequencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n1, n2, str;
        int l, cont, caso = 1, pos;

        while (sc.hasNext()) {
            pos = 0;
            cont = 0;

            n1 = sc.next();
            n2 = sc.next();

            l = n1.length();

            char[] c1 = n1.toCharArray();
            char[] c2 = n2.toCharArray();

            for (int i = 0; i < n2.length(); i++) {
                if (c2[i] == c1[0] && (l + i) <= n2.length()) {
                    str = n2.substring(i, (l + i));

                    if (n1.equals(str)) {
                        pos = i + 1;
                        cont++;
                    }
                }

            }
            System.out.println("Caso #" + caso + ":");

            if (cont != 0) {
                System.out.println("Qtd.Subsequencias: " + cont);
                System.out.println("Pos: " + pos);
            } else {
                System.out.println("Nao existe subsequencia");
            }
            System.out.println();

            caso++;
        }
    }
}
