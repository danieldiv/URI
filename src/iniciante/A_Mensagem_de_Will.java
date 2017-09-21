package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class A_Mensagem_de_Will {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String alfabeto, palavra;
        int N;
        char[] c;

        while (sc.hasNext()) {
            palavra = "";

            alfabeto = sc.next();
            c = alfabeto.toCharArray();

            N = sc.nextInt();
            int[] L = new int[N];

            for (int i = 0; i < N; i++) {
                L[i] = sc.nextInt();

                if (L[i] != 0) {
                    palavra += c[L[i] - 1];
                } else {
                    palavra += c[L[i]];
                }
            }
            System.out.println(palavra);
        }
    }
}
