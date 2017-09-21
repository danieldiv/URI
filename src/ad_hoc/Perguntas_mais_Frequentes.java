package ad_hoc;

import java.io.IOException;
import java.util.Scanner;

public class Perguntas_mais_Frequentes {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, K, P[], Q[], cont, maior = 0;

        while (true) {
            N = sc.nextInt();
            K = sc.nextInt();

            P = new int[N];
            Q = new int[101];

            cont = 0;

            if (N == K && N == 0) {
                break;
            }

            for (int i = 0; i < N; i++) {
                P[i] = sc.nextInt();

                if (Q[P[i]] != 0) {
                    Q[P[i]]++;
                } else {
                    Q[P[i]] = 1;

                    if (maior < P[i]) {
                        maior = P[i];
                    }
                }
            }
            
            for (int i = 0; i <= maior; i++) {
                if (Q[i] != 0 && Q[i] >= K) {
                    cont++;
                }
            }
            System.out.println(cont);
        }
    }
}
