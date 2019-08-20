package ad_hoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Banco_Imobiliario {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        Map<String, Integer> map = new TreeMap<>();
        String[] str;
        int I, N, aux;

        str = in.readLine().split(" ");

        I = Integer.parseInt(str[0]);
        N = Integer.parseInt(str[1]);

        map.put("D", I);
        map.put("E", I);
        map.put("F", I);

        for (int i = 0; i < N; i++) {
            str = in.readLine().split(" ");

            switch (str[0]) {
                case "A":
                    map.put(str[1], (map.get(str[1]) + Integer.parseInt(str[3])));
                    map.put(str[2], (map.get(str[2]) - Integer.parseInt(str[3])));
                    break;
                case "C":
                    map.put(str[1], (map.get(str[1]) - Integer.parseInt(str[2])));
                    break;
                case "V":
                    map.put(str[1], (map.get(str[1]) + Integer.parseInt(str[2])));
                    break;
            }
        }

        aux = 1;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.print(entry.getValue());

            if (aux < map.size()) {
                System.out.print(" ");
            }
            aux++;
        }
        System.out.println();
    }
}
