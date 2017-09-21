package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rot13 {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String str, newStr;
        int p;

        while ((str = in.readLine()) != null) {
            newStr = "";

            for (int i = 0; i < str.length(); i++) {
                p = (int) str.charAt((i));

                if (p >= 97 && p <= 122) {
                    if ((p + 13) > 122) {
                        System.out.print((char) (p - 13));
                    } else {
                        System.out.print((char) (p + 13));
                    }
                } else if (p >= 65 && p <= 90) {
                    if ((p + 13) > 90) {
                        System.out.print((char) (p - 13));
                    } else {
                        System.out.print((char) (p + 13));
                    }
                } else {
                    System.out.print((char) p);
                }

            }
            System.out.println();
        }
    }
}
