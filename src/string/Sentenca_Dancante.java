package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sentenca_Dancante {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String str, newStr;
        boolean b;

        while ((str = in.readLine()) != null) {
            newStr = "";
            b = true;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ') {
                    if (b) {
                        newStr += String.valueOf(str.toUpperCase().charAt(i));
                        b = false;
                    } else {
                        newStr += String.valueOf(str.toLowerCase().charAt(i));
                        b = true;
                    }
                } else {
                    newStr += " ";
                }
            }
            System.out.println(newStr);
        }
    }
}
