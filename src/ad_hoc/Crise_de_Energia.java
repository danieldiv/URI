package ad_hoc;

import java.io.IOException;
import java.util.Scanner;

//ad-hoc
public class Crise_de_Energia {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, m, cont, quant, aux;
        int[] numeros;

        while ((N = sc.nextInt()) != 0) {
            m = aux = 0;

            while (aux != 13) {
                numeros = new int[N];
                cont = aux = 0;
                quant = 1;
                m++;

                for (int i = 0; i < N; i++) {
                    numeros[i] = i + 1;
                }
                numeros[0] = 0;

                while (quant < N) {
                    for (int i = 0; i < N; i++) {
                        if (numeros[i] != 0) {
                            cont++;
                        }
                        if (cont == m) {
                            aux = numeros[i];
                            cont = numeros[i] = 0;
                            quant++;
                        }
                    }
                }
            }
            System.out.println(m);
        }
    }

}
