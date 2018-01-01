package string;

import java.io.IOException;
import java.util.Scanner;

public class Um_Dois_Tres {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N;
        String str;
        char[] c;

        while ((N = sc.nextInt()) > 1000) {
        }

        for (int i = 0; i < N; i++) {

            str = sc.next();

            if (str.equals("one")) {
                System.out.println("1");
            } else if (str.equals("two")) {
                System.out.println("2");
            } else if (str.equals("three")) {
                System.out.println("3");
            } else if (str.length() == 5) {
                System.out.println("3");
            } else {
                c = str.toCharArray();

                //numero 1
                if (c[0] == 'o' && c[1] == 'n' && c[2] != 'e') {
                    System.out.println("1");
                } else if (c[0] == 'o' && c[1] != 'n' && c[2] == 'e') {
                    System.out.println("1");
                } else if (c[0] != 'o' && c[1] == 'n' && c[2] == 'e') {
                    System.out.println("1");
                }

                //numero 2
                if (c[0] == 't' && c[1] == 'w' && c[2] != 'o') {
                    System.out.println("2");
                } else if (c[0] == 't' && c[1] != 'w' && c[2] == 'o') {
                    System.out.println("2");
                } else if (c[0] != 't' && c[1] == 'w' && c[2] == 'o') {
                    System.out.println("2");
                }
            }
        }
    }
}
