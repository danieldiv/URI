package iniciante.entrada_saida;

import java.io.IOException;
import java.text.DecimalFormat;

public class Saida_5 {

    public static void main(String[] args) throws IOException {
        int a, b, v_max = 5, cont = 0;
        double c, d;
        String S = "Valores de x:", F = "x) ", F2;

        a = 15;
        b = a / 2;

        c = 15.456;
        d = c / 7;

        exibe(S, "b");

        for (int i = 0; i < v_max; i++) {
//            F2 = F.replaceAll("x", String.valueOf(i + 1));

            System.out.println(result(i, b, d, cont, F));
//            System.out.println(F2 + result(i, b, cont, F));

            if (i == v_max - 1 && cont < 1) {
                System.out.println();

                exibe(S, "d");

                i = -1;
                v_max = 9;
                cont++;
            }
        }
    }

    public static String result(int i, int b, double d, int cont, String F) {
        String S = "", x;

        if (cont == 0) {
            S += F.replaceAll("x", String.valueOf(i + 1)) + "b = ";

            //<editor-fold defaultstate="collapsed" desc="Caso de teste 1">
            switch (i) {
                case 0:
                    return S + b;
                case 1:
                    for (int j = 1; j < 20; j++) {
                        S += " ";
                    }
                    S += b;
                    break;
                case 2:
                    for (int j = 1; j < 20; j++) {
                        S += "0";
                    }
                    S += b;
                    break;
                case 3:
                    S += b;
                    for (int j = 1; j < 20; j++) {
                        S += " ";
                    }
                    break;
                case 4:
                    return S += b + "%";
            }
//</editor-fold>
        } else {
            S += F.replaceAll("x", String.valueOf(i + 1)) + "d = ";

            //<editor-fold defaultstate="collapsed" desc="Caso de teste 2">
            switch (i) {
                case 0:
                    x = String.format("%.6f", d);
                    return S + x;
                case 1:
                    return S += (int) d;
                case 2:
                    x = String.format("%.1f", d);
                    return S + x;
                case 3:
                    x = String.format("%.2f", d);
                    return S + x;
                case 4:
                    x = String.format("%.3f", d);
                    return S + x;
                case 5:
                    for (int j = 5; j < 20; j++) {
                        S += " ";
                    }
                    x = String.format("%.3f", d);

                    return S + x;
                case 6:
                    for (int j = 5; j < 20; j++) {
                        S += "0";
                    }
                    x = String.format("%.3f", d);

                    return S + x;
                case 7:
                    x = String.format("%.3f", d);
                    S += x;

                    for (int j = 5; j < 20; j++) {
                        S += " ";
                    }

                    return S;
                case 8:
                    x = String.format("%.2f", d);
                    return S + x + "%";
            }
//</editor-fold>
        }

        return S;
    }

    public static void exibe(String S, String valor) {
        S = S.replaceAll("x", valor);
        System.out.println(S);

        for (int i = 0; i < S.length(); i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
