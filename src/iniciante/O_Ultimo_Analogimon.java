package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class O_Ultimo_Analogimon {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        short N, M, x1 = 0, x2 = 0, y1 = 0, y2 = 0, soma;

        while (sc.hasNext()) {
            soma = 0;

            N = sc.nextShort();
            M = sc.nextShort();

            short[][] C = new short[N][M];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    C[i][j] = sc.nextShort();

                    if (C[i][j] == 1) {
                        x1 = (short) i;
                        y1 = (short) j;
                    } else if (C[i][j] == 2) {
                        x2 = (short) i;
                        y2 = (short) j;
                    }
                }
            }

            if (x1 > x2) {
                soma += (x1 + x2);
            } else {
                soma += (x2 - x1);
            }
            if (y1 > y2) {
                soma += (y1 + y2);
            } else {
                soma += (y2 - y1);
            }

            System.out.println(soma);
        }

    }
}
