package iniciante;

import java.util.Scanner;

public class Crepusculo_em_Portland {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, x, cont;

        while ((n = sc.nextInt()) < 1 || n > 100) {
        }

        int[][] val = new int[n + 1][n + 1];
        String[][] str = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                val[i][j] = sc.nextShort();
            }
        }

        for (int i = 0; i < n + 1; i++) {
            cont = 0;
            for (int j = 0; j < n + 1; j++) {
                if (i < n - 1 && j < n - 1) {
                    if (val[i][j] == 1) {
                        cont++;
                    }

                    if (val[i][j + 1] == 1) {
                        cont++;
                    }

                    if (val[i + 1][j] == 1) {
                        cont++;
                    }

                    if (val[i + 1][j + 1] == 1) {
                        cont++;
                    }
                }
                x = i;

                if (x < 0) {
                    x++;
                }

                System.out.println("cont: " + cont);
                if (cont >= 2) {
                    System.out.println("a");
                    str[i][j] = "S";
                } else {
                    System.out.println("b");
                    str[i][j] = "U";
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(str[i][j]);
            }
        }
    }
}
