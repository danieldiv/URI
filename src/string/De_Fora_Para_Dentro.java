package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class De_Fora_Para_Dentro {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int N;
        String S;

        N = Integer.parseInt(in.readLine());

        for (int i = 0; i < N; i++) {
            S = in.readLine();

            exibePalavra(S.substring(0, (S.length() / 2)).toCharArray());
            exibePalavra(S.substring((S.length() / 2), S.length()).toCharArray());

            System.out.println();
        }
    }

    public static void exibePalavra(char[] c) {
        for (int i = c.length - 1; i >= 0; i--) {
            System.out.print(c[i]);

            if (i > 0) {
                System.out.print("");
            }
        }
    }
}
