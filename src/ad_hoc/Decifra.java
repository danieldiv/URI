package ad_hoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Decifra {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        char[] codigo, str;

        codigo = in.readLine().toCharArray();
        str = in.readLine().toCharArray();

        System.out.println(result(codigo, str));
    }

    public static String result(char[] codigo, char[] str) {
        Map<String, String> map = new HashMap<>();
        String res = "";
        int x = 0;

        for (int i = 97; i <= 122; i++) {
            map.put(String.valueOf(codigo[x]), String.valueOf((char) i));
            x++;
        }

        for (char c : str) {
            res += map.get(String.valueOf(c));
        }
        
        return res;
    }
}
