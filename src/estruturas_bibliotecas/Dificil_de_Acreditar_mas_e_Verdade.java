package estruturas_bibliotecas;

import java.io.IOException;
import java.util.Scanner;

public class Dificil_de_Acreditar_mas_e_Verdade {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String S[];

        while (sc.hasNext()) {
            S = sc.next().split("\\W");

            for (int i = 0; i < S.length; i++) {
                S[i] = new StringBuilder(S[i]).reverse().toString();
            }

            if (Integer.parseInt(S[0]) + Integer.parseInt(S[1]) == Integer.parseInt(S[2])) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
}
