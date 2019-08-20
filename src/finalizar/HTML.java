package finalizar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HTML {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String S, aux[];
        int cont = 0, quant = 0;

        while ((S = in.readLine()) != null) {
            S = S.replaceAll("<br>", "\n");
            aux = S.split(" ");

            for (String _aux : aux) {
                cont += _aux.length();
                if (quant != 0 && (cont + 1) <= 80) {
                    System.out.print(" ");
                    cont++;
                }
                if (cont <= 80) {
                    System.out.print(_aux);
                    quant++;
                } else {
                    cont = 0;
                    quant = 0;
                    System.out.println();
                }
            }
//            if (aux.contains("<hr>")) {
//                aux += "<br>";
//
//                for (int i = 0; i < 80; i++) {
//                    aux += "-";
//                }
//                aux = aux.replaceAll("<hr>", "<br>");
//                aux += "<br>";
//            }
//
//            if (aux.contains("<br>")) {
//                aux = aux.replaceAll("<br>", "\n");
//            }
//            if (aux.length() < 80) {
//                aux += S;
//
//                if (aux.length() >= 80) {
//                    System.out.println("s:" + aux.substring(0, 80));
//                    aux = aux.substring(80, aux.length());
//                }
//            }
        }
    }
}
