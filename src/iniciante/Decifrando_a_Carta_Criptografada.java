package iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decifrando_a_Carta_Criptografada {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int C, N;

        while (true) {

            C = Integer.parseInt(in.readLine());
            N = Integer.parseInt(in.readLine());

            String cifra1M, cifra2M, cifra1m, cifra2m;
            String[] palavra = new String[N];

            cifra1M = in.readLine();
            cifra2M = in.readLine();

            cifra1M = cifra1M.toUpperCase();
            cifra2M = cifra2M.toUpperCase();

            cifra1m = cifra1M.toLowerCase();
            cifra2m = cifra2M.toLowerCase();

            char[] c1M = cifra1M.toCharArray();
            char[] c2M = cifra2M.toCharArray();
            char[] c1m = cifra1m.toCharArray();
            char[] c2m = cifra2m.toCharArray();

            for (int i = 0; i < N; i++) {
                palavra[i] = in.readLine();
                System.out.println(decifrar(palavra[i], c1M, c2M, c1m, c2m));
            }
            System.out.println();
        }

    }

    public static String decifrar(String palavra, char[] c1M, char[] c2M, char[] c1m, char[] c2m) {
        char[] p = palavra.toCharArray();
        String n = "0123456789";

        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < c1M.length; j++) {
                if (p[i] == c1M[j] && !n.contains(String.valueOf(p[i]))) {
                    p[i] = c2M[j];
                    break;
                } else if (p[i] == c1m[j] && !n.contains(String.valueOf(p[i]))) {
                    p[i] = c2m[j];
                    break;
                } else if (p[i] == c2M[j] && !n.contains(String.valueOf(p[i]))) {
                    p[i] = c1M[j];
                    break;
                } else if (p[i] == c2m[j] && !n.contains(String.valueOf(p[i]))) {
                    p[i] = c1m[j];
                    break;
                }
            }
        }

        String str = String.copyValueOf(p);
        for (int i = 0; i < p.length; i++) {
            if (n.contains(String.valueOf(p[i]))) {
                for (int j = 0; j < c1M.length; j++) {
                    if (p[i] == c1M[j]) {
                        str = str.replace(p[i], c2m[j]);
                        break;
                    } else if (p[i] == c1m[j]) {
                        str = str.replace(p[i], c2m[j]);
                        break;
                    } else if (p[i] == c2M[j]) {
                        str = str.replace(p[i], c1m[j]);
                        break;
                    } else if (p[i] == c2m[j]) {
                        str = str.replace(p[i], c1m[j]);
                        break;
                    }
                }
            }

        }

        return str;
    }
}
