package iniciante.entrada_saida;

import java.io.IOException;

public class Saida_3 {

    public static void main(String[] args) throws IOException {
        String[] tr_1;
        String[][] tr_2;
        String X = "x = 35";

        tr_1 = new String[39];
        tr_2 = new String[5][39];

        preencher(tr_1, tr_2, X);
        result(tr_1, tr_2);
    }

    /**
     * Preenche valores do vetor
     *
     * @param tr_1
     * @param tr_2
     * @param X
     */
    public static void preencher(String[] tr_1, String[][] tr_2, String X) {
        int k;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 39; j++) {
                if (i == 0) {
                    tr_1[j] = "-";
                }

                if (!(j == 0 || j == 38)) {
                    tr_2[i][j] = " ";
                } else {
                    tr_2[i][j] = "|";
                }
            }
        }

        for (int i = 0; i < 5; i += 2) {
            k = 0;
            OUTER:
            for (int j = 1; j < 39; j++) {
                switch (i) {
                    case 0:
                        if (j > 0) {
                            tr_2[i][j] = String.valueOf(X.charAt(k));
                            if (k == (X.length() - 1)) {
                                break OUTER;
                            }
                            k++;
                        }
                        break;
                    case 2:
                        if (j > 15) {
                            tr_2[i][j] = String.valueOf(X.charAt(k));
                            if (k == (X.length() - 1)) {
                                break OUTER;
                            }
                            k++;
                        }
                        break;
                    default:
                        if (j > 31) {
                            tr_2[i][j] = String.valueOf(X.charAt(k));
                            if (k == (X.length() - 1)) {
                                break OUTER;
                            }
                            k++;
                        }
                        break;
                }
            }
        }
    }

    /**
     * Exibe o resultado final
     *
     * @param tr_1
     * @param tr_2
     */
    public static void result(String[] tr_1, String[][] tr_2) {
        for (String s1 : tr_1) {
            System.out.print(s1);
        }
        System.out.println();

        for (String[] s2 : tr_2) {
            for (String val : s2) {
                System.out.print(val);
            }
            System.out.println();
        }

        for (String s1 : tr_1) {
            System.out.print(s1);
        }
        System.out.println();
    }
}
