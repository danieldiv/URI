package matematica;

import java.io.IOException;
import java.util.Scanner;

public class Colocando_Radares {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int C, N, M, D, R;

        C = sc.nextInt();

        for (int i = 0; i < C; i++) {
            N = sc.nextInt();
            M = sc.nextInt();

            D = N / M;
            R = N % M;

            if (R == 0) {
                System.out.println(D);
            } else {
                System.out.println(D + 1);
            }
        }
    }
}
