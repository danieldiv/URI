package ad_hoc;

import java.io.IOException;
import java.util.Scanner;

public class Tacografo {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, T, V, cont;

        N = sc.nextInt();
        cont = 0;

        for (int i = 0; i < N; i++) {
            T = sc.nextInt();
            V = sc.nextInt();

            cont += (T * V);
        }
        System.out.println(cont);
    }
}
