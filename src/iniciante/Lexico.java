package iniciante;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Lexico {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String S[];

        S = new String[2];

        for (int i = 0; i < S.length; i++) {
            S[i] = sc.next();
        }

        Arrays.sort(S);

        for (String s : S) {
            System.out.println(s);
        }

    }
}
