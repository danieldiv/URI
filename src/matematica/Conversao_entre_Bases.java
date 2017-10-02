package matematica;

import java.io.IOException;
import java.util.Scanner;

public class Conversao_entre_Bases {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        long N, bin, dec, hex;
        String X, Y;

        N = sc.nextLong();

        for (int i = 0; i < N; i++) {
            X = sc.next();
            Y = sc.next();

            System.out.println(Integer.parseInt(X, 2) + " dec");
            Integer.toHexString(i);

        }
    }
}
