package iniciante.entrada_saida;

import java.io.IOException;
import java.util.Scanner;

public class Entrada_e_Saida_6 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double N;
        float t;
        int I, D;
        String S;

        while (sc.hasNext()) {
            t = sc.nextFloat();
//            N = sc.nextDouble();

            S = String.valueOf(t);
            S = S.substring(S.length() - 3, S.length());

            I = (int) t;

            System.out.println("s: " + S);
            System.out.println("i: " + I);
//            D = Integer.parseInt(S);

//            System.out.println(D + "," + I);
        }
    }
}
