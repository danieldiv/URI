package ad_hoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Digitos_Diferentes {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String N, M, C[];

        while ((N = in.readLine()) != null && (M = in.readLine()) != null) {
            C = new String[Integer.valueOf(M + 1)];

            for (int i = Integer.valueOf(N); i <= Integer.valueOf(M); i++) {
                C[i] = String.valueOf(i);
            }

            System.out.println(Arrays.toString(C));

            for (String c : C) {
                if (c != null) {
                    System.out.println("c: " + c);
                    char[] c1 = c.toCharArray();
                    char c2[] = new char[9];
                    for (int j = 0; j < 9; j++) {
//                        if(c1[j]=='')
                    }
                    for (char d : c2) {
                        System.out.println(" " + d);
                    }
                }
            }

            break;

//            for (String c : C) {
//                if (c != null) {
//                    System.out.print(c + " ");
//                }
//            }
        }
    }

    public static int valida(String[] str, int x, int y) {

        return 0;
    }
}
