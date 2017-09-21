package contest;

import java.io.IOException;
import java.util.Scanner;

public class Sucessor_Par {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int X;

        while ((X = sc.nextInt()) < 0 || X > 10000000) {
        }

        if ((X + 1) % 2 == 0) {
            System.out.println(X + 1);
        } else {
            System.out.println(X + 2);
        }

    }
}
