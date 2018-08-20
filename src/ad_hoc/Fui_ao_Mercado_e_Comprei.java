package ad_hoc;

import java.io.IOException;
import java.util.Scanner;

public class Fui_ao_Mercado_e_Comprei {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, K;
        String S[];

        while (true) {
            N = sc.nextInt();
            K = sc.nextInt();

            if (N == 0) {
                break;
            }

            S = new String[N];

            for (int i = 0; i < N; i++) {
                S[i] = sc.next();
            }

            if (K == 1) {
                System.out.println(S[0]);
            } else {
                System.out.println(resutl(N, K, S));
            }
        }
    }

    public static String resutl(int N, int K, String[] S) {
        int L, r, cont, V[][];

        r = 2;
        L = N;

        V = new int[N][N];
        V[0][0] = 1;

        for (int i = 1; i < N; i++) {
            V[i][0] = V[i - 1][0] + r;
            r++;
        }

        for (int i = 0; i < N; i++) {
            r = i + 1;
            cont = 0;

            for (int j = 1; j < L; j++) {
                V[i][j] = V[i][j - 1] + r;
                r++;

                if (V[i][j] == K) {
                    return S[i];
                }

                if (V[i][j] > K) {
                    break;
                }
            }
            if (cont == 1) {
                break;
            }
            L--;
        }
        return "";
    }
}
