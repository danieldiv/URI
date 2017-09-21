package string;

import java.io.IOException;
import java.util.Scanner;

public class Revisao_de_Contrato {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String D, N;

        while (true) {
            D = sc.next();
            N = sc.next();

            if (D.equals("0") && N.equals("0")) {
                break;
            }

            N = N.replace(D, "");
            N = N.replaceFirst("0*", "");

            if (N.isEmpty()) {
                N = "0";
            }

            System.out.println(N);
        }
    }
}
