package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Frase_Completa {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int N, Q[], aux, cont, cont_0;
        String str, abc = "abcdefghijklmnopqrstuvwxyz., ";
        char c[];

        N = Integer.parseInt(in.readLine());

        for (int i = 0; i < N; i++) {
            cont = cont_0 = 0;
            Q = new int[abc.length()];

            str = in.readLine();
            c = str.toCharArray();

            for (int j = 0; j < c.length; j++) {
                aux = abc.indexOf(c[j]);
                Q[aux]++;
            }

            for (int j = 0; j < Q.length - 3; j++) {
                if (Q[j] == 0) {
                    cont_0++;

                    if (cont_0 > 13) {
                        break;
                    }
                } else {
                    cont++;
                }
            }

            if (cont_0 > 13) {
                System.out.println("frase mal elaborada");
            } else if (cont == 26) {
                System.out.println("frase completa");
            } else {
                System.out.println("frase quase completa");
            }
        }
    }
}
