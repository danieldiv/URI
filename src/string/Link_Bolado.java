package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Link_Bolado {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String str = in.readLine();

        if (str.contains("zelda")) {
            System.out.println("Link Bolado");
        } else {
            System.out.println("Link Tranquilo");
        }

    }
}
