package finalizar;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Quadro_de_Medalhas {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        Map<String, int[]> map = new HashMap<>();
        Map<String, int[]> map_aux = new LinkedHashMap<>();
        Map<String, int[]> map2 = new LinkedHashMap<>();

        int N, num[][], ord[], A[];
        String S;

        N = sc.nextInt();
        num = new int[N][3];
        ord = new int[N];

        for (int i = 0; i < N; i++) {
            S = sc.next();

            for (int j = 0; j < num[0].length; j++) {
                num[i][j] = sc.nextInt();

                if (j == 0) {
                    ord[i] = num[i][j];
                }
            }

            map.put(S, num[i]);
        }

        Arrays.sort(ord);

        for (int j = ord.length - 1; j >= 0; j--) {
            for (Map.Entry<String, int[]> entry : map.entrySet()) {
                A = entry.getValue();

                if (ord[j] == A[0]) {
                    map_aux.put(entry.getKey(), entry.getValue());
                }
            }
        }

        exibe(map_aux);
        boolean b = true;
        int[] value_x = null, value_y;
        String key = null, V[];

        for (Map.Entry<String, int[]> entry : map_aux.entrySet()) {
            if (b) {
                value_x = entry.getValue();
                key = entry.getKey();
                b = false;
            } else {
                value_y = entry.getValue();
                System.out.println(entry.getKey() + ":y " + Arrays.toString(value_y) + " - " + key + ":x " + Arrays.toString(value_x));

                if (value_y[0] == value_x[0]) {
                    if (value_y[1] < value_x[1]) {

                        map2.put(key, value_x);
                        
                        key = entry.getKey();
                        value_x = entry.getValue();
                    } else if (value_y[1] == value_x[1]) {
                        if (value_y[2] < value_x[2]) {

                            map2.put(key, value_x);
                            
                            key = entry.getKey();
                            value_x = entry.getValue();
                        } else if (value_y[2] > value_x[2]) {

                            map2.put(entry.getKey(), value_y);
                        } else {
                            V = new String[2];

                            V[0] = key;
                            V[1] = entry.getKey();

                            Arrays.sort(V);

                            map2.put(V[0], map_aux.get(V[0]));
                            map2.put(V[1], map_aux.get(V[1]));
                        }

                    } else if (value_y[1] > value_x[1]) {
                        map2.put(entry.getKey(), value_y);

                        key = entry.getKey();
                        value_x = entry.getValue();

//                        break;
                    }
                } else {
//                    System.out.println(key + " - " + Arrays.toString(value_x));

                    map2.put(key, value_x);

                    key = entry.getKey();
                    value_x = entry.getValue();
                }

            }
        }

        exibe(map2);
    }

    public static void exibe(Map<String, int[]> map) {
        System.out.println("*");
        map.entrySet().stream().forEach((entry) -> {
            System.out.print(entry.getKey());

            for (int value : entry.getValue()) {
                System.out.print(" " + value);
            }
            System.out.println();
        });
    }
}
