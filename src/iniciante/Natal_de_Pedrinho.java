package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Natal_de_Pedrinho {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int M, D, aux, cont = 0;
        int m[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};//365 dias

        while (sc.hasNext()) {
            cont = 0;

            M = sc.nextInt();
            D = sc.nextInt();

            for (int i = 0; i < M - 1; i++) {
                cont += m[i];
            }

            cont += D;
            aux = 360 - cont;

            if (M > 2) {
                aux -= 1;
            }

            if (aux == 0) {
                System.out.println("E natal!");
            } else if (aux == 1) {
                System.out.println("E vespera de natal!");
            } else if (aux < 1) {
                System.out.println("Ja passou!");
            } else {
                System.out.println("Faltam " + aux + " dias para o natal!");
            }
        }
    }
}
