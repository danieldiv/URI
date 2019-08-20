package finalizar;

import java.io.IOException;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Saida_8 {

    public static void main(String[] args) throws IOException {
//        DecimalFormat df;
        double A, B;

        DecimalFormat df = new DecimalFormat("0.000000E0");    // Formato

        Double valorDouble = 10000000000.0;

        A = 234.345;
        B = 45.698;
        
        System.out.println(df.format(valorDouble));     // 1E10
        System.out.println(df.format(A));     // 1E10

//        df = tamanho("000000");
//        System.out.println(df.format(A) + " - " + df.format(B));
//        System.out.println((int) A + " - " + (int) B);
//
//        df = tamanho("0");
//        System.out.println(df.format(A) + " - " + df.format(B));
//
//        df = tamanho("00");
//        System.out.println(df.format(A) + " - " + df.format(B));
//
//        df = tamanho("000");
//        System.out.println(df.format(A) + " - " + df.format(B));
    }

    public static DecimalFormat tamanho(String tam) {
        DecimalFormat df = new DecimalFormat("0." + tam);
        df.setMaximumFractionDigits(tam.length());
        df.setGroupingUsed(false);
        df.setRoundingMode(RoundingMode.DOWN);

        return df;
    }
}
