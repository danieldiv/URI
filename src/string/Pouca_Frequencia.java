package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//String
public class Pouca_Frequencia {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String[] aluno, presenca;
        String result;
        float[] valor;
        boolean b;

        int T, N;

        T = Integer.valueOf(in.readLine());

        for (int i = 0; i < T; i++) {
            N = Integer.valueOf(in.readLine());

            if (N != 0) {
                aluno = in.readLine().split(" ");
                presenca = in.readLine().split(" ");

                valor = percentual(presenca);

                result = "";
                b = false;

                for (int j = 0; j < valor.length; j++) {
                    if (valor[j] < 0.75) {
                        if (b) {
                            result += " ";
                        } else {
                            b = true;
                        }
                        result += aluno[j];
                    }
                }
                System.out.println(result);
            } else {
                System.out.println();
            }
        }
    }

    public static float[] percentual(String[] str) {
        float res[], P, A, M;
        char[] presenca;
        int x;

        x = 0;
        res = new float[str.length];

        for (String s : str) {
            presenca = s.toCharArray();
            P = A = M = 0;

            for (char c : presenca) {
                switch (c) {
                    case 'P':
                        P++;
                        break;
                    case 'A':
                        A++;
                        break;
                    case 'M':
                        M++;
                        break;
                }
            }

            if (M == presenca.length) {
                res[x] = 1;
            } else {
                res[x] = P / (P + A);
            }
            x++;
        }
        return res;
    }
}
