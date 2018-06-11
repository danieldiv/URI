package string;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Colecao_de_Pomekons {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, cont = 0;
        String S[];

        N = sc.nextInt();
        S = new String[N];

        for (int i = 0; i < N; i++) {
            S[i] = sc.next();
        }

        Arrays.sort(S);

        for (int i = 1; i < S.length; i++) {
            if (!S[i].equals(S[i - 1])) {
                cont++;
            }
        }

        System.out.println("Falta(m) " + (150 - cont) + " pomekon(s).");
    }
}
