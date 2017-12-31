package iniciante;

import java.io.IOException;
import java.util.Scanner;
 
public class Sucessor_Par {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
    
        int N;
        
        N = sc.nextInt();
        
        if ((N + 1) % 2 == 0) {
            System.out.println(N + 1);
        } else {
            System.out.println(N + 2);
        }
    
    }
 
}