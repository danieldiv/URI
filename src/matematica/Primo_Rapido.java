package matematica;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Primo_Rapido {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        long N, P;

        N = sc.nextLong();

        for (int i = 0; i < N; i++) {
            P = sc.nextLong();

            if (primo(P)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
    }

    public static boolean primo(long p) {
        long V[];

        V = new long[(int) Math.sqrt(p)];

        for (int i = 1; i < V.length; i++) {
            V[i] = i + 1;
        }

        for (int i = 2; i < Math.sqrt(p); i++) {
            if (V[i - 1] == i) {
                if (p % V[i - 1] == 0) {
                    return false;
                }

                for (int j = i + i; j <= V.length; j += i) {
                    V[j - 1] = 0;
                }
            }
        }

        return true;
    }
}
