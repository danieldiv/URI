package ad_hoc;

import java.io.IOException;
import java.util.Scanner;

public class Divisibilidade_por_3 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n, m, soma;
        char c[];

        while (sc.hasNext()) {
            soma = 0;

            n = sc.nextInt();
            m = sc.nextInt();

            while (m > 0) {
                soma += (m % 10);

                m /= 10;
            }

            if (soma % 3 == 0) {
                System.out.println(soma + " sim");
            } else {
                System.out.println(soma + " nao");
            }
        }
    }
}
