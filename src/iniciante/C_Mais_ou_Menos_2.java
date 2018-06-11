package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class C_Mais_ou_Menos_2 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int T, N, soma;
        String A;

        String[] V = {" suco de laranja", " morango fresco", " mamao", " goiaba vermelha", " manga", " laranja", " brocolis"};
        int[] quantVC = {120, 85, 85, 70, 56, 50, 34};

        while ((T = sc.nextInt()) != 0) {
            soma = 0;

            for (int i = 0; i < T; i++) {
                N = sc.nextInt();
                A = sc.nextLine();

                for (int j = 0; j < V.length; j++) {
                    if (A.equals(V[j])) {
                        soma += N * quantVC[j];
                    }
                }

            }

            if (soma >= 110 && soma <= 130) {
                System.out.println(soma + " mg");
            } else if (soma > 130) {
                System.out.println("Menos " + (soma - 130) + " mg");
            } else if (soma < 110) {
                System.out.println("Mais " + (110 - soma) + " mg");
            }
        }
    }

}
