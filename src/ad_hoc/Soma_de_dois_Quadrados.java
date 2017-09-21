package ad_hoc;

import java.io.IOException;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Soma_de_dois_Quadrados {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, x, y, raiz;
        boolean B;

        while (sc.hasNext()) {
            N = sc.nextInt();
            raiz = (int) sqrt(N);
            B = false;

            for (int i = raiz; i >= 0; i--) {
                for (int j = 0; j <= raiz; j++) {
                    x = (int) pow(i, 2);
                    y = (int) pow(j, 2);

                    if (pow(i, 2) + pow(j, 2) > N) {
                        break;
                    } else if (pow(i, 2) + pow(j, 2) == N) {
                        B = true;
                        break;
                    }
                }
                if (B) {
                    break;
                }
            }

            if (B) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
