package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Notacao_Cientifica {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String S;
        double X;

        S = sc.next();

        X = Double.valueOf(S.substring(0, S.length()));

        if (X >= 0 && S.charAt(0) != '-') {
            System.out.print("+");
        }
        System.out.printf("%.4E\n", X);
    }
}
