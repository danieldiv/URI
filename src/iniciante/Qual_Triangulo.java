package iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Qual_Triangulo {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int a, b, c, r1, r2, r3;

        while ((a = sc.nextInt()) < 0 || a > 100000) {}
        while ((b = sc.nextInt()) < 0 || b > 100000) {}
        while ((c = sc.nextInt()) < 0 || c > 100000) {}

        /**
         * | b - c | < a < b + c
         * | a - c | < b < a + c
         * | a - b | < c < a + b
         *
         * Escaleno: possui todos os lados com medidas diferentes;
         * Equilátero: possui os lados com medidas iguais;
         * Isósceles: dois de seus lados possuem a mesma medida.
         * 
         * Triangulo Retangulo
         * o quadrado da hipotenusa é igual à soma dos quadrados dos catetos
         */
        if ((r1 = (b - c)) < 0) { r1 = -r1; }
        if ((r2 = (a - c)) < 0) { r2 = -r2; }
        if ((r3 = (a - b)) < 0) { r3 = -r3; }

        if (r1 < a && a < (b + c)
                || r2 < b && b < (a + c)
                || r3 < c && c < (a + b)) {

            System.out.printf("Valido-");

            if (a == b && a == c) {
                System.out.println("Equilatero");
                System.out.println("Retangulo: N");
            } else if (a != b && a != c && b != c) {
                System.out.println("Escaleno");
                System.out.println("Retangulo: " + trRet(a, b, c));
            } else {
                System.out.println("Isoceles");
                System.out.println("Retangulo: " + trRet(a, b, c));
            }
        } else {
            System.out.println("Invalido");
        }
    }
    
    public static String trRet(int a, int b, int c) {
        if (a > b && a > c) {
            if ((a * a) == ((b * b) + (c * c))) {
                return "S";
            }
        } else if (b > a && b > c) {
            if ((b * b) == ((a * a) + (c * c))) {
                return "S";
            }
        } else if (c > a && c > b) {
            if ((c * c) == ((b * b) + (a * a))) {
                return "S";
            }
        }
        return "N";
    }
}
