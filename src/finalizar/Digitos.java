package finalizar;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;
import sun.util.logging.resources.logging;

public class Digitos {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

//        String res = new BigDecimal(Math.pow(100, 100)).toPlainString();
        double d = 10 * Math.log(2);
//        log( a ^ b ) = b * log( a )
        System.out.println(d);
        System.out.println();

        int C, N, M;
        String res;

        C = sc.nextInt();

        for (int i = 0; i < C; i++) {
            N = sc.nextInt();
            M = sc.nextInt();

            res = new BigDecimal(Math.pow(N, M)).toPlainString();
            System.out.println(res);
            System.out.println(res.length());
        }
    }
}
