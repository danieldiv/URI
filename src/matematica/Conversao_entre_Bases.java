package matematica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conversao_entre_Bases {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        long N, cont = 0, dec = 0;
        String X, Y[], hex, bin;

        N = Long.parseLong(in.readLine());

        for (int i = 0; i < N; i++) {
            cont++;

            X = in.readLine();
            Y = X.split(" ");

            switch (Y[1]) {
                case "bin":
                    dec = Long.parseLong(Y[0], 2);
                    break;
                case "dec":
                    dec = Long.parseLong(Y[0]);
                    break;
                case "hex":
                    dec = Long.parseLong(Y[0], 16);
                    break;
            }

            hex = Integer.toHexString((int) dec);
            bin = Integer.toBinaryString((int) dec);

            System.out.println("Case " + cont + ":");

            if (Y[1].equals("bin") || Y[1].equals("hex")) {
                System.out.println(dec + " dec");
            }
            if (Y[1].equals("bin") || Y[1].equals("dec")) {
                System.out.println(hex + " hex");
            }
            if (Y[1].equals("hex") || Y[1].equals("dec")) {
                System.out.println(bin + " bin");
            }

            System.out.println();
        }
    }
}
