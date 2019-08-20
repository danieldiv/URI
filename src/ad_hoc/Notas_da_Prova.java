package ad_hoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class Notas_da_Prova {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int N;

        N = Integer.parseInt(in.readLine());
        System.out.println(res(N));

//        Scanner sc = new Scanner(System.in);
//
//        int N;
//
//        N = sc.nextInt();
//        System.out.println(res(N));
    }

    public static String res(int N) {
        if (N >= 86) {
            return "A";
        } else if (N >= 61) {
            return "B";
        } else if (N >= 36) {
            return "C";
        } else if (N >= 1) {
            return "D";
        } else {
            return "E";
        }
    }
}
