package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Mensagem_Oculta {
    
    public static void main(String[] args) throws IOException {
        
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        
        int N;
        N = Integer.parseInt(in.readLine());
        String str, newStr[], V;
        
        for (int i = 0; i < N; i++) {
            str = in.readLine();
            V = "";
            
            newStr = str.split(" ");
            
            for (String s : newStr) {
                if (!s.equals("")) {
                    V += s.charAt(0);
                }
            }
            
            System.out.println(V);
        }
        
    }
}
