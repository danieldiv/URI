package ad_hoc;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Digitos_Diferentes {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, M, cont, quant;

        while (sc.hasNext()) {
            quant = 0;

            N = sc.nextInt();
            M = sc.nextInt();

            for (int i = N; i <= M; i++) {
                String[] str = String.valueOf(i).split("");

                List<String> lista = Arrays.asList(str).stream().distinct().collect(Collectors.toList());

                cont = 0;
                cont = lista.stream().map((_item) -> 1).reduce(cont, Integer::sum);

                if (cont == str.length) {
                    quant++;
                }
            }
            System.out.println(quant);
        }
    }
}
