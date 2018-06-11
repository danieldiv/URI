package iniciante;

import java.util.Scanner;

public class Crepusculo_em_Portland {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, M[][], i, j, cont;

        N = sc.nextInt();
        M = new int[N + 1][N + 1];

        for (i = 0; i < N + 1; i++) {
            for (j = 0; j < N + 1; j++) {
                M[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                cont = M[i][j] + M[i][j + 1] + M[i + 1][j] + M[i + 1][j + 1];

                System.out.print((cont > 1) ? "S" : "U");
            }
            System.out.println();
        }
    }
}
