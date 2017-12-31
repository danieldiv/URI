package ad_hoc;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class URI {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, J[], M, Ps[], p = 0;
        double d;

        while (true) {
            N = sc.nextInt();

            J = new int[3];
            Ps = new int[3];

            if (N == 0) {
                break;
            }

            for (int i = 0; i < N; i++) {
                M = 0;

                for (int j = 0; j < 3; j++) {
                    J[j] = sc.nextInt();

                    d = Math.log(J[j]) / Math.log(2);

                    if (d == Math.floor(d)) {
                        Ps[j]++;
                    }

                    if (J[j] > M) {
                        M = J[j];
                        p = j;
                    }

                }

                d = Math.log10(J[p]) / Math.log10(2);

                if (d == Math.floor(d)) {
                    Ps[p]++;
                }
            }

            if (Ps[0] > Ps[1] && Ps[0] > Ps[2]) {
                System.out.println("Uilton");
            } else if (Ps[1] > Ps[0] && Ps[1] > Ps[2]) {
                System.out.println("Rita");
            } else if (Ps[2] > Ps[0] && Ps[2] > Ps[1]) {
                System.out.println("Ingred");
            } else if (Ps[0] == Ps[1] || Ps[0] == Ps[2] || Ps[1] == Ps[2]) {
                System.out.println("URI");
            }
        }
    }
}

/**
 * Potencia de 2 ganha 1 ponto | Se for o maior da rodada ganha 1 ponto
 */
