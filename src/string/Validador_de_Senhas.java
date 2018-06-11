package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Validador_de_Senhas {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String str, abc = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

        while ((str = in.readLine()) != null) {
            if (validador(str, abc)) {
                System.out.println("Senha valida.");
            } else {
                System.out.println("Senha invalida.");
            }
        }

    }

    public static boolean validador(String str, String abc) {
        int cont = 0;

        if (str.length() < 6 || str.length() > 32) {
            return false;
        } else {
            for (int i = 0; i < str.length(); i++) {

                if (!abc.contains(str.substring(i, i + 1))) {
                    return false;
                }
            }

            for (int i = 0; i < abc.length();) {

                if (str.contains(abc.substring(i, i + 1))) {

                    if (i < 25) {
                        i = 25;
                    } else if (i < 50) {
                        i = 50;
                    } else if (i < 75) {
                        i = 75;
                    } else {
                        i++;
                    }

                    cont++;
                    if (cont == 3) {
                        break;
                    }
                } else {
                    i++;
                }
            }
            return cont == 3;
        }
    }
}
