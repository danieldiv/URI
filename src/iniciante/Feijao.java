package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Feijao {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int C[];

        C = new int[4];

        for (int i = 0; i < C.length; i++) {
            C[i] = sc.nextInt();
        }

        for (int i = 0; i < C.length; i++) {
            if (C[i] == 1) {
                System.out.println(i + 1);
            }
        }

    }
}
