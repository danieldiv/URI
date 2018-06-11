package iniciante.entrada_saida;

import java.io.IOException;
import java.util.Scanner;

public class Entrada_e_Saida_de_Caracter {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        char a, b, c;

        a = sc.next().charAt(0);
        b = sc.next().charAt(0);
        c = sc.next().charAt(0);

        System.out.println("A = " + a + ", " + "B = " + b + ", " + "C = " + c);
        System.out.println("A = " + b + ", " + "B = " + c + ", " + "C = " + a);
        System.out.println("A = " + c + ", " + "B = " + a + ", " + "C = " + b);

    }
}
