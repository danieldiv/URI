package iniciante.entrada_saida;

import java.io.IOException;

public class Saida_2 {

    public static void main(String[] args) throws IOException {
        String[] tr_1;
        String[][] tr_2;
        String p1 = "Roberto", p2 = "UNIFEI", num = "5786";

        tr_1 = new String[39];
        tr_2 = new String[5][39];

        preencher(tr_1, tr_2, p1, p2, num);
        result(tr_1, tr_2);
    }

    /**
     * Preenche valores do vetor
     *
     * @param tr_1
     * @param tr_2
     * @param p1
     * @param p2
     * @param num
     */
    public static void preencher(String[] tr_1, String[][] tr_2, String p1, String p2, String num) {
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
            for (int j = 9; j < 39; j++) {
                switch (i) {
                    case 0:
                        tr_2[i][j] = String.valueOf(p1.charAt(k));
                        if (k == (p1.length() - 1)) {
                            break OUTER;
                        }
                        k++;
                        break;
                    case 2:
                        tr_2[i][j] = String.valueOf(num.charAt(k));
                        if (k == (num.length() - 1)) {
                            break OUTER;
                        }
                        k++;
                        break;
                    default:
                        tr_2[i][j] = String.valueOf(p2.charAt(k));
                        if (k == (p2.length() - 1)) {
                            break OUTER;
                        }
                        k++;
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
