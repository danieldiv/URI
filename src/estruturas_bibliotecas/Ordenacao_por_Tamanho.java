package estruturas_bibliotecas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ordenacao_por_Tamanho {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int N, tam[];
        String S, V[], R[];

        N = Integer.parseInt(in.readLine());

        for (int i = 0; i < N; i++) {
            S = in.readLine();
            V = S.split(" ");

            tam = new int[V.length];
            R = new String[V.length];

            for (int j = 0; j < tam.length; j++) {
                tam[j] = V[j].length();
            }

            Arrays.sort(tam);

            for (int j = 0; j < tam.length; j++) {
                for (int k = 0; k < V.length; k++) {
                    if (V[k].length() == tam[tam.length - (j + 1)] && (!V[k].equals("."))) {
                        R[j] = V[k];
                        V[k] = ".";
                        break;
                    }
                }
            }

            for (int j = 0; j < R.length; j++) {
                System.out.print(R[j]);
                if (j < R.length - 1) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
