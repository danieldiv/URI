package ad_hoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Elevador {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int N, C, S, E, aux;
        boolean b = true;
        String[] str;

        str = in.readLine().split(" ");
        
        N = Integer.parseInt(str[0]);
        C = Integer.parseInt(str[1]);

        aux = 0;
        for (int i = 0; i < N; i++) {
            str = in.readLine().split(" ");
            
            S = Integer.parseInt(str[0]);
            E = Integer.parseInt(str[1]);

            aux -= S;
            aux += E;

            if (aux > C) {
                b = false;
            }
        }

        System.out.println((b) ? "N" : "S");
    }
}
