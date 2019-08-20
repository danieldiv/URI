package ad_hoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Overflow {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        long N;
        String str[], C;

        N = Integer.parseInt(in.readLine());

        C = in.readLine();
        str = C.replaceAll(" ", "").split("[+*]");
        C = (C.contains("+")) ? "+" : "*";

        System.out.println((result(str, C) > N) ? "OVERFLOW" : "OK");

    }

    public static long result(String[] str, String C) {
        long P, Q;

        P = Long.parseLong(str[0]);
        Q = Long.parseLong(str[1]);

        switch (C) {
            case "+":
                return P + Q;
            case "*":
                return P * Q;
            default:
                return 0;
        }
    }
}
