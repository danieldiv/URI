package finalizar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Qual_o_mais_Rapido {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        double O, B, I;
        String[] str;

        str = in.readLine().split(" ");

        O = Double.parseDouble(str[0]);
        B = Double.parseDouble(str[1]);
        I = Double.parseDouble(str[2]);

        DecimalFormat df = new DecimalFormat("0.00");
        df.setMaximumFractionDigits(3);
        df.setGroupingUsed(false);
        df.setRoundingMode(RoundingMode.DOWN);

        O = Double.valueOf(df.format(O).replaceAll(",", "."));
        B = Double.valueOf(df.format(B).replaceAll(",", "."));
        I = Double.valueOf(df.format(I).replaceAll(",", "."));

        System.out.println(res(O, B, I));
    }

    public static String res(double O, double B, double I) {
        if (O < B && O < I) {
            return "Otavio";
        } else if (B < O && B < I) {
            return "Bruno";
        } else if (I < O && I < B) {
            return "Ivan";
        }

        return "Empate";
    }
}
