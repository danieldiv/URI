package iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Batmain {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        
        int T;
        String N;
        
        T = Integer.parseInt(in.readLine());
        
        for (int i = 0; i < T; i++) {
            N = in.readLine();
            
            System.out.println("Y");
        }

    }
}
