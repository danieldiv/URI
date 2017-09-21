package ad_hoc;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Sudoku {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n, m1[][], m2[], cont = 0;

        n = sc.nextInt();

        for (int h = 1; h <= n; h++) {

            m1 = new int[9][9];

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    m1[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < 9; i++) {
                cont = 0;
                m2 = new int[9];

                for (int j = 0; j < 9; j++) {
                    m2[m1[j][i] - 1] = m1[j][i];
                }

                for (int j = 0; j < 9; j++) {
                    if (m2[j] == 0) {
                        cont++;
                        break;
                    }
                }

                if (cont != 0) {
                    break;
                }
            }

            if (cont == 0) {
                for (int i = 0; i < 9; i++) {
                    cont = 0;
                    m2 = new int[9];

                    for (int j = 0; j < 9; j++) {
                        m2[m1[i][j] - 1] = m1[i][j];
                    }

                    for (int j = 0; j < 9; j++) {
                        if (m2[j] == 0) {
                            cont++;
                            break;
                        }
                    }

                    if (cont != 0) {
                        break;
                    }
                }
            }

            if (cont == 0) {
                if (valida(m1, 0, 3)) {
                    if (valida(m1, 3, 6)) {
                        if (valida(m1, 6, 9)) {
                            if (valida(m1, 0, 3)) {
                                if (valida(m1, 3, 6)) {
                                } else {
                                    cont++;
                                }
                            } else {
                                cont++;
                            }
                        } else {
                            cont++;
                        }
                    } else {
                        cont++;
                    }
                } else {
                    cont++;
                }
            }

            System.out.println("Instancia " + h);

            if (cont != 0) {
                System.out.println("NAO");
            } else {
                System.out.println("SIM");
            }
            System.out.println();
        }
    }

    public static boolean valida(int[][] M, int x, int y) {
        int newM[] = new int[9];

        for (int i = x; i < y; i++) {
            for (int j = x; j < y; j++) {

                newM[M[i][j] - 1] = M[i][j];
            }
        }

        for (int i = 0; i < newM.length; i++) {
            if (newM[i] == 0) {
                return false;
            }
        }

        return true;
    }
}
