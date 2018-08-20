package estruturas_bibliotecas;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Fila_do_Recreio {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, M, P[], D[], cont;

        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            M = sc.nextInt();

            P = new int[M];
            D = new int[M];
            cont = 0;

            for (int j = 0; j < P.length; j++) {
                P[j] = sc.nextInt();
            }
            
            System.out.println(result(cont, P, D));
        }

    }

    public static int result(int cont, int[] P, int[] D) {
        System.arraycopy(P, 0, D, 0, P.length);
        Arrays.sort(D);

        for (int j = 0; j < D.length; j++) {
            if (D[j] == P[D.length - (j + 1)]) {
                cont++;
            }
        }
        return cont;
    }
}
