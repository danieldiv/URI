package string;

import java.io.IOException;
import java.util.Scanner;

public class Cifra_de_Cesar {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ", str, newStr;
        int N, P;

        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            newStr = "";

            str = sc.next();
            P = sc.nextInt();

            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < abc.length(); k++) {
                    if (str.charAt(j) == abc.charAt(k)) {
                        if (k - P < 0) {
                            newStr += abc.charAt(abc.length() + (k - P));
                        } else {
                            newStr += abc.charAt(k - P);
                        }
                    }
                }
            }

            System.out.println(newStr);
        }
    }
}
