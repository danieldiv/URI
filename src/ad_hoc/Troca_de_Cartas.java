package ad_hoc;

import java.io.IOException;
import java.util.Scanner;
import java.util.Objects;

public class Troca_de_Cartas {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        Integer A, B, X[], Y[], cont, cX0, cY0;

        while (true) {
            cX0 = cY0 = cont = 0;

            A = sc.nextInt();
            B = sc.nextInt();

            if (A == 0 && B == 0) {
                break;
            }

            X = new Integer[A];
            Y = new Integer[B];

            for (int i = 0; i < A; i++) {
                X[i] = sc.nextInt();
            }

            for (int i = 0; i < B; i++) {
                Y[i] = sc.nextInt();
            }

            for (int i = 1; i < A; i++) {
                if (Objects.equals(X[i], X[i - 1])) {
                    X[i - 1] = 0;
                    cX0++;
                }
            }

            for (int i = 1; i < B; i++) {
                if (Objects.equals(Y[i], Y[i - 1])) {
                    Y[i - 1] = 0;
                    cY0++;
                }
            }

            if ((X.length - cX0) <= (Y.length - cY0)) {
                System.out.println(valida(X, Y, cont));
            } else {
                System.out.println(valida(Y, X, cont));
            }
        }

    }

    public static Integer valida(Integer[] A, Integer[] B, Integer cont) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] != 0) {
                for (Integer b : B) {
                    if (b != 0) {
                        if (Objects.equals(A[i], b)) {
                            A[i] = 0;
                            break;
                        }
                    }
                }
            }
        }

        for (Integer a : A) {
            if (a != 0) {
                cont++;
            }
        }
        return cont;
    }
}
