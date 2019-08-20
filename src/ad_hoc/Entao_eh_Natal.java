package ad_hoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Entao_eh_Natal {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int I;
        String str = "";

        I = Integer.parseInt(in.readLine());

        for (int i = 0; i < I; i++) {
            str += "a";
        }

        System.out.println("Ent" + str + "o eh N" + str + "t" + str + "l!");
    }
}
