package string;

import java.io.IOException;
import java.util.Scanner;

public class Bacteria_II {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N;
        String bac[], virus;

        N = sc.nextInt();
        bac = new String[N];

        for (int i = 0; i < N; i++) {
            bac[i] = sc.next();
        }
        
        virus = sc.next();
        DNA_Resultante(bac, virus);

    }

    public static void DNA_Resultante(String[] bac, String virus) {
        int menor = 1000, x = 0, cont = 0;
        String v = "";

        for (int i = 0; i < bac.length; i++) {
            while (bac[i].contains(virus)) {
                bac[i] = bac[i].replaceFirst(virus, "");
            }

            if (bac[i].length() < menor) {
                menor = bac[i].length();
                v = bac[i];
                x = i;
            }
        }

        while (v.length() > 1) {
            for (int i = 0; i < bac.length; i++) {
                if (i != x) {
                    if (bac[i].contains(v)) {
                        cont++;
                    }
                }
            }
            if (cont == bac.length - 1) {
                System.out.println(v);
                break;
            } else {
                v = v.substring(0, v.length() - 1);
            }
        }
    }
}
