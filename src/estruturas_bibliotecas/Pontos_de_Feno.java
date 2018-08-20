package estruturas_bibliotecas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pontos_de_Feno {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        int N, M, cont;
        String S;

        N = sc.nextInt();
        M = sc.nextInt();

        for (int i = 0; i < N; i++) {
            map.put(sc.next(), sc.nextInt());
        }

        for (int i = 0; i < M; i++) {
            cont = 0;

            while (!(S = sc.nextLine()).equals(".")) {
                for (Map.Entry<String, Integer> entry : map.entrySet()) {
                    while (true) {
                        if (S.contains(entry.getKey())) {
                            cont += entry.getValue();
                            S = S.replaceFirst(entry.getKey(), "*");
                        } else {
                            break;
                        }
                    }
                }
            }
            System.out.println(cont);
        }
    }
}
