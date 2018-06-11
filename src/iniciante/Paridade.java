package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Paridade {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String S, str;

        S = sc.next();
        str = S;

        S = S.replace("0", "");
        str += (S.length() % 2 == 0 ? "0" : "1");

        System.out.println(str);
    }
}
