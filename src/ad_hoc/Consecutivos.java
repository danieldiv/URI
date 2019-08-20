package ad_hoc;

import java.io.IOException;
import java.util.Scanner;

public class Consecutivos {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int V[], N, cont, aux;

        N = sc.nextInt();
        V = new int[N];

        cont = 1;
        aux = 0;
        for (int i = 0; i < N; i++) {
            V[i] = sc.nextInt();

            if (i > 0) {
                if (V[i] == (V[i - 1])) {
                    cont++;
                } else {
                    if (aux < cont) {
                        aux = cont;
                    }
                    cont = 1;
                }
            }
        }

        if (aux < cont) {
            aux = cont;
        }

        System.out.println(aux);
    }
}
