package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Tamanho_da_Placa {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int X, Y, M, x1, y1;
        String res;

        while (sc.hasNext()) {
            X = sc.nextInt();
            Y = sc.nextInt();
            M = sc.nextInt();

            for (int i = 0; i < M; i++) {
                x1 = sc.nextInt();
                y1 = sc.nextInt();

                if (x1 <= X && y1 <= Y) {
                    System.out.println("Sim");
                } else if (x1 <= Y && y1 <= X) {
                    System.out.println("Sim");
                } else {
                    System.out.println("Nao");
                }

            }
        }
    }
}
