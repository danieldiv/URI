package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Enigma {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String cifra, crib;
        int tam, cont = 0;

        cifra = in.readLine();
        crib = in.readLine();
        tam = (cifra.length() - crib.length()) + 1;

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < crib.length(); j++) {
                if ((crib.charAt(j)) == (cifra.charAt(j + i))) {
                    cont++;
                    break;
                }
            }
        }

        System.out.println(tam - cont);
    }
}
