package string;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Problema_com_a_Calculadora {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, cont;
        String S;
        String[] V;

        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            S = sc.next();
            V = S.split("[^0-9]+");

            cont = 0;
            for (String v : V) {
                if (!v.isEmpty()) {
                    cont += Integer.valueOf(v);
                }
            }
            System.out.println(cont);
        }
    }
}
