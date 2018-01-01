package string;

import java.io.IOException;
import java.util.Scanner;

public class Justificador {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb;
        
        int N, maior, cont = 0;
        String str[];

        while ((N = sc.nextInt()) != 0) {
            if (cont != 0) {
                System.out.println();
            } else {
                cont++;
            }

            maior = 0;
            str = new String[N];

            for (int i = 0; i < N; i++) {
                str[i] = sc.next();

                if (str[i].length() > maior) {
                    maior = str[i].length();
                }
            }

            for (int i = 0; i < N; i++) {
                sb = new StringBuilder(str[i]);

                for (int j = 0; j < maior - str[i].length(); j++) {
                    sb.insert(0, " ");
                }
                System.out.println(sb.toString());
            }
        }
    }
}
