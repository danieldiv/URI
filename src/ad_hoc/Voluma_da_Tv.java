package ad_hoc;

import java.io.IOException;
import java.util.Scanner;

public class Voluma_da_Tv {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int V, T, A, aux;

        V = sc.nextInt();
        T = sc.nextInt();
        aux = V;

        for (int i = 0; i < T; i++) {
            A = sc.nextInt();
            aux += A;

            if (aux > 100) {
                aux = 100;
            } else if (aux < 0) {
                aux = 0;
            }
        }
        System.out.println(aux);
    }
}
