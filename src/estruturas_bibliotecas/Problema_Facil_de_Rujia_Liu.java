package estruturas_bibliotecas;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problema_Facil_de_Rujia_Liu {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<>();

        int N, M, X, k, v;

        while (sc.hasNext()) {
            N = sc.nextInt();
            M = sc.nextInt();

            for (int i = 0; i < N; i++) {
                X = sc.nextInt();

                if (map.get(X) == null) {
                    map.put(X, String.valueOf(i + 1));
                } else {
                    map.put(X, map.get(X) + String.valueOf(i + 1));
                }
            }

            for (int i = 0; i < M; i++) {
                k = sc.nextInt();
                v = sc.nextInt();

                if (map.get(v) != null) {
                    if (k <= map.get(v).length()) {
                        System.out.println(map.get(v).charAt(k - 1));
                    } else {
                        System.out.println("0");
                    }
                } else {
                    System.out.println("0");
                }
            }
            
            map.clear();
        }
    }
}
