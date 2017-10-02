package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Reservatorio_de_Mel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double V, D, A, r, h; //Volume, diametro, raio e altura

        DecimalFormat dc = new DecimalFormat("#.##");
        dc.setMinimumFractionDigits(2);
        dc.setMaximumFractionDigits(2);

        while (sc.hasNext()) {
            V = sc.nextDouble();
            D = sc.nextDouble();

            //O raio é a metade do diametro
            r = D / 2;

            //Area = π * r²
            A = (3.14 * (r * r));
//            A = 3.14 * Math.pow(r, 2);

            //Volume = A * h | h = V / A
            h = V / A;

            System.out.print("ALTURA = " + dc.format(h));
            System.out.print("\nAREA = " + dc.format(A) + "\n");
        }
    }
}
