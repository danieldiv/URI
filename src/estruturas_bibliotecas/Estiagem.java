package estruturas_bibliotecas;

import java.io.IOException;
import static java.lang.Math.floor;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Estiagem {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        Map<Integer, Integer> map = new TreeMap<>();

        float consumo, morador;
        int N, X, Y, cont = 0, qt = 0;

        while ((N = sc.nextInt()) != 0) {
            map.clear();
            morador = consumo = 0;

            for (int i = 0; i < N; i++) {
                X = sc.nextInt();
                Y = sc.nextInt();

                consumo += Y;
                morador += X;

                Y /= X;

                if (i != 0 && map.get(Y) != null) {
                    map.put(Y, map.get(Y) + X);
                } else {
                    map.put(Y, X);
                }

            }
            result(++cont, qt++, map, consumo, morador);
        }
    }

    public static void result(int cont, int qt, Map<Integer, Integer> map, float consumo, float morador) {
        int quant = 0;

        if (qt != 0) {
            System.out.println();
        }
        System.out.println("Cidade# " + cont + ":");

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (quant++ != 0) {
                System.out.print(" ");
            }
            System.out.print(entry.getValue() + "-" + entry.getKey());
        }

        System.out.printf("\nConsumo medio: %.2f m3.\n", floor(100 * (float) consumo / morador) / 100);
    }

}
