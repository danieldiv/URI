package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class C_Mais_ou_Menos {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int T, soma;

        String[] V = {" suco de laranja", " morango fresco", " mamao",
            " goiaba vermelha", " manga", " laranja", " brocolis"};

        int[] quantVC = {120, 85, 85, 70, 56, 50, 34};

        while ((T = sc.nextInt()) != 0) {
            
            System.out.println(T);

            String[][] N = new String[T][2];

            for (int i = 0; i < T; i++) {
                N[i][0] = sc.nextLine();
                N[i][1] = sc.nextLine();
            }
            
            for (String[] s : N) {
                System.out.println(s);
            }

            soma = 0;
            for (int i = 0; i < T; i++) {
                for (int j = 0; j < V.length; j++) {
                    if (N[i][1].equals(V[j])) {
                        soma += Integer.parseInt(N[i][0]) * quantVC[j];
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
