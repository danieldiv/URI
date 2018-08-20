package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Eearliest_Deadline_First_EDF {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, M[][], aux = 0;
        double soma = 0;

        N = sc.nextInt();
        M = new int[N][2];

        for (int i = 0; i < N; i++) {
            M[i][0] = sc.nextInt();
            M[i][1] = sc.nextInt();
        }

        for (int i = 0; i < N - 1; i++) {
            if (i == 0) {
                aux = mmc(M[i][1], M[i + 1][1]);
            } else {
                aux = mmc(aux, M[i + 1][1]);
            }
        }

        for (int i = 0; i < N; i++) {
            soma += M[i][0] * (aux / M[i][1]);
        }

        if ((soma / aux) > 1) {
            System.out.println("FAIL");
        } else {
            System.out.println("OK");
        }
    }

    //Algoritmo de Euclides iterativo
    private static int mdc(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    //Algoritmo do MMC
    private static int mmc(int a, int b) {
        return a * (b / mdc(a, b));
    }
}
