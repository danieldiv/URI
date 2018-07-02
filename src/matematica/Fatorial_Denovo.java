package matematica;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Fatorial_Denovo {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, num, cont, soma;
        int[] fat = {1, 2, 6, 24, 120};//fatorial de 1,2,3,4,5
        char[] c;

        while ((N = sc.nextInt()) != 0) {
            c = String.valueOf(N).toCharArray();

            cont = soma = 0;
            for (int i = c.length - 1; i >= 0; i--) {
                num = Character.getNumericValue(c[cont]);
                num *= fat[i];

                soma += num;

                cont++;
            }
            System.out.println(soma);
        }
    }
}
