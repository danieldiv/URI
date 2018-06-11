package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Falha_no_Motor {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, R[], p = 0;

        N = sc.nextInt();
        R = new int[N];

        for (int i = 0; i < N; i++) {
            R[i] = sc.nextInt();

            if (i > 0 && p == 0) {
                if (R[i] < R[i - 1]) {
                    p = (i + 1);
                }
            }
        }

        System.out.println(p);
    }
}
