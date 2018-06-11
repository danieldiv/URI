package string;

import java.io.IOException;
import java.util.Scanner;

//terminar
public class Arredondamento_por_Valor_de_Corte {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String num, cutoff;
        String n[], co[];

        while (sc.hasNext()) {
            num = sc.next();
            cutoff = sc.next();

            n = num.split("\\.");
            co = cutoff.split("\\.");

            if (n[0].isEmpty()) {
                n[0] = "0";
            }

            if (n.length == 1) {
                System.out.println(n[0]);
            } else if (Integer.parseInt(n[1]) < Integer.parseInt(co[1])) {
                System.out.println(Integer.parseInt(n[0]));
            } else {
                System.out.println(Integer.parseInt(n[0]) + 1);
            }

        }
    }
}
