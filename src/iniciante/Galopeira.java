package iniciante;

import java.util.Scanner;

public class Galopeira {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c, quant;
        float q;
        String str;

        c = sc.nextInt();

        for (int i = 0; i < c; i++) {
            str = sc.next();
            q = str.length();
            q /= 100.00;

            System.out.printf("%.2f\n", q);
        }
    }
}
