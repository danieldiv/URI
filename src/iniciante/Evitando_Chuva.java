package iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Evitando_Chuva {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int N, E = 0, E2 = 0, C = 0, C2 = 0;
        String S[][];

        N = Integer.parseInt(in.readLine());
        S = new String[N][2];

        for (int i = 0; i < N; i++) {
            S[i] = in.readLine().split(" ");
        }

        for (int i = 0; i < N; i++) {
            if (S[i][0].equals("chuva")) {
                if (C2 > 0) {
                    C2--;
                    E2++;
                } else {
                    C++;
                    E2++;
                }
            }
            if (S[i][1].equals("chuva")) {
                if (E2 > 0) {
                    E2--;
                    C2++;
                } else {
                    E++;
                    C2++;
                }
            }
        }

        System.out.println(C + " " + E);
    }
}
