package estruturas_bibliotecas;

import java.io.IOException;
import java.util.Scanner;

public class Museu_Virtual_3D {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, M, soma, V[];

        while (sc.hasNext()) {
            N = sc.nextInt();
            M = N - sc.nextInt();

            V = new int[N];
            soma = 0;

            for (int i = 0; i < N; i++) {
                V[i] = sc.nextInt();

                if (i >= M) {
                    soma += V[i];
                }
            }

            System.out.println(soma);
        }

    }
}
