package iniciante.entrada_saida;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Entrada_e_Saida_6 {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String S, A[];
        int X, Y;

        S = in.readLine();

        if (!S.contains(".")) {
            S += ".0";
        }

        A = S.split("[.]");
        X = Integer.parseInt(A[1]);
        Y = Integer.parseInt(A[0]);

        System.out.println(X + "." + Y);
    }
}
