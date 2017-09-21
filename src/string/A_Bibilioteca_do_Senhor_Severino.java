package string;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class A_Bibilioteca_do_Senhor_Severino {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N;
        String C[];

        while (sc.hasNext()) {
            N = sc.nextInt();
            C = new String[N];

            for (int i = 0; i < N; i++) {
                C[i] = sc.next();
            }
            
            Arrays.sort(C);
            
            for (String s : C) {
                System.out.println(s);
            }
        }
    }
}
