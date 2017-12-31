package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class O_despertar_da_forca {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n, m, x = 0, y = 0;

        n = sc.nextShort();
        m = sc.nextShort();

        int[][] val = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                val[i][j] = sc.nextShort();
            }
        }

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < m - 1; j++) {

                if ((val[i][j] == 42) && i > 0 && i < n - 1 && j > 0 && j < m - 1) {

                    if (val[i - 1][j - 1] == 7 && val[i - 1][j] == 7 && val[i - 1][j + 1] == 7) {
                        if (val[i + 1][j - 1] == 7 && val[i + 1][j] == 7 && val[i + 1][j + 1] == 7) {
                            if (val[i][j - 1] == 7 && val[i][j + 1] == 7) {
                                x = i + 1;
                                y = j + 1;
                            }
                        }
                    }
                }
            }
        }

        System.out.println(x + " " + y);
    }
}
