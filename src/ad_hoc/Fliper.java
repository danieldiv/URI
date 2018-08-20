package ad_hoc;

import java.io.IOException;
import java.util.Scanner;

//ad-hoc
public class Fliper {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int P, R;

        P = sc.nextInt();
        R = sc.nextInt();

        if (P == 0) {
            System.out.println("C");
        } else if (R == 0) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }
    }
}
