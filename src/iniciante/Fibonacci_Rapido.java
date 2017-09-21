package iniciante;

import java.util.Scanner;

public class Fibonacci_Rapido {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        double a, b, res, raiz = Math.sqrt(5);

        while ((n = sc.nextInt()) < 0 || n > 50) {
        }

        a = Math.pow(((1 + raiz) / 2), n);
        b = Math.pow(((1 - raiz) / 2), n);

        res = (a - b) / raiz;
        
        System.out.printf("%.1f\n", res);
    }
}
