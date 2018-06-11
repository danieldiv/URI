package iniciante.entrada_saida;

import java.io.IOException;

public class Saida_1 {

    public static void main(String[] args) throws IOException {
        String tr_1 = "", tr_2 = "|";

        for (int i = 0; i < 39; i++) {
            tr_1 += "-";

            if (i < 37) {
                tr_2 += " ";
            }
        }
        
        tr_2 += "|";

        System.out.println(tr_1);

        for (int i = 0; i < 5; i++) {
            System.out.println(tr_2);
        }

        System.out.println(tr_1);

    }
}
