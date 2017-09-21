package iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C_Mais_ou_Menos {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int T, soma;

        String[] V = {"suco de laranja", "morango fresco", "mamao",
            "goiaba vermelha", "manga", "laranja", "brocolis"};

        int[] quantVC = {120, 85, 85, 70, 56, 50, 34};

        while (true) {
            T = Integer.parseInt(in.readLine());

            if (T == 0) {
                break;
            }

            String[][] N = new String[T][2];

            for (int i = 0; i < T; i++) {
                N[i][0] = in.readLine();
                N[i][1] = in.readLine();
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
