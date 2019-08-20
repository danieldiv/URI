package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Inseto {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int C, N;

        C = sc.nextInt();

        for (int i = 0; i < C; i++) {
            System.out.println(((N = sc.nextInt()) <= 8000) ? "Inseto!" : "Mais de 8000!");
        }
    }
}
