package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Montanha_Russa {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, Amin, Amax, A, cont;

        while (sc.hasNext()) {
            cont = 0;

            while ((N = sc.nextShort()) < 1 || N > 100) {
            }

            while ((Amin = sc.nextShort()) < 50 || Amin > 250) {
            }
            while ((Amax = sc.nextShort()) < Amin || Amax > 250) {
            }

            for (int i = 0; i < N; i++) {
                A = sc.nextInt();

                if (A >= Amin && A <= Amax) {
                    cont++;
                }
            }
            
            System.out.println(cont);
        }
    }
}
