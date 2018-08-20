package matematica;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Triangulo_Trinominal {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int R, D, cont;
        long p1, p2, p3, V[][], V2[][];

        R = sc.nextInt();
        R++;

        V = new long[R + 1][(R * 2) - 1];
        V2 = new long[R + 1][(R * 2) - 1];

        for (int i = 1; i <= R; i++) {
            D = (i * 2) - 1;

            for (int j = 0; j < D; j++) {
                if (i > 2) {
                    if (j == 0 || j == (D - 1)) {
                        V[i][j] = 1;
                    } else {
                        V[i][j] = 1;
                    }
                } else {
                    V[i][j] = 1;
                }
            }
        }

        /**
         * avanca os valores dos vetores para ficar mais facil a manipulacao em
         * ordem
         */
        for (int i = 1; i < V.length; i++) {
            cont = 0;
            for (int j = V[0].length - 1; j >= 0; j--) {
                if (V[i][j] == 0) {
                    cont++;
                } else {
                    break;
                }
            }
            if (i == 1) {
                V[i][cont / 2] = V[i][0];
                V[i][0] = 0;
                V2[i] = V[i];

            } else if (i < V.length - 1) {
                for (int j = cont / 2; j < V2.length;) {
                    for (int k = 0; k < V.length; k++) {
                        if (V[i][k] == 0) {
                            break;
                        } else {
                            V2[i][j] = V[i][k];
                            j++;
                        }
                    }
                }
            } else {
                V2[i] = V[i];
            }

        }

        for (int i = 3; i < V2.length; i++) {
            for (int j = 1; j < V2[i].length; j++) {
                p1 = (j - 1 < 0) ? 0 : (V2[i - 1][j - 1]);
                p2 = V2[i - 1][j];
                p3 = (j + 1 > V2[i].length - 1) ? 0 : V2[i - 1][j + 1];

                V2[i][j] = p1 + p2 + p3;

            }
        }

        System.out.println(soma(R, V2));

    }

    public static long soma(int R, long[][] V2) {
        int tam = V2.length - 1;
        long S = 0;

        if (R == 1) {
            return 1;
        } else {
            for (int i = 0; i < V2[tam].length; i++) {
                S += V2[tam][i];
            }
        }
        return S;
    }
}
