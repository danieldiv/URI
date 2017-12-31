package ad_hoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Instrucoes_do_Robo {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int T, N, robo;
        String S[];

        T = Integer.parseInt(in.readLine());

        for (int i = 0; i < T; i++) {
            robo = 0;

            N = Integer.parseInt(in.readLine());
            S = new String[N];

            for (int j = 0; j < N; j++) {
                S[j] = in.readLine();
            }

            for (String s : S) {
                robo = Instrucao(S, s, robo);
            }

            System.out.println(robo);

        }

    }

    public static int Instrucao(String[] V, String S, int robo) {
        String aux[];
        int P;

        switch (S) {
            case "LEFT":
                robo--;
                break;
            case "RIGHT":
                robo++;
                break;
            default:
                aux = S.split(" ");
                P = Integer.parseInt(aux[aux.length - 1]);

                return Instrucao(V, V[P - 1], robo);
        }
        return robo;
    }
}
