package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Digitador_Gago {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String S[];

        S = in.readLine().split(" ");

        for (int i = 0; i < S.length; i++) {
            if (S[i].length() > 3) {
                if (S[i].substring(0, 2).equals(S[i].substring(2, 4))) {
                    S[i] = S[i].substring(2, S[i].length());
                }
            }
            System.out.print(S[i]);

            if (i < S.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
