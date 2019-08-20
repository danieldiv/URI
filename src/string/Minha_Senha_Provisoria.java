package string;

import java.io.IOException;
import java.util.Scanner;

public class Minha_Senha_Provisoria {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N;
        String str;

        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            str = sc.next();
            
            System.out.println(result(str));
        }
    }

    public static String result(String str) {
        String RA[] = str.split("RA");

        if (RA.length == 1 || str.length() < 20) {
            return "INVALID DATA";
        } else {
            return RA[1].replaceFirst("0*", "");
        }
    }
}
