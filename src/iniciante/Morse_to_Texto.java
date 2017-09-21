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
 *
 * Substituido por
 *
 * . : =
 * - : ===
 *
 * Símbolos são separados por "." letras são separadas por "..." palavras são
 * separadas por "......."
 *
 * SOS : =.=.=...===.===.===...=.=.=
 *
 * S : =.=.= O : ===.===.===
 *
 * Morse
 *
 * A : .- | B : -... | C : -.-. | D : -.. | E : . | F : ..-. | G : --. | H :
 * .... | I : .. | J : .--- | K : -.- | L : .-.. | M : -- | N : -. | O : --- | P
 * : .--. | Q : --.- | R : .-. | S : ... | T : - | U : ..- | V : ...- | W : .--
 * | X : -..- | Y : -.-- | Z : --.. |
 */
public class Morse_to_Texto {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int t;
        String str;

        String morse[] = {
            "-...", "b", "-.-.", "c", "..-.", "f", "....", "h", ".---", "j",
            ".-..", "l", ".--.", "p", "--.-", "q", "...-", "v", "-..-", "x",
            "-.--", "y", "--..", "z",
            "-..", "d", "--.", "g", "-.-", "k", "---", "o",
            ".-.", "r", "...", "s", "..-", "u", ".--", "w",
            ".-", "a", "..", "i", "--", "m", "-.", "n",
            ".", "e", "-", "t",
            " ", " "};
        

        while ((t = sc.nextShort()) < 1 || t > 10) {
        }

        for (int i = 0; i < t; i++) {

            while ((str = sc2.nextLine()).length() > 1000) {
            }

            str = str.replace(".......", "*");
            str = str.replace("...", "#");
            str = str.replace(".", "@");
            str = str.replace("===", "-");
            str = str.replace("=", ".");
            str = str.replace("@", "");
            str = str.replace("*", " ");
            str = str.replace("#", "][");

            for (int j = 0; j < morse.length - 2; j += 2) {
                str = str.replace(morse[j], morse[j + 1]);
            }

            str = str.replace("]", "");
            str = str.replace("[", "");

            System.out.println(str);

        }
    }
}
