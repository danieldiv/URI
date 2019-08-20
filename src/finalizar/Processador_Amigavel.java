package finalizar;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Processador_Amigavel {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String n, regex = "\\D";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;

        while (sc.hasNext()) {
            n = sc.nextLine();

            if (n.isEmpty()) {
                System.out.println("error");
            } else {
                n = substituicao(n);
                matcher = pattern.matcher(n);
                System.out.println(result(matcher, n) ? Long.parseLong(n) : "error");
            }
        }

    }

    public static String substituicao(String n) {
        n = n.replaceAll("[, ]", "");
        n = n.replaceAll("[O|o]", "0");
        n = n.replaceAll("l", "1");

        if (!n.isEmpty()) {
            n = n.replaceFirst("0*", "");

            if (n.isEmpty()) {
                n = "0";
            }
        }

        return n;
    }

    public static boolean result(Matcher matcher, String n) {
        while (matcher.find()) {
            return false;
        }

        return !(n.isEmpty() || n.length() > 10 || Long.parseLong(n) > 2147483647);
    }
}
