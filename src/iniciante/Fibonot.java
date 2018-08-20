package iniciante;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Fibonot {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        long N, cont = 3, X;
        ArrayList F = new ArrayList();

        N = sc.nextInt();

        for (int i = 0; i < cont; i++) {
            F.add(fibo(i));

            if (i > 3) {
                fibonot(N, F);
                X = fibonot(N, F);

                if (X != 0) {
                    System.out.println(X);
                    break;
                }
            }

            cont++;
        }
    }

    public static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static long fibonot(long N, ArrayList F) {
        long cont = 1;

        int X, Y;

        for (int i = 3; i < F.size() - 1; i++) {
            X = Integer.parseInt(F.get(i).toString());
            Y = Integer.parseInt(F.get(i + 1).toString());

            for (int j = X + 1; j < Y; j++) {
                if (cont == N) {
                    return j;
                } else {
                    cont++;
                }
            }
        }
        return 0;
    }
}
