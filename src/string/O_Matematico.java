package string;

import java.io.IOException;
import java.util.Scanner;

public class O_Matematico {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, X, Y;
        String S[];

        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            S = sc.next().split("x");

            X = Integer.parseInt(S[0]);
            Y = Integer.parseInt(S[1]);
            
            result(X, Y);
        }
    }

    public static void result(int X, int Y) {
        for (int i = 5; i <= 10; i++) {
            System.out.print(X + " x " + i + " = " + (X * i));

            if (X != Y) {
                System.out.println(" && " + Y + " x " + i + " = " + (Y * i));
            } else {
                System.out.println();
            }
        }
    }
}
