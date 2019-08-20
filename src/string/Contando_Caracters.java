package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Contando_Caracters {

    public static int maior = 0;
    public static String X;

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String S[], str;
        int V[];

        while (!(str = in.readLine()).equals("0")) {
            S = str.split(" ");
            V = new int[S.length];

            result(V, S);
        }
        System.out.println("\nThe biggest word: " + X);

    }

    public static void result(int[] V, String[] S) {
        for (int i = 0; i < V.length; i++) {
            V[i] = S[i].length();

            if (V[i] >= maior) {
                maior = V[i];
                X = S[i];
            }

            System.out.print(V[i]);

            if (i < V.length - 1) {
                System.out.print("-");
            }
        }
        System.out.println();
    }
}
