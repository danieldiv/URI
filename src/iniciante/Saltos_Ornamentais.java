package iniciante;

import java.util.Scanner;

public class Saltos_Ornamentais {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        float GD, menor, maior, soma;
        float[] NO = new float[7];

        String str;

        while ((N = sc.nextInt()) < 0 || N > 100) {
        }

        for (int i = 0; i < N; i++) {
            str = sc.next();

            maior = soma = 0;
            menor = 11;

            while ((GD = sc.nextFloat()) < 1.2 || GD > 3.8) {
            }

            for (int j = 0; j < 7; j++) {
                while ((NO[j] = sc.nextFloat()) < 0 || NO[j] > 10) {
                }

                if (NO[j] < menor) {
                    menor = NO[j];
                }
                if (NO[j] > maior) {
                    maior = NO[j];
                }

                soma += NO[j];
            }

            System.out.printf("%s %.2f \n", str, ((soma - (menor + maior)) * GD));
        }
    }
}
