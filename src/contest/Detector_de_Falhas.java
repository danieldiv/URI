package contest;

import java.io.IOException;
import java.util.Scanner;

public class Detector_de_Falhas {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = 0, X, Y, maior = 0;

        while (sc.hasNext()) {
            if (N == 10000) {
                break;
            }

            X = sc.nextInt();

            if (maior < X) {
                maior = X;
            } else {
                Y = maior + 1;
            }

            N++;
        }
    }
}
