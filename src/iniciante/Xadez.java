package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Xadez {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int L, C;

        L = sc.nextInt();
        C = sc.nextInt();

        if (L % 2 == 1 && C % 2 == 0) {
            System.out.println("0");
        } else if (L % 2 == 0 && C % 2 == 1) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }

    }
}
