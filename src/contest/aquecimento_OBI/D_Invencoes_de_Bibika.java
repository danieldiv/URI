package contest.aquecimento_OBI;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class D_Invencoes_de_Bibika {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, M;
        char mapa[][];
        
        int s = 305000;
        
        System.out.println(s);

        N = sc.nextInt();
        M = sc.nextInt();

        mapa = mapaBrasil(N, M, sc);

        int i = Arrays.binarySearch(mapa[1], '@');
        System.out.println("i: " + i);
    }

    /**
     * Prenche uma matriz representando o mapa do brasil
     *
     * @param N
     * @param M
     * @param sc
     * @return
     */
    public static char[][] mapaBrasil(int N, int M, Scanner sc) {
        char[][] mapa = new char[N][M];

        for (int i = 0; i < N; i++) {
            mapa[i] = sc.next().toCharArray();
        }

        return mapa;
    }
}
