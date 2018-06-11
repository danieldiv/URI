package string;

import java.io.IOException;
import java.util.Scanner;

public class Arvore_de_Natal {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, aux;

        while (sc.hasNext()) {
            N = sc.nextInt();
            aux = N / 2;

            for (int i = 0; i < N; i += 2) {
                for (int j = 0; j < aux; j++) {
                    System.out.print(" ");
                }
                aux--;
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            aux = N / 2;
            for (int i = 0; i < 4; i += 2) {
                for (int j = 0; j < aux; j++) {
                    System.out.print(" ");
                }
                aux--;
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
