package iniciante;

import java.util.Scanner;

public class Pepe_ja_tirei_a_vela {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, h, m, o;

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            h = sc.nextShort();
            m = sc.nextShort();
            o = sc.nextShort();

            if (h < 10) {
                System.out.print("0");
            }
            System.out.print(h + ":");

            if (m < 10) {
                System.out.print("0");
            }
            System.out.print(m + " - ");

            if (o == 1) {
                System.out.println("A porta abriu!");
            } else {
                System.out.println("A porta fechou!");
            }
        }
    }
}
