package iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I_am_Toorg {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int n;
        String ask;

        n = Integer.parseInt(in.readLine());

        for (int i = 0; i < n; i++) {
            ask = in.readLine();

            System.out.println("I am Toorg!");
        }
    }
}
