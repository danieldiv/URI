package contest.aquecimento_OBI;

import java.io.IOException;
import java.util.Scanner;

public class B_Desafio_de_Rangel {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int V[], N;
        String[] M;

        N = sc.nextInt();

        V = new int[N];
        M = new String[N];

        M[N - 1] = "*";

        for (int i = 0; i < N; i++) {
            V[i] = sc.nextInt();

            if (i > 0) {
                M[i - 1] = (V[i] >= V[i - 1]) ? String.valueOf(V[i]) : "*";
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(M[i]);
            if (i < N - 1) {
                System.out.print(" ");
            }
        }

        System.out.println();
    }
}
