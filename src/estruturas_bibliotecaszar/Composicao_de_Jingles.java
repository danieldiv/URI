package estruturas_bibliotecaszar;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Composicao_de_Jingles {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        Map<String, Double> map_valor = new LinkedHashMap<>();

        String str, aux;
        int cont;

        while (true) {
            str = sc.nextLine();
            if (str.equals("*")) {
                break;
            }

            StringTokenizer token = new StringTokenizer(str, "/");
            map_valor = atribuirValor(map_valor);

            cont = 0;

            while (token.hasMoreElements()) {
                Object nextElement = token.nextElement();

                aux = (String) nextElement;
                cont += contarNotas(aux, map_valor);
            }
            System.out.println(cont);
        }
    }

    public static int contarNotas(String aux, Map<String, Double> map_valor) {
        Map<String, Integer> map_quant;

        String letra;
        double valor_map, cont;

        map_quant = resetarMap();

        for (int i = 0; i < aux.length(); i++) {
            letra = String.valueOf(aux.charAt(i));
            map_quant.put(letra, map_quant.get(letra) + 1);
        }
        cont = 0;

        for (Map.Entry<String, Integer> entry : map_quant.entrySet()) {
            if (entry.getValue() != 0) {
                valor_map = map_valor.get(entry.getKey());
                cont += valor_map * entry.getValue();
            }
        }

        if (cont == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public static Map resetarMap() {
        Map<String, Integer> map = new LinkedHashMap<>();

        char[] notas = "WHQESTX".toCharArray();

        for (int i = 0; i < notas.length; i++) {
            map.put(String.valueOf(notas[i]), 0);
        }
        return map;
    }

    public static Map atribuirValor(Map<String, Double> map_valor) {
        char[] notas = "WHQESTX".toCharArray();
        double[] valor = {1, 0.5, 0.25, 0.125, 0.0625, 0.03125, 0.015625};

        for (int i = 0; i < notas.length; i++) {
            map_valor.put(String.valueOf(notas[i]), valor[i]);
        }
        return map_valor;
    }
}
