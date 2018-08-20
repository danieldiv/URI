package iniciante;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//erro na descricao do problema
public class Figurinhas_da_Copa {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, C, M, X[], Y[], num, cont = 0;

        N = sc.nextInt();
        C = sc.nextInt();
        M = sc.nextInt();

        X = new int[C];
        Y = new int[N + 1];

        for (int i = 0; i < C; i++) {
            X[i] = sc.nextInt();
        }

        for (int i = 0; i < M; i++) {
            num = sc.nextInt();

            if (num < Y.length) {
                Y[num]++;
            }
        }

        for (int i = 0; i < X.length; i++) {
            if (Y[X[i]] == 0) {
                cont++;
            }
        }

        System.out.println(cont);

    }
}
