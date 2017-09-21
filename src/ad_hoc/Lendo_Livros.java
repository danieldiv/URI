package ad_hoc;

import java.io.IOException;
import java.util.Scanner;

public class Lendo_Livros {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int Q, D, P, R;

        while (true) {
            Q = sc.nextInt(); if (Q == 0) { break; }
            D = sc.nextInt(); if (D == 0) { break; }
            P = sc.nextInt(); if (P == 0) { break; }

            if (Q == 0 && D == 0 && P == 0) {
                break;
            }

            R = (Q * D * P) / (P - Q);

            

            if (R != 1) {
                System.out.println(R + " paginas");
            } else {
                System.out.println(R + " pagina");
            }
        }

    }
}
