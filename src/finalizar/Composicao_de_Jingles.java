package finalizar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Composicao_de_Jingles {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String S, str[], notas = "WHQESTX";
        char[] c;
        double valor[] = {1, 0.5, 0.25, 0.125, 0.0625, 0.03125, 0.015625}, soma;
        int quant;
        
        while (!(S = in.readLine()).equals("*")) {
            str = S.split("/");
            quant = 0;

            for (int i = 1; i < str.length; i++) {
                c = str[i].toCharArray();
                soma = 0;

                for (int j = 0; j < c.length; j++) {
                    soma += valor[notas.indexOf(String.valueOf(c[j]))];
                }

                if (soma % 1 == 0) {
                    quant++;
                }
            }

            System.out.println(quant);
        }
    }
}
