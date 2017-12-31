package matematica;

import java.io.IOException;
import java.util.Scanner;

public class Acima_da_Media {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int C, Ns[];
        float soma, media, quant, result, N;

        C = sc.nextInt();

        for (int i = 0; i < C; i++) {
            quant = soma = 0;

            N = sc.nextFloat();
            Ns = new int[(int) N];

            for (int j = 0; j < N; j++) {
                Ns[j] = sc.nextInt();
                soma += Ns[j];
            }

            media = soma / N;

            for (int O : Ns) {
                if (O > media) {
                    quant++;
                }
            }

            result = (100 / N) * quant;

            System.out.printf("%.3f%%\n", result);
        }
    }
}
