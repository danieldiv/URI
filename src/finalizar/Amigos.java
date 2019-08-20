package finalizar;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Amigos {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str;

        while (sc.hasNext()) {
            str = sc.nextLine();

            result(str);
        }
    }

    /**
     * Mostra o resultado
     *
     * @param str
     */
    public static void result(String str) {
        List array;
        String str_aux;

        int x, y;

        if (str.contains("{}")) {
            str = str.replace("{}", "{ }");
        }

        if (str.contains("(")) {
            x = str.indexOf("(");
            y = str.indexOf(")");

            str_aux = str.substring(x + 1, y);

            array = reduzirExpressao(str_aux, "{}");

            str_aux = "";
            str_aux += str.substring(0, x);

            for (Object object : array) {
                str_aux += "{" + object + "}";
            }

            if ((y + 1) < str.length()) {
                str_aux += str.substring(y + 1, str.length());
            }

            result(str_aux);

        } else {
            array = reduzirExpressao(str, "{}");

            for (Object object : array) {
                System.out.println("{" + String.valueOf(object).trim() + "}");
            }
        }
    }

    /**
     * Entrada de dados
     *
     * @param str
     * @param regex
     * @return
     */
    public static List reduzirExpressao(String str, String regex) {
        List array = removerRegex(str, "{}");

        while (array.size() > 1) {
            array = operacoes_menu(array);
        }
        return array;
    }

    /**
     * Remove o regex passado '()' || '{}'
     *
     * @param exp
     * @param regex
     * @return
     */
    public static List removerRegex(String exp, String regex) {
        StringTokenizer token;

        List array = new ArrayList<>();
        token = new StringTokenizer(exp, regex);

        while (token.hasMoreElements()) {
            Object nextElement = token.nextElement();
            array.add(nextElement);
        }
        return array;
    }

    /**
     * Realiza a selecao dos operadores ['*', '+', '-']
     *
     * @param array
     * @return
     */
    public static List operacoes_menu(List array) {
        List array_aux = new ArrayList<>();
        String operador;

        String val_1, val_2;
        int posicao_operador;

        if (array.contains("*")) {
            operador = "*";

        } else if (array.contains("+")) {
            if (array.contains("-")) {
                if (array.indexOf("+") < array.indexOf("-")) {
                    operador = "+";
                } else {
                    operador = "-";
                }
            } else {
                operador = "+";
            }

        } else if (array.contains("-")) {
            operador = "-";
        } else {
            operador = "#";
        }

        if (!operador.equals("#")) {
            posicao_operador = array.indexOf(operador);

            val_1 = ((String) array.get(posicao_operador - 1));
            val_2 = ((String) array.get(posicao_operador + 1));

            array_aux = operacao(array, operador, val_1, val_2, posicao_operador);
        } else {
            array_aux.add("");
        }

        return array_aux;
    }

    /**
     * Realiza as operacoes
     *
     * @param array
     * @param operador
     * @param val_1
     * @param val_2
     * @param posicao_operador
     * @return
     */
    public static List operacao(List array, String operador, String val_1, String val_2, int posicao_operador) {
        List array_aux = new ArrayList<>();

        String palavra, aux = "";

        switch (operador) {
            case "*":
                for (int i = 0; i < val_1.length(); i++) {
                    palavra = String.valueOf(val_1.charAt(i));

                    if (val_2.contains(palavra)) {
                        aux += palavra;
                    }
                }
                array_aux = atribuirValor(array, posicao_operador, aux);
                break;
            case "+":
                Map<String, String> map = new TreeMap<>();

                for (int i = 0; i < val_1.length(); i++) {
                    map.put(String.valueOf(val_1.charAt(i)), null);
                }

                for (int i = 0; i < val_2.length(); i++) {
                    map.put(String.valueOf(val_2.charAt(i)), null);
                }

                for (Map.Entry<String, String> entry : map.entrySet()) {
                    aux += entry.getKey();
                }

                array_aux = atribuirValor(array, posicao_operador, aux);
                break;
            case "-":
                for (int i = 0; i < val_1.length(); i++) {
                    palavra = String.valueOf(val_1.charAt(i));

                    if (!val_2.contains(palavra)) {
                        aux += palavra;
                    }
                }
                array_aux = atribuirValor(array, posicao_operador, aux);
                break;
        }
        return array_aux;
    }

    /**
     * Atribui o valor de uma list para outra lista removendo os valore null
     *
     * @param array
     * @param p
     * @param aux
     * @return
     */
    public static List atribuirValor(List array, int p, String aux) {
        List array_aux = new ArrayList<>();

        array.set(p - 1, null);
        array.set(p, null);
        array.set(p + 1, aux);

        for (Object object : array) {
            if (object != null) {
                array_aux.add(object);
            }
        }
        return array_aux;
    }
}
