package string;

import java.io.IOException;
import java.util.Scanner;

public class Bacteria_I {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String R, S;

        while (sc.hasNext()) {
            R = sc.next();
            S = sc.next();

            System.out.println((R.contains(S)) ? "Resistente" : "Nao resistente");
        }
    }
}
