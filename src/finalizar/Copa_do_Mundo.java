package finalizar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Copa_do_Mundo {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int T, N;
        String S[];

        while (true) {
            //<editor-fold defaultstate="collapsed" desc="Entrada de dados">
            while ((T = Integer.parseInt(in.readLine())) > 2 && T > 200) {
            }
            
            System.out.println("s");
            
            if (T == 0) {
                break;
            }
            
            while ((N = Integer.parseInt(in.readLine())) >= 0 && N <= 10000) {
            }
            
            S = new String[T];
//</editor-fold>

            for (int i = 0; i < S.length; i++) {
                S[i] = in.readLine();
            }
            
            System.out.println(Arrays.toString(S));

        }
    }
}
