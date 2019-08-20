package iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pegadinha_de_Evergreen {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int N;
        char[] R, S;
        String aux;

        N = Integer.parseInt(in.readLine());

        while (N > 0) {
            R = in.readLine().toCharArray();
            S = in.readLine().toCharArray();
            aux = "";

            for (int i = 0; i < R.length; i += 2) {
                aux += R[i];
                aux += R[i + 1];

                aux += S[i];
                if (!(i + 1 == S.length)) {
                    aux += S[i + 1];
                }
            }

            System.out.println(aux);
            N--;
        }
    }
}
