package estruturas_bibliotecas;

import java.io.IOException;
import java.util.Scanner;

public class Organizando_Vagoes {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, L, cont, aux;
        int[] lista;

        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            L = sc.nextInt();
            lista = new int[L];
            cont = 0;

            for (int j = 0; j < L; j++) {
                lista[j] = sc.nextInt();
            }

            for (int j = 0; j < lista.length; j++) {
                for (int k = 0; k < lista.length - 1; k++) {
                    if (lista[k] > lista[k + 1]) {
                        aux = lista[k];
                        lista[k] = lista[k + 1];
                        lista[k + 1] = aux;

                        cont++;
                    }
                }
            }

            System.out.println("Optimal train swapping takes " + cont + " swaps.");
        }
    }
}
