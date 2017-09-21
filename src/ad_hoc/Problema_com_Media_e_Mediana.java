package ad_hoc;

import java.io.IOException;
import java.util.Scanner;

public class Problema_com_Media_e_Mediana {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int A, B, C;

        while (true) {
            A = sc.nextInt();
            B = sc.nextInt();

            if (A == 0 && B == 0) {
                break;
            }

            C = (2 * A) - B;
            
            System.out.println(C);
        }
    }
}
