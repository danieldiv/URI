package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Piso_da_Escola {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int L, C;

        L = sc.nextInt();
        C = sc.nextInt();

        System.out.println((L * C) + ((L - 1) * (C - 1)));
        System.out.println((L + C - 2) * 2);
    }
}
