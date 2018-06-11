package iniciante.entrada_saida;

import java.io.IOException;
import java.util.Scanner;

public class Entrada_e_Saida_CPF {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String cpf;

        cpf = sc.next();

        String[] parts = cpf.split("[\\W]");

        for (String part : parts) {
            System.out.println(part);
        }
    }
}
