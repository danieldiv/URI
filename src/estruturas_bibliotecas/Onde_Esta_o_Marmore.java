package estruturas_bibliotecas;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Onde_Esta_o_Marmore {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, Q, i, num[], target[], quant = 0;

        while (true) {
            N = sc.nextInt();
            Q = sc.nextInt();

            if (N == 0 && Q == 0) {
                break;
            }

            num = new int[N];
            target = new int[Q];
            quant++;

            for (i = 0; i < N; i++) {
                num[i] = sc.nextInt();
            }

            for (i = 0; i < Q; i++) {
                target[i] = sc.nextInt();
            }

            Arrays.sort(num);

            System.out.println("CASE# " + quant + ":");
            busca_binaria(num, target);
        }
    }

    public static void busca_binaria(int[] num, int[] target) {
        int i, min, max, n, x, cont;

        for (int j = 0; j < target.length; j++) {
            max = num.length - 1;
            n = target[j];
            cont = 0;

            if (num[max] < n) {
                System.out.println(n + " not found");
            } else if (num[0] == n) {
                System.out.println(n + " found at 1");
            } else {
                for (min = 0; min < max;) {
                    x = ((min + (max)) / 2);

                    if (num[x] < n) {
                        min = x++;
                        min++;
                    } else {
                        max = x--;
                    }
                }
                if (cont == 0) {
                    x = min;

                    if (min >= max) {
                        x = max;
                        max = min;
                    }

                    for (i = x; i <= max; i++) {
                        if (num[i] == n) {
                            System.out.println(n + " found at " + (i + 1));
                            cont++;
                            break;
                        }
                    }
                    if (cont == 0) {
                        System.out.println(n + " not found");
                    }
                }
            }
        }
    }
}
