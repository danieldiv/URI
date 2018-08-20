package estruturas_bibliotecas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TDA_Racional {

    static int N1, N2, D1, D2;

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int N;

        String X, V[];

        N = Integer.parseInt(in.readLine());

        for (int i = 0; i < N; i++) {
            X = in.readLine();

            V = X.split(" ");

            N1 = Integer.parseInt(V[0]);
            N2 = Integer.parseInt(V[4]);
            D1 = Integer.parseInt(V[2]);
            D2 = Integer.parseInt(V[6]);

            result(V[3]);
        }

    }

    public static int result(String o) {
        int v1, v2;
        switch (o) {
            case "+":
                v1 = (N1 * D2) + (N2 * D1);
                v2 = (D1 * D2);
                break;
            case "-":
                v1 = (N1 * D2) - (N2 * D1);
                v2 = (D1 * D2);
                break;
            case "*":
                v1 = (N1 * N2);
                v2 = (D1 * D2);
                break;
            case "/":
                v1 = (N1 * D2);
                v2 = (N2 * D1);
                break;
            default:
                return 0;
        }

        System.out.print(v1 + "/" + v2 + " = ");

        if (v1 % v2 == 0) {
            System.out.println((v1 / v2) + "/" + (v2 / v2));
        } else if (simplificar(v1, v2) == 0) {
            System.out.println(N1 + "/" + N2);

        }
        return 0;
    }

    public static int simplificar(int a, int b) {
        int cont = 0;

        if (a % b == 0) {
            return a / b;
        } else {
            if (a < 0) {
                a = -a;
                cont = 1;
            }

            for (int i = 2; i < i + 1;) {
                if (a == 1 || (a < b && a < i) || (b < a && b < i)) {
                    N1 = a;
                    N2 = b;

                    if (cont == 1) {
                        N1 = -N1;
                    }

                    return 0;
                } else if (a % i == 0 && b % i == 0) {
                    a /= i;
                    b /= i;

                    if (!(a % i == 0 && b % i == 0)) {
                        i++;
                    }
                } else {
                    i++;
                }
            }
        }

        return 0;
    }
}
