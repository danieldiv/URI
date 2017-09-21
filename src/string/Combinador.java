package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Combinador {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int N, tam;
        String str, newStr, S[];

        N = Integer.valueOf(in.readLine());

        while (N != 0) {
            newStr = "";

            str = in.readLine();
            S = str.split(" ");

            if (S[0].length() <= S[1].length()) {
                tam = S[0].length();
            } else {
                tam = S[1].length();
            }

            for (int i = 0; i < tam; i++) {
                newStr += S[0].charAt(i);
                newStr += S[1].charAt(i);
            }

            if (S[0].length() < S[1].length()) {
                newStr += S[1].substring(S[0].length(), S[1].length());
            } else if (S[1].length() < S[0].length()) {
                newStr += S[0].substring(S[1].length(), S[0].length());
            }

            System.out.println(newStr);

            N--;
        }
    }
}
