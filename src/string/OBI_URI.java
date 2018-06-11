package string;

import java.io.IOException;
import java.util.Scanner;

public class OBI_URI {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N;
        String str, S[];

        N = sc.nextInt();
        S = new String[N];

        for (int i = 0; i < N; i++) {
            str = sc.next();

            if (str.length() == 3) {
                if (str.charAt(0) == 'O' && str.charAt(1) == 'B') {
                    S[i] = "OBI";
                } else if (str.charAt(0) == 'U' && str.charAt(1) == 'R') {
                    S[i] = "URI";
                } else {
                    S[i] = str;
                }
            } else {
                S[i] = str;
            }
        }

        for (int i = 0; i < S.length; i++) {
            System.out.print(S[i]);

            if (i < S.length - 1) {
                System.out.print(" ");
            }
        }

        System.out.println();

    }
}
