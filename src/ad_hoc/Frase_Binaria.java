package ad_hoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Frase_Binaria {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String str, binario, res;
        int N, dec;
        char c;

        while ((str = in.readLine()) != null) {
            N = Integer.parseInt(str);
            res = "";

            for (int i = 0; i < N; i++) {
                binario = in.readLine();
                dec = Integer.parseInt(binario, 2);
                c = (char) dec;

                res += c;
            }
            System.out.println(res);
        }
    }
}
