package estruturas_bibliotecas;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class A_Unica_Chance {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, M;
        char[] A;
        Map<String, Integer> map = new TreeMap<>();
        String S;

        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            M = sc.nextInt();
            S = sc.next();

            A = S.toCharArray();
            map.clear();

            for (int j = 0; j < M; j++) {
                map.put(String.valueOf(A[j]), j);
            }

            if (result(map, M, A, S)) {
                System.out.println("There are the chance.");
            } else {
                System.out.println("There aren't the chance.");
            }
        }

    }

    public static boolean result(Map map, int M, char[] A, String S) {
        if (map.size() != M) {
            return false;
        } else {
            int cont = 0, x = -1, y = -1;
            char[] B;

            Arrays.sort(B = S.toCharArray());

            for (int j = 0; j < M; j++) {
                if (B[j] != A[j]) {
                    cont++;

                    if (cont > 2) {
                        return false;
                    }

                    if (x == -1) {
                        x = j;
                    } else {
                        y = j;
                    }
                }
            }

            if (cont == 0) {
                return false;
            } else if (A[x] == B[y] && A[y] == B[x]) {
                return true;
            }
        }
        return false;
    }
}
