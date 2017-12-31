package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Evento {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int X;
        long M;

        while (true) {
            X = sc.nextInt();
            M = sc.nextLong();

            if (X == 0 && M == 0) {
                break;
            }

            System.out.println(X * M);
        }
    }
}
