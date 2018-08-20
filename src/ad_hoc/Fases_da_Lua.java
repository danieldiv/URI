package ad_hoc;

import java.io.IOException;
import java.util.Scanner;

public class Fases_da_Lua {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int A, B;

        A = sc.nextInt();
        B = sc.nextInt();

        if (A < B) {
            if (B <= 2) {
                System.out.println("nova");
            } else if (B <= 96) {
                System.out.println("crescente");
            } else if (B <= 100) {
                System.out.println("cheia");
            }
        } else if (B <= 2) {
            System.out.println("nova");
        } else if (B <= 96) {
            System.out.println("minguante");
        } else {
            System.out.println("cheia");
        }
    }
}
