package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Atalhos_Bloggo {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String str;
        char c[], res[];
        int aux, aux2;

        while ((str = in.readLine()) != null) {
            aux = aux2 = 0;

            c = str.toCharArray();
            res = new char[c.length];

            for (int i = 0; i < c.length; i++) {
                if (c[i] == '_' && aux == 0) {
                    res[i] = '@';
                    aux = 1;
                } else if (c[i] == '_' && aux == 1) {
                    res[i] = '#';
                    aux = 0;
                } else if (c[i] == '*' && aux2 == 0) {
                    res[i] = '&';
                    aux2 = 1;
                } else if (c[i] == '*' && aux2 == 1) {
                    res[i] = '%';
                    aux2 = 0;
                } else {
                    res[i] = c[i];
                }
            }

            str = String.valueOf(res);

            str = str.replace("@", "<i>");
            str = str.replace("#", "</i>");

            str = str.replace("&", "<b>");
            str = str.replace("%", "</b>");

            System.out.println(str);
        }
    }
}
