package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Justificador_II {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int N, maior, cont = 0;
        String S[], aux[];

        while ((N = Integer.parseInt(in.readLine())) != 0) {
            S = new String[N];
            maior = 0;

            if (cont != 0) {
                System.out.println();
            }

            for (int i = 0; i < N; i++) {
                aux = in.readLine().split(" ");
                S[i] = "";

                for (String a : aux) {
                    if (!a.isEmpty()) {
                        S[i] += a + " ";
                    }
                }

                S[i] = S[i].substring(0, S[i].length() - 1);

                if (S[i].length() > maior) {
                    maior = S[i].length();
                }
            }

            for (String s : S) {
                for (int i = 0; i < maior - s.length(); i++) {
                    System.out.print(" ");
                }
                System.out.println(s);
            }
            cont++;
        }
    }
}
