package iniciante.entrada_saida;

import java.io.IOException;
import java.util.Scanner;

public class Entrada_e_Saida_de_Numeros_Inteiros {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int A = 1234, B = 12, C = 123;
        String[] R, S;

        while (sc.hasNext()) {
            //<editor-fold defaultstate="collapsed" desc="Entrada de dados">
            while ((A = sc.nextInt()) < -10000 || A > 10000) {
            }
            while ((B = sc.nextInt()) < 0 || B > 99) {
            }
            while ((C = sc.nextInt()) < 0 || C > 999) {
            }
            R = new String[3];
            S = new String[4];

            R[0] = String.valueOf(A);
            R[1] = String.valueOf(B);
            R[2] = String.valueOf(C);

            S[0] = "A = x, B = y, C = z";

//</editor-fold>    
            for (int i = 0; i < S.length; i++) {
                switch (i) {
                    case 0:
                        S[i] = S[i].replace("x", R[0]);
                        S[i] = S[i].replace("y", R[1]);
                        S[i] = S[i].replace("z", R[2]);
                        break;
                    case 1:
                        for (int j = 0; j < R.length; j++) {
                            preencheCampos(A, i, j, S, R);

                            for (int k = R[j].length(); k < 10; k++) {
                                S[i] += " ";
                            }
                            S[i] += R[j];
                        }
                        break;
                    case 2:
                        for (int j = 0; j < R.length; j++) {
                            preencheCampos(A, i, j, S, R);

                            String str = R[j];
                            int tam = 10;

                            for (int k = R[j].length(); k < tam; k++) {
                                if (j == 0 && A < 0 && k == R[j].length()) {
                                    S[i] += "-";
                                    str = String.valueOf(-A);
                                    tam++;
                                } else {
                                    S[i] += "0";
                                }
                            }
                            S[i] += str;
                        }
                        break;
                    case 3:
                        for (int j = 0; j < R.length; j++) {
                            preencheCampos(A, i, j, S, R);

                            S[i] += R[j];
                            for (int k = R[j].length(); k < 10; k++) {
                                S[i] += " ";
                            }
                        }
                        break;
                }
            }

            for (String s : S) {
                System.out.println(s);
            }
        }
    }

    public static void preencheCampos(int A, int i, int j, String S[], String R[]) {
        switch (j) {
            case 0:
                S[i] = "";
                S[i] += "A = ";
                break;
            case 1:
                S[i] += ", B = ";
                break;
            default:
                S[i] += ", C = ";
                break;
        }
    }
}
