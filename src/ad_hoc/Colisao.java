package ad_hoc;

import java.io.IOException;
import java.util.Scanner;

public class Colisao {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, V[];

        N = sc.nextInt();
        V = new int[10];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 10; j++) {
                V[j] = sc.nextInt();
            }
            validador(V);
        }
    }

    public static void validador(int[] V) {

//        (ry < cy) || (ry < dy)
//        (rx > ax) || (rx > dx)
//        (ry > by) || (ry > ay)
//        (rx < cx) || (rx < bx)
        if (((V[9] <= V[5]) && (V[9] <= V[7]))
                && ((V[8] >= V[0]) && (V[8] >= V[6]))
                && ((V[9] >= V[3]) && (V[9] >= V[1]))
                && ((V[8] <= V[4]) && (V[8] <= V[2]))) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
