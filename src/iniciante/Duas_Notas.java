package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Duas_Notas {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, M, T, V[] = {200, 150, 120, 110, 105, 102, 100, 70, 60, 55, 52, 40, 30, 25, 22, 20, 15, 12, 10, 7, 4};
        boolean B;

        while (true) {
            N = sc.nextInt();
            M = sc.nextInt();

            T = M - N;
            B = false;

            if (N == 0 && M == 0) {
                break;
            }

            if (T <= 200) {
                for (int I : V) {
                    if (T == I) {
                        B = true;
                        break;
                    }
                }
            }

            if (B) {
                System.out.println("possible");
            } else {
                System.out.println("impossible");
            }
        }
    }
}
