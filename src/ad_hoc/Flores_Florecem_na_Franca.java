package ad_hoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Flores_Florecem_na_Franca {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String str = "";
        String[] array;
        char c;
        int cont;

        while (!(str = in.readLine()).equals("*")) {
            cont = 0;

            str = str.toLowerCase();

            array = str.split(" ");
            c = str.charAt(0);

            for (String s : array) {
                if (s.charAt(0) == c) {
                    cont++;
                }
            }

            if (cont == array.length) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }

    }
}
