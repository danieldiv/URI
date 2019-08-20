package iniciante;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Jetiqui {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int C, N[];
        String Pi;
        char[] P1, P2;

        C = sc.nextInt();

        while (C > 0) {
            N = new int[2];

            P1 = sc.next().toCharArray();
            P2 = sc.next().toCharArray();
            Pi = sc.next();

            N = posicao(Pi, N);

            if (P1[N[0]] == P2[N[1]] || P1[N[1]] == P2[N[0]]) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }

            C--;
        }
    }

    public static int[] posicao(String Pi, int[] N) {
        int x = 0;

        Pattern pattern = Pattern.compile("_");
        Matcher matcher = pattern.matcher(Pi);

        while (matcher.find()) {
            N[x++] = matcher.start();
        }
        return N;
    }
}
