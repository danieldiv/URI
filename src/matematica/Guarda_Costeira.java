package matematica;

import java.io.IOException;
import java.util.Scanner;

public class Guarda_Costeira {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double T1, T2;
        double D, VF, VG, Dt = 12;

        while (sc.hasNext()) {
            D = sc.nextFloat();
            VF = sc.nextFloat();
            VG = sc.nextFloat();

            T1 = (Dt) / (VF);
            T2 = Math.sqrt((D * D) + Dt * Dt) / VG;

            if (T1 >= T2) {
                System.out.println("S");
            } else {
                System.out.println("N");
            }
        }
    }
}

/**
 * limete = 12 mihas
 *
 * 1 milha = 1,852 km
 *
 * 12 milhas = 22,224
 *
 * vm = d/t
 *
 * 1 no - 1,852 km/h
 *
 * 1 milha nautica - 1,852 km
 *
 * t = d/vm
 *
 * t = 12/1 = 12 h
 *
 * t = (12 + 5)/12
 *
 * t = 17/12 = 1,42 h
 */
