package matematica;

import java.io.IOException;
import java.util.Scanner;

public class Soma_de_Fatoriais {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        long M, N;

        while (sc.hasNext()) {
            M = sc.nextLong();
            N = sc.nextLong();

            System.out.println(fat(M, 1) + fat(N, 1));
        }
    }

    public static long fat(long v, long r) {
        if (v >= 1) {
            r *= v;
            return fat(v -= 1, r);
        } else {
            return r;
        }
    }
}
