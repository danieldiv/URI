package contest.aquecimento_OBI;

import java.io.IOException;
import java.util.Scanner;

public class J_Digit_Root {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        long B, E;

        B = sc.nextLong();
        E = sc.nextLong();

        B = (long) Math.pow(B, E);

        System.out.println(digitRoot(String.valueOf(B)));
    }

    /**
     * Soma todos os digitos ate ser menor que 10
     *
     * @param S
     * @return
     */
    public static long digitRoot(String S) {
        long soma = 0;
        
        for (int i = 0; i < S.length(); i++) {
            soma += Character.getNumericValue(S.charAt(i));
        }

        if (soma < 10) {
            return soma;
        } else {
            return digitRoot(String.valueOf(soma));
        }
    }
}
