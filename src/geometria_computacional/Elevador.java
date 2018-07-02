package geometria_computacional;

import java.io.IOException;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Elevador {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int L, C, R1, R2, soma;
        int Diagonal, Rec;

        while (true) {
            L = sc.nextInt();
            C = sc.nextInt();
            R1 = sc.nextInt();
            R2 = sc.nextInt();

            if (L == 0 && C == 0 && R1 == 0 && R2 == 0) {
                break;
            }

            soma = (R1 * 2) + (R2 * 2);
            Rec = (int) (pow(L, 2) + pow(C, 2));
            Diagonal = (int) sqrt(Rec);

            if ((soma < (Diagonal - 1) && ((R1 * 2)) <= L && (R1 * 2) <= C) && ((R2 * 2) <= L && (R2 * 2) <= C)) {
                System.out.println("S");
            } else {
                System.out.println("N");
            }
        }
    }
}
