package iniciante;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Iccanobif {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        long N;
        ArrayList F = new ArrayList();

        N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            F.add(fibo(i));
        }

        for (int i = F.size() - 1; i >= 0; i--) {
            System.out.print(F.get(i));

            if (i > 0) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}
