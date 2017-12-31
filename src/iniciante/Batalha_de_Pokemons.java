package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Batalha_de_Pokemons {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int T, B, A[], D[], L[];
        double VC[];

        T = sc.nextInt();

        A = new int[2];
        D = new int[2];
        L = new int[2];
        VC = new double[2];

        for (int i = 0; i < T; i++) {
            B = sc.nextInt();

            for (int j = 0; j < 2; j++) {
                A[j] = sc.nextInt();
                D[j] = sc.nextInt();
                L[j] = sc.nextInt();

                VC[j] = (A[j] + D[j]) / 2;

                if (L[j] % 2 == 0) {
                    VC[j] += B;
                }
            }
            
            if (VC[0] == VC[1]) {
                System.out.println("Empate");
            } else if (VC[0] > VC[1]) {
                System.out.println("Dabriel");
            } else if (VC[0] < VC[1]) {
                System.out.println("Guarte");
            }
        }
    }
}
