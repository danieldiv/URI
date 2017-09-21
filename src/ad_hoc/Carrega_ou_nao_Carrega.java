package ad_hoc;

import java.io.IOException;
import java.util.Scanner;

public class Carrega_ou_nao_Carrega {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        long a, b;

        while (sc.hasNext()) {
            a = sc.nextLong();
            b = sc.nextLong();

            System.out.println(Long.parseUnsignedLong(Long.toBinaryString(a ^ b), 2));
        }
    }
}
