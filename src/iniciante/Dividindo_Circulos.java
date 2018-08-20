package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Dividindo_Circulos {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double N;

//        N = sc.nextInt();
        for (int i = 1; i <= 1000; i++) {
            N = i;

            System.out.print(i + ": ");

            N = Math.pow(2, N - 1);
            N = Math.floor(N);
            
            System.out.println(N);
        }
    }
}
