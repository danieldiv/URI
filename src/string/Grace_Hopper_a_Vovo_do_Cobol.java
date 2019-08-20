package string;

import java.io.IOException;
import java.util.Scanner;

public class Grace_Hopper_a_Vovo_do_Cobol {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String[] S;
        char[] regex = {'C', 'O', 'B', 'O', 'L'};
        int cont;

        while (sc.hasNext()) {
            S = sc.nextLine().toUpperCase().split("-");
            cont = 0;

            for (int i = 0; i < regex.length; i++) {
                if (S[i].charAt(0) == regex[i] || S[i].charAt(S[i].length() - 1) == regex[i]) {
                    cont++;
                } else {
                    break;
                }
            }

            if (cont != 5) {
                System.out.println("BUG");
            } else {
                System.out.println("GRACE HOPPER");
            }
        }
    }
}
