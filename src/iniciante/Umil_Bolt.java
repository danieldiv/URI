package iniciante;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Umil_Bolt {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N;
        double T[];

        while (sc.hasNext()) {
            N = sc.nextInt();
            T = new double[N];

            for (int i = 0; i < T.length; i++) {
                T[i] = sc.nextDouble();
            }

            Arrays.sort(T);
            System.out.println(T[0]);
        }
    }
}
