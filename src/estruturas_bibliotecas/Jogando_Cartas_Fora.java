package estruturas_bibliotecas;

import java.io.IOException;
import java.util.Scanner;

public class Jogando_Cartas_Fora {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, V[], D[];

        while ((N = sc.nextInt()) != 0) {
            V = new int[N];
            D = new int[N - 1];

            for (int i = 0; i < N; i++) {
                V[i] = i + 1;
            }
            
            retirandoCartas(D, V, N);
        }
    }

    public static void retirandoCartas(int[] D, int[] V, int N) {
        for (int i = 0; i < D.length; i++) {
            D[i] = V[0];
            N--;

            System.arraycopy(V, 1, V, 0, N);
            V[N] = V[0];
            System.arraycopy(V, 1, V, 0, N);
            V[N] = 0;
        }

        System.out.print("Discarded cards:");

        for (int i = 0; i < D.length; i++) {
            System.out.print(" " + D[i]);

            if (i < D.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("\nRemaining card: " + V[0]);
    }

}
