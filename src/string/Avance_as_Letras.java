package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Avance_as_Letras {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int T;
        String V[];

        T = Integer.parseInt(in.readLine());

        for (int i = 0; i < T; i++) {
            V = in.readLine().split(" ");

            if (V[0].equals(V[1])) {
                System.out.println("0");
            } else {
                System.out.println(avancaLetra(V[0], V[1]));
            }
        }
    }

    public static int avancaLetra(String S1, String S2) {
        char c1[] = S1.toCharArray(), c2[] = S2.toCharArray();
        int x, y, cont = 0;

        for (int i = 0; i < c1.length; i++) {
            x = (int) c1[i];
            y = (int) c2[i];

            cont += (y - x >= 0) ? (y - x) : (26 + (y - x));
        }
        return cont;
    }
}
