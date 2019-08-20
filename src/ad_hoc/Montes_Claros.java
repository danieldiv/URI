package ad_hoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Montes_Claros {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        Map<Integer, Integer> map = new TreeMap<>();
        int N, Di, Ti, cont, aux;
        String[] str;

        N = Integer.parseInt(in.readLine());

        for (int i = 0; i < N; i++) {
            str = in.readLine().split(" ");

            Di = Integer.parseInt(str[0]);
            Ti = Integer.parseInt(str[1]);

            map.put(Di, Ti);
        }

        cont = aux = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (cont != 0) {
                if (entry.getValue() > aux) {
                    break;
                }
            }
            aux = entry.getValue();
            cont++;
        }

        System.out.println((cont == map.size()) ? "S" : "N");
    }
}
