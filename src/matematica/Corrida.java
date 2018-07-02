package matematica;

import java.io.IOException;
import java.util.Scanner;

public class Corrida {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        float S, Va, Vb;

        while (sc.hasNext()) {
            S = sc.nextInt();
            Va = sc.nextInt();
            Vb = sc.nextInt();

            if (Vb >= Va) {
                System.out.println("impossivel");
            } else {
                System.out.printf("%.2f", (S / (Va - Vb)));
                System.out.println();
            }
        }
    }
}
