package ad_hoc;

import java.io.IOException;
import java.util.Scanner;

public class Campeonato {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int Cv, Ce, Cs, Fv, Fe, Fs, Pc, Pf;

        Cv = sc.nextInt();
        Ce = sc.nextInt();
        Cs = sc.nextInt();

        Fv = sc.nextInt();
        Fe = sc.nextInt();
        Fs = sc.nextInt();

        Pc = (Cv * 3) + (Ce);
        Pf = (Fv * 3) + (Fe);

        System.out.println(res(Pc, Pf, Fs, Cs));

    }

    public static String res(int Pc, int Pf, int Fs, int Cs) {
        if (Pc > Pf) {
            return "C";
        } else if (Pf > Pc) {
            return "F";
        } else {
            if (Cs > Fs) {
                return "C";
            } else if (Fs > Cs) {
                return "F";
            } else {
                return "=";
            }
        }
    }
}
