package iniciante;

import java.util.Scanner;

public class Senha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        while (sc.hasNext()) {
            while ((n = sc.nextInt()) < 1001 || n > 9999) {
            }
            
            n--;
            System.out.println(n);
        }
    }
}
