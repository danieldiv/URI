package string;

import java.io.IOException;
import java.util.Scanner;

public class Conversa_Internacional {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, K, cont;
        String S[], aux;

        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            cont = 0;

            K = sc.nextInt();
            S = new String[K];

            for (int j = 0; j < K; j++) {
                S[j] = sc.next();
            }

            aux = S[0];

            for (String s : S) {
                if (aux.equals(s)) {
                    cont++;
                }
            }

            if (cont == S.length) {
                System.out.println(aux);
            } else {
                System.out.println("ingles");
            }
        }

    }
}
