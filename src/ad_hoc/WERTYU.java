package ad_hoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WERTYU {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String str;
        char[] C = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./".toCharArray();

        while ((str = in.readLine()) != null) {
            for (int i = 1; i < C.length; i++) {

                if (C[i] != 'Q' && C[i] != 'A' && C[i] != 'Z') {
                    str = str.replace(C[i], C[i - 1]);
                }
            }
            System.out.println(str);
        }

    }
}
