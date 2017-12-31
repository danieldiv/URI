package iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

public class Morse {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int t;
        String str;

        String morse[] = {
            "-...", "b", "-.-.", "c", "..-.", "f", "....", "h", ".---", "j",
            ".-..", "l", ".--.", "p", "--.-", "q", "...-", "v", "-..-", "x",
            "-.--", "y", "--..", "z", "-..", "d", "--.", "g", "-.-", "k",
            "---", "o", ".-.", "r", "...", "s", "..-", "u", ".--", "w",
            ".-", "a", "..", "i", "--", "m", "-.", "n", ".", "e", "-", "t",
            " ", " "};

        t = Integer.parseInt(in.readLine());

        for (int i = 0; i < t; i++) {
            str = in.readLine();

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
