package iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Jogo_do_Operador {

    static String[] val_1, val_2;

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String T;
        String[][] EN;

        while ((T = in.readLine()) != null) {
            EN = new String[Integer.valueOf(T)][2];
            val_1 = new String[Integer.valueOf(T)];
            val_2 = new String[Integer.valueOf(T)];

            for (int j = 0; j < 2; j++) {
                for (int i = 0; i < Integer.valueOf(T); i++) {
                    EN[i][j] = in.readLine();

                    if (j == 0) {
                        val_1[i] = validate(EN[i][j], j);
                    } else {
                        val_2[i] = validate(EN[i][j], j);
                    }
                }
            }
            if (result() == 0) {
                System.out.println("You Shall All Pass!");
            } else if (result() == val_1.length) {
                System.out.println("None Shall Pass!");
            } else {
                Arrays.sort(val_2);

                for (int i = 0; i < val_2.length; i++) {
                    if (!val_2[i].equals("")) {
                        System.out.print(val_2[i]);

                        if (i < (val_2.length - 1)) {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }

        }
    }

    public static int result() {
        int cont = 0;

        for (String v1 : val_2) {
            if (v1.equals("")) {
                cont++;
            }
        }
        return cont;
    }

    public static String validate(String str, int j) {
        String[] B = str.split("[= ]");

        if (j == 0) {
            int[] V = new int[B.length];

            for (int i = 0; i < V.length; i++) {
                V[i] = Integer.parseInt(B[i]);
            }

            if ((V[0] + V[1]) == V[2]) {
                return "+";
            } else if ((V[0] - V[1]) == V[2]) {
                return "-";
            } else if ((V[0] * V[1]) == V[2]) {
                return "*";
            } else {
                return "I";
            }
        } else {
            int P = Integer.parseInt(B[1]);

            if (!B[2].equals(val_1[P - 1])) {
                return B[0];
            } else {
                return "";
            }
        }
    }
}
