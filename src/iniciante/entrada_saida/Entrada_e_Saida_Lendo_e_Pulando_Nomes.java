package iniciante.entrada_saida;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Entrada_e_Saida_Lendo_e_Pulando_Nomes {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String[] nome;

        nome = new String[10];

        for (int i = 0; i < nome.length; i++) {
            nome[i] = in.readLine();
        }
        
        System.out.println(nome[2]);
        System.out.println(nome[6]);
        System.out.println(nome[8]);

    }
}
