package iniciante;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Laercio {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, M, num;
        ArrayList V = new ArrayList();

        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            M = sc.nextInt();

            for (int j = 0; j < M; j++) {
                num = sc.nextInt();

                if (num % 2 != 0) {
                    V.add(num);
                }
            }

            Collections.sort(V);
            result(V);
            V.clear();
        }
    }

    public static void result(ArrayList V) {
        int X = V.size() - 1, Y = 0;
        boolean b = true;

        for (int j = 0; j < V.size(); j++) {
            if (b) {
                System.out.print(V.get(X));
                b = false;
                X--;
            } else {
                System.out.print(V.get(Y));
                b = true;
                Y++;
            }

            if (j < V.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
