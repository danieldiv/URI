package iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Construindo_Muralhas {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int N, W, R[], V;
        String S, nS[];

        N = Integer.parseInt(in.readLine());
        W = Integer.parseInt(in.readLine());

        R = new int[N];

        for (int i = 0; i < N; i++) {
            S = in.readLine();
            nS = S.split(" ");

            V = Integer.parseInt(nS[2]);

            if (V > W) {
                System.out.println("Titan " + nS[1]);
            }
        }
    }
}
