package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Impeachment_do_Líder {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, cont;

        while (sc.hasNext()) {
            cont = 0;

            while ((N = sc.nextInt()) < 1 || N > 100000) {
            }

            int[] v = new int[N];

            for (int i = 0; i < N; i++) {
                while ((v[i] = sc.nextShort()) < 0 || v[i] > 1) {
                }

                if (v[i] == 1) {
                    cont++;
                }
            }

            if (cont >= ((2.0 / 3) * N)) {
                System.out.println("impeachment");
            } else {
                System.out.println("acusacao arquivada");
            }
        }

    }
}
