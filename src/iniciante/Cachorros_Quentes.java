package iniciante;

import java.util.Scanner;

public class Cachorros_Quentes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float h, p, r;

        while ((h = sc.nextInt()) < 1 || h > 1000) {
        }
        while ((p = sc.nextInt()) < 1 || h > 1000) {
        }
        
        r = h / p;
        
        System.out.printf("%.2f", r);
        System.out.println();
    }
}
