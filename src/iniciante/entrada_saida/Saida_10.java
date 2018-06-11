package iniciante.entrada_saida;

import java.io.IOException;

public class Saida_10 {

    public static void main(String[] args) throws IOException {
        String[][] c = new String[9][12];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 12; j++) {
                if (i == 0 && j == 7) {
                    c[i][j] = "A";
                    break;
                } else if (i == 1 && (j == 6 || j == 8)) {
                    c[i][j] = "B";
                    if (j == 8) {
                        break;
                    }
                } else if (i == 2 && (j == 5 || j == 9)) {
                    c[i][j] = "C";
                    if (j == 9) {
                        break;
                    }
                } else if (i == 3 && (j == 4 || j == 10)) {
                    c[i][j] = "D";
                    if (j == 10) {
                        break;
                    }
                } else if (i == 4 && (j == 3 || j == 11)) {
                    c[i][j] = "E";
                } else if (i == 5 && (j == 4 || j == 10)) {
                    c[i][j] = "D";
                    if (j == 10) {
                        break;
                    }
                } else if (i == 6 && (j == 5 || j == 9)) {
                    c[i][j] = "C";
                    if (j == 9) {
                        break;
                    }
                } else if (i == 7 && (j == 6 || j == 8)) {
                    c[i][j] = "B";
                    if (j == 8) {
                        break;
                    }
                } else if (i == 8 && j == 7) {
                    c[i][j] = "A";
                    break;
                } else {
                    c[i][j] = " ";
                }
            }
        }

        for (String[] cs : c) {
            for (String d : cs) {
                if (d == null) {
                    break;
                } else {
                    System.out.print(d);
                }
            }
            System.out.println();
        }
    }
}
