package string;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Discagem_de_Voz {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String N, V[], regex = "[!$%&'()+,-./:;?@[\\\\]_`{|}~ ]";

        String letras[][] = {{"A", "B", "C"}, {"D", "E", "F"},
        {"G", "H", "I"}, {"J", "K", "L"}, {"M", "N", "O"}, {"P", "Q", "R", "S"},
        {"T", "U", "V"}, {"W", "X", "Y", "Z"}};

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < 8; i++) {
            for (String l : letras[i]) {
                map.put(l, i + 2);
            }
        }

        while (sc.hasNext()) {
            N = sc.nextLine();
            resutl(map, N, regex);
        }
    }

    public static void resutl(Map<String, Integer> map, String N, String regex) {
        String S = "";

        N = N.replaceAll(regex, "");

        char[] c = N.toUpperCase().toCharArray();
        for (char d : c) {
            if (map.containsKey(String.valueOf(d))) {
                S += map.get(String.valueOf(d));
            } else {
                S += d;
            }
        }
        System.out.println(S);
    }
}
