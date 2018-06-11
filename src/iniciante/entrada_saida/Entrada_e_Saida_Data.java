package iniciante.entrada_saida;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Entrada_e_Saida_Data {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String data;

        data = in.readLine();
        String[] parts = data.split("[\\W]");

        System.out.println(parts[1] + "/" + parts[0] + "/" + parts[2]);

        for (int i = parts.length - 1; i >= 0; i--) {
            System.out.print(parts[i]);
            if (i != 0) {
                System.out.print("/");
            }
        }
        System.out.println();

        for (int i = 0; i < parts.length; i++) {
            System.out.print(parts[i]);
            if (i != 2) {
                System.out.print("-");
            }
        }
        System.out.println();
    }
}
