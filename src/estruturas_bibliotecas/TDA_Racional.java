package estruturas_bibliotecas;

import java.io.IOException;
import java.util.Scanner;

public class TDA_Racional {

    static int N, N1, N2, D1, D2;
    static String C1, O, C2;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            N1 = sc.nextInt();
            C1 = sc.next();
            D1 = sc.nextInt();
            O = sc.next();
            N2 = sc.nextInt();
            C2 = sc.next();
            D2 = sc.nextInt();

            result(O);
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

        if (spf(v1, v2) != 0) {
            System.out.println(v1 / v2);
        } else {
            System.out.println(N1 + "/" + N2);
        }

        return 0;
    }

    public static int spf(int a, int b) {
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
