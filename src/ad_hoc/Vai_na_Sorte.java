package ad_hoc;

import java.io.IOException;
import java.util.Scanner;

public class Vai_na_Sorte {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, V, cont, aux;
        boolean b;

        while ((N = sc.nextInt()) != 0) {
            cont = 0;

            do {
                aux = 0;
                b = true;
                for (int i = 0; i < N; i++) {
                    if (b) {
                        V = sc.nextInt();

                        if (V == i + 1) {
                            aux++;
                        } else {
                            b = false;
                        }
                    } else {
                        sc.nextInt();
                    }
                }
                cont++;
            } while (aux != N);
            System.out.println(cont);
        }

    }
}
