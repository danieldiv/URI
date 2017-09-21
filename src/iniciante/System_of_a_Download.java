package iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class System_of_a_Download {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int c, x, y;
        String[] m = {"PROXYCITY", "P.Y.N.G.", "DNSUEY!", "SERVERS", "HOST!",
            "CRIPTONIZE", "OFFLINE DAY", "SALT", "ANSWER!", "RAR?", "WIFI ANTENNAS"};

        c = sc.nextShort();

        for (int i = 0; i < c; i++) {
            x = sc.nextShort();
            y = sc.nextShort();

            System.out.println(m[x + y]);
        }
    }
}
