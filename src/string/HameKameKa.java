package string;

import java.io.IOException;
import java.util.Scanner;

public class HameKameKa {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int C, N;
        String str[];

        C = sc.nextByte();

        for (int i = 0; i < C; i++) {
            str = sc.next().split("k");

            str[0] = str[0].replaceAll("[^a]", "");
            str[1] = str[1].replaceAll("[^a]", "");
            N = str[0].length() * str[1].length();

            System.out.print("k");

            for (int j = 0; j < N; j++) {
                System.out.print("a");
            }
            System.out.println();
        }
    }
}
