package string;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class R_L_J {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String str, S[], letras[] = {"R", "L", "J"};
        int x, i, p;

        Pattern pattern;
        Matcher matcher;

        while (sc.hasNext()) {
            str = sc.next();

            pattern = Pattern.compile("[//+//=]");
            matcher = pattern.matcher(str);

            S = new String[3];
            x = i = 0;

            while (matcher.find()) {
                S[i] = str.substring(x, matcher.start());
                x = (matcher.start() + 1);

                i++;
            }
            S[i] = str.substring(x, str.length());

            p = posicao(letras, S);
            System.out.println(result(p, S));
        }
    }

    public static int result(int posicao, String S[]) {
        switch (posicao) {
            case 0:
                return Integer.parseInt(S[2]) - Integer.parseInt(S[1]);
            case 1:
                return Integer.parseInt(S[2]) - Integer.parseInt(S[0]);
            case 2:
                return Integer.parseInt(S[0]) + Integer.parseInt(S[1]);
            default:
                return 0;
        }
    }

    public static int posicao(String letras[], String S[]) {
        for (String letra : letras) {
            for (int j = 0; j < S.length; j++) {
                if (S[j].equals(letra)) {
                    return j;
                }
            }
        }
        return 0;
    }
}
