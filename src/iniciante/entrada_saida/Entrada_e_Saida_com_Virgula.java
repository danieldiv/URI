package iniciante.entrada_saida;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Entrada_e_Saida_com_Virgula {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String texto;

        texto = in.readLine();
        String[] t = texto.split(",");

        for (int i = 0; i < 2; i++) {
            System.out.println(t[i]);
        }

    }
}
