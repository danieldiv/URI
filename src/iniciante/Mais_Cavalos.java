package iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mais_Cavalos {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String S[];
        char c[];
        int tab[][], aux[] = {7, 6, 5, 4, 3, 2, 1, 0}, X, Y;

        tab = new int[8][8];

        S = in.readLine().split(" ");
//        S = "a8 b4".split(" ");

        c = S[0].toCharArray();
        X = aux[Character.getNumericValue(c[1]) - 1];
        Y = (int) (c[0] - 97);

        tab[X][Y] = 2;

        movimentosValidosCav(tab, X, Y);
//        exibeTabuleiro(tab);

        c = S[1].toCharArray();
        X = aux[Character.getNumericValue(c[1]) - 1];
        Y = (int) (c[0] - 97);

        if (tab[X][Y] == 1) {
            System.out.println("VALIDO");
        } else {
            System.out.println("INVALIDO");
        }
    }

    public static void exibeTabuleiro(int[][] tab) {
        for (int[] is : tab) {
            for (int i : is) {
                System.out.print(i + "");
            }
            System.out.println();
        }
    }

    public static void movimentosValidosCav(int[][] tab, int X, int Y) {
        int aux[] = {1, 2, 2, 1}, cont = 0;

        for (int i = X - 2; i <= X + 2; i++) {
            if (i != X) {
                if (i >= 0 && i < 8) {
                    if (!((Y - (aux[cont])) < 0)) {
                        tab[i][Y - (aux[cont])] = 1;
                    }
                    if (!((Y + (aux[cont])) > 7)) {
                        tab[i][Y + (aux[cont])] = 1;
                    }
                }
                cont++;
            }
        }
    }
}
