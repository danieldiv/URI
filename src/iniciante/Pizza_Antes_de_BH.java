package iniciante;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Pizza_Antes_de_BH {

    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(System.in);

        int N, D, cont;
        Date newD;
        String data = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        while (sc.hasNext()) {
            while ((N = sc.nextShort()) < 1 || N > 50) {
            }
            while ((D = sc.nextShort()) < 1 || N > 50) {
            }

            String[][] P = new String[D][N + 1];
            Date date[] = new Date[D];
            boolean[] b = new boolean[D];

            //leitura das datas e participantes
            for (int i = 0; i < D; i++) {
                for (int j = 0; j <= N; j++) {
                    P[i][j] = sc.next();
                }
                date[i] = (Date) sdf.parse(P[i][0]);
            }

            newD = null;

            //Verifica se todas as pessoas podem comparecer
            for (int i = 0; i < P.length; i++) {
                cont = 0;
                for (int j = 1; j < P[0].length; j++) {
                    if (P[i][j].equals("1")) {
                        cont++;
                    } else {
                        break;
                    }
                }
                b[i] = cont == (P[i].length - 1);
            }

            //Verifica a menor data em que todas estejam disponiveis
            for (int i = 0; i < date.length - 1; i++) {
                if (b[i]) {
                    if (newD != null) {
                        for (int j = 0; j < date.length; j++) {
                            if (newD.compareTo(date[j]) == 1 && (b[j] == true)) {
                                newD = date[j];
                            }
                        }
                    } else {
                        newD = date[i];
                    }
                }
            }

            cont = 0;

            //adiciona a data na variavel
            for (int i = 0; i < b.length; i++) {
                if (b[i]) {
                    cont++;
                    data = P[i][0];
                }
            }

            /**
             * se a quantidade de datas adicionada for apenas 1, é exibida a
             * primeira opcao, caso seja 0 a segunda opcao, e se tiver mais de
             * um, ira exibir a menor data
             */
            switch (cont) {
                case 1:
                    System.out.println(data);
                    break;
                case 0:
                    System.out.println("Pizza antes de FdI");
                    break;
                default:
                    for (int i = 0; i < b.length; i++) {
                        if (b[i] && P[i][0].equals(data)) {
                            System.out.println(concant(sdf.format(newD)));
                        }
                    }
                    break;
            }
        }
    }

    public static String concant(String data) {
        String[] str = data.split("/");
        String newStr = "";
        int d;

        for (int i = 0; i < str.length; i++) {
            d = Integer.valueOf(str[i]);
            str[i] = String.valueOf(d);
        }

        for (int i = 0; i < str.length; i++) {
            newStr += str[i];

            if (i < str.length - 1) {
                newStr += "/";
            }
        }

        return newStr;
    }
}
