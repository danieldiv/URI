package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Albun_da_Copa {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, M, X[], num, cont = 0;

        N = sc.nextInt();
        M = sc.nextInt();

        X = new int[N + 1];

        for (int i = 0; i < M; i++) {
            num = sc.nextInt();
            X[num]++;
        }

        for (int i = 1; i < X.length; i++) {
            if (X[i] == 0) {
                cont++;
            }
        }
        
        System.out.println(cont);

    }
}
