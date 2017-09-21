package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Jogatina_UFPR {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N,I, i, j, cont;
        
        while (sc.hasNext()) {
            cont = 0;
            
            while ((N = sc.nextInt()) < 1 || N > 10000) {}
            while ((I = sc.nextInt()) < 1000 || N > 9999) {}
            
            for (int k = 0; k < N; k++) {
                while ((i = sc.nextInt()) < 1000 || i > 9999) {}
                while ((j = sc.nextShort()) < 0 || j > 1) {}
                
                if (i == I && j == 0) {
                    cont++;
                }
            }
            
            System.out.println(cont);
        }
    }
}
