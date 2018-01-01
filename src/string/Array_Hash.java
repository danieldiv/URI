package string;

import java.io.IOException;
import java.util.Scanner;

public class Array_Hash {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, L, soma, aux;
        String str, abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char c[];

        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            soma = 0;
            L = sc.nextInt();

            for (int j = 0; j < L; j++) {
                str = sc.next();
                c = str.toCharArray();

                for (int k = 0; k < c.length; k++) {
                    aux = abc.indexOf(c[k]);
                    soma += aux + j + k;
                }
            }

            System.out.println(soma);
        }
    }
}
