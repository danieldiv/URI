package ad_hoc;

import java.io.IOException;
import java.util.Scanner;

public class Loop_Musical {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n, cont;

        while ((n = sc.nextInt()) != 0) {
            cont = 0;

            int[] h = new int[n];

            for (int i = 0; i < n; i++) {
                h[i] = sc.nextInt();
            }

            if (h[h.length - 1] > h[0] && h[h.length - 1] > h[h.length - 2]) {
                cont++;
            } else if (h[h.length - 1] < h[0] && h[h.length - 1] < h[h.length - 2]) {
                cont++;
            }

            if (h[0] > h[h.length - 1] && h[0] > h[1]) {
                cont++;
            } else if (h[0] < h[h.length - 1] && h[0] < h[1]) {
                cont++;
            }

            for (int i = 1; i < n - 1; i++) {
                if (h[i] > h[i - 1] && h[i] > h[i + 1]) {
                    cont++;
                } else if (h[i] < h[i - 1] && h[i] < h[i + 1]) {
                    cont++;
                }
            }

            System.out.println(cont);
        }
    }
}
