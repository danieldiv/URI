package iniciante.entrada_saida;

import java.io.IOException;

public class Saida_4 {

    public static void main(String[] args) throws IOException {
        String[] tr_1, formato;
        String[][] tr_2;

        int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        tr_1 = new String[39];
        formato = new String[3];
        tr_2 = new String[17][39];

        preencherValIniciais(tr_1, tr_2, num, formato);
        result(tr_1, tr_2);
    }

    /**
     * Preenche valores do vetor
     *
     * @param tr_1
     * @param tr_2
     * @param num
     * @param formato
     */
    public static void preencherValIniciais(String[] tr_1, String[][] tr_2, int[] num, String[] formato) {
        for (int i = 0; i < tr_2.length; i++) {
            for (int j = 0; j < tr_2[i].length; j++) {
                if (i == 0) {
                    tr_1[j] = "-";
                }

                if ((j == 0 || j == 12 || j == 22 || j == 38)) {
                    tr_2[i][j] = "|";
                } else {
                    tr_2[i][j] = " ";
                }
            }
        }

        formato[0] = "decimal";
        formato[1] = "octal";
        formato[2] = "Hexadecimal";

        preencherValInternos(tr_2, num, formato);
    }

    /**
     * Preenche valores internos do vetor
     *
     * @param tr_2
     * @param num
     * @param formato
     */
    public static void preencherValInternos(String[][] tr_2, int[] num, String[] formato) {
        int k = -1, l;

        //<editor-fold defaultstate="collapsed" desc="prenchimento dos formatos">
        k++;
        l = 0;
        for (int j = 0; j < 39; j++) {
            if (j == 15 || j == 25) {
                l = 0;
                k++;
            }

            if (j >= 3 && ((formato[k].length() + 3) - j) > 0) {
                tr_2[0][j] = String.valueOf(formato[k].charAt(l));

                l++;
            } else if (j >= 15 && ((formato[k].length() + 15) - j) > 0) {
                tr_2[0][j] = String.valueOf(formato[k].charAt(l));

                l++;
            } else if (j >= 25 && ((formato[k].length() + 25) - j) > 0) {
                tr_2[0][j] = String.valueOf(formato[k].charAt(l));

                l++;
            }
        }
//</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="valores formatados">
        k = 0;
        for (int i = 1; i < tr_2.length; i++) {
            for (int j = 7; j < tr_2[i].length; j++) {
                switch (j) {
                    case 7:
                        if (i < 11) {
                            tr_2[i][j] = String.valueOf(k);
                        } else {
                            tr_2[i][j - 1] = String.valueOf(k / 10);
                            tr_2[i][j] = String.valueOf(k % 10);
                        }
                        break;
                    case 17:
                        if (i < 9) {
                            tr_2[i][j] = Integer.toOctalString(num[k]);
                        } else {
                            tr_2[i][j - 1] = String.valueOf((Integer.parseInt(Integer.toOctalString(num[k]))) / 10);
                            tr_2[i][j] = String.valueOf((Integer.parseInt(Integer.toOctalString(num[k]))) % 10);
                        }
                        break;
                    case 30:
                        tr_2[i][j] = Integer.toHexString(num[k]).toUpperCase();
                        break;
                    default:
                        break;
                }
            }
            k++;
        }
//</editor-fold>

    }

    /**
     * Exibe o resultado final
     *
     * @param tr_1
     * @param tr_2
     */
    public static void result(String[] tr_1, String[][] tr_2) {
        int cont = 0;

        for (String s1 : tr_1) {
            System.out.print(s1);
        }
        System.out.println();

        for (int i = 0; i < tr_2.length; i++) {
            for (int j = 0; j < tr_2[i].length; j++) {
                if (i == 1 && j == 0) {
                    for (String s1 : tr_1) {
                        System.out.print(s1);
                    }
                    System.out.println();
                }
                System.out.print(tr_2[i][j]);
            }
            System.out.println();
        }

        for (String s1 : tr_1) {
            System.out.print(s1);
        }
        System.out.println();
    }
}
