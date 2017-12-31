package matematica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conversao_Simples_de_Base {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        Long dec;
        String X, sub;

        while (true) {
            X = in.readLine();

            if (X.substring(0, 1).equals("-")) {
                break;
            } else if (X.length() > 2) {
                sub = X.substring(0, 2);

                if (sub.equals("0x")) {
                    sub = X.substring(2, X.length());

                    System.out.println(Long.parseLong(sub, 16));
                } else {
                    System.out.println("0x" + Integer.toHexString(Integer.parseInt(X)).toUpperCase());
                }
            } else {
                System.out.println("0x" + Integer.toHexString(Integer.parseInt(X)).toUpperCase());
            }

        }
    }
}
