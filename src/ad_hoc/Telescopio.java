package ad_hoc;

import java.io.IOException;
import java.util.Scanner;

public class Telescopio {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int A, N, F, cont = 0;
        long calc;

        A = sc.nextInt();
        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            F = sc.nextInt();
            calc = F * A;

            if (calc >= 40000000) {
                cont++;
            }
        }
        System.out.println(cont);
    }
}
