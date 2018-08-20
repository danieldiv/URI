package finalizar;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//ad-hoc
public class Crise_de_Energia {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = 13, V[], random;

        while (N != 0) {
//        while ((N = sc.nextInt()) != 0) {

            V = new int[N];

            for (int i = 0; i < N; i++) {
                V[i] = i + 1;
            }
            int x = 0;
            while (x < 1) {
                random = (int) (Math.random() * N);
                desligamento(V, 2);
                x++;
            }
            break;
        }
    }

    /**
     *
     * @param V vetor com valores em ordem crescente
     * @param R valor randomico
     */
    public static void desligamento(int V[], int R) {
        int V2[] = V, cont = R;

        System.out.println(R);
        for (int i = 0; i < V2.length; i++) {
            if (i == 0) {
                V2[i] = 0;
//            } else if (cont > 0) {
            } else if (V2[i] != 0) {
                if (cont > 0) {
                    cont--;
                } else {
                    System.out.println("i: " + i);
                    System.out.println(Arrays.toString(V2));

                    V2[i] = 0;
                    cont = R;

                    if (i == V2.length - 1) {
                        System.out.println("a");
                        i = 0;
                    }
                }
            } else {
                i = 0;
            }
        }

    }
}
