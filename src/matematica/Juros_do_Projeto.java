package matematica;

import java.io.IOException;
import java.util.Scanner;

public class Juros_do_Projeto {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int C = 1;
        double X, Y, R;

        while (sc.hasNext()) {
            X = sc.nextDouble();
            Y = sc.nextDouble();

            R = ((Y - X) * 100) / X;

            System.out.println("Projeto " + (C++) + ":");
            System.out.printf("Percentual dos juros da aplicacao: %.2f %%\n\n", R);
        }
    }
}
