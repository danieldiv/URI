package string;

import java.io.IOException;
import java.util.Scanner;

public class Sequencia_Espelho {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int C, B, E;
        String str;

        C = sc.nextInt();

        for (int i = 0; i < C; i++) {
            B = sc.nextInt();
            E = sc.nextInt();

            str = "";

            for (int j = B; j <= E; j++) {
                System.out.print(j);
                str += String.valueOf(j);
            }

            for (int j = str.length() - 1; j >= 0; j--) {
                System.out.print(str.charAt(j));
            }

            System.out.println();
        }

    }
}
