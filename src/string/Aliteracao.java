package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aliteracao {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String str, newS;
        String[] S, res;
        char Q2[], c;
        int[] Q, cont;
        int quant;

        while ((str = in.readLine()) != null) {
            S = str.split(" ");
            Q = new int[S.length];
            Q2 = new char[S.length];
            cont = new int[S.length];

            for (int i = 0; i < S.length; i++) {
                if (!S[i].isEmpty()) {
                    c = S[i].toUpperCase().charAt(0);
                    Q[i] = (int) c;
                    Q2[i] = c;
                }

            }

            for (int i = 1; i < Q.length; i++) {
                if (Q[i] == Q[i - 1]) {
                    cont[i - 1]++;
                }
            }

            newS = "";
            for (int i = 0; i < cont.length; i++) {
                newS += cont[i];
            }

            newS = newS.replaceFirst("0*", "");
            res = newS.split("0");

            quant = 0;
            for (String r : res) {
                if (!r.isEmpty()) {
                    quant++;
                }
            }

            System.out.println(quant);
        }
    }
}
