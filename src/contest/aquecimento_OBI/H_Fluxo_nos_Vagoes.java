package contest.aquecimento_OBI;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class H_Fluxo_nos_Vagoes {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, M, X, Y, A, B, C, D, OP, soma;

        Map<Integer, Integer> map = new HashMap<>();

        N = sc.nextInt();
        M = sc.nextInt();

        for (int i = 0; i < M; i++) {
            OP = sc.nextInt();

            if (OP == 1) {
                X = sc.nextInt();
                Y = sc.nextInt();

                if (map.get(X) == null) {
                    map.put(X, Y);
                } else {
                    map.put(X, map.get(X) + Y);
                }
            } else if (OP == 2) {
                A = sc.nextInt();
                B = sc.nextInt();
                C = sc.nextInt();
                D = sc.nextInt();

                soma = soma = 0;

                int G, H;

                if (C <= A) {
                    G = C;

                    if (D >= B) {
                        H = D;
                    } else {
                        H = B;
                    }

                    for (int j = G; j <= H; j++) {
                        soma += (map.get(j) != null) ? map.get(j) : 0;
                    }
                } else if (B > C) {
                    G = A;

                    if (D >= B) {
                        H = D;
                    } else {
                        H = B;
                    }

                    for (int j = G; j <= H; j++) {
                        soma += (map.get(j) != null) ? map.get(j) : 0;
                    }
                } else {
                    for (int j = A; j <= B; j++) {
                        soma += (map.get(j) != null) ? map.get(j) : 0;
                    }
                    if (B == C) {
                        C++;
                    }

                    for (int j = C; j <= D; j++) {
                        soma += (map.get(j) != null) ? map.get(j) : 0;
                    }
                }

                System.out.println(soma);
            }
        }
    }

}
