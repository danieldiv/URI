package iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Feliz_Natal {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int i;

        while ((i = sc.nextShort()) < 1 || i > 10000) {}
        
        System.out.print("Feliz nat");

        for (int j = 0; j < i; j++) {
            System.out.print("a");
        }

        System.out.println("l!");

    }
}
