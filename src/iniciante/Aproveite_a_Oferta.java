package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Aproveite_a_Oferta {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int T, N, K, res;
        float aux;

        T = sc.nextInt();

        while (T > 0) {
            N = sc.nextInt();
            K = sc.nextInt();

            aux = N / K;

            if (aux < 1) {
                System.out.println(N);
            } else {
                res = (int) aux;
                aux *= K;
                res += N - aux;
                
                System.out.println(res);
            }

            T--;
        }
    }
}
