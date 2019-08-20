package finalizar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Teclado_Zoeiro {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        Map<String, String> map = new HashMap<>();

        int N, M;
        String C[], X[], res, aux;
        char[] c;

        X = in.readLine().split(" ");

        N = Integer.parseInt(X[0]);
        M = Integer.parseInt(X[1]);

        for (int i = 0; i < N; i++) {
            C = in.readLine().split(" ");

            map.put(C[0], C[1]);
            map.put(C[1], C[0]);
        }

        for (int i = 0; i < M; i++) {
            c = in.readLine().toCharArray();
            System.out.println(result(c, map));
        }
    }

    public static String result(char[] c, Map<String, String> map) {
        String aux, res = "";

        for (int j = 0; j < c.length; j++) {
            aux = String.valueOf(c[j]);

            if (map.containsKey(aux)) {
                res += map.get(aux);
            } else {
                res += c[j];
            }
        }
        return res;
    }
}
