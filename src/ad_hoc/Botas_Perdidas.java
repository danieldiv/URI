package ad_hoc;

import java.io.IOException;
import java.util.Scanner;

public class Botas_Perdidas {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, p, cont;
        int[] mE, mD;

        while (sc.hasNext()) {
            mE = new int[61];
            mD = new int[61];
            cont = 0;

            while ((N = sc.nextInt()) < 2 || N > 10000) {
            }

            String[][] M = new String[N][2];

            for (int i = 0; i < N; i++) {
                M[i][0] = sc.next();
                M[i][1] = sc.next();

                p = Integer.valueOf(M[i][0]);

                if (M[i][1].equals("E")) {
                    mE[p]++;
                } else if (M[i][1].equals("D")) {
                    mD[p]++;
                }
            }

            for (int i = 0; i < 61; i++) {
                if (mE[i] != 0 && mD[i] != 0) {
                    if (mE[i] >= mD[i]) {
                        cont += mD[i];
                    } else {
                        cont += mE[i];
                    }
                }
            }

            System.out.println(cont);
        }

    }
}
