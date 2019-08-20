package string;

import java.io.IOException;
import java.util.Scanner;

public class Criptotexto {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int C;
        char c[];

        C = sc.nextByte();

        for (int i = 0; i < C; i++) {
            c = sc.next().toCharArray();
            System.out.println(result("", c));
        }
    }

    public static String result(String str, char c[]) {
        for (char d : c) {
            if ((int) d >= 97 && (int) d <= 122) {
                str += d;
            }
        }
        return new StringBuffer(str).reverse().toString();
    }
}
