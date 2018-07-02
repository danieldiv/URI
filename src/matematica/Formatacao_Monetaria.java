package matematica;

import java.io.IOException;
import java.util.Scanner;

public class Formatacao_Monetaria {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int quant, resto_v;
        short centavos;
        String sub, str[], S, cent;
        char[] c;

        while (sc.hasNext()) {
            quant = 0;

            S = sc.next();
            centavos = sc.nextShort();

            cent = (centavos < 10) ? ".0" : ".";
            c = S.toCharArray();

            resto_v = (c.length % 3 != 0) ? 1 : 0;
            str = new String[(c.length / 3) + (int) resto_v];

            for (int i = S.length(); i > 0; i -= 3) {
                sub = (i - 3 > 0) ? S.substring(i - 3, i) : S.substring(0, i);

                str[quant] = sub;
                quant++;
            }

            System.out.print("$");

            for (int i = str.length - 1; i >= 0; i--) {
                System.out.print(str[i]);

                if (i != 0) {
                    System.out.print(",");
                }
            }

            System.out.println(cent + centavos);
        }

    }
}
