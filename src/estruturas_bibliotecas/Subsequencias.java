package estruturas_bibliotecas;

import java.io.IOException;
import java.util.Scanner;

public class Subsequencias {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, Q, cont;
        String S, R;

        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            S = sc.next();
            Q = sc.nextInt();

            for (int j = 0; j < Q; j++) {
                R = sc.next();
                cont = 0;

                if (S.contains(R)) {
                    System.out.println("Yes");
                } else {
                    for (int k = 0; k < S.length(); k++) {
                        if (R.charAt(cont) == S.charAt(k)) {
                            cont++;
                        }

                        if (cont > R.length() - 1) {
                            break;
                        }
                    }
                    System.out.println((cont == R.length()) ? "Yes" : "No");
                }
            }
        }
    }
}
