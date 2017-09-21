package string;

import java.io.IOException;
import java.util.Scanner;

public class Abracadabra {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String s;
        int tam;

        while (sc.hasNext()) {
            s = sc.next();
            tam = s.length();

            for (int i = 0; i < tam; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < tam - 1 - i; j++) {
                    System.out.print(s.charAt(j));

                    if (j < s.length() - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
