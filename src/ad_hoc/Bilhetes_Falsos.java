package ad_hoc;

import java.io.IOException;
import java.util.Scanner;

public class Bilhetes_Falsos {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, M, n, T[], newT[], cont;

        while ((N = sc.nextInt()) != 0 && (M = sc.nextInt()) != 0) {
            cont = 0;

            T = new int[N + 1];
            newT = new int[N + 1];

            for (int i = 1; i <= M; i++) {
                while ((n = sc.nextInt()) < 1 || n > N) {
                }
                
                T[n] = n;

                if (T[n] != 0) {
                    newT[n]++;
                } else {
                    newT[n] = 1;
                }
            }

            for (int t : newT) {
                if (t > 1) {
                    cont++;
                }
            }
            
            System.out.println(cont);
        }
    }
}
