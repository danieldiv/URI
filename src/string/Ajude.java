package string;

import java.io.IOException;
import java.util.Scanner;

public class Ajude {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N, T, cont, quant, V[], aux[], indice;
        String I, J, abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        while ((N = sc.nextInt()) != 0) {
            V = new int[abc.length()];
            aux = new int[abc.length()];

            quant = cont = 0;

            for (int i = 0; i < N; i++) {
                I = sc.next();
                T = sc.nextInt();
                J = sc.next();

                indice = abc.indexOf(I);

                if (aux[indice] == 0) {
                    if (J.equals("correct")) {
                        quant++;
                        cont += T;

                        aux[indice] = 1;
                    } else {
                        V[indice] += 20;
                    }
                }
            }

            for (int i = 0; i < aux.length; i++) {
                if (aux[i] != 0) {
                    cont += V[i];
                }
            }

            System.out.println(quant + " " + cont);
        }
    }
}
