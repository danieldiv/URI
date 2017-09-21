package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Frequencia_de_Letras {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int N, P, vet[], cont;
        String str;

        System.out.println((int) 'a');
        System.out.println((int) 'A');
        N = Integer.parseInt(in.readLine());

        for (int i = 0; i < N; i++) {
            str = in.readLine();
            str = str.toLowerCase();

            vet = new int[123];
            cont = 0;

            for (int j = 0; j < str.length(); j++) {
                P = (int) str.charAt(j);
                if (P <= 122 && P != 32) {
                    vet[P]++;

                    if (vet[P] > cont) {
                        cont = vet[P];
                    }
                }
            }

            for (int j = 0; j < vet.length; j++) {
                if (vet[j] == cont) {
                    System.out.print((char) j);
                }
            }
            System.out.println();
        }

    }
}
