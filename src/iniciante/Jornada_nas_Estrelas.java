package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Jornada_nas_Estrelas {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        long N, X[], Y[], aux, R, E = 0, cont = 0, soma = 0;
        int i;

        N = sc.nextLong();
        X = new long[(int) N];
        Y = new long[(int) N];

        for (i = 0; i < N; i++) {

            X[i] = sc.nextInt();
            soma += X[i];
        }

        i = 0;
        while (true) {
            aux = X[i];

            if (aux != 0) {
                X[i]--;
                Y[i]++;
            }

            i = (aux % 2 == 1) ? (i += 1) : (i -= 1);

            if (i < 0 || i == N) {
                break;
            }
        }

        for (long j : Y) {
            if (j != 0) {
                cont += j;
                E++;
            }
        }

        R = (soma >= cont) ? soma - cont : cont - soma;

        System.out.println(E + " " + R);
    }
}
