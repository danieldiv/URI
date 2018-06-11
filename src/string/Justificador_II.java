package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//terminar
public class Justificador_II {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int N;
        String str[], t[];

        while ((N = Integer.parseInt(in.readLine())) != 0) {
            str = new String[N];

            for (int i = 0; i < N; i++) {
                str[i] = in.readLine();

                t = str[i].split(" ");

                System.out.println(i + " " + Arrays.toString(t));
            }

        }
    }
}
