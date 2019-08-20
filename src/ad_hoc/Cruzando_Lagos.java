package ad_hoc;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Cruzando_Lagos {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, aux = 0, cont = 0;
        boolean b = true;
        String[] gelo;

        while ((N = sc.nextInt()) > 101 || N < 0);
        gelo = new String[N];

        for (int i = 0; i < N; i++) {
            gelo[i] = sc.next();

            if (b) {
                if (gelo[i].contains(".")) {
                    aux++;

                    if (aux == 1) {
                        cont++;
                    } else if (aux > 2) {
                        b = false;
                    }
                } else {
                    aux = 0;
                }
            }
        }
        System.out.println((b) ? cont : "N");
    }
}
