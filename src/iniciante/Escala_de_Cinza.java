package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Escala_de_Cinza {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int R, G, B, T, res;
        String cvs;

        T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            cvs = sc.next();

            R = sc.nextInt();
            G = sc.nextInt();
            B = sc.nextInt();

            res = (int) result(cvs, R, G, B);

            System.out.println("Caso #" + (i + 1) + ": " + res);
        }
    }

    public static double result(String str, int r, int g, int b) {
        double res = 0;
        switch (str) {
            case "min":
                if (r < g && r < b) {
                    res = r;
                } else if (g < r && g < b) {
                    res = g;
                } else {
                    res = b;
                }
                break;
            case "max":
                if (r > g && r > b) {
                    res = r;
                } else if (g > r && g > b) {
                    res = g;
                } else {
                    res = b;
                }
                break;
            case "mean":
                res = (r + g + b) / 3;
                break;
            case "eye":
                res = (0.30 * r) + (0.59 * g) + (0.11 * b);
                break;
        }
        return res;
    }
}
