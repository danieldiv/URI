package iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
/**
 * Padrao
 *
 * SOS : ...---... S : ... O : ---

 Substituido por

 . : =
 - : ===

 Símbolos são separados por "." letras são separadas por "..." palavras são
 separadas por "......."

 SOS : =.=.=...===.===.===...=.=.=

 S : =.=.= O : ===.===.===

 Texto_to_Morse

 A : .- | B : -... | C : -.-. | D : -.. | E : . | F : ..-. | G : --. | H :
 .... | I : .. | J : .--- | K : -.- | L : .-.. | M : -- | N : -. | O : --- | P
 : .--. | Q : --.- | R : .-. | S : ... | T : - | U : ..- | V : ...- | W : .--
 | X : -..- | Y : -.-- | Z : --.. |
 */
public class Texto_to_Morse {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int t, k, j, l;
        String str, newMorse;
        char cStr[], cMor[];
        boolean controle = false;

        //alfabeto
        char[] az = "abcdefghijklmnopqrstuvwxyz ".toCharArray();

        //codigo morse de a-z
        String morse[] = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", " "};

        //simbolos codigo morse
        char simbMorse[] = ".- ".toCharArray();

        //novo simbolos codigo morse
        String newSimbMorse[] = {"=", "===", "."};

        while ((t = sc.nextShort()) < 1 || t > 10) {
        }

        for (int i = 0; i < t; i++) {
            newMorse = "";

            while ((str = sc2.nextLine()).length() > 1000) {
            }

            cStr = str.toCharArray();

            String newStr[] = new String[cStr.length];

            for (j = 0; j < cStr.length; j++) {
                for (k = 0; k < az.length; k++) {
                    if (cStr[j] == az[k]) {
                        newStr[j] = morse[k];
                        break;
                    } else if (cStr[j] == ' ') {
                        newStr[j] = " ";
                    }
                }
            }

            for (j = 0; j < newStr.length; j++) {
                cMor = newStr[j].toCharArray();

                for (k = 0; k < cMor.length; k++) {
                    for (l = 0; l < simbMorse.length; l++) {
                        if (cMor[k] == simbMorse[l]) {
                            newMorse += newSimbMorse[l];

                            if (k < (cMor.length) - 1) {
                                newMorse += ".";
                                break;
                            }
                        }
                    }
                }

                if (j < (newStr.length) - 1) {
                    newMorse += "...";
                }

            }
            for (String string : newStr) {
                System.out.printf(string);
            }
            System.out.println();

            System.out.println(newMorse);
        }
    }
}
