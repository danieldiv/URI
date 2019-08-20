package string;

import java.io.IOException;
import java.util.Scanner;

public class Vogais_Alienigenas {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String str, V, regex;
        int cont;

        while (sc.hasNext()) {
            V = sc.nextLine();
            str = sc.nextLine();

            regex = "[" + V + "]";
            cont = str.length();
            str = str.replaceAll(regex, "");
            cont -= str.length();

            System.out.println(cont);
        }
    }
}
