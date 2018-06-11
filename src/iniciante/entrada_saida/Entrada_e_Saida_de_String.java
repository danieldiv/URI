package iniciante.entrada_saida;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Entrada_e_Saida_de_String {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String s1, s2, s3;
        char[] c1, c2, c3;

        s1 = in.readLine();
        s2 = in.readLine();
        s3 = in.readLine();

        c1 = s1.toCharArray();
        c2 = s2.toCharArray();
        c3 = s3.toCharArray();

        System.out.println(s1 + s2 + s3);
        System.out.println(s2 + s3 + s1);
        System.out.println(s3 + s1 + s2);

        for (int i = 0;; i++) {
            if (i >= c1.length || i == 10) {
                break;
            }
            System.out.print(c1[i]);
        }
        for (int i = 0;; i++) {
            if (i >= c2.length || i == 10) {
                break;
            }
            System.out.print(c2[i]);
        }
        for (int i = 0;; i++) {
            if (i >= c3.length || i == 10) {
                break;
            }
            System.out.print(c3[i]);
        }
        System.out.println();
    }
}
