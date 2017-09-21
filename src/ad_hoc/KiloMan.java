package ad_hoc;

import java.io.IOException;
import java.util.Scanner;

public class KiloMan {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, T, Ts[], cont;
        String pulos;
        char[] p;

        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            cont = 0;

            while ((T = sc.nextInt()) < 1 || T > 50) {
            }

            Ts = new int[T];
            pulos = "";

            for (int j = 0; j < T; j++) {
                while ((Ts[j] = sc.nextInt()) < 1 || Ts[j] > 7) {
                }
            }

            pulos = sc.next();
            p = pulos.toCharArray();

            /**
             * J = pula | S = parado | <= 2 é atingido - parado > 2 é atingido
             * quando pula
             */
            for (int j = 0; j < p.length; j++) {
                if (p[j] == 'J' && Ts[j] > 2) {
                    cont++;
                } else if (p[j] == 'S' && Ts[j] <= 2) {
                    cont++;
                }
            }

            System.out.println(cont);
        }
    }
}
